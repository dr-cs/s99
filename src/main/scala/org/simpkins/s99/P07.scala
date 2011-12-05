package org.simpkins.s99

object P07 {

  def flatten(list: List[Any]):List[Any] =
    list.flatMap ( x => x match {
        case xs: List[Any] => flatten(xs)
        case x => List(x)
      })
      
  def flattenLispy(list: List[Any]):List[Any] = {
    if (list == Nil) {
      Nil
    } else if (list.head.isInstanceOf[List[Any]]) {
      flattenLispy(list.head.asInstanceOf[List[Any]]):::flattenLispy(list.tail)
    } else {
      list.head::flattenLispy(list.tail)
    }
  }
  
  def flattenCasey(list: List[Any]):List[Any] = list match {
    case Nil => Nil
    case x::xs => x match {
      case x: List[Any] => flattenCasey(x):::flattenCasey(xs)
      case _ => x::flattenCasey(xs)
    }
  }
  
  def main(args: Array[String]) = {
    val test = List(List(1, 1), 2, List(3, List(5, 8)))
    println("Given list " + test + ":")
    println("flatMap version yields: " +flatten(test))
    println("flattenLispy yields:    " +flattenLispy(test))
    println("flattenCasey yields:    " +flattenCasey(test))
  }
}