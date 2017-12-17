package lazyevaluation.imperative

class Cart {

    val paymentConfig by lazy { Cart.loadAndPreparePaymentConfig() }
//    val paymentConfig : Map<String, String>
//        get() = Cart.loadAndPreparePaymentConfig()

    fun checkout(){
        if(paymentConfig["type"] == "card"){
            //TODO
        }
    }

    companion object {
        fun loadAndPreparePaymentConfig(): Map<String, String>{
            println("Very expensive operation!!!")

            return mapOf("currency" to "eur", "type" to "card")
        }
    }
}

fun main(args: Array<String>) {
    val cart = Cart()
    cart.checkout()
    cart.checkout()
}