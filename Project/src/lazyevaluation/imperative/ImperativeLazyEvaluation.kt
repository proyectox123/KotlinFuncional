package lazyevaluation.imperative

fun main(args: Array<String>) {
    val formattedPrice = format(9.99, loadActiveCurrency())

    println(formattedPrice)
}

fun loadActiveCurrency() = "€"

fun format(price: Double, currency: String): String{
    if(price <= 0){
        return "Free"
    }else{
        return "$price $currency"
    }
}