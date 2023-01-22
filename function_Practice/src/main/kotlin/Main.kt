fun main(){
    val addition = addOrMul(true)
    val multiplication = addOrMul(false)

    addition(10,20)
    multiplication(10,20)
}

fun addOrMul(isAdd : Boolean) : (Int, Int) -> Unit {
    return if (isAdd){
        add
    }else{
        mul
    }
}
val add : (Int, Int) -> Unit = {
    a,b ->
    println(a + b)
}

val mul : (Int, Int) -> Unit = {
    a,b ->
    println(a * b)
}