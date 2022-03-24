fun main(){
    var answer= ArrayProduct(arrayOf(1,2,3,4,5))
    println(answer)
    var output =mixed(arrayOf(2, 5.0F, 7.23, 1.00))
    println(output)
    var counting= ArrayCharacters(arrayOf('a','f','g','i'))
    println(counting)

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
        if (element is Double || element is Float){
            sum+=element.toString().toDouble()
        }

    }
return sum
}
fun ArrayCharacters(contains:Array<Char>):Int{
    var vowels=0
    contains.forEach {char ->
        if (char == 'a' || char == 'e'|| char=='i'||char=='o'|| char=='u') {
            vowels++

        }
    }

    return vowels
}