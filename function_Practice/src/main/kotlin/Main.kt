fun main() {

    val coins: (Int) -> String = { quantity ->
        "$quantity quarter"
    }

    val cupCake: (Int) -> String = {
        "Have a cupcake !"
    }

    val human1 = testingFunctionality(true, cupCake)
    val human2 = testingFunctionality(true, coins)
    human1()
    /*
    Have a cupcake !
    Welcome, Sir! please sit here...
    */

}

fun testingFunctionality(isVerified: Boolean, extraFeature: (Int) -> String): () -> Unit {
    return if (isVerified) {
        // execute extraFeature
        println(extraFeature(5))
        welcomeMessage

    } else {
        message
    }
}

val welcomeMessage: () -> Unit = {
    println("Welcome Sir, please sit here...")
}

val message: () -> Unit = {
    println("Thanking you, will see you again.... 🙂")
}