package org.example

class User(
    val uid: String,
    val name: String,
    val phone: String,
    val address: String,
    val orderList : MutableList<Order> = mutableListOf()
) {

    fun addOrder(order: Order){
        orderList.add(order)
    }

}