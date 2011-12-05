package org.simpkins.s99

import P09.pack

object P10 {
  
  def encode(list: List[Any]):List[(Int, Any)] = 
    for (sublist <- pack(list)) yield (sublist.length, sublist.head)
    
  def main(args: Array[String]) = {
    val test = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println("Run-length encoding of \n" + test + "\nis\n" + encode(test))
  }
}