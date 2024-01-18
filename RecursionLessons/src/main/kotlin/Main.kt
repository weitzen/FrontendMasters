fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")


    // sums up the numbers from five down to 1
    val result = sumFrom(5)
    println("result: $result")

}

fun sumFrom(n: Int): Int {
    // Base Case
    if (n === 1) {
        println("Base Case. End.")
        return 1;
    }
    return n + sumFrom(n - 1);
}

/*
*
* recursion = sth that calls itself over and over again
*
*
*
* */