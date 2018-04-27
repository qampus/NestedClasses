class outer {
    val mString = "Hallo Hasan"

    class nested {
        val iString = "Inside class"

        fun callInside(): String {
            return "Function nested inside class"
        }
    }
}

fun main(args: Array<String>) {

    //accessing member variable of the class
    println(outer.nested().callInside())

    //create object in nested class

    val nested = outer.nested()

    println(nested.callInside())
}