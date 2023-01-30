package baekjoon

fun main() = with(System.`in`.bufferedReader()){
    val k = readLine().toInt()
    val numbers = arrayListOf<Int>()

    for(i in 0 until k){
        val check = readLine().toInt()
        if(check != 0) {
            numbers.add(check)
        }
        else {
            numbers.removeAt(numbers.size - 1)
        }
    }

    var result = 0
    
    for(i in 0..numbers.size - 1) {
        result += numbers[i]
    }
    
    println(result)
}
