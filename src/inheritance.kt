open class Person(var age:Int, var name:String){
    var nationality = "Ugandan"

    fun talk(words: String){
        println(words)
    }

    open fun eat(){
        println("yum")
    }

    fun sleep(){
        println("zzzz")
    }

    open fun introduction(){
        println("Hi my $name is my mentor ")
    }

    open fun ageIn2030(): Int{
        return age+9
    }
}

class Banker (age:Int, name:String) :Person(age, name){

    fun countMoney(notes: List<Int>):Int{
        var sum = 0
        notes.forEach{note-> sum+note}
        return sum
    }
    override fun ageIn2030(): Int{
        return age+4
    }
    }
    class Doctor(name:String, age: Int) :Person(age, name){
        fun treatPatient(patient: String, disease :String){
            println("Treat $patient for $disease")
        }
        override fun introduction() {
            println("Hi, I am Dr.$name")
        }
    }
class Farmer(name:String, age: Int) :Person(age, name){
    fun cultivateLand(){
        println("dig dig dig")
    }
   override fun eat(){
    println("I am eating the food in my granary")
}

    override fun introduction() {
        super.introduction()  //reference to parent class
        println("I am a farmer")
    }
}

open class Kenyan(){
    fun speakSwahili(){

    }
}


fun main(){
    var banker = Banker(23,"Joy")
    println(banker.name)
    println(banker.age)
    banker.eat()
    banker.sleep()
    var farmer = Farmer("Shosh",45)
    println(farmer.name)
    println(farmer.age)
    farmer.eat()
    farmer.cultivateLand()
    var doctor = Doctor("Daktari",29)
    println(doctor.name)
    println(doctor.age)
    doctor.eat()
    doctor.sleep()


    banker.eat()
    doctor.eat()
    farmer.eat()


    farmer.introduction()
    banker.introduction()
}