class Jump(private val decorTo: IMovement): IMovement {

    private val id: Int = 2

    override fun points(): Int = this.decorTo.points() + 5

    override fun workoutMessage(): String = this.decorTo.workoutMessage() + "\n" + "- Salto"

    override fun workoutMovements(): String = this.decorTo.workoutMovements() + this.id

    override fun knowWhichWorkoutIs(key: String): String = workoutMovements().findWorkout()

    fun didIt(): String = "Salto realizado"
}