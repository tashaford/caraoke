class Guest

  def initialize(first_name, last_name, money)
    @first_name = first_name
    @last_name = last_name
    @money = money
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

end