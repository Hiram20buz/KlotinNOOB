fun shippingCost(amount: Double, international: Boolean): Double {
    
    if (international == false) {
        if (amount >= 75.0) {
            return 0.0
        }
        else {
            return 0.1*amount
        }
    }
    else {
        var tax = 0.15*amount
        if (tax > 50.0) {
            tax = 50.0
        }
        return tax
    }    
}
fun main(args: Array<String>) {
    val total = readLine()!!.toDouble()
    val international = readLine()!!.toBoolean()    
    println(shippingCost(total, international))

}
