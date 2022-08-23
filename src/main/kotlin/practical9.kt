fun main() {
    var arrlist = listOf(11, 28, 66, 5, 22)
    var maxNum:Int
    maxNum=arrlist[0]
    for (i in arrlist) {
        if(maxNum<i)
        {
            maxNum=i
        }
    }
    println("Largest  number is: $maxNum")
}
