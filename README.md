# kotlin-study

## Setup
- create kotlin repo
  - create remote repo -> clone to temp in local -> create kotlin project (same name as repo) -> copy everything in temp to project


## Basics

### variable
- `var` vs `val`

- Primitive Types & String
  - String, Char
  - Boolean
  - "Numbers"
    - Byte: `val b: Byte = 127`
    - Short, Int (default), Long
    - Float, Double (default)
- Type Casting, `toInt()`, `toLong()` 

- Expression vs Statement
  - Expression: `3+6`, `listOf(1,2,3)` -> return value
  - Statement: -> doesn't return value: `val a = 4`, 
    - can NOT do `val b = val c = 4` 

- Nullable Variable
  - cannot assign `null`
  - to allow null: `var str: String? = null`
    - but need to `str?.length` or `str!!.length` (less preferred)

### Conditional
- `if`
- `when`
- **Conditional Expressions**
  - `if` and `when` can be expression
```kotlin
val result = when (num) {
  1 -> "one"
  2-> {
    println("the input is 2")
    "two"
  }
  else -> "unknow number"
}
```
- **Advanced `when` Construct**
```kotlin
when (x) {
  5 -> println("x is 5")
  3*12 -> println("x is 3 * 12")
  "some string".length -> println("x equals length of some string")
  is Long -> println("...")
  in 1..10 -> println("....")
  !in 1..9 -> println("...")
}
```

### Arrays and Lists
- Array
  - fix length
  - can reassign element
  - concatenate through "+"
  - `.isEmpty()`, `contains()`
- List
  
- ArrayList
  - mutable list
  - concatenate through "+"
  - `.add(...)`, `.remove(...)`, `subList(...)`

### Loop
- `for`
  - `for (i in 1..100)`
  - `for (v in list)`
  - `for ((i, v) in list.withIndex())`
- `while`
- `break` and `continue`
  - `outer@`, `break@outer`

### functions
- argument, return type, 

## Object Oriented Program
Object, Class, Property, Method, interface...
- `init {}`
- `class Person(name: String)` vs `class Person(val name: String)`
- Named Parameters

### Inheritance: Open Class, Abstract Class and Interface
**Open Class**
- can be inherited (must explicitly `open` for class and constructor argument to enable inheritance)
- can be used to create object

**Abstract Class**
- similar to Open Class
- but can NOT be used to create object
- `abstract fun` will be defined in child class

**Interface**
- more implicit than Abstract Class
- everything is implicit and must be override in child class
- class can inherired multiple `interface`: `class Car() : Driveable, Buildable`
- how to resolve override conflicts

**Inheritance**
- How to prevent child class to inherit a method? (`final`)
- name conflicts from parents
  - `override`
  - `super<T>`

**Data Classes**
- build in methods `data class SomeClass()`:
  - `toString`, `equals`, `copy`, `hashCode`
  - decomposition

**Objects / Singletons**
```kotlin
object SomeObject {
    val name = "singletons"
}
```

**Enums**
- multiple value enums
- default value for print - `toString()`

**Other Notice**
- setter and getter in kotlin


- **visibility**
  - `private`: most strick, invisible outside
  - `protected`: visible in subclass
  - `internal`: can access in the same module
  - `public`: no restriction. default.

### Generic
- `class Demo<T>`
- `fun <T> genFun() {}`