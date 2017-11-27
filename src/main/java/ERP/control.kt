package ERP
var storeData = ArrayList<String>()

open class AddPersonData(name: String, birth: String, address: String, phone: String){
    var name: String? = null
    var birth: String? = null
    var address: String? = null
    var phone: String? = null

    init{
        this.name = name
        this.birth = birth
        this.address = address
        this.phone = phone

        storeData.add(name)
        storeData.add(birth)
        storeData.add(address)
        storeData.add(phone)

    }





}

fun getStoreData(){
    for(item in storeData) {
        println(item)
    }
}
fun main(args: Array<String>) {
    var count = 0
    var exit = false
    do{
        println("Enter the full name")
        var name: String = readLine().toString()
        println("Enter the birth date")
        var birth: String = readLine().toString()
        println("Enter the Address")
        var address: String = readLine().toString()
        println("Enter the phone number")
        var phone: String = readLine().toString()

        if (count < 3) {
            AddPersonData(name, birth, address, phone)
            count++
        }else{
        exit = true
        }

    }while (!exit)

    getStoreData()

}