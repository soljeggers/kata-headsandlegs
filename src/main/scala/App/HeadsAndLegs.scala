package App

object HeadsAndLegs extends App {

  val head: Int = 5
  val legs: Int = 18

  def whatsYourBeef(head: Int, legs: Int) = {
    val cow = (legs - (2 * head)) / 2
    val chicken = head - cow
    (chicken, cow)
  }

  def canItBeDoneFam (head: Int, legs: Int) = {
    if (legs % 2 == 0 &&
      legs >= (head*2) && legs <= (head*4)){
      whatsYourBeef(head, legs)
    }else{ "No Solution Found"
      }
    }
  println(canItBeDoneFam(head,legs))
}



