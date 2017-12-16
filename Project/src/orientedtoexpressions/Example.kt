package orientedtoexpressions

fun main(args: Array<String>) {
    val ibans = listOf(
            "GB82 WEST 1234 5698 7654 32",
            "GB82 TEST 1234 5698 7654 32"
    )

    useImperativeForm(ibans)
    useFunctionalForm(ibans)
}

private fun useImperativeForm(ibans: List<String>) {
    println("**** useImperativeForm ****")
    ibans.forEach {
        val isValid = orientedtoexpressions.imperative.validate(it)
        println(it + if (isValid) " may be valid" else " is not valid")
    }
}

private fun useFunctionalForm(ibans: List<String>){
    println("**** useFunctionalForm ****")
    ibans.forEach {
        val isValid = orientedtoexpressions.functional.validate(it)
        println(it + if (isValid) " may be valid" else " is not valid")
    }
}