// interface inheritance

interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String
    
    override val name: String get() = "$firstName $lastName"
}

data class Employee(
    // implementing 'name' is not required
    override val firstName: String,
    override val lastName: String
) : Person

fun sayAName(p: Named) {
    println("[NAME]:   ${p.name}")
}

fun sayAPerson(p: Person) {
    println("[PERSON]: ${p.name}")
    println("firstname: ${p.firstName}")
    println("lastname:  ${p.lastName}")
}

fun main () {
    val p = Employee("Edgar", "Albalate")
    sayAName(p)
    sayAPerson(p)
}
