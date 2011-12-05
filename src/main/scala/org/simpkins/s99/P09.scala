package org.simpkins.s99

object P09 {

  def pack[T](list: List[T]):List[List[T]] =
    packHelper(List(List(list.head)), list.tail)
    
  def packHelper[T](res: List[List[T]], list: List[T]):List[List[T]] = list match {
    case Nil => res.reverse
    case x::xs if (x == res.head.head) => packHelper((x::res.head)::res.tail, xs)
    case x::xs => packHelper(List(x)::res, xs)
  }
  
  def main(args: Array[String]) = {
    val test = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(test + " packed is \n" + pack(test))
  }
}