package App

import scala.io.StdIn

object HeadsAndLegs2 extends App {

  val head: Int = 5 // StdIn.readLine("How many heads?\n").toInt
  val legs: Int = 18 // StdIn.readLine("How many legs? \n").toInt

  def whatsYourBeef(head: Int, legs: Int) = {
    val cow = (legs - (2 * head)) / 2
    val chicken = head - cow
    if (legs % 2 == 0 &&
    legs >= (head*2) && legs <= (head*4)){
      println(s"You have $chicken chickens and $cow cows!")
      (chicken, cow)
    }else{ "No Solution Found"
    }
  }
  println(whatsYourBeef(head,legs))
}


