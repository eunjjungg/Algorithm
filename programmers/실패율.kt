class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = IntArray(N)
        var fail = mutableMapOf<Int, Float>()

        for(i in 0..N - 1) {
            fail.put(i + 1, getFailure(i + 1, stages))
        }

        val descendingOrderList = fail.toList().sortedWith(compareByDescending({it.second}))

        for(i in 0..N - 1) {
            answer[i] = descendingOrderList[i].first
        }

        return answer
    }

    fun getFailure(x: Int, stages: IntArray): Float {
        var allUser = 0
        var failUser = 0
        for(i in 0..stages.size - 1) {
            if(stages[i] >= x)
                allUser++
            if(stages[i] == x)
                failUser++
        }

        if(allUser == 0)
            return 0.toFloat()

        return failUser / allUser.toFloat()
    }
}
