fun main() {

//    val coins: (Int) -> String = {
//        "$it quarter"
//    }

    val cupCake: (Int) -> String = {
        "Have a cupcake !"
    }

    // trailing lambda syntax, we don't need to pass coin as reference variable
    val human1 = testingFunctionality(true) {
        "$it quarter"
    }

    /* repeat is a high-order function, which uses the for loop behind the hood
    also it uses trailing lambda syntax
     */
    repeat(5){
        human1()
    }



}

fun testingFunctionality(isVerified: Boolean, extraFeature: ((Int) -> String)?): () -> Unit {
    return if (isVerified) {
        // execute extraFeature
        if (extraFeature != null) {
            println(extraFeature(5))
        }
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