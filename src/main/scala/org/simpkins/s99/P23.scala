package org.simpkins.s99

import scala.util.Random

object P23 {

  def randomSelect[T](num: Int, list: List[T]): List[T] = {
    if (num <= 0) {
      Nil
    } else {
      val (remainder, elem) = P20.removeAt(Random.nextInt(list.length), list)
      elem::randomSelect(num-1, remainder)
    }
  }

  def main(args: Array[String]) {
    val test = List(0,1,2,3,4,5,6,7,8,9)
    println(randomSelect(3, test))
  }
}
