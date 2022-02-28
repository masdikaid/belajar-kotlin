//variable
/*
kotlin have 2 type of variable
        1. mutable use var
        2. immutable use val or and const val for global variable
*/

const val VERSION = "1.0.1"

fun variableKotlin() {
    val key = "string key"
//    key = "new string key" //this will be error
    var num = 10
    num = 15
    println(key)
    println(num)
    println(VERSION)
}
