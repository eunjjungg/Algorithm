class Solution {
    fun solution(record: Array<String>): Array<String> {
        var answer = arrayOf<String>()
        var hash = HashMap<String, String>()
        var changeCount = 0
        val status = 0
        val uid = 1
        val nickname = 2
        val entrance = "님이 들어왔습니다."
        val exit = "님이 나갔습니다."

        for(i in 0..record.size - 1) {
            val recordSplit = record[i].split(" ")

            when(recordSplit[status]) {
                "Enter" -> {
                    if(hash.containsKey(recordSplit[uid])) {
                        hash.replace(recordSplit[uid], recordSplit[nickname])
                    } else {
                        hash.put(recordSplit[uid], recordSplit[nickname])
                    }
                }
                "Change" -> {
                    changeCount++
                    hash.replace(recordSplit[uid], recordSplit[nickname])
                }
            }
        }

        val ans = Array<String>(record.size - changeCount) {i -> " "}
        var count = 0

        for(i in 0..record.size - 1) {
            val recordSplit = record[i].split(" ")

            when(recordSplit[status]) {
                "Enter" -> {
                    ans[count++] = "${hash.get(recordSplit[uid])}$entrance"
                }
                "Leave" -> {
                    ans[count++] = "${hash.get(recordSplit[uid])}$exit"
                }
            }
        }

        return ans
    }
}
