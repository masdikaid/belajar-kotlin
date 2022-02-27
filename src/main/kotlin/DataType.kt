
//=============== Data Type ===============
//----- Number Data Type
fun numberDataType() {
//      byte (8) -128 to 127
    val numByte: Byte = 30
    println(numByte)
    println(numByte.javaClass.typeName)

//      short (16) -32768 to 32767
//      underscore can be separator that help number readable
    val numShort: Short = 20_000
    println(numShort)
    println(numShort.javaClass.typeName)

//      integer (32) -2,147,483,648 (-2^31) to 2,147,483,647 (2^31-1)
    val numInteger: Int = 2_000_000_000
    val numInteger2 = 1_000_000_000
    println(numInteger)
    println(numInteger.javaClass.typeName)
    println(numInteger2.javaClass.typeName)

//      long (64) -9,223,372,036,854,775,808 (-2^63) to 9,223,372,036,854,775,807 (2^63-1)
    val numLong: Long = 2_000_000_000_000_000
//  if value in range of int but want fill to be long must be type with "L" ie: 500L
    val numLong2= 2_000_000_000_000_000
    println(numLong)
    println(numLong.javaClass.typeName)
    println(numLong2.javaClass.typeName)


//      float (32) 6-7 Decimal Digits
//      float must type with F
    val numFloat: Float = 2.4F
    val numFloat2= 2.4F
    println(numFloat)
    println(numFloat.javaClass.typeName)
    println(numFloat2.javaClass.typeName)


//      double (64) 15-16 Decimal Digits
    val numDouble: Double = 200.40
    val numDouble2= 200.42
    println(numDouble)
    println(numDouble.javaClass.typeName)
    println(numDouble2.javaClass.typeName)
}

//      Character Data Type
fun charDataType() {
    val character: Char = 'K'
    val character2: Char = '2'
    val character3 = '@'
    println("$character $character2")
}

//      String Data Type
fun stringDataType() {
    val oneLine: String = "This is one line string"
    val multiLine: String = """
        This is first line in Multi line 
        This is Second line in multi line
    """.trimIndent()
    val firstName = "Dika"
    val lastName = "Adi Setiawan"
    println(oneLine)
    println(multiLine)
    println("$firstName $lastName")
    println("length of first string is ${oneLine.length}")
}

fun boolDataType() {
    val trueVar: Boolean = true
    val falseVar: Boolean = false
    val falseVar2 = false
    println("$trueVar $falseVar")
}
