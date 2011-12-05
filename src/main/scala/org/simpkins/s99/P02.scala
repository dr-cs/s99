package org.simpkins.s99

object P02 {

  def penultimate[T](list: List[T]):T = {
    list.reverse.tail.head
  }
  
  def main(args: Array[String]): Unit = {
    val testList = List(1,2,3,4,5)
    println("Penultimate of " + testList + " is " + penultimate(testList))
  }

}