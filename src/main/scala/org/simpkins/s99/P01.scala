package org.simpkins.s99

object P01 {
  def last[T](list: List[T]) = list.last
	
  def lastRecursive[T](list: List[T]):Option[T] = list match {
    case x::Nil => Some(x)
    case x::xs => lastRecursive(xs)
    case _ => None
  }
  
  def main(args: Array[String]) = {
		val testList = List(1, 2, 3, 4, 5)
		println(last(testList))
		println("Recursively " + lastRecursive(testList))
	}
}
