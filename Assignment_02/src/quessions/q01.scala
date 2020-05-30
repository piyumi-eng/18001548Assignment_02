package quessions

object q01 {
  def main(args:Array[String])
  {
    println("Enter the number of Normal Working hours : ")
    var normal_hours = scala.io.StdIn.readInt()
    
    println("Enter the number of OT hours : ")
    var ot_hours = scala.io.StdIn.readInt()
    
    var salary = take_home_salary(normal_hours, ot_hours)
    println("Take home salary of this employee is "+salary+"/=")
  }
  
  def normal_pay(hours:Int):Int=
  {
    hours*150
  }
  
  def ot_pay(hours:Int):Int=
  {
    hours*75
  }
  
  def net_salary(hours1:Int, hours2:Int):Int=
  {
    normal_pay(hours1)+ot_pay(hours2)
  }
  
  def tax(net_salary:Int):Double=
  {
    net_salary*10/100
  }
  
  def take_home_salary(hours1:Int, hours2:Int):Double=
  {
    net_salary(hours1,hours2)-tax(net_salary(hours1,hours2))
  }
}