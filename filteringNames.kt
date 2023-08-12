fun main(args: Array<String>) {
    var letter = readLine()!![0]
    val names = arrayOf("John", "David", "Amy", "James", "Amanda", "Dave", 
    "Bob", "Billy", "Bobby", "Diana", "Lenny", "Gina")
    names.forEach{                  //iterating each element in the array
        if(it[0]==letter){         //comparing the index of each element with the input
            println(it)        //printing the array
        }
    }
    
}
