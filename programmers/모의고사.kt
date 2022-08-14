class Solution {
    fun solution(answers: IntArray): IntArray {
        var ans = arrayOf(0, 0, 0)
        var ansList = mutableListOf<Int>()

        for(i in 0..answers.size - 1) {
            ans[0] += checkFirst(i, answers[i])
            ans[1] += checkSecond(i, answers[i])
            ans[2] += checkThird(i, answers[i])
        }

        var max = ans[0]
        for(i in 1..2) {
            if(ans[i] > max)
                max = ans[i]
        }

        for(i in 0..2) {
            if(max == ans[i])
                ansList.add(i + 1)
        }

        var answer = IntArray(ansList.size)
        for(i in 0..ansList.size - 1) {
            answer[i] = ansList[i]
        }

        return answer
    }

    fun checkFirst(number: Int, answer: Int): Int {
        when(number % 5) {
            0 -> if(answer == 1) return 1
            1 -> if(answer == 2) return 1
            2 -> if(answer == 3) return 1
            3 -> if(answer == 4) return 1
            4 -> if(answer == 5) return 1
        }
        return 0
    }

    fun checkSecond(number:Int, answer: Int): Int {
        if(number % 2 == 0 && answer == 2)
            return 1
        when(number % 8) {
            1 -> if(answer == 1) return 1
            3 -> if(answer == 3) return 1
            5 -> if(answer == 4) return 1
            7 -> if(answer == 5) return 1
        }
        return 0
    }
    fun checkThird(number:Int, answer: Int): Int {

        when(number % 10) {
            0, 1 -> if(answer == 3) return 1
            2, 3 -> if(answer == 1) return 1
            4, 5 -> if(answer == 2) return 1
            6, 7 -> if(answer == 4) return 1
            8, 9 -> if(answer == 5) return 1
        }
        return 0
    }
}
