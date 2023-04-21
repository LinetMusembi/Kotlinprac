fun main() {
    numbers(listOf())
    val evenIndeces = listOf("Linet", "Eunice", "Jemimah", "Esther", "Moureen","mercy","emma","diana")
    println(evenIndeces)
    var x = Vehicles("KYF020F", 60)
    var y = Vehicles("KBM230G", 50)
    var z = Vehicles("KCF343P", 70)
    var p = Vehicles("KFD343V", 75)
    var allVehicles = listOf(x, y, z, p)
    println(vehicleList(allVehicles))



    val evenName =
        listOf("school", "mountain", "road", "kindergarten", "irene", "alphonsa", "beuty", "flower", "zaque", "eunice")
    println(evenName)

    println( people(listOf(3.7,4.8,5.4,6.3,2.8,7.0,8.1)))




    val myName = Human("Lynet",19,50)
    myName.eat(2)
    myName.speak("I enjoy learning kotlin")
    myName.birthday()





    val myPhone = Phone("Lynet","Musembi","musembilinet@gmail.com","0712763498                         ","melody")
    println(myPhone.firstName)
    println(myPhone.email)


}
class Human(var name: String,var age: Int,var weight: Int) {


    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food")
        weight += foodWeight
        println(weight)
    }


    fun speak(speak: String) {
        println(speak)
    }
    fun birthday() {
        age +=1
        println(age)

    }
}
data class Phone(var firstName: String,var lastName: String,var email: String,var phoneNumber: String,var password: String)

//3. Given a list of Person objects, each with the attributes, name, age,
//    height and weight. Sort the list in order of descending age (2 points)
class Persons(var nam:String,var age:Int,var height:Double,var weight:Int)
//
//    4. Given a list similar to the one above, write a function in which you will
//    create 2 more people objects and add them to the list at one go.
//    (1 points)

fun peopleAdd(topple:List<Persons>):List<Any> {
    return listOf()
}

//sum of used in kotlin


//. Given a list of people’s heights in metres. Write a function that returns
//  the average height and the total height (2 points)
data class Height(var myAvarage:Double,var totalHeight:Double)



fun people(allHeight:List<Double>):Height{
    var myAvarage = allHeight.average()
    var totalHeight = allHeight.sum()
    var heights = Height(myAvarage,totalHeight)
    return heights
}
//1. Given a list of 10 strings, write a function that returns a list of the strings
//    at even indices i.e index 2,4,6 etc (2 points

fun numbers (many:List<String>):List<String>{
    many.forEachIndexed{index, s ->
        if (index % 2 == 0) {
            println(s)
        }
    }
    return many

}
//Write a function that takes in a list of Car objects each with a
//            registration and mileage attribute and returns the average mileage of
//     wj       all the vehicles in the list. (3 points)
data class Vehicles(var registration:String, var mileage:Int)
fun vehicleList(vehicle:List<Vehicles>):Int {
    var avg = 0
    vehicle.forEach { new ->
        new.mileage
        avg += new.mileage
    }
    var totalAvg = vehicle.count()
    return totalAvg

}

