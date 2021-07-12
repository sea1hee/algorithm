import java.sql.DriverManager.println

class FineSquare {
    fun solution(w: Int, h: Int): Long {
        var answer: Long = 0
        var r_w :Long = w.toLong()
        var r_h :Long = h.toLong()

        if (w > h) {
            r_w = h.toLong()
            r_h = w.toLong()
        }

        val gcd = calGcd(r_w, r_h)

        answer = r_w * r_h - (r_w + r_h - gcd)
        return answer
    }

    fun calGcd(num1: Long, num2: Long): Long{
        var returnValue : Long = 1
        for(i in 1..num1){
            if (num1 % i == 0.toLong() && num2 % i == 0.toLong()) {
                returnValue = i
            }
        }
        return returnValue
    }
}

fun main(){
    val result = FineSquare().solution(8, 12)
    println("$result")
}