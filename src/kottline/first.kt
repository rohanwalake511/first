package kottline

class first {
}

fun printhello(){
    println("Hello world")
}

fun printmessage(message:String):Unit{
    println(message)
}

fun printMessageWithPrefix(message:String, prefix:String="Info"){
    println("[$prefix] $message")
}
fun sum(x:Int,y:Int):Int{
    return x+y
}
fun product(x:Int, y:Int)=x*y
// sum and product can be written either ways

fun main() {
    println("hello")
    printhello()

    printmessage("Hello")
    printMessageWithPrefix("Hello","Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello world")
    println(sum(1,2))
    println(product(2,4))
}

