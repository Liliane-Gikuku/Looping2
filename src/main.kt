fun main(){
    var answer= ArrayProduct(arrayOf(1,2,3,4,5))
    println(answer)
    var output =mixed(arrayOf(2, 5.0, 7.23,"Angel", 1.00))
    println(output)
    var length= ArrayCharacters(arrayOf('a','f','g'))
    println(length)

}

//Question 1
fun ArrayProduct(values:Array<Int>):Int{
    var product=1
    values.forEach {value ->
        product*=value
    }
return product
}

//Question
fun mixed(elements:Array<Any>):Double{
    var sum=0.00
    elements.forEach {element ->
        if (element is Double){
            sum+=element
        }

    }
return sum
}
fun ArrayCharacters(contains:Array<Char>):Int{
    var length=contains.size
    return length
}