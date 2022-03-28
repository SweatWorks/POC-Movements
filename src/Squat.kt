class Squat(private val decorTo: IMovement): IMovement {

    private val id: Int = 5

    override fun points(): Int = this.decorTo.points() + 10

    override fun workoutMessage(): String = this.decorTo.workoutMessage() + "- Sentadilla"

    override fun workoutMovements(): String =
        this.decorTo.workoutMovements() + this.id

    override fun knowWhichWorkoutIs(key: String): String = workoutMovements().findWorkout()
}