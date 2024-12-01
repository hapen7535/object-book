package org.example

enum class PaymentType(type: Int){
    Credit(1),
    Cash(2);
}

class Payment(
    val uid: String,
    var type: Int,
) {

    fun setType(type: Int){
        this.type = type
    }

}