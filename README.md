# JConditionUtils

Java Condition Tools

# Purpose

The purpose of the Java Condition Tools is to provide a set of static methods in a utility class which can help to make
common conditions more concise.

# Examples

## Test if several objects are not null

In standard Java you would have to write something like the following code.

```java
if (object1 != null && object2 != null && object3 != null) {
  // execute something
}
```

With Java Condition Tools your code can look like this.

```java
if (ObjectConditionUtils.areNotNull(object1, object2, object3) {
  // execute something
}
```

## Compare inequality of with a number of other objects

In standard Java you would have to write something like the following code.
```java
if (!object1.equals(object2) && !object1.equals(object3) && !object1.equals(object4) {
  // execute something
}
```

With Java Condition Tools your code can look like this.

```java
if (ObjectConditionUtils.equalsNone(object1, object2, object3, object4) {
  // execute something
}
```

# License

This project is available under the MIT License.
See [http://www.opensource.org/licenses/mit-license.php](http://www.opensource.org/licenses/mit-license.php) for
details.

# Build status
[![Maven Build](https://github.com/SeanDorff/JConditionTools/actions/workflows/maven-build.yml/badge.svg)](https://github.com/SeanDorff/JConditionTools/actions/workflows/maven-build.yml)