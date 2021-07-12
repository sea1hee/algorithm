class PressKeypad {
    fun solution(numbers: IntArray, hand: String): String{
        var answer = ""
        var left = 10
        var right = 12


        for(i in numbers.indices){
            if (numbers[i] == 0){
                numbers[i] = 11
            }
            when(numbers[i]) {
                1, 4, 7 -> {
                    answer += "L"
                    left = numbers[i]
                }
                3, 6, 9 -> {
                    answer += "R"
                    right = numbers[i]
                }
                2, 5, 8, 11 -> {
                    val leftDis = calDistance(left.coerceAtMost(numbers[i]), left.coerceAtLeast(numbers[i]))
                    val rightDis = calDistance(right.coerceAtMost(numbers[i]), right.coerceAtLeast(numbers[i]))

                    if (leftDis == rightDis){
                        if (hand == "right"){
                            answer = answer + "R"
                            right = numbers[i]
                        }
                        else{
                            answer = answer + "L"
                            left = numbers[i]
                        }
                    }
                    else if(leftDis < rightDis){
                        answer = answer + "L"
                        left = numbers[i]
                    }
                    else{
                        answer = answer + "R"
                        right = numbers[i]
                    }
                }
            }
        }
        return answer
    }

    fun calDistance(num1 :Int, num2 :Int): Int{
        var returnValue :Int = (num2-num1)/3 + (num2-num1)%3
        return returnValue
    }
}