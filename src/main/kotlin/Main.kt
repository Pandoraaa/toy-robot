fun main() {
    println("beep boop ! I'm a robot")
    Robot("toto").let {
        it.place(0, 0, "NORTH")
        it.move()
        it.report()
        it.place(0, 0, "NORTH")
        it.left()
        it.report()
        it.place(1, 2, "EAST")
        it.move()
        it.move()
        it.left()
        it.move()
        it.report()
    }
}


