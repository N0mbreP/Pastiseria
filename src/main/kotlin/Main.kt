import Classes.Begudes
import Classes.Pasta

fun main(args: Array<String>) {
    pastes()
    begudes()
}

fun pastes(){
    println("Totes les pastes disponibles:")
    val croissant:Pasta= Pasta("croissant", 1f, 0.9f, 10)
    val donut:Pasta= Pasta("donut", 1f, 9f, 11)
    val ensaimada:Pasta= Pasta("ensaimada", 5f, 900f, 100)
    println(croissant)
    println(donut)
    println(ensaimada)
}

fun begudes(){
    println("Totes les begudes disponibles:")
    val aigua:Begudes=Begudes("Aigua", 1f,   false)
    val cafe:Begudes= Begudes("Café tallat", 1.35f, false)
    val te:Begudes= Begudes("Té vermell", 1.50f, false)
    val cola:Begudes=Begudes("Cola",1.65f, true)
    println(aigua)
    println(cafe)
    println(te)
    println(cola)
}