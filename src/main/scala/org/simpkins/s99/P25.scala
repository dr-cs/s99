package org.simpkins.s99

import scala.util.Random

object P25 {
  def randomPermute[T](list: List[T], accum: List[T] = List()): List[T] =
    list match {
    case Nil => accum
    case _ => {
      val (remainder, elem) = P20.removeAt(Random.nextInt(list.length), list)
      randomPermute(remainder, elem::accum)
    }
  }
}
