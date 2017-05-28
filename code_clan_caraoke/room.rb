class Room

  def initialize(id)
    @id = id
    @guestlist = []
    @playlist = []
    @room_limit = 2
    first_name = ""
    second_name = ""
    @entry_fee = 5
  end

  def get_room_id()
    @id
  end

  def get_song_playlist()
    @playlist
  end

  def put_song_in_playlist(song)
    @playlist << song
  end

  def get_song_by_title(search_title)
    title = ""
    for song in @playlist
      title = song.get_title if song.get_title == search_title
    end
    return title
  end

  def get_guestlist()
    return @guestlist
  end

  def put_guest_in_guestlist(guest)
    if @guestlist.count < @room_limit
      @guestlist << guest
    end
  end

    def get_first_name_from_guestlist()
      whos_in = []
      for names in @guestlist
      # if names.get_first_name == search_name
      #   first_name = names.get_first_name
      #   second_name = names.get_last_name
      # end
      whos_in << (names.get_first_name + " " + names.get_last_name)
    end
    return whos_in
  end

  def remove_guest_in_guestlist(remove_guest)
    taken_out = []
    removed = @guestlist.delete(remove_guest)
    taken_out << (removed.get_first_name + " " + removed.get_last_name)
    return taken_out
  end

  def pay_entry_fee(guest_to_pay)
    purse = 0
    if @guestlist.include? guest_to_pay
      purse = guest_to_pay.get_purse  - @entry_fee
    end
    return purse
  end

end