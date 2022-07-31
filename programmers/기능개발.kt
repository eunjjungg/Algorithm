import java.lang.Math.ceil

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val days = arrayOfNulls<Int>(progresses.size)
        val resultArr = arrayOfNulls<Int>(progresses.size)
        var resultSize = 0


        for (i in 0..progresses.size - 1) {
            days[i] = ceil((100.0 - progresses[i]) / speeds[i]).toInt()
        }

        var count = 0
        var pivot = 0
        while(count < progresses.size) {
            if(days[pivot]!! >= days[count]!!)
                count++
            else {
                resultArr[resultSize] = count - pivot
                resultSize++
                pivot = count
            }
        }

        if(count - pivot > 0){
            resultArr[resultSize] = count - pivot
            resultSize++
        }

        var answer = IntArray(resultSize)

        for(i in 0..resultSize - 1) {
            answer[i] = resultArr[i]!!
        }


        return answer
    }
}
