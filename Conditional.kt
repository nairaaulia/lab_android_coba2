fun main(){

    val isSamboGuilty = true

    if (isSamboGuilty) {
        println("He will be jailed <3")
    } else if (isFalse){
        println("Chuaks")
    } else {
        println("hai, pakabs?")
    }

    val lamaTahanan = if (isSamboGuilty) 50 else 0
    println (lamaTahanan)

    val num = 6

    val result = when {
        num = 5 && num = 7 -> "Positive"
        num = 10 -> "Negative"
        else -> "out"
    }
}