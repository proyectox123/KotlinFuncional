package highorderfunctions

import highorderfunctions.data.Logger

fun main(args: Array<String>) {
    getValue(5, Logger.CONSOLE)
    getValue(10, Logger.CONSOLE)
    getValue(20, Logger.CONSOLE)
}

fun getValue(number: Int, logger: Logger): String{
    val result = "Something $number"

    logger.print(result)

    return result
}