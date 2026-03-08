package org.example.app

class FlyWeightFactory {
    val stringToChars = mutableMapOf<String, CharFlyWeight>()

    fun createCharFlyWeight(ch: Char,
                            font: String, size: Int, italic: Boolean, bold: Boolean): CharFlyWeight {
        val res = StringBuilder().append(ch)
            .append('-')
            .append(font)
            .append(' ')
            .append(size)
            .append(' ')
            .append(if(italic){'i'}else{""})
            .append(' ')
            .append(if(bold){'b'}else{""})
            .toString()

        val obj = CharFlyWeight(ch,font,size,italic,bold)
        stringToChars[res] = obj
        return stringToChars[res]!!
    }
}