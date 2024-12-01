package org.example

class Product(
    val uid: String,
    val name: String,
    val price: String,
    val description: String,
    val imageURL: String,
    var quantity: Int,
) {

    fun changeQuantity(quantity: Int){
        this.quantity = quantity
    }

}