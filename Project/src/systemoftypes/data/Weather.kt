package systemoftypes.data

sealed class Weather(label: String) {
    val label = "Weather is $label"
}

class Rainy : Weather("rainy")

class Windy : Weather("windy")

class Sunny : Weather("sunny")

class Snowy : Weather("snowy")

class Cloudy : Weather("cloudy")