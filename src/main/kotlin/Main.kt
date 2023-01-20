class SmartDevices (deviceName : String, category: String) {

    private val dName : String = deviceName
    private val category : String = category

    fun turnOn(){
        println("$dName Booting up .... ")
    }

    fun turnOff(){
        println("Logging off ....")
    }
}

fun main(){

    val smartDevices1 = SmartDevices("Samsung Smart TV", "Entertainment")
    smartDevices1.turnOn()
    smartDevices1.turnOff()

    val smartDevices2 = SmartDevices("Apple iPhone", "Personal")
    smartDevices2.turnOn()
}