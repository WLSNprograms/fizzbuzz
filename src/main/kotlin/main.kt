fun main() {
    var range = Pair(1,100)
    var mutiples = arrayOf(
        Pair(1,"ITS GLOTHAR! "),
        Pair(2,"DESTROYER OF WORLDS!! "),
        Pair(3,"GARDNER OF TOMATOES!! "),
        Pair(4,"AFTERNOOD READER!! "),
        Pair(5,"LISTENER OF FREE FORM JAZZ!! "),
        Pair(6,"NOT THAT GUY, THIS ONE!! "),
        Pair(7,"MONTY PYTHON BUTTON COLLECTOR!! "),
        Pair(8,"LOST IN THE SAUCE!! "),
        Pair(9,"THE MOST EVIIIIIILLLLL!! "))

    run(range,*mutiples)
}

fun run(range:Pair<Int,Int>, vararg multiplesOf:Pair<Int,String>){
    //Should probably check for making sure there is some minimum distance in the range
    for(n in range.first until range.second){
        var line = ""

        for(multiple in multiplesOf){
            if(n % multiple.first == 0){
                line += multiple.second
            }
        }

        if(line.isNullOrEmpty()){
            line = n.toString()
        }

        println(line)
    }
}