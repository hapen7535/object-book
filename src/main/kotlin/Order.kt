package org.example

import java.math.BigInteger

enum class OrderStatus(val type: Int) {
    Canceled(1),
    Preparing(2),
    Delivered(3);
}

class Order(
    val uid: String,
    val userUID: String,
    val productList: MutableList<Product>,
    val totalPrice: String,
    var status: Int,
) {

    fun addProduct(product: Product){
        productList.add(product)
    }

    fun removeProduct(product: Product){
        productList.removeIf { it.uid == product.uid }
    }

    fun getTotalPrice(): BigInteger{
        return productList.sumOf { it.price.toBigIntegerOrNull()?.multiply(it.quantity.toBigInteger()) ?: BigInteger.ZERO }
    }

    fun cancelOrder() {
        status = if(status == OrderStatus.Preparing.type) status else OrderStatus.Canceled.type
    }

    fun preparingOrder(){
        status = OrderStatus.Preparing.type
    }

    fun completeOrder(){
        status = OrderStatus.Delivered.type
    }

}