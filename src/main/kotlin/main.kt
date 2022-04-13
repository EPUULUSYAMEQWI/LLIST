fun main(){
   var c= findEven(listOf("Amekwi","lucy","Nadine","Sarah","Epuu","Laura","Susan","Anota","Kevin","Phylis"))
    println(c)

    var total = heightInMetre(listOf(5, 6, 2, 5))
    println(total)

    var Mary=Person("Mary",33,2.5,30)
     var Sabdio=Person("Sabdio",20,1.4,40)
     var Ephy=Person("Ephy",19,1.3,50)
     var Rehema=Person("Rehema",16,1.2,20)

    var namesOfpeople= listOf(Mary,Sabdio,Ephy,Rehema)
   var descending=namesOfpeople.sortedByDescending {Person -> Person.age}
     println(descending)

     var w=Person("sakina",26,2.0,57)
    var q=Person("Mommy",66,6.2,66)
    var newList= mutableListOf(w,q)
     println (newList.plus(namesOfpeople))

    var Mercedez=Cars("KCT107L",22)
    var Toyota=Cars("KRC108O",23)
    var Prado=Cars("KYC198K",21)
    var v8=Cars("KIA345G",20)
    var dreamcars= listOf(Mercedez,Toyota,Prado,v8)
    println(dreamcars)


}
fun findEven(num:List<String>):List<String> {
    var x = mutableListOf<String>()
    num.forEachIndexed { Index, k ->
        if (Index % 2 == 0) {
            x.add(k)
        }
    }
    return x
}
fun heightInMetre(height:List<Int>):String {
    var t = height.sum()
    var g = height.average()
    var total = "$t,$g"
    return total

}
data class Person(var name:String, var age:Int,var height:Double,var weight:Int){

}

fun addPeople(people:List<Any>):List<Any>{
    return listOf()
}

data class Cars(var registration:String,var mileage:Int)




