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
        storeData.add("|")

    }



}
