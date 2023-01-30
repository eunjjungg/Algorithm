class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for(i in left..right) {
            if(getDivisor(i) % 2 == 0)
                answer += i
            else
                answer -= i
        }
        return answer
    }
}

fun getDivisor(x: Int): Int {
    var count = 0
    val limit = x / 2
    var temp = 1
    
    while(temp <= limit) {
        if(x % temp++ == 0)
            count++
    }
    
    return ++count
} 
