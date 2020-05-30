package quessions

object q02 {
  def main(args:Array[String])
  {
    println(profit(15), profit(18), profit(20), profit(23), profit(25), profit(60))
  }
  
  def attendees(ticket_price:Int):Int=
  {
    120-(ticket_price-15)/5*20
  }
  
  def revenue(ticket_price:Int):Int=
  {
    attendees(ticket_price)*ticket_price
  }
  
  def cost(ticket_price:Int):Int=
  {
    500+attendees(ticket_price)*3
  }
  
  def profit(ticket_price:Int):Int=
  {
    revenue(ticket_price)-cost(ticket_price)
  }
}

/*These parameters we can see the best price of a ticket is 23 rupees and it gets 1500 rupees profit*/