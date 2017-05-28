require 'minitest/autorun'
require 'minitest/rg'

require_relative '../guest.rb'

class TestGuest < MiniTest::Test

  def setup()
    @guest_1 = Guest.new("Natasha", "Ford", 30, "Dead or Alive")
  end

  def test_get_guest_first_name()
    assert_equal("Natasha", @guest_1.get_first_name())
  end

  def test_get_guest_last_name()
    assert_equal("Ford", @guest_1.get_last_name())
  end

  def test_how_much_money_does_guest_have()
    assert_equal(30, @guest_1.get_purse())
  end

  def test_guests_fav_song()
    assert_equal("Dead or Alive", @guest_1.get_fav_song)
  end

end