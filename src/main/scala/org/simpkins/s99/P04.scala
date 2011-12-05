package org.simpkins.s99

object P04 {

  def length(list: List[Any]): Int = lengthIter(0, list)
  
  def lengthIter(n: Int, list: List[Any]): Int = list match {
    case Nil => n
    case x::xs => lengthIter(n + 1, xs)
  }
 
  def lengthFold(list: List[Any]) =
    // Note: not using second argument to fold's function value, just
    // using fold to traverse and count the elements of the list using
    // the accumulator (first) argument to the function value
    list.foldLeft(0) { (x,y) => x + 1}
  
  def main(args: Array[String]) = {
    val testList = List(1,2,3,4,5)
    println("Length of " + testList + " is " + length(testList))
    println("Using lengthFold: " + lengthFold(testList))
  }
}