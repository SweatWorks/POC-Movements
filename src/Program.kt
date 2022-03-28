fun main() {

    var myWorkout: IMovement = Workout()
    println(myWorkout.workoutMessage())

    println("********************************\n")

    myWorkout = Squat(myWorkout)
    println(myWorkout.workoutMessage())
    println("Puntaje obtenido acumulado: ${myWorkout.points()}")

    println("********************************\n")

    myWorkout = Jump(myWorkout)
    println(myWorkout.workoutMessage())
    println("Puntaje obtenido acumulado: ${myWorkout.points()}")
    println(myWorkout.didIt())

    println("********************************\n")

    myWorkout = Jump(myWorkout)
    println(myWorkout.workoutMessage())
    println("Puntaje obtenido acumulado: ${myWorkout.points()}")

    println("********************************\n")

    println("Los ids de los movimientos son: ${ myWorkout.workoutMovements()}")
    println("El calentamiento realizado es: ${ myWorkout.knowWhichWorkoutIs(myWorkout.workoutMovements())}")
}

fun String.findWorkout(): String{
    val workoutsMap = hashMapOf<String, String>()
    workoutsMap["522"] = "Yoga Workout"

    return workoutsMap[this] ?: "Calentamiento desconocido"
}