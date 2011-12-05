package org.simpkins.s99

object P06 {
  
  def isPalindrome[T](list: List[T]): Boolean = {
    if (list.length == 1) {
      true
    } else if (list.length == 2) {
      list.head == list.last
    } else {
      (list.head == list.last) && isPalindrome(list.tail.init)
    }
  }

  def main(args: Array[String]) = {
    val radar = List('r','a','d','a','r')
    val boob = List('b','o','o','b')
    val dante = List('d','a','n','t','e')
    val candidates = List(radar, boob, dante)
    for (candidate <- candidates)
      println("Is " + candidate + " a " + " palindrome? " +
          isPalindrome(candidate))
  }
}