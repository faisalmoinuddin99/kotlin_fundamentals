fun main() {

    val child = 5
    val adult = 28
    val senior = 87


    val isMonday = true


    println("The movie ticket price for a person aged $child is  \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")


}

fun ticketPrice(age: Int, isMonday: Boolean): Any {

    var price: Int = 0

    price = when {
        age in 1..12 -> 15
        isMonday && age in 13..60 -> 25
        age in 13..60 -> 30
        age in 61..100 -> 20
        else -> -1
    }
    return price

}

/*
The movie ticket price for a person aged 5 is  $15.
The movie ticket price for a person aged 28 is $25.
The movie ticket price for a person aged 87 is $20.
 */