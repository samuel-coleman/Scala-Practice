
println("Input a number: ")
var num=scala.io.StdIn.readInt()

for(i <- 2 to (num-1)){
	if(num % i == 0){
		println(num+" is not a prime number")
		sys.exit
	}
}
println(num+" is a prime number")
	