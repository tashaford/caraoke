require_relative 'guest'
require_relative 'song'
require_relative 'room'
require_relative 'viewer'

class Caraoke

  def initialize(viewer)
    @viewer = viewer

    @room = Room.new(1)
    @guest_1 = Guest.new("Natasha", "Ford", 30)
    @guest_2 = Guest.new("Michael", "Robertson", 50)
    @guest_3 = Guest.new("Euan", "Bennet", 45)
    @song_1 = Song.new("Dead or Alive", "Bon Jovi")
    @song_2 = Song.new("Bohemian Rhapsody", "Queen")
    @id = id
    @guestlist = []
    @playlist = []
    @room_limit = 2
    first_name = ""
    second_name = ""
    @entry_fee = 5
  end

  def run()
    while(!@game.is_won?)
      @viewer.start(@game.current_player.name)
      @game.next_turn(@dice.roll)
      @viewer.show_update(@game.log.last)
    end

    @viewer.end(@game.winner.name)
  end

end
