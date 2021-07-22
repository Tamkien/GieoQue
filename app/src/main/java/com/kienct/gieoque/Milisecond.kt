package com.kienct.gieoque

class Milisecond (private val ms: String) {
    private val batQuai = listOf("000", "111", "011", "101", "001", "110", "010", "100")
    fun gieoQueChu() : String{
        return getThuongQuai().plus(getHaQuai())
    }
    private fun getThuongQuai(): String {
        var sum = 0
        for (i in 0..6) {
            sum += ms[i].toInt()
        }
        return batQuai[sum % 8]
    }
    private fun getHaQuai(): String {
        var sum = 0
        for (i in 7..12) {
            sum += ms[i].toInt()
        }
        return batQuai[sum % 8]
    }
}