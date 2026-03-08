package org.example.app

class CharFlyWeight(val ch:Char,val font:String,
    val fontSize:Int, val italic:Boolean,val bold:Boolean) {

    fun getChar(): Char {
        return ch
    }

    fun getStyle() : String{
        val res = StringBuilder().append(ch)
            .append('-')
            .append(font)
        .append(' ')
        .append(fontSize)
        .append(' ')
        .append(if(italic){'i'}else{""})
        .append(' ')
        .append(if(bold){'b'}else{""})
        return res.toString()
    }

}