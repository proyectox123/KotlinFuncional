package systemoftypes

import systemoftypes.data.*

fun main(args: Array<String>) {
    navigateToNextScreen(Rainy())
    navigateToNextScreen(Sunny())
    navigateToNextScreen(Windy())
    navigateToNextScreen(Snowy())
    navigateToNextScreen(Cloudy())
}

fun navigateToNextScreen(weather: Weather) = when(weather){
    is Rainy -> println("Go to buy an umbrella")
    is Sunny -> println("Go to buy an ice cream")
    is Windy -> println("Go to buy a coffee")
    is Snowy -> println("Go to buy a snowboard")
    is Cloudy -> println("Go to buy a sweater")
}