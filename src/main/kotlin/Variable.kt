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

//    nulable variable
    var nullableVar: String? = null
    nullableVar = "Nullable"
    println(nullableVar)
//    cause of nullable when call the variable must use ?
    println(nullableVar?.length)
    println(key)
    println(num)
    println(VERSION)
}
