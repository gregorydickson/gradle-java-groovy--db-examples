// Groovy and Scala offer tail call optimization to avoid stack overflow errors in 
// recursive method or function calls.




def finderClosure
finderClosure = { findThis, inThis, counter ->
	
	if(inThis.startsWith(findThis)){
		println "found"
		return counter
	} else if(inThis.length() == 0){
		println "does not contain string"
		return counter
	} else {
		inThis = inThis[ 1..(inThis.length()-1)]
		println inThis
		finderClosure(findThis, inThis, ++counter)
	}

	
}.trampoline()

String a = "the";
String b = "a man rode to the park to see the ducks."

println finderClosure(a, b, 0)
println b.indexOf(a) // plain ole java


