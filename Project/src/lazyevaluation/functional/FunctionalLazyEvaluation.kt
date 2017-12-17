package lazyevaluation.functional

fun main(args: Array<String>) {
    val formattedPrice = format(9.99)

    println(formattedPrice)
}

fun loadActiveCurrency() = "€"

fun format(price: Double): String{
    if(price <= 0){
        return "Free"
    }else{
        return "$price ${loadActiveCurrency()}"
    }
}