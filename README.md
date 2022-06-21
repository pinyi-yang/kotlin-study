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