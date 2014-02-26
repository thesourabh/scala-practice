object Solution {
    def main(args: Array[String]) = { 
        val m = Console.readInt
        val grid = new Array[String](m*m)
        for (i <- 0 until m) {
            val line = Console.readLine
            for (j <- 0 until m) {
                grid.update(i*m + j, line(j).toString)
            }
        }
    displayPathtoPrincess(m,grid);
    }

  /*Refer section <i>Output format</i> for more details */
  def displayPathtoPrincess(m:Int,grid:Array[String])={
    val b = grid.indexOf("m")
    val p = grid.indexOf("p")
    //println(b + "   " + p + "   " + m)
    //println(b/m + "  " + (p / m) + "  " + (b%m) + "  "+ (p % m ))
    val vert = (b / m) - (p / m)
    //println(vert)
    for (i <- 0 until math.abs(vert)) {
        if (vert > 0) println("UP") else println("DOWN")
    }          
    val horiz = (b % m) - (p % m)
    //println(horiz)
    for (i <- 0 until math.abs(horiz)) {
        if (horiz > 0) println("LEFT") else println("RIGHT")
    }
    
  }
}