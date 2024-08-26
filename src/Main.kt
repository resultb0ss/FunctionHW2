fun main() {

    mulNumber(1,4)
}

fun mulNumber(a: Int, b:Int){
    var result = 1
    for( num in a..b){
        result *= num
    }
    println(result)
}