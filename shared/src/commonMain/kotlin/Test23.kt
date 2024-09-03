import kotlin.js.ExperimentalJsExport
import kotlin.js.JsExport

@OptIn(ExperimentalJsExport::class)
@JsExport
class Test23 {
    fun test23() {
        println("sdf")
    }
}

@OptIn(ExperimentalJsExport::class)
@JsExport
class ExampleClass {
    fun greet() {
        println("Hello from Kotlin JS")
    }

    fun reverseString(input: String): String {
        val reversed = input.reversed()
        println("The reverse of \"$input\" is \"$reversed\"")
        return reversed
    }
}

@OptIn(ExperimentalJsExport::class)
@JsExport
fun main() {
    val example = ExampleClass()
    example.greet()
}
