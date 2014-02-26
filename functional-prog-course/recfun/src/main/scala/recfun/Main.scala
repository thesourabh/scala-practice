package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if ((c == 0) || (c == r)) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def loop(cs: List[Char], bal: Int): Boolean = {
      if (cs.isEmpty || (bal < 0)) (bal == 0)
      else if (cs.head == '(') loop(cs.tail, bal + 1)
      else if (cs.head == ')') loop(cs.tail, bal - 1)
      else loop(cs.tail, bal)
    }
    loop(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def count(m: Int, cs: List[Int]): Int =
      if (cs.isEmpty || m < 0) 0
      else if (m == 0) 1
      else count(m, cs.tail) + count(m - cs.head, cs)
    if (money == 0) 1
    else count(money, coins.sortWith(_ > _))
  }
}
