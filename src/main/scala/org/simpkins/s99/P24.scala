package org.simpkins.s99

object P24 {
  def lotto(n: Int, m: Int): List[Int] = {
    P23.randomSelect(n, List.range(1, m + 1))
  }
}
