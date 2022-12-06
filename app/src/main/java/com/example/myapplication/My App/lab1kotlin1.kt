package com.example.lab1kotlin1.lab1kotlin

//class lab1kotlin1 {
//}

fun main() {
    val subjectScore = arrayOf(67,52,73,85,42,78)
    println("There are "+ subjectScore.size+"subject in array.")
//   calculateGrade(subjectScore)
    CalculateGPAX(subjectScore)
}fun calculateGrade(scoreArr: Array<Int>){
    var i : Int =1
    var grade : String
    for (value in scoreArr){
        when {
            value <50 -> grade = "F"
            value <55 -> grade = "D"
            value <60 -> grade = "D+"
            value <65 -> grade = "C"
            value <70 -> grade = "C+"
            value <75 -> grade = "B"
            value <80 -> grade = "B+"
            else -> grade ="A"
        }
        println("Grade of subject number $i : $value = $grade")
        i++
    }

}fun CalculateGPAX(scoreArr: Array<Int>){
    var i : Int =1
    var grade : String =""
    var gpa : Double = 0.0
    var GPAX : Double
    val credit : Int = 3
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
        println("Grade of subject number $i : $value = $grade : $gpa")

        i++
    }
}