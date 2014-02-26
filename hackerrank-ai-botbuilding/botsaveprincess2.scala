object Solution {
    def main(args: Array[String]) = { 
        val n = Console.readInt
        var x_y = Console.readLine.split(" ")
        val x = x_y(0).toInt
        val y = x_y(1).toInt
        val grid = new Array[String](n*n)
        for (i <- 0 until n) {
            val line = Console.readLine
            for (j <- 0 until n) {
                grid.update(i*n + j, line(j).toString)
            }
        }
        nextMove(n,x,y,grid);
    }
/* Head ends here */
def nextMove(player:Int, x:Int, y:Int, grid:Array[String])={
    val p = grid.indexOf("p")
    val b = grid.indexOf("m")
    val vert = (b / player) - (p / player)
    val horiz = (b % player) - (p % player)
    if (vert > 0) println("UP")
    else if(vert < 0) println("DOWN")
    else if(horiz > 0) println("LEFT")
    else println("RIGHT")
}
/* Tail starts here */
}