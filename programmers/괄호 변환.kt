class Solution {
    fun solution(p: String): String {
        return r(p, 0)
    }

    fun r(p: String, start: Int): String {
        if(p == "" || start >= p.length)
            return ""

        val result = checkCorrectString(p, start)

        if(result[0] == 1) {
            val rResult = r(p, result[1] + 1)
            var tmp = ""
            for(i in start..result[1])
                tmp = "$tmp${p[i]}"
            return "$tmp$rResult"
        }
        else {
            var tmp = "("
            val rResult = r(p, result[1] + 1)
            tmp = "$tmp$rResult)"

            for(i in start + 1..result[1] - 1) {
                when(p[i]) {
                    '(' -> tmp = "$tmp)"
                    else -> tmp = "$tmp("
                }
            }
            return tmp
        }

    }

    fun checkCorrectString(p: String, start: Int): Array<Int> {
        //올바른 문자열일 경우 올바른 짝이 되는 위치까지 반환
        //올바르지 않은 문자열일 경우 올바르지 않지만 짝은 맞는 위치까지 반환
        var left = 0
        var right = 0
        var correctness = true

        for(i in start..p.length - 1) {
            when(p[i]) {
                '(' -> left++
                ')' -> right++
            }
            if(left < right)
                correctness = false

            if(correctness == false && left == right)
                return arrayOf(0, i)
            else if(correctness == true && left == right)
                return  arrayOf(1, i)
        }

        return arrayOf(-1, -1)
    }
}
