```groovy
class MyClass {
    def myMethod(String str) {
        if (str == null) {
            return "null"
        } else {
            return str.toUpperCase()
        }
    }
}

MyClass myInstance = new MyClass();
println myInstance.myMethod(null) // Output: null
println myInstance.myMethod("hello") // Output: HELLO

//The bug is in the next line:
println myInstance.myMethod(123) // Exception: groovy.lang.MissingMethodException: No signature of method: java.lang.String.toUpperCase() is applicable for argument types: (java.lang.Integer)
```