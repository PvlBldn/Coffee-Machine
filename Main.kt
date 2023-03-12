package machine

var water = 400
var milk = 540
var cBeans = 120
var cups = 9
var money = 550

fun main() {
    while (true) {
        println("\nWrite action (buy, fill, take, remaining, exit):")
        when (readln()) {
            "buy" -> buyCoffee()
            "fill" -> fillMachine()
            "remaining" -> remaining()
            "exit" -> break
            "take" -> {
                print("I gave you $money")
                money = 0
            }
        }
    }
}

fun buyCoffee() {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
    when (readln()) {
        "1" -> checkIng(250, 0, 16, 4)
        "2" -> checkIng(350, 75, 20, 7)
        "3" -> checkIng(200, 100, 12, 6)
        "back" -> return
    }
}

fun fillMachine() {
    println("Write how many ml of water do you want to add:")
    water += readln().toInt()
    println("Write how many ml of milk do you want to add:")
    milk += readln().toInt()
    println("Write how many grams of coffee beans do you want to add:")
    cBeans += readln().toInt()
    println("Write how many disposable cups of coffee do you want to add:")
    cups += readln().toInt()
}

fun remaining() {
    println("The coffee machine has:")
    println("$water of water")
    println("$milk of milk")
    println("$cBeans of coffee beans")
    println("$cups of disposable cups")
    println("$$money of money")
}

fun checkIng(waterX: Int, milkX: Int, cBeansX: Int, moneyX: Int) {
    if (water >= waterX && milk >= milkX && cBeans >= cBeansX && cups >= 1) {
        water -= waterX
        milk -= milkX
        cBeans -= cBeansX
        cups--
        money += moneyX
        println("I have enough resources, making you a coffee!")
    } else println("Not enough ingredients")
}
