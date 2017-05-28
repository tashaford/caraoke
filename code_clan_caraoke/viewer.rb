class Viewer

  def get_guest_first_name()
    puts "Please enter your first name"
    return gets.chomp
  end

  def get_guest_surname()
    puts "Please enter your surname"
    return gets.chomp
  end

  def get_guest_purse_amount()
    puts "And how much money are you taking with you?"
    return gets.chomp
  end

  def start(get_first_name)
    puts
    puts "#{get_first_name} is going to code clan caraoke!"
  end

  # def pay_entry_fee(get_first_name, guest_money)
  #   puts "#{get_first_name} has paid the room entry fee."
  #   if()
  #     puts "#{guest_money} has #{} left in their wallet."
  #   end
  #   puts 
  # end

  # def end(get_first_name)
  #   puts "#{get_first_name} has ran out of money and is heading home."
  # end
end