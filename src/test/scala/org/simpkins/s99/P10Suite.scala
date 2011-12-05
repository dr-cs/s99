package org.simpkins.s99

import org.scalatest.FunSuite

class P10Suite extends FunSuite {

  test("run length encoding works") {
    expect(List((4,'a), (1,'b), (2,'c), (2,'a), (2,'d), (4,'e))) {
      P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    }
  }
}