fun main() {

    /**
     * 1. to define a var in Kotlin  :> var userName : String  = "Yousuf"
     * in case you provide a value then Kotlin will understand what is the data type so no need to specify the data type
     * the var then can be defined as :> var userName  = "Yousuf"
     *
     * 2. in case you need to define a var without a value then you need to specify the data type
     *  e.g :> var x : Int
     *
     * 3. you can try pieces of code using Kotlin REPL: which can be found under Tools > Kotlin > Kotlin REPL
     *      confirm code by command by Enter
     *      #Also you can call your own functions using REPL
     *      # Click cancel button "X" to stop REPL
     *      # F1 to see documentation of a function
     *
     * 4.  functions Parameters are declare as val, means you cannot change the value!!!
     *
     * 5. You can make function return a value by assigning a data type to it. for example :
     *      getMax(v1 : Int, v2 Int) : Int {} // now this function have to return an int value
     *
     * 6. In Kotlin Global vars have to be initialize when you declare them, in other other words
     *    you have to give them a value ! like this var::  x : Int = 10 OR var x = 10
     *
     * 7. In Kotlin you can define global constant values like : val KEY_ID = "id"
     *    also you can declare it like : const val KEY_ID = "id"
     *    which is almost equivalent to public static final  KEY_ID ="id" in java
     */

//   print("Hello World!\t")
//   exp2()
//   math()
//   arrayExample()
//   forLoopsExample()
//   logicExamples()
//   whileExample()
//   forLoopSkipRange()
//   prefixExample()// you can use if statement to return value
//   timeExample()
//   whenExample()
//   whenTrafficLightExample()
//   whenExp()
//   greetings("hi")
//   printNumbersASC(23, 8)
//   printNumbersDESC(23, 8)
//   println("Max number is ${getMax(3, 30)}")
//   println("The smallest number is ${getMin(78, 87)}")

//    defaultParametersExample()
//    defaultParametersExample("hi")
//    defaultParametersExample(repeat = 5)
//    defaultParametersExample("hello", 5)

//    println(getSum(10, 20, 40))
//    println(getSum(50, 50))
//    println(getSum(80, -50))
//    val array = intArrayOf(2,3,5)
//    println(getSum(*array))
//    println(getSum(10,20,*array,30,40,50))

//    println(getSum2(6, 2, 3, 5, b = 6))
//    println(getSum2(a = 6, numbers = *intArrayOf(2, 3, 5), b = 6))
//    val array2 = intArrayOf(2, 3, 5)
//    println(getSum2(6, *array2, b = 6))
//    println(getSum2(a = 6, numbers = *array2, b = 6))

//    println(getBiggestNumber(1))
//    println(getBiggestNumber(60,20,30,80,10))

}


fun math() {

    var a: Double = 5.0
    var b: Double = 6.0

    println("a = $a \t b = $b")
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")

}

fun exp1() {

    var userName = "Yousuf"
    var age = 27
    val cid = 441122 // val similar to final, val define constant
    var x: Int
    var char: Char = 's'
    var b: Boolean = true


    println(
        "my name is $userName & I'm $age, " +
                "After 2 years I will be ${age + 2}" +
                "\n here is my civil id $cid"
    )
}

fun exp2() {
    //raw string allow to write as you wish without having to skip special with back slash
    // also if click enter it would make the text go to next line without having to use \n
    //trimMargin() will remove auto margin, auto margin happens when you click Enter the IDE adds some margin and trimMargin() removes it automatically
    var rawString = """Hi
        |Hello
    """.trimMargin()

    print(rawString)
}

fun arrayExample() {
    // this like the normal array in java fixed size!!
    var names = arrayOf("John", "Harry", "Sami", "Tom")
    var numbers = arrayOf(1, 2, 3, 4)
    //println("First element ${names[0]} : ${numbers[0]} ")

    names[0] = "Yousuf" //swap value at index zero
    println("\nFirst element ${names[0]}, Size: ${names.size} ")

    /**
     * 1. you can save multiple data types in one array
     */
    var namesAndNumbers = arrayOf(1, "yousuf", 2, "Ali", 'a', 34.9)//

    /**
     * 2. you can save multiple arrays in one array
     * this is a multi-dimension array
     */
    var arrayOfArrays = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    //printing the second element of the first row
    println(arrayOfArrays[0][1])

    //printing the third element of the second row
    println(arrayOfArrays[1][2])

    //printing the first element of the third row
    println(arrayOfArrays[2][0])

    //printing the last element of namesAndNumbers
    println("last element in namesAndNumbers is ${namesAndNumbers.last()}")


}

fun forLoopsExample() {

    var names = arrayOf("jim", "jimmy", "John")
    for (name in names) {
        print("$name, ")
    }
    println()

    //loop through string
    for (char in names[1]) {
        print("$char-")
    }

    println()

    // print numbers from 1 to 10 using for, this only works with incremental loops like 1 to 10 but won't work from 10 - 1!!!!
    for (i in 1..10) {
        print("$i ")
    }

    println()
    // print numbers from 1 until 10 excluding 10!  this only works with incremental loops like 1 to 10 but won't work from 10 - 1!!!!
    for (i in 1 until 10) {
        print("$i ")
    }

    println()
    // print numbers from 10 downTo 1 !  this only works with decremental loops like 10 to 1 but won't work from 1 - 10!!!!
    for (i in 10 downTo 1) {
        print("$i ")
    }

    println()
    // print numbers from 1 to 10 while skipping one number | in each iteration take two steps instead of 1
    for (i in 1..10 step 2) {
        print("$i ")
    }

    println()
    // print numbers from 1 to 10 while skipping one number | in each iteration take four steps instead of 1
    for (i in 1..10 step 4) {
        print("$i ")
    }


    println()
    // print letters from A to z
    for (i in 'A'..'z') {
        print("$i ")
    }

    println("\n")
    //print index & val
    for (index in names.indices) {

        println("index : $index \t value: ${names[index]}")
    }


}

fun logicExamples() {

    println("${2 >= 1}")
    println("${2 == 1}")
    println("${2 != 1}")
    println("${!(2 == 1)}")
}

fun whileExample() {
    var i = 0
    while (i < 5) {
        print("${i++} ")
    }

    println()

    var k = 0
    do {
        println("this is do while")
    } while (k < 0)

    println()

    // you can use brake to target an outer loop using label, label can be any name, but there certain word you cannot use
    //first@ : first label
    //second@ : second label
    first@
    for (i in 1..5) {
        println(i)
        second@
        for (k in 1..i) {
            print("----$k ")
            if (k == 3) {
                break@first // this break will stop the first loop
            }
        }
        println()
    }


}

fun forLoopSkipRange() {
    //TODO print numbers from 1 to 100 while skipping all numbers between 30 and 79
    for (i in 1..100) {
        if (i !in 30..79) {// if "i" doesn't equal any number between 30 and 79 then print "i"
            print("$i ")
            if (i % 5 == 0) println()// print 5 items in each line
        }
    }
}

fun prefixExample() {

    for (i in 1..10) {

        val prefix = if (i % 2 == 0) {
            "\n:"
        } else {
            "\n."
        }

        print("$prefix $i")
    }
}

fun timeExample() {

    val time = 13
    val msg = if (time in 0..11) {
        "Good Morning!"
    } else if (time == 12) {
        "lunch time!"
    } else if (time in 13..23) {
        "Good Evening!"
    } else {
        "$time is invalid entry!"
    }

    println(msg)
}

fun whenExample() {
    //somewhat smilier to switch
    val time = 13
    val msg = when (time) {
        in 0..11 -> {
            "Good Morning!"
        }
        12 -> {
            "lunch time!"
        }
        in 13..23 -> {
            "Good Evening!"
        }
        else -> { //else here is like default in switch
            "$time is invalid entry!"
        }
    }

    println(msg)
}

fun whenTrafficLightExample() {

    val trafficLightColor = "red"

    val msg = when (trafficLightColor) {
        "red", "Red", "RED" -> "STOP!"
        "green", "Green", "GREEN" -> "GO!"
        "yellow", "Yellow", "YELLOW" -> "WAIT!"
        else -> "$trafficLightColor is invalid color"
    }

    println(msg)

}

fun whenExp() {

    // in case you used

    val number = 88
    val isLessThanZero = false
    val msg = when {
        isLessThanZero -> "$number is negative!"
        number in 1..49 -> "$number is less than 50"
        number == 50 -> "$number equals 50"
        number in 51..100 -> "$number is bigger than 50 and less than OR equal 100"

        else -> "Invalid"
    }

    println(msg)


}

fun greetings(msg: String) {

    println("$msg Kotlin")
}

fun printNumbersASC(x: Int, y: Int) {

    //regardless of the order of parameters values this function will print numbers in ascending order!
    val range = if (y > x) {
        x..y
    } else {
        y..x
    }
    for (i in range) {
        print("$i ")
    }
    println()
}

fun printNumbersDESC(x: Int, y: Int) {
    //regardless of the order of parameters values this function will print numbers in descending order!
    val range = if (y < x) {
        x downTo y
    } else {
        y downTo x
    }
    for (i in range) {
        print("$i ")
    }
    println()
}

fun getMax(v1: Int, v2: Int): Int {
    return if (v1 >= v2) {
        v1
    } else {
        v2
    }
}

// single Expression Function Example this syntax works only if you have a single expression. This function will get minimum!
fun getMin(x: Int, y: Int) = if (x >= y) y else x

// this function overload the first one
fun getMin(x: Double, y: Double) = if (x >= y) y else x

/**
 * "hello" & 1 are the default values, so you can call the function without any parameters

 * or you can send any on of them or both.  All the following scenarios will work
 * example :
1. defaultParametersExample()
2. defaultParametersExample("hi")
2. defaultParametersExample(5)
3. defaultParametersExample("hi" , 3)

# However this call wont work :     defaultParametersExample(5)!

# Solution :  defaultParametersExample(repeat = 5)

 */
fun defaultParametersExample(msg: String = "Hello Kotlin", repeat: Int = 1) {
    for (i in 1..repeat) {
        println("$i. $msg.")
    }
}

/**
 * #1 vararg allow you to send as many parameters as you want
 * #2 You can add a default value this way : (vararg numbers: Int = intArrayOf(0))
 * #3 You can call getSum() using the following ways:
 *  3.1 getSum(1,2,3,5)
 *  3.2 val array = intArrayOf( 1,2,3,5)
 *      getSum(*array)// the "*" is called Spread Operator
 *      // using *array is equivalent of typing numbers directly
 *      // also you can call this this function like : getSum(10,20,*array,30,40,50)
 *
 *
 *
 */
fun getSum(vararg numbers: Int): Int {
    var sum = 0;
    for (n in numbers) {
        sum += n;
    }
    return sum
}

/**
 * # You
 *  getSum2( 6, 2,3,5, b = 6)
 *  getSum2( a=6, numbers = *intArrayOf(2,3,5), b = 6)
 *  val array2 = intArrayOf(2,3,5)
 *  getSum2( 6, *array2 , b = 6)
 *  getSum2( a=6, numbers = *array2, b = 6)
 */
fun getSum2(a: Int, vararg numbers: Int, b: Int): Int {
    var sum = a * b;
    for (n in numbers) {
        sum += n;
    }
    return sum
}

fun getBiggestNumber(first: Int, vararg numbers: Int): Int {
    var max = first;
    for (i in numbers) {
        if (i > max) {
            max = i
        }
    }
    return max
}

