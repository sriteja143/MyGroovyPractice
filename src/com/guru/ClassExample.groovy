package com.guru

class ClassExample {
	static String name
	static Integer age

	def increaseAge(Integer years) {
		this.age += years
	}
	
	
	static def printClass() {
		println(name)
		println(age)
	}
	
	static def get(String input) {
		if(input.equals("name"))
			name
		else {
			age
		}
		
		
	}
	static void main(args) {
		printClass()
		def cls = new ClassExample(name:'guru',age:20)
		printClass()
		
		println(get("name"))
		
	}
}

//def cls = new ClassExample(name:'guru',age:20)
