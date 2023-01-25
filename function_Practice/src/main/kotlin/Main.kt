fun main() {
    val trickFunction = trickOrTreat(true)
    val treatFunction = trickOrTreat(false)

    trickFunction() // No treat !
    treatFunction() // Have a treat....

    val runFunction = walkOrRun(true)
    val walkFunction = walkOrRun(false)

    runFunction() // Running...
    walkFunction() // Walking....


}

val trick: () -> Unit = {
    println("No treat !")
}

val treat: () -> Unit = {
    println("Have a treat.... ")
}

fun trickOrTreat(isTrick: Boolean): () -> Unit {
    return if (isTrick) {
        trick
    } else {
        treat
    }
}

//function 1
val walk : () -> Unit = {
    println("Walking....")
}

//function 2
val run : () -> Unit = {
    println("Running...")
}

// return function from function
fun walkOrRun(isRun : Boolean) : () -> Unit {
    return if (isRun){
        run
    }else {
        walk
    }
}