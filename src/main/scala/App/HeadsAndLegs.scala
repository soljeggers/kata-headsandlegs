package App

object HeadsAndLegs extends App {


  val head : Int = 5
  val legs : Int = 18

  def whatsYourBeef (head : Int, legs : Int) = {
    val cow = (legs-(2*head)) / 2
    val chicken = head - cow
    (chicken, cow)

  }
  println(whatsYourBeef(head,legs))
}



