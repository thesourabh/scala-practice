object Solution {
    def main(args: Array[String]) = { 
        var x_y = Console.readLine.split(" ")
        val x = x_y(0).toInt
        val y = x_y(1).toInt
        val board = new Array[String](5*5)
        for (i <- 0 until 5) {
            val line = Console.readLine
            for (j <- 0 until 5) {
                board.update(i*5 + j, line(j).toString)
            }
        }
    nextMove(x, y, board);
    }

  def nextMove(posx:Int, posy: Int, board:Array[String])={
      val b = board.indexOf("b")
      val d = board.indexOf("d")
      val vert = (b / 5) - (d / 5)
      val horiz = (b % 5) - (d % 5)
      if (b == -1) println("CLEAN")
      else if (vert > 0) println("UP")
      else if(vert < 0) println("DOWN")
      else if(horiz > 0) println("LEFT")
      else println("RIGHT")
  }
}