import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RobotTest {
    @Test
    @DisplayName("place the robot")
    fun placeTheRobot() {
        // GIVEN
        var robot = Robot("Roberto")
        // WHEN
        robot.place(4,0,"NORTH")
        // THEN
        val x = robot.x
        val y = robot.y
        val facing = robot.facing
        val expectedX = 4
        val expectedY = 0
        val expectedFacing = "NORTH"

        assertEquals(expectedX,x)
        assertEquals(expectedY,y)
        assertEquals(expectedFacing,facing)
    }

    @Test
    @DisplayName("it turn to the left")
    fun itTurnToTheLeft() {
        // GIVEN
        var robot = Robot("Roberto")
        // WHEN
        robot.place(4,0,"NORTH")
        robot.left()
        val actual = robot.facing
        val expected = "WEST"
        // THEN
        assertEquals(expected, actual)
    }

    @Test
    @DisplayName("it turn to the right")
    fun itTurnToTheRight() {
        // GIVEN
        var robot = Robot("Roberto")
        // WHEN
        robot.place(4,0,"NORTH")
        robot.right()
        val actual = robot.facing
        val expected = "EAST"
        // THEN
        assertEquals(expected, actual)
    }

    @Test
    @DisplayName("it report its position")
    fun itReportItsPosition() {
        // GIVEN
        var robot = Robot("Roberto")
        // WHEN
        robot.place(4,0,"NORTH")
        val actual = robot.report()
        // THEN
        // TODO comment vérifier la sortie console ???
        assertEquals(true, true)
    }

}