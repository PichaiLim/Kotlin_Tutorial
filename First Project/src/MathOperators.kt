fun main(args: Array<String>) {
    println("Math Operators: ")

    //TODO Simple calculator
    println("Please enter the first number: ")
    var n1: Int = readLine()!!.toInt();
    println("Please enter to second number: ")
    var n2: Int = readLine()!!.toInt()

    var sum: Int
    sum = n1 + n2

    println("The sum is = ${sum}")

    var dif: Int
    dif = n1 - n2

    println("The difference is = ${dif}")

    var product: Int
    product = n1 * n2

    println("The product is = ${product}")

    var div: Float
    div = n1.toFloat() / n2.toFloat()

    println(n1.toString() + " divided by "+ n2.toString() +" is equla to ${div}")


    println("Please enter the number: ")
    var n3 = readLine()!!.toInt()

    var mod:Float
    mod = n1.toFloat() % n3.toFloat()
    println("mod = ${mod}")
}