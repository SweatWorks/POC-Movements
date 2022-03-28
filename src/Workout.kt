class Workout: IMovement{

    override fun points(): Int = 0

    override fun workoutMessage(): String =
        "**** Comenzando calentamiento ****\n" +
        "Qué movimientos se realizaron en este calentamiento?\n"

    override fun workoutMovements(): String = ""

    override fun knowWhichWorkoutIs(key: String): String = key.findWorkout()
}