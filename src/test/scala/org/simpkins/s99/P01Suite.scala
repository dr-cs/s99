package org.simpkins.s99

import org.scalatest.Suite

class P01Suite extends Suite {

 def testLastRecursive() {
   expect(Some(5)) {
     P01.lastRecursive(List(1, 2, 3, 4, 5))
   }
 }
}