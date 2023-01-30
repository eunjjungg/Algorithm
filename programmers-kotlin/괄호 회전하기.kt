import java.util.Stack

class Solution {
    val smlL = 0
    val smlR = 1
    val midL = 2
    val midR = 3
    val lrgL = 4
    val lrgR = 5

    fun solution(s: String): Int {
        var answer: Int = 0

        for(i in 0..s.length - 1) {
            answer += getAnswer(i, s)
            if(getAnswer(i, s) == 1)
                print(i.toString() + " ")
        }
        return answer
    }

    fun getAnswer(x: Int, s: String): Int {
        val stack = Stack<Char>()

        for(i in x..s.length - 1) {
            if(!checkCorrectStack(s[i], stack))
                return 0
        }

        if(x != 0) {
            for(i in 0..x - 1) {
                if(!checkCorrectStack(s[i], stack))
                    return 0
            }
        }

        if(!stack.isEmpty())
            return 0

        return 1
    }

    fun checkCorrectStack(x: Char, stack: Stack<Char>): Boolean {
        if(getDirection(x) == smlL || getDirection(x) == midL || getDirection(x) == lrgL)
            stack.push(x)
        else if(stack.isEmpty()) {
            return false
        }
        else if(getDirection(x) == smlR){
            if(stack.pop() != '(')
                return false
        }
        else if(getDirection(x) == midR){
            if(stack.pop() != '{')
                return false
        }
        else {
            if(stack.pop() != '[')
                return false
        }
        return true
    }


    fun getDirection(i: Char): Int {
        return when(i) {
            '(' -> smlL
            ')' -> smlR
            '{' -> midL
            '}' -> midR
            '[' -> lrgL
            else -> lrgR
        }
    }
}
