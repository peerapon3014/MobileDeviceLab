package com.example.myapplication.`My App`.mobileAss

import com.example.lab1kotlin1.lab1kotlin.CalculateGPAX


fun main() {
    val subjectScore = arrayOf(67,52,73,85,42,78)
    println("There are "+ subjectScore.size+"subject in array.")
//   calculateGrade(subjectScore)
    CalculateGPAX(subjectScore)
    fun CalculateGPAX(scoreArr: Array<Int>) {
        var i : Int = 1
        var grade : String
        var numgrade : Float
        var listresult = mutableListOf<Float>()
        var sum : Float
        var result : Float = 0f
        var credit :Int = 3
        for (value in scoreArr) {
            if (value < 50) {
                grade = "F"
                numgrade = 0.0f
            }
            else if (value < 55) {
                grade = "D"
                numgrade = 1.0f
            }
            else if (value < 60) {
                grade = "D+"
                numgrade = 1.5f
            }
            else if (value < 65) {
                grade = "C"
                numgrade = 2.0f
            }
            else if (value < 70) {
                grade = "C+"
                numgrade = 2.5f
            }
            else if (value < 75) {
                grade = "B"
                numgrade = 3.0f
            }
            else if (value < 80) {
                grade = "B+"
                numgrade = 3.5f
            }
            else {
                grade = "A"
                numgrade = 4.0f
            }
            listresult.add(numgrade)
            sum = numgrade*credit
            result = result + sum
            println("Grade of Subject Number $i : $value = $grade : $numgrade")
            i++
        }
        result = result / (credit*listresult.size)
        println("GPAX = ((${listresult.get(0)}*$credit) + (${listresult.get(1)}*$credit) + (${listresult.get(2)}*$credit) + (${listresult.get(3)}*$credit) + (${listresult.get(4)}*$credit) ) / "+credit*listresult.size+" = $result")
    }
}