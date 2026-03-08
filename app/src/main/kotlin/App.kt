package org.example.app


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val obj = Solution()

    obj.addCharacter(0, 0, 'g', "Cambria", 17, true, true)
    obj.addCharacter(1, 0, 'y', "Century Gothic", 14, true, true)
    obj.addCharacter(1, 1, 'h', "Courier New", 22, false, false)
    obj.addCharacter(1, 2, 'y', "Georgia", 14, false, false)

    obj.getStyle(0,0) //returns 'g-Cambria-17-b-i'
    obj.readLine(0) //returns 'g'
    obj.addCharacter(0, 0, 'q', "Arial", 21, false, true)
    obj.readLine(0) //returns 'qg'

    obj.readLine(1) //returns 'yhy'
    obj.deleteCharacter(1, 1) //returns true
    obj.readLine(1) //returns 'yy'
    obj.deleteCharacter(1, 4) //returns false
}
