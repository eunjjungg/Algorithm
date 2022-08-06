class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size)
        val first = 0
        val last = 1
        val key = 2
        var size = 0

        for(i in 0..commands.size - 1) {
            size = commands[i][last] - commands[i][first] + 1
            val tmp = IntArray(size)
            var count = commands[i][first] - 1
            for(j in 0..size - 1) {
                tmp[j] = array[count++]
            }
            val keyPosition = commands[i][key] - 1
            answer[i] = tmp.sorted()[keyPosition]
        }

        return answer
    }
}
