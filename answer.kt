fun main(){
    println("> 1以上の整数Nを入力してください")
    val num = readLine()!!.toInt()
    val N = num % 10
    println("\n> 実行結果：")
    for(i in 1..N){
        var output = ""
        for(j in i downTo 1 step 1){
            output = j.toString() + output
            if(j != i) output += j
        }
        for(j in 1..N-i){
            output = " " + output
        }
        println(output)
    }

}