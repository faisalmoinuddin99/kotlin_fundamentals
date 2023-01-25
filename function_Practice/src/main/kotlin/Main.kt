fun main() {

    val morningNotification = 51
    val eveningNotification = 135

    printNumberOfSummaryNotification(morningNotification)
    printNumberOfSummaryNotification(eveningNotification)
}

fun printNumberOfSummaryNotification(numberOfMessages : Int){

    if(numberOfMessages >= 100){
        println("Your phone is blowing up! You have 99+ notifications.")
    }else {
        println("You have $numberOfMessages notifications.")
    }
}
/*
You have 51 notifications.
Your phone is blowing up! You have 99+ notifications.
 */