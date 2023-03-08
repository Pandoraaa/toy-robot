fun main() {
    println("beep boop ! I'm a robot")
    Robot("toto").let {
       it.place(0,0,"NORTH")
        it.move()
        it.move()
        it.move()
        it.right()
        it.move()
        it.left()
        it.move()
        it.left()
        it.report()
    }
}


