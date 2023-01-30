class Solution {
    val m1 = 31
    val m2 = 29 + m1
    val m3 = 31 + m2
    val m4 = 30 + m3
    val m5 = 31 + m4
    val m6 = 30 + m5
    val m7 = 31 + m6
    val m8 = 31 + m7
    val m9 = 30 + m8
    val m10 = 31 + m9
    val m11 = 30 + m10

    fun solution(a: Int, b: Int): String {
        var answer = ""
        var days = 0

        when(a) {
            1 -> days = b
            2 -> days = m1 + b
            3 -> days = m2 + b
            4 -> days = m3 + b
            5 -> days = m4 + b
            6 -> days = m5 + b
            7 -> days = m6 + b
            8 -> days = m7 + b
            9 -> days = m8 + b
            10 -> days = m9 + b
            11 -> days = m10 + b
            12 -> days = m11 + b
        }

        when(days % 7) {
            0 -> answer = "THU"
            1 -> answer = "FRI"
            2 -> answer = "SAT"
            3 -> answer = "SUN"
            4 -> answer = "MON"
            5 -> answer = "TUE"
            6 -> answer = "WED"
        }

        return answer
    }
}
