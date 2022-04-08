
const val MIN_COMMISSION = 35_00
const val PERCENT = 75

fun main() {
    val amount = 5643_00
    val charge = amount * PERCENT / 10000
    println("Сумма перевода составляет: ${amount / 100} ${endingRuble(amount)} ${amount%100} ${endingPenny(amount)}")
    val commission = if (charge < MIN_COMMISSION) MIN_COMMISSION else charge
    print("Комиссия составит: ${commission / 100} ${endingRuble(commission)} ${commission%100} ${endingPenny(commission)}")
}

fun endingRuble (value: Int): String {
    if (value / 100 % 10 >= 5 || value / 100 % 10 == 0) {
        return "рублей"
    } else if (value / 100 % 10 >= 2) {
        return "рубля"
    } else {
        return "рубль"
    }
}

fun endingPenny (value: Int): String {
    if (value % 10 >= 5 || value % 10 == 0) {
        return "копеек"
    } else if (value % 10 >= 2) {
        return "копейки"
    } else {
        return "копейка"
    }
}


