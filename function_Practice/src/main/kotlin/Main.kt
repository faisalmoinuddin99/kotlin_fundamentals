fun main() {
    // Fill in the code.
    // available temp : Celsius, Fahrenheit, Kelvin
    val temp : Double = 350.0
    val from : String = "Kelvin"
    val to : String = "Celsius"
    printFinalTemperature(temp,from,to){
        when {
            from == "Celsius" && to == "Fahrenheit" -> (temp * 9/5) + 32
            from == "Fahrenheit" && to == "Kelvin" -> (temp - 32) * 5/9 + 273.15
            from == "Kelvin" && to == "Celsius" -> temp - 273.15
            else -> 0.0
        }
    }
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}