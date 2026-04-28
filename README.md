# ktuple - Kotlin Tuple

![Maven Central Version](https://img.shields.io/maven-central/v/io.github.wan2dev/ktuple)
![Static Badge](https://img.shields.io/badge/License-Apache-blue)

Kotlin Tuple library providing typed, immutable tuples from arity 0 through 8. Fills the gap in the Kotlin standard
library which only offers `Pair` and `Triple`.

## Installation

### Maven

```xml

<dependency>
    <groupId>io.github.sodekim</groupId>
    <artifactId>ktuple</artifactId>
    <version>1.0.2-SNAPSHOT</version>
</dependency>
```

### Gradle (Kotlin DSL)

```kotlin
implementation("io.github.sodekim:ktuple:1.0.2-SNAPSHOT")
```

### Gradle (Groovy DSL)

```groovy
implementation 'io.github.sodekim:ktuple:1.0.2-SNAPSHOT'
```

## Quick Start

```kotlin
import io.github.sodekim.ktuple.*

// Create tuples
val t0 = Tuple()
val t1 = Tuple(1)
val t2 = Tuple("hello", 42)
val t3 = Tuple(1, 2, 3)
val t8 = Tuple(1, 2, 3, 4, 5, 6, 7, 8)

// Access elements
t2.first    // "hello"
t2.second   // 42
t3.third    // 3

// Destructuring
val (a, b, c) = Tuple(1, 2, 3)

// Convert to list (requires same element type)
val list = Tuple(1, 2, 3).toList()  // [1, 2, 3]
```

## API

### Construction

Use the `Tuple()` factory functions for type inference:

```kotlin
val t0 = Tuple()
val t1 = Tuple("a")
val t2 = Tuple("a", 1)
val t3 = Tuple("a", 1, true)
// ... up to Tuple8
```

Or use the class constructors directly:

```kotlin
val t2 = Tuple2("hello", 42)
val t3 = Tuple3(1, 2, 3)
```

### Element Access

Each tuple exposes its elements via named `val` properties:

```kotlin
val t5 = Tuple(1, 2, 3, 4, 5)
t5.first    // 1
t5.second   // 2
t5.third    // 3
t5.fourth   // 4
t5.fifth    // 5
```

### Size

```kotlin
Tuple().size        // 0
Tuple(1, 2).size    // 2
```

### Emptiness Checks

```kotlin
Tuple().isEmpty()       // true
Tuple().isNotEmpty()    // false
Tuple(1).isEmpty()      // false
Tuple(1).isNotEmpty()   // true
```

### Append

Grow a tuple by one element:

```kotlin
Tuple(1, 2).append(3)      // Tuple3(1, 2, 3)
Tuple(1).append(2)          // Tuple2(1, 2)
Tuple().append("hello")     // Tuple1("hello")
```

> **Note:** `Tuple8` does not support `append()` since there is no `Tuple9`.

### Mapping

Transform individual elements:

```kotlin
val t = Tuple(1, "hello", true)
t.map1 { it * 2 }          // Tuple2(2, "hello", true)
t.map2 { it.length }       // Tuple3(1, 5, true)
t.map3 { !it }             // Tuple3(1, "hello", false)
```

Transform all elements at once:

```kotlin
val t = Tuple(1, 2, 3)
t.map { a, b, c -> Tuple(a * 10, b * 10, c * 10) }
// Tuple(10, 20, 30)
```

### Invoke Operator

Call a tuple with a lambda that receives all elements:

```kotlin
val t = Tuple(1, 2, 3)
val sum = t { a, b, c -> a + b + c }   // 6
```

### Collection Conversion

Convert homogeneous tuples to collections (all elements must share the same type):

```kotlin
val t = Tuple(1, 2, 3)
t.toList()          // listOf(1, 2, 3)
t.toMutableList()   // mutableListOf(1, 2, 3)
t.toSet()           // setOf(1, 2, 3)
t.toMutableSet()    // mutableSetOf(1, 2, 3)
t.toArray()         // arrayOf(1, 2, 3)
```

### Equality

Tuples implement structural equality via `data class`:

```kotlin
Tuple(1, 2) == Tuple(1, 2)   // true
Tuple(1, 2) == Tuple(3, 4)   // false
```

### toString

Tuples have a readable string representation:

```kotlin
Tuple().toString()              // "()"
Tuple(1).toString()             // "(1)"
Tuple(1, 2).toString()          // "(1, 2)"
Tuple(1, 2, 3).toString()      // "(1, 2, 3)"
```

## License

[Apache](https://www.apache.org/licenses/LICENSE-2.0.txt)