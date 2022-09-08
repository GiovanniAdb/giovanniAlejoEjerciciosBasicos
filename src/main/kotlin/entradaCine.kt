fun main(){
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    val senior2 = 102

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
    println("The movie ticket price for a person aged $senior2 is \$${ticketPrice(senior2, isMonday)}.")

}

fun ticketPrice(age: Int, isMonday: Boolean):Int{
    if (age <= 12 && age > 0)
    {
        return 15
    }else if (age <= 60 && age >= 13)
    {
        if(isMonday)
        {
            return 25
        }else return 30
    }else if(age <= 100 && age >= 61)
    {
        return 20
    }else return -1
}