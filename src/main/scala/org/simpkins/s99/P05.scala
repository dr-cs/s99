package org.simpkins.s99

object P05 {
  
  def reverseFold[T](list: List[T]):List[T] =
    list.foldLeft(List[T]()) {(revList, curElem) => curElem::revList}

  def main(args: Array[String]): Unit = {
    val testList = List(1,2,3,4,5)
    println("Reverse of " + testList + " is " + reverseFold(testList))
  }

}