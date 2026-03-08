package org.example.app

class TextRow {
    val row = mutableListOf<CharFlyWeight>()

    fun addChar(ch: CharFlyWeight, col:Int){
        val i = row.size-1
        if(i >= col){
            row.add(ch)
        }else{
            row.add(ch)
        }
    }

    fun readLine(): MutableList<CharFlyWeight> {
        return row
    }

    fun deleteChar(col:Int): Boolean {
        val i = row.size-1
        if(i >= col){
            row.removeAt(col)
            return true
        }
        return false
    }


    fun getFlyWeight(col:Int):CharFlyWeight?{
        val i = row.size-1
        if(i >= col){
            return row[col]
        }
        return null
    }

}