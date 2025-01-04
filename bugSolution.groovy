```groovy
class MyClass {
    def myMethod(Object str) {
        if (str == null) {
            return "null"
        } else if (str instanceof String) {
            return str.toUpperCase()
        } else {
            return "Not a String"
        }
    }
}

MyClass myInstance = new MyClass();
println myInstance.myMethod(null) // Output: null
println myInstance.myMethod("hello") // Output: HELLO
println myInstance.myMethod(123) // Output: Not a String
```