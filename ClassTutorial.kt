fun main() {

    /**
     * #1 In Kotlin no need to write "new" keyword when create a new Object
     * #2 Any code between [] is clickable and act like link
     *    click and hold control/command then click on the word between the square bracts
     *   try it here [SimpleUser]
     *
     *  #3 In Kotlin you can specify construct in class declaration like : class <className> (Parameters){ ...}
     *  take as example : [SimpleUser2]
     *
     *  #4 [SimpleUser2] and [SimpleUser3] do the same thing, but different syntax
     *   [SimpleUser3] removes code duplication found in [SimpleUser2]!!
     *   However, in [SimpleUser3] we assume that we won't change the value passed to constructor.
     *   If you need to do changes to value passed to constructor use [SimpleUser2]
     *
     *  #5 In Kotlin there is constructor block! if there a code you want to execute
     *     at object creation then you can put it in init{ } block which act as constructor block
     *   take as an example [SimpleUser4],
     *   init{ } block will be automatically get executed when we call the constructor.
     *   We can have multiple init{ } blocks in a single class.
     *
     *   #6 [SimpleUser4] and [SimpleUser5] do the same thing
     *
     */

    val su = SimpleUser()
    println("${su.name} ${su.age}")

    val su2 = SimpleUser2("Hamad", 34)
    println("${su2.name} ${su2.age}")

    val su3 = SimpleUser3("Said", 45)
    println("${su3.name} ${su3.age}")


    val su4 = SimpleUser4("  Khamis  ", 23)
    println("${su4.name} ${su4.age}")

}

class SimpleUser {
    var name = "Yousuf"
    var age = 27
}

class SimpleUser2(name: String, age: Int) {
    var name = "Yousuf"
    var age = 27
}

class SimpleUser3(var name: String, var age: Int) {

}

class SimpleUser4(name: String = "no-name", var age: Int = 0) {
    var name: String //global var

    /**
     * #1 init{ } block acts as constructor block
     *
     * #2 this refers to the global var NOT the parameter!
     */
    init {
        //check the data was passed to parameter is empty string or have only white spaces only!
        if (name.isBlank()) {
            this.name = "no-name"
        } else {
            this.name = name.trim()// remove white spaces before the string and after it!
        }
    }
}

class SimpleUser5(name: String = "no-name", var age: Int = 0) {
    var name: String =
        //check the data was passed to parameter is empty string or have only white spaces only!
        if (name.isBlank()) {
            "no-name"
        } else {
            name.trim()// remove white spaces before the string and after it!
        }

}



