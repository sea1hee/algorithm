import sun.tools.jconsole.MaximizableInternalFrame

class mockexam {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        var scoreList = IntArray(3)

        val first = intArrayOf(1,2,3,4,5)
        val second = intArrayOf(2,1,2,3,2,4,2,5)
        val third = intArrayOf(3,3,1,1,2,2,4,4,5,5)

        for (i in answers.indices) {
            if (answers[i] == first[i%first.size]) {
                scoreList[0]++
            }
            if (answers[i] == second[i%second.size]) {
                scoreList[1]++
            }
            if (answers[i] == third[i%third.size]) {
                scoreList[2]++
            }
        }

        val max = scoreList[0].coerceAtLeast(scoreList[1].coerceAtLeast(scoreList[2]))
        val answerList : MutableList<Int> = ArrayList()
        if (max == scoreList[0]) answerList.add(1)
        if (max == scoreList[1]) answerList.add(2)
        if (max == scoreList[2]) answerList.add(3)

        answer = IntArray(answerList.size)
        for (i in answerList.indices){
            answer[i] = answerList[i]
        }

        return answer
    }
}