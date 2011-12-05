package org.simpkins.s99

object P03 {

  def nth[T](n: Int, list: List[T]):T = {
    require(n < list.length && n > -1)
    nthIter(n, list)
  }
  
  def nthIter[T](i: Int, list: List[T]):T ={
    if (i == 0) {
      list.head
    } else {
      nthIter(i-1, list.tail)
    }
  }
  
  def main(args: Array[String]): Unit = {
    val testList = List(1,2,3,4,5)
    println("0th element of " + testList + " is " + nth(0, testList))
    println("2th (3rd) element of " + testList + " is " + nth(2, testList))
    println("4th (last) element of " + testList + " is " + nth(4, testList))
  }

}