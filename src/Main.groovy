/**
 * Created by Evan on 2/1/2015.
 */
class Main {
    def static final scanner = new Scanner(System.in)
    def static potatoes = 0
    def static potatoPot = []

    static main(args) {
        println "Welcome to Potato Thing"
        def more = true
        while (more) {
            println "How many potatoes would you like to cook?"
            potatoes = scanner.nextInt()
            for (i in 1..potatoes) {
                potatoPot << new Potato(1 + i / 100, "Potato #$i")
            }
            potatoPot.each {
                println("I just ate a potato named ${it.name}")
            }
            println("Would you like more potatoes?")
            def answer = scanner.nextLine()
            more = answer.startsWith("y") || answer.startsWith("Y")
        }
        println("Thanks for cooking potatoes.")
    }
}
