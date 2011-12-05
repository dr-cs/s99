package org.simpkins.s99

object P20 {

  def removeAt[T](pos:Int, list: List[T]): (List[T], T) =
    removeAtHelper(pos, List[T](), list)
  
  def removeAtHelper[T](pos: Int, leading:List[T],
                     trailing:List[T]): (List[T], T)
    = trailing match {
    case Nil => throw new IllegalArgumentException
    case x::xs if (pos == 0) => (leading.reverse:::xs, x)
    case x::xs => removeAtHelper( pos - 1, x::leading, xs)
  }
  
  def main(args: Array[String]) = {
    val test = List('a, 'b, 'c, 'd)
    println("test: " + test + "\nremoveAt(1, test): " + removeAt(1,test))
  }
}
