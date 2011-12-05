package org.simpkins.s99

object P08 {
  
  def compress(list: List[Any]) =
    list.init.foldRight(List[Any](list.last)) {(elem, accum) =>
      if (elem != accum.head) elem::accum
      else accum
    }
  
  def main(args: Array[String]) = {
    val test = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println("test:           " + test)
    println("compress(test): " + compress(test))
  }
}