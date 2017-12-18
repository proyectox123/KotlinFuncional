package highorderfunctions.data

enum class Logger {
    CONSOLE, FILE, WINDOW;

    val print: (String) -> Unit get() = when(this){
        CONSOLE -> ::logToConsole
        FILE -> ::logToFile
        WINDOW -> ::logToWindow
    }
}

private fun logToConsole(message: String){
    println("logToConsole message -> $message")
}

private fun logToFile(message: String){
    println("logToFile message -> $message")
}

private fun logToWindow(message: String){
    println("logToWindow message -> $message")
}