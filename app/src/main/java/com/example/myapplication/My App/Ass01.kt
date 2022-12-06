package com.example.myapplication.`My App`

fun main() {
    val subjectScore = arrayOf(67,52,73,85,42,7)
    println("There are "+ subjectScore.size+"subject in array.")
//   calculateGrade(subjectScore)
    CalculateGPAX1(subjectScore)
}
fun CalculateGPAX1(scoreArr: Array<Int>){
    var i : Int =1
    var grade : String
    var gpa : Double = 0.0
    var gpaSum: Double
    val credit : Int = 3
    var resultList = mutableListOf<Double>()
    var sum : Float
    var result : Double = 0.0
    for (value in scoreArr){
        if(value <50) {
            gpa = 0.0 ; grade="F"
        }else if(value <55) {
            gpa = 1.0 ; grade="D"
        }else if(value <60) {
            gpa = 1.5 ; grade="D+"
        }else if(value <65) {
            gpa = 2.0 ; grade="C"
        }else if(value <70) {
            gpa = 2.5 ; grade="C+"
        }else if(value <75) {
            gpa = 3.0 ; grade="B"
        }else if(value <80) {
            gpa = 3.5 ; grade="B+"
        }else {
            gpa = 4.0 ; grade="A"
        }
        resultList.add(gpa)
        sum = (gpa*credit).toFloat()
        result = result + sum
        println("Grade of subject number $i : $value = $grade : $gpa")

        i++
    }
    result = result / (credit*resultList.size)
    println("GPAX = ((${resultList.get(0)}*$credit) + (${resultList.get(1)}*$credit) + (${resultList.get(2)}*$credit) + (${resultList.get(3)}*$credit) + (${resultList.get(4)}*$credit) ) / "+credit*resultList.size+" = $result")
}