
def calc(x:Int, y:Int,choice:Int){
	var result=0
	choice match{
		case 1 => result=x+y
		case 2 => result=x-y
		case 3 => result=x*y
		case 4 => if(y==0){println("You cannot divide by Zero; please restart.")}
				else{x.toFloat; y.toFloat; result=x/y}
		case 5 => println("Goodbye"); sys.exit
		case _ => println("Input a valid action")
	}
	println("The result is: "+result)
}

var i=0
while(i<1){
	println("Input the first number:")
	var a= scala.io.StdIn.readInt()
	println("Input the second number:")
	var b= scala.io.StdIn.readInt()
	println("Which action would you like to take:")
	println("1: Addition")
	println("2: Subraction")
	println("3: Multiplication")
	println("4: Division")
	println("5: Close Calculator")
	var choice = scala.io.StdIn.readInt()
	calc(a,b,choice)
	println("Would you like to perform another action?")
	println("1: Yes")
	println("2: No")
	var cont=scala.io.StdIn.readInt()
	if(cont==2){
		println("Goodbye")
		i=1
	}
}