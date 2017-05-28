require 'minitest/autorun'
require 'minitest/rg' 

require_relative '../room.rb'
require_relative '../guest.rb'
require_relative '../song.rb'

class TestRoom < MiniTest::Test

  def setup()
    @room = Room.new(1)
    @guest_1 = Guest.new("Natasha", "Ford", 30)
    @guest_2 = Guest.new("Michael", "Robertson", 50)
    @guest_3 = Guest.new("Euan", "Bennet", 45)
    @song_1 = Song.new("Dead or Alive", "Bon Jovi")
    @song_2 = Song.new("Bohemian Rhapsody", "Queen")
  end

  def test_get_room_id_number()
    assert_equal(1, @room.get_room_id())
  end

  def test_get_song_playlist()
    assert_equal([], @room.get_song_playlist())
  end

  def test_put_song_in_playlist()
    @room.put_song_in_playlist(@song_1)
    assert_equal(1, @room.get_song_playlist.count())
  end

  def test_get_song_from_playlist()
    @room.put_song_in_playlist(@song_1)
    @room.put_song_in_playlist(@song_2)
    assert_equal("Dead or Alive", @room.get_song_by_title("Dead or Alive"))
  end

  def test_get_guestlist()
    assert_equal([], @room.get_guestlist())
  end

  def test_put_guest_in_guestlist()
    @room.put_guest_in_guestlist(@guest_1)
    @room.put_guest_in_guestlist(@guest_2)
    assert_equal(2, @room.get_guestlist.count())
  end

  def test_get_guests_name_from_guestlist()
    @room.put_guest_in_guestlist(@guest_2)
    assert_equal("Michael Robertson", @room.get_first_name_from_guestlist()[0])
  end

  def test_remove_guest_from_guestlist()
    @room.put_guest_in_guestlist(@guest_1)
    @room.put_guest_in_guestlist(@guest_2)
    assert_equal("Michael Robertson", @room.remove_guest_in_guestlist(@guest_2)[0])
  end

  def test_whos_still_in_guestlist()
    @room.put_guest_in_guestlist(@guest_1)
    @room.put_guest_in_guestlist(@guest_2)
    @room.remove_guest_in_guestlist(@guest_2)
    assert_equal("Natasha Ford", @room.get_first_name_from_guestlist()[0])
  end

  def test_too_many_guests()
    @room.put_guest_in_guestlist(@guest_1)
    @room.put_guest_in_guestlist(@guest_2)
    @room.put_guest_in_guestlist(@guest_3)
    assert_equal(2, @room.get_guestlist.count())
  end

  def test_room_entry_fee()
    @room.put_guest_in_guestlist(@guest_1)
    assert_equal(25, @room.pay_entry_fee(@guest_1))
  end

end