const val appleNo=100.0
const val dozen=12.0
fun main(args: Array<String>) {

    var noOfDozens=appleNo/dozen
    var remainApples=appleNo%dozen

    println("the numbers of Apple:"+appleNo)
    println("the numbers of dozens are:"+noOfDozens)
    println("the remain are"+remainApples)

}