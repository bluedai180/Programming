package KotlinExercise

/**
 * Created by Blue on 2017/5/27.
 */

fun num(a:Int, b:Int, c:Int = 5) = a + b + c

fun delete(a:Int, b:Int): Unit {

}

fun main(args: Array<String>) {
    var a: Int = 1
    val b = 2
    var c: Int
    c = 3
    println(num(1, 3))
    println(num(1, 3, 1))
    println("${num(19, 23)}")
    println("a = $a, b = $b")
}
