require 'minitest/autorun'
require 'minitest/rg'

require_relative '../song.rb'

class TestSong < MiniTest::Test

  def setup()
    @song = Song.new("Dead or Alive", "Bon Jovi")
  end

  def test_get_song_title()
    assert_equal("Dead or Alive", @song.get_title())
  end

  def test_get_song_artist()
    assert_equal("Bon Jovi", @song.get_artist())
  end

end