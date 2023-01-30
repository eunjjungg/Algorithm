class Solution {
    fun solution(w: Int, h: Int): Long {
        val wL = w.toLong()
        val hL = h.toLong()
        var answer: Long = 0
        var gcd: Long = 0
        if(wL > hL)
            gcd = gcd(wL, hL)
        else 
            gcd = gcd(hL, wL)
        
        answer = wL * hL - (wL + hL - gcd)
        
        return answer
    }
}

//유클리드 호제법 사용하여 최대공약수 구하기
fun gcd(a: Long, b: Long): Long {
    var larger = a
    var smaller = b
    var remainder: Long = -1
    
    while(remainder != 0.toLong()) {
        remainder = larger % smaller
        if(remainder != 0.toLong()) {
            larger = smaller
            smaller = remainder
        }
    }
    return smaller
}

