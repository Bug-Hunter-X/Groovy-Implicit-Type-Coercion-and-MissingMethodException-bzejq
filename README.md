# Groovy Implicit Type Coercion Bug

This example demonstrates a subtle bug that can arise in Groovy due to its flexible type system and implicit type coercion. The `myMethod` function handles null input gracefully but fails when an integer is passed in because of the implicit conversion that does not match the expected input.