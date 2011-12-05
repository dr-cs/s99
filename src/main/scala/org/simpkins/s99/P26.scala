package org.simpkins.s99

object P26 {

  def sublists[T](list: List[T]): List[List[T]] = {
    if (list == Nil) Nil
    else list::sublists(list.tail)
  }

  def combinations[T](k: Int, list: List[T]): List[List[T]] = {
    if(k == 0) {
      List(Nil)
    } else {
      val sl = sublists(list)
      sl.flatMap( l => combinations(k-1, l.tail).map( combo => l.head::combo))
    }
  }
}
