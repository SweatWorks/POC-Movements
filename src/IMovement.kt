interface IMovement {
    fun points(): Int
    fun workoutMessage(): String
    fun workoutMovements(): String
    fun knowWhichWorkoutIs(key: String): String
}