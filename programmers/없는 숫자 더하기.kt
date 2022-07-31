class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = -1
        var result = 0
        
        for(i in 0..9)
            result += i
        
        for(i in numbers)
            result -= i
        
        answer = result
        return answer
    }
}
