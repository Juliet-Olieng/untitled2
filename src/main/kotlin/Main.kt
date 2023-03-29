fun main() {

    val newList= names(listOf("juliet","dan","peter","john","wendy","kelly","ben","ken","nick","teddy"))
    println(newList)
    val height= sumHeight(listOf(58.0,76.0,89.0,55.0,70.0))
    println(height)
    createPersonList()
    createPeopleList()
}
//question one
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun names(name:List<String>):String{
    val name2=name.filterIndexed { index,name->index % 2==0 }
    return name2.toString()

//question two
}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
data class AverageTotal(var average:Double,var totalHeight: Double){

}
fun sumHeight(heights: List<Double>): AverageTotal {
    var average = heights.average()
    var totalHeight = heights.sum()
    var statistics = AverageTotal(average, totalHeight)

    return statistics

}
//question three

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)
fun createPersonList(){
    val person1=Person("Bange",25,169.0,70.0)
    val person2=Person("Mark",28,159.0,60.0)
    val person3=Person("kaitlin",3,60.0,23.0)
    val personList= listOf(person1,person2,person3)
    println(personList)
    val sortedPeople= personList.sortedByDescending{ person->person.age}
    println(sortedPeople)
}
//question four
// given a list similar to the one above ,write a function in which you will
// create 2 more people objects and then add them to the list at one go
fun createPeopleList(){
    val person4=Person("Vanessa",22,150.0,60.0)
    val person5=Person("Raol",16,120.0,62.0)
    val peopleList= mutableListOf(person4,person5)
//    println(peopleList)
    val newPersonList=peopleList.add(person4)
    println(newPersonList)
}
//question five
// write a function that creates a list of car object each with a
// registration and mileage attributes and returns the average millage of all the vehicles in the list
data class Car(var registration: String, var mileage:Double){
    fun createCarList(distance : List<Car>):Double{
        var total=0.0
        distance.forEach{Car->
            total +=Car.mileage }
        var average=total/distance.count()
        return average
    }
}


