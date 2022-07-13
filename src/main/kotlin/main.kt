fun main() {
    val ivan = user("Иван", true)
    var discount: Int
    var sum: Int = 11100_00
    var totalPrice: Int
    var roublePrice: Double
    if (sum <= 1000_00) {
        discount = 0;
    } else
        if (sum > 1000_00 && sum < 10001_00) {
            discount = 100_00
        } else {
            discount = (sum * 0.05).toInt()
        }
    totalPrice = sum - discount

    if (ivan.extraDiscount == true) {
        totalPrice = totalPrice - (totalPrice * 0.01).toInt()
    }
    roublePrice = totalPrice.toDouble() / 100
    println(roublePrice)
}