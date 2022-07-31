class Solution {
    fun solution(n: Int): Int {
        var i = 1
        var answer: Int = 0

        while(true) {
            if((n/i) * i + 1 == n) {
                answer = i
                break
            } else {
                i++
            }
        }


        return answer
    }
}
