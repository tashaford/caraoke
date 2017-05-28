class Viewer

  def get_guest_first_name(guest_info)
    puts "Please enter your first name"
    return gets.chomp
  end

  def get_guest_surname(guest_info)
    puts "Please enter your surname"
    return gets.chomp
  end

  def get_guest_purse_amount(guest_info)
    puts "And how much money are you taking with you?"
    return gets.chomp
  end

  def start(guest_name)
    puts
    puts "#{guest_name} wants to go to code clan caraoke!"
  end

  def pay_entry_fee(guest_money)
    puts "#{guest_money} has paid the room entry fee."
    if()
      puts "#{guest_money} has #{} left in their wallet."
    end
    puts 
  end

  def end(guest_info)
    puts "#{guest_info} has ran out of money and is heading home."
  end
end