data class Robot(
    val name: String,
) {
    var x: Int = 10
    var y: Int = 10
    var facing: String = "GROUND"

    fun place(x: Int, y: Int, facing: String) {
        val places: List<Int> = listOf(0, 1, 2, 3, 4)
        val directions: List<String> = listOf("NORTH", "SOUTH", "EAST", "WEST")

        if (!places.contains(x) || !places.contains(y)) {
            println("beep boop ! does not compute")
        }
        if (!directions.contains(facing)) {
            println("beep boop ! wrong direction")
        }

        this.x = x
        this.y = y
        this.facing = facing
    }

    fun move() {
        if (facing === "NORTH" && y < 4) {
            y += 1
        }
        if (facing === "SOUTH" && y > 0) {
            y -= 1
        }
        if (facing === "EAST" && x < 4) {
            x += 1
        }
        if (facing === "WEST" && x > 0) {
            x -= 1
        }
    }

    fun left() {
        when (facing) {
            "NORTH" -> facing = "WEST"
            "SOUTH" -> facing = "EAST"
            "EAST" -> facing = "NORTH"
            "WEST" -> facing = "SOUTH"
        }
    }

    fun right() {
        when (facing) {
            "NORTH" -> facing = "EAST"
            "SOUTH" -> facing = "WEST"
            "EAST" -> facing = "SOUTH"
            "WEST" -> facing = "NORTH"
        }
    }

    fun report(): String {
        val report = "$x, $y, $facing"
        println("beep boop !")
        println(report)
        return report
    }
}
