import java.awt.Point

class MaseSolver {

    /*
    * Entrance function
    * normally not the function you want to recurse in
    * */
    fun startMazeSolver(maze: List<String>, wall: String, start: Point, end: Point) : List<Point> {

        return listOf()
    }

    fun walk (){

        // base cases -> requiers us where we are currently at, at welcher Pos. wir gerade stehen
        // recursive cases -> da mssen wir moven, müssen wir in die versch. Richtungen vordringen/ checken können.

//        1.

    }


    fun columnwiseArrayTraversal(){
        val arr = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )

        for (i in arr[0].indices) {
            for (j in arr.indices) {
                println(arr[j][i])
            }
        }
    }

}