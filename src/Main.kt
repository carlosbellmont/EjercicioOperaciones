fun main() {

    println("El restulado del ejercicio1  ${ejercicio1(5)}")
    ejercicio2(5)
}

fun ejercicio1(num: Int) : Int {
    var result = 0
    if(num < 0) {
        result *= 2
        result += 3
    } else if (num > 0) {
        result /= 2
        result -= 3
    }
    return result
}



fun ejercicio2(num: Int) {
    if (num % 2 == 0) {
        println("El número $num es par")
    } else {
        println("El número $num es impar")
    }
}
