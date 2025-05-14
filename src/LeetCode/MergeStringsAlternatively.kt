package LeetCode

import kotlin.math.max

fun main() {

    val m = MergeStringsAlternatively()
    println( m.mergerAlternately("abc","pqr"))

}
class MergeStringsAlternatively {

    fun mergerAlternately(word1: String, word2: String): String{
        var result = CharArray(word1.length + word2.length)
        var index = 0
        var resultIndex = 0
        while (index < maxOf(word1.length, word2.length)){
            if(index<word1.length){
                result[resultIndex] = word1[index]
                resultIndex++
                println(result)
            }

            if (index < word2.length){
                result[resultIndex] = word2[index]
                resultIndex++
                println(result)
            }
            index++
        }
        return String(result)
    }
}