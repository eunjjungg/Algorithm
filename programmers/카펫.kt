class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var width = 0
        var height = 0
        var check = false

        for(i in 1..yellow) {
            if(yellow % i == 0)
                check = checkAnswer(i, yellow, brown)
            if(check) {
                height = i + 2
                width = (yellow / i) + 2
                break
            }
        }

        var answer = intArrayOf(width, height)

        return answer
    }

    fun checkAnswer(i: Int, yellow:Int, brown: Int): Boolean {
        if((i + 2) * (yellow / i + 2) == yellow + brown)
            return true
        else
            return false
    }
}
