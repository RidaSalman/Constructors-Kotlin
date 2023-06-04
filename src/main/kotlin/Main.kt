//--------------------------------------Constructors----------------------------------------
/*
class Automobile(val name : String, val tyres : Int , val maxSeating : Int, val engineType : String){
    init {
        println("$name is created")
    }
    init {
        println("2n initializer is created")
    }
    constructor(name1 : String, engineType1: String) : this(name1, 3,4, engineType1)
    fun drive(){}
    fun applyBrakes(){}
}
//----------------------------------------------------------------------------
class Calculator{}

fun main(){
    var car = Automobile("Car", "petrol")
    var car2 = Automobile("Car2", "fuel")

    println(car.name)
}
*/

/*
class Empty{}
class Person(name1 : String, age1 : Int){
    val name : String = "$name1-salman"
    var age : Int = age1
}*/
//---------------------------------------------------------------------------------------------
//Primary Constructor
/*class Person(val firstName: String, var age: Int) {

}
fun main(){
    val p1 = Person("Rida", 22)
    println("First name is = ${p1.firstName}")
}*/
//-----------------Initializer Blocks-------------------------------------
/*class Person(fName: String, personAge: Int) {
    val firstName: String
    var age: Int

    init {
        firstName = fName.capitalize()
        age = personAge

        println("First Name = $firstName")
        println("Age = $age")

    }
}
fun main() {
    val p1 = Person("joe,", 24)
}*/
//--------------------------------------------------------------------------------
/*
class person(_firstName: String = "UNKNOWN", _age: Int = 0){
    val firstName = _firstName.capitalize()
    var age = _age

    init {
        println("First Name = $firstName")
        println("Age = $age\n")
    }
}
fun main(){
    println("person1 is instantiated")
    val person1 = person("joe", 25)

    println("person2 is instantiated")
    val person2 = person("Jack")

    println("person3 is instantiated")
    val person3 = person()
}*/
//---------------------------------------------------------------------------
/*open class Log {
    var data: String = ""
    var numberOfData = 0
    constructor(_data: String) {

    }
    constructor(_data: String, _numberOfData: Int) {
        data = _data
        numberOfData = _numberOfData
        println("$data: $numberOfData times")
    }
}
class AuthLog: Log {
    constructor(_data: String): this("From AuthLog -> " + _data, 10) {
    }

    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData) {
    }
}
fun main(args: Array<String>) {

    val p1 = AuthLog("Bad Password")
}*/
//--------------------------------------------------------------------------------------------
//Default value in Constructor
/*class Student(val name: String = "Student", var age: Int = 99) {
    //This is my class. For now I am leaving it empty
}
fun main(args: Array<String>) {

    //creating the object of class Student
    val stu = Student("Chaitanya", 31)
    val stu2 = Student("Chaitanya")
    val stu3 = Student()

    println("Name: ${stu.name} and Age: ${stu.age}")
    println("Name: ${stu2.name} and Age: ${stu2.age}")
    println("Name: ${stu3.name} and Age: ${stu3.age}")

}*/
//----------------------------------------------------------------------
/*
fun main(args: Array<String>) {

    val stu = Student("Chaitanya", 31)
    val stu2 = Student("Chaitanya")
    val stu3 = Student()

}

class Student(val name: String = "Student", var age: Int = 99) {
    val stuName: String
    var stuAge: Int
    init{
        if(name == "Student") {
            stuName = "NA"
            stuAge = 0
        }
        else {
            stuName = name.toUpperCase()
            stuAge = age
        }
        println("Student Name is: $stuName")
        println("Student Age is: $stuAge")
    }
}
//-----------------------------------------SECONDARY CONSTRUCTOR---------------------
fun main(args: Array<String>){
    val stu = Student("Harry", 24)
}

open class College{

    constructor(name: String, age: Int){
        println("parent class constructor")
        println("Student Name: ${name.toUpperCase()}")
        println("Student Age: $age")
    }
}
class Student: College{
    constructor(name: String, age: Int): super(name,age){
        println("child class constructor")
        println("Student Name: $name")
        println("Student Age: $age")
    }
}*/
/*
//-----------------------------------------------------------------------------------
class Car{
    constructor(){
        println("calling default constructor")
    }
}
fun main(){
    val audi= Car()
}*///----------------------------------------------------------------------------------
/*class Car{
    companion object{
        var n = 0
    }
    init{
        n += 1
        println("Creating Object $n")
    }
}
fun main(){
    val audi = Car()
    val bmw = Car()
}*/
//----------------------------------------------------------------------------------
/*
class Car(val model : String,val enginenumber :Int, val speed : Double){
    init {
        println("Model : $model, enginenumber : $enginenumber, Speed : $speed")
    }

}
fun main(){
    val audi = Car("Toyota", 985, 424.3)
}*/
//-----------------------------------------------------------------------------------
/*class Car(val model : String,val enginenumber :Int, val speed : Double){
    constructor(model : String, enginenumber :Int,  speed : Double, petrolconsumption: Int):this(model,enginenumber,speed){
        println("Secondary Constructor : Petrol Consumption : $petrolconsumption of $model")
    }
    init {
        println("Model : $model, enginenumber : $enginenumber, Speed : $speed")
    }
}
fun main(){
    //calling primary constructor
    val audi = Car("Toyota", 985, 424.3)
    //calling secondary constructor
    val audi3 = Car("Toyadadota", 985, 4223.3, 40)
}*/
//------------------------------------------------------------------------------------------
// Kotlin class and constructors
//class Person constructor(val name:String,val  age:Int?,val password:Int?){
/*class Person (val name:String,val  age:Int?,val password:Int?){
    init{
        println("Here you can do something at object initialize")
    }
}

fun main(args: Array<String>) {

    // Create a person object
    var person = Person(name = "John",password = 1234, age = null)
    println("person details name : ${person.name}, age : ${person.age}")


}*/
//----------------------------------------------Primary Constructor-------------------------
/*class myClass(val name: String, var id: Int) {
}
fun main(args: Array<String>){
    val myclass = myClass ("Ashu", 2343)
[]
    println("Name = ${ myclass.name}")
    println("Id = ${ myclass.id}")
}*/
//------------------------Primary constructor with initializer block--------------------

/*class Myclass (name: String, id: Int) {
    val e_name: String
    var e_id: Int
    init{
        e_name = name.capitalize()
        e_id = id

        println("Name = ${e_name}")
        println("Id = ${e_id}")
    }
}fun main(){
    val myclass = Myclass ("Ashu", 101)
}*/
//-------------------------------------Secondary Constructor---------------------------

/*class myClass{

    constructor(name: String, id: Int){
        println("Name = ${name}")
        println("Id = ${id}")
    }
}
fun main(args: Array<String>){
    val myclass = myClass ("Ashu", 101)

}*/
//-------------------------------------------------------------------
/*class myClass(password: String){

    constructor(name: String, id: Int, password: String): this(password){
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${password}")
    }
}
fun main(args: Array<String>){
    val myclass = myClass ("Ashu", 101, "mypassword")

}*/
//------------------------------------------------------------------
//-----------------------Calling one secondary constructor from another
// secondary constructor of same class
/*class myClass{

    constructor(name: String, id: Int): this(name,id, "mypassword"){
        println("this executes next")
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int,pass: String){
        println("this executes first")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }
}
fun main(args: Array<String>){
    val myclass = myClass ("Ashu", 101)

}*/
//---------------------Calling supper class secondary constructor
// from derived class secondary constructor
/*open class Parent{

    constructor(name: String, id: Int){
        println("this executes first")
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int,pass: String){
        println("this executes third")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }
}
class Child: Parent{
    constructor(name: String, id: Int): super(name,id){
        println("this executes second")
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int,pass: String):super(name,id,"password"){
        println("this executes forth")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }
}
fun main(args: Array<String>){
    val obj1 = Child("Ashu", 101)
    val obj2 = Child("Ashu", 101,"mypassword")
}*/
//------------------------------------------------------------------------------------------
/*class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    fun getStatus(): String {
        return "Device name: $name, Category: $category, Status: $deviceStatus"
    }
}
fun main(){
    val device1 = SmartDevice("Smart Speaker", "Audio")
    println(device1.getStatus())
    val device2 = SmartDevice("Smart Thermostat", "Home Automation", )
    println(device2.getStatus())

}*/
//-Primary constructor with init block
/*class Person (val _name: String, val _age: Int) {
    // Member Variables
    var name: String = _name
    var age: Int = _age
    init {
        println("Name = $name")
        println("Age = $age")
    }

}
fun main(args: Array<String>) {
    val person = Person("Zara", 20)
}*/
//---------------------------------------------------------------------
//-Primary constructor with init block-default values
/*class Person (val _name: String, val _age: Int=20) {
    // Member Variables
    var name: String =_name
    var age: Int = _age

    // Initializer Block
    init {
        println("Name = $name")
        println("Age = $age")
    }
}
fun main(args: Array<String>) {
    val zara = Person("Zara")
    val nuha = Person("Nuha", 11)
}*/
//--------------------------------------------------------------------
/*
class person{
    var name: String
    var age: Int
    // Initializer Block
    init {
        println("Initializer Block")
    }
    constructor(_name: String, _age: Int){
        this.name = _name
        this.age = _age
        println("Name = $name")
        println("Age = $age")
    }
}
fun main(args: Array<String>) {
    val zara = person("Zara", 20)
}
*/
//----------------------------------------------------------------------
/*
class Person{
    // Member Variables
    var name: String
    var age: Int
    var salary:Double

    // First Secondary Constructor
    constructor ( _name: String, _age: Int) {
        this.name = _name
        this.age = _age
        this.salary = 0.00
        println("Name = $name")
        println("Age = $age")
    }

    // Second Secondary Constructor
    constructor ( _name: String, _age: Int, _salary: Double) {
        this.name = _name
        this.age = _age
        this.salary = _salary
        println("Name = $name")
        println("Age = $age")
        println("Salary = $salary")
    }
}

fun main(args: Array<String>) {
    val nuha = Person("Nuha", 12)
    val zara = Person("Zara", 20, 2000.00)
}*/
//------------------------------------------------------------------------------
/*
class Dog(val name: String,
          weight_param: Int,
          var height: Int,
          val avgLifeExpectancy: Int){

    init {
        println("This is init block. Notice where it's getting executed!")
    }
    var weight = weight_param
        set (value) {
            if (value > 0) field = value
        }

    fun speak() {
        println("woof!")
    }

    fun eat() {
        println("nom nom!")
    }

    fun walk() {
        println("I love walking with my hooman. And occasional zoomies!")
    }


}
fun main(){
    var myDog = Dog("nora", 10, 22, 10)
    myDog.speak()
    myDog.eat()
    myDog.walk()
    println("${myDog.name} has following properties,")
    println("Weight is ${myDog.weight}")
    println("Height is ${myDog.height}")
    println("Average life expectancy is ${myDog.avgLifeExpectancy}")
    println("Weight = ${myDog.weight}")
    println("Changing weight to 30")
    myDog.weight = 30
    println("New weight is ${myDog.weight}")
    println("Changing weight to -30")
    myDog.weight = -30
    println("Weight after assigning negative value is ${myDog.weight}")
}
*/
//---------------------------------------------------------------------------------
/*class Car() {
    var Car_Model: String = "Tesla"
    var Car_type: String = "Electric"
    var Car_details: String = "run 450 on single charge"
    var Car_id: Int = 5123

    fun printCarDetails() {
        println(
            "Car id : $Car_id" +
                    "\nCar Model : $Car_Model" +
                    "\nCar Type : $Car_type" +
                    "\nCar Details : $Car_details",
        )

   }
}
fun buildCar() {
    val myCar = Car()
    myCar.Car_details = "After upgradation now the car runs 550 on single charge"
    myCar.printCarDetails()
}

fun main() {
    buildCar()
}*/
//----------------------------------------------------------------------------------
/*class Car(var carmodel: String = "Base Model", var cartype: String = "Petrol",
          var cardetails: String = "This is just a car frame", var carid: Int = 0) {
    init {
        println("\n $carmodel engine started ")
    }
    fun printCarDetails() {
        println(
            "Car id : $carid" +
                    "\nCar Model : $carmodel" +
                    "\nCar Type : $cartype" +
                    "\nCar Details : $cardetails",
        )

}}
fun buildCar() {

    val myCar = Car("Tesla", "Electric", "run 450 on single charge", 5123)
    println("\t Car 1 details")
    myCar.printCarDetails()


    val myCar2 = Car(carmodel = "Maruti Sizuki 200", cartype = "petrol")
    println("\t Car 2 details")
    myCar2.printCarDetails()


    val myCar3 = Car("Defender")
    println("\t Car 3 details")
    myCar3.printCarDetails()


    val myCar4 = Car()
    println("\t Car 4 details")
    myCar4.printCarDetails()
}
fun main(){
    buildCar()
}*/
//-----------------------------------------------------------------------------------
//----------------------Primary Constructor
/*class Add (a : Int, b : Int){
    var c = a + b

}
fun main(){
    val add = Add(5, 6)
    println("sum is ${add.c}")
}*/
//------------------------------Primary with init block
/*class Person (val _name: String) {

    // Member Variables
    var name: String

    // Initializer Blocks

    init{
        println("This is first init block")
    }

    init{
        println("This is second init block")
    }

    init{
        println("This is third init block")
    }
    init {
        this.name = _name
        println("Name = $name")
    }
}
fun main(args: Array<String>) {
    val person = Person("Geeks")
}*/
//------------------------------Default value in primary constructor –
/*class employee(var emp_id : Int = 100 ,var  emp_name: String = "abc") {

    // initializer block
    init {

        print("Employee id is: $emp_id, ")
        println("Employee name: $emp_name")
        println()
    }
}
fun main(){
    val emp = employee(1, "eqa")
    val emp1 = employee(131)
    val emp2 = employee()
}*/
//-----------------------------------------------------------Secondary Construtor
/*class Add
{
    constructor(a: Int, b:Int)
    {
        var c = a + b
        println("The sum of numbers 5 and 6 is: ${c}")
    }
}
fun main(args: Array<String>)
{
    Add(5, 6)
}*/
//---------------------------------------------------------------
/*class employee {

    constructor (emp_id : Int, emp_name: String ) {
        var id: Int = emp_id
        var name: String = emp_name
        print("Employee id is: $id, ")
        println("Employee name: $name")
        println()
    }

    constructor (emp_id : Int, emp_name: String ,emp_salary : Double) {
        var id: Int = emp_id
        var name: String = emp_name
        var salary : Double = emp_salary
        print("Employee id is: $id, ")
        print("Employee name: $name, ")
        println("Employee name: $salary")
    }
}
fun main(args: Array<String>) {
    employee(18018, "Sagnik")
    employee(11011,"Praveen",600000.5)
}*/
//------------------------------------------------------------------------
/*
class Add
{
    constructor(a: Int, b: Int)
    {
        var c = a + b
        println("Sum of 5, 6 = ${c}")
    }
    constructor(a: Int, b: Int, c: Int)
    {
        var d = a + b + c
        println("Sum of 5, 6, 7 = ${d}")
    }
    constructor(a: Int, b: Int, c: Int, d: Int)
    {
        var e = a + b + c + d
        println("Sum of 5, 6, 7, 8 = ${e}")
    }
}

    fun main(args: Array<String>)
    {
        Add(5, 6)
        Add(5, 6, 7)
        Add(5, 6, 7, 8)
    }
*/

//----------------------Calling one secondary constructor from another –
/*class Add {
    // calling another secondary using this
    constructor(a: Int,b:Int) : this(a,b,7) {
        var sumOfTwo = a + b
        println("The sum of two numbers 5 and 6 is: $sumOfTwo")
    }
    // this executes first
    constructor(a: Int, b: Int,c: Int) {
        var sumOfThree = a + b + c
        println("The sum of three numbers 5,6 and 7 is: $sumOfThree")
    }
}
fun main(args: Array<String>)
{
    Add(5,6)
}*/
//---------------------------------------------------------------------------
//Calling parent class secondary constructor from child class secondary constructor –
/*open class Parent {
    constructor (emp_id: Int, emp_name: String, emp_salary: Double) {
        var id: Int = emp_id
        var name: String = emp_name
        var salary : Double = emp_salary
        println("Employee id is: $id")
        println("Employee name: $name")
        println("Employee salary: $salary")
        println()
    }
}
class Child : Parent {
    constructor (emp_id : Int, emp_name: String):super(emp_id,emp_name,500000.55){
        var id: Int = emp_id
        var name: String = emp_name
        println("Employee id is: $id")
        println("Employee name: $name")
    }
}
fun main(args: Array<String>) {
    Child(18018, "Sagnik")
}*/
//----------------------------------------------------------------------------------
/*
//------------------------Default Constructor
class Calculator(){

    fun ADD(a : Int , b: Int) : Int{
        return a + b
    }

    fun Multi(a : Int , b: Int) : Int{
        return a * b
    }
}
fun main(){
    val ob = Calculator()
    println(ob.ADD(4,5))
}*/
//--------------------------------------Getter & Setter
class person( name : String, age : Int){

    var name1 : String = name
        get() {
            println("Name getter is called")
            return field.toUpperCase()
        }
    var age1 :  Int = age
    set(value){
        if ( value >  0){
            field  =  value
        }
        else{
            println(" Age cant be negative")
        }
    }
    var email: String = ""
        get() = field
        set(value) {
            field = value
        }


}
fun main(){
    var p1 = person("hjh", 13)
    println(p1.age1)
    p1.age1 = 23
    println(p1.name1)
}