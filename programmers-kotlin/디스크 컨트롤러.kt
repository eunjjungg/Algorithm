class Solution {
    fun solution(jobs: Array<IntArray>): Int {
        var answer = 0

        var q = PriorityQueue<IntArray>(compareBy({it[1]},{it[0]}))
        var q2 = PriorityQueue<IntArray>(compareBy({it[0]},{it[1]}))
        var check = 0

        q2.addAll(jobs)

        while (!q.isEmpty() || !q2.isEmpty()) {

            while (!q2.isEmpty() && q2.peek()[0] <= check) {
                q.add(q2.poll())
            }

            if (!q.isEmpty()) {
                check += q.peek()[1]
                answer += check - q.peek()[0]
                q.poll()
            }

            else if (!q2.isEmpty()) {
                check = q2.peek()[0]
            }
        }

        return answer/jobs.size
    }
}
