fun main(){
    val uAla1 = 27.0
    val uAla2 = 350.0
    val uAla3 = 10.0

    val cel = "Celsius"
    val fahr = "Fahrenheit"
    val kel = "Kelvin"

    val celafhr = { ini:Double -> (((9.0/5.0)*ini)+32.0)}
    val kelacel = { ini:Double -> ini-273.15}
    val fahrakel = { ini:Double -> (((5.0/9.0)*(ini-32))+273.15)}

    printFinalTemperature(uAla1 ,cel,fahr,celafhr)
    printFinalTemperature(uAla2, kel, cel, kelacel)
    printFinalTemperature(uAla3, fahr, kel, fahrakel)
}
fun printFinalTemperature(
    initialMeasurement : Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double)->Double
)
{
    val finalMeasurement = String.format("%.2f",conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit")
}