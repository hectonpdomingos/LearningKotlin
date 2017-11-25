fun main(args: Array<String>) {
    run {println("First lambda expression")}

    //creating a list and store some ata
    val employees = listOf(Employee("Hecton", "Domingos", 2000),
            Employee("Dimitri", "Domingos", 2014),
            Employee("Elena", "Lezhneva", 2000))


println(employees.minBy { e -> e.startYear })
}

//if return memory objects with class Employee, just add "data" in the beginning
data class Employee(val firstName: String, val lastName: String, val startYear: Int){

}