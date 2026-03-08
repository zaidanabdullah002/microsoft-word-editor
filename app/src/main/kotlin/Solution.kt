package org.example.app

class Solution {
    val flyWeightFactory = FlyWeightFactory()
    val textRow = mutableListOf<TextRow>()
    fun addCharacter(row: Int, col: Int, ch: Char,
                     fontStyle: String, size: Int, italic: Boolean, bold: Boolean) {

        val r = textRow.size-1
        val chrObj = flyWeightFactory.createCharFlyWeight(ch,fontStyle,size,italic,bold)
        if(r >= row){
            val row = textRow[row]
            row.addChar(chrObj,col)
        }else{
            val row = TextRow()
            row.addChar(chrObj,col)
            textRow.add(row)
        }

    }
    fun readLine(row: Int) : String{
        val r = textRow.size-1
        var ans = ""
        if(r >= row){
            val row = textRow[row]
            val obj = row.readLine()
            obj.forEach {
                ans+=it.ch
            }
        }
        println(ans)
        return ans

    }
    fun getStyle(row: Int, col: Int) : String{
        val r = textRow.size-1
        val ans =  if(r >= row){
            textRow[row].getFlyWeight(col)?.getStyle()?:""
        } else {
            ""
        }
        println(ans)
        return ans
    }
    fun deleteCharacter(row: Int, col: Int) : Boolean{
        val r = textRow.size-1
        val ans =  if(r >= row) {
            textRow[row].deleteChar(col)
        }else{
            false
        }
        println(ans)
        return ans
    }

}