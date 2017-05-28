class Guest

  def initialize(first_name, last_name, money, fav_song)
    @first_name = first_name
    @last_name = last_name
    @money = money
    @fav_song = fav_song
  end

  def get_first_name()
    @first_name
  end

  def get_last_name()
    @last_name
  end

  def get_purse()
    @money
  end

  def get_fav_song()
    @fav_song
  end

end