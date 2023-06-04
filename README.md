# JConditionUtils

Java Condition Tools

# Purpose

The purpose of the Java Condition Tools is to provide a set of static methods in a utility class which can help to make
common conditions more concise.

# Examples

## Test if several objects are not null

In standard Java you would have to write something like the following code.

```java
class ExampleClass {
  void exampleMethod() {
    if (object1 != null && object2 != null && object3 != null) {
      // execute something
    }
  }
}
```

With Java Condition Tools your code can look like this.

```java
class ExampleClass {
  void exampleMethod() {
    if (ObjectConditionUtils.areNotNull(object1, object2, object3)) {
      // execute something
    }
  }
}
```

## Compare inequality of with a number of other objects

In standard Java you would have to write something like the following code.
```java
class ExampleClass {
  void exampleMethod() {
    if (!object1.equals(object2) && !object1.equals(object3) && !object1.equals(object4)) {
      // execute something
    }
  }
}
```

With Java Condition Tools your code can look like this.

```java
class ExampleClass {
  void exampleMethod() {
    if (ObjectConditionUtils.equalsNone(object1, object2, object3, object4)) {
      // execute something
    }
  }
}
```

# License

This project is available under the MIT License.
See [http://www.opensource.org/licenses/mit-license.php](http://www.opensource.org/licenses/mit-license.php) for
details.

# Build status
[![Maven Build](https://github.com/SeanDorff/JConditionTools/actions/workflows/maven-build.yml/badge.svg)](https://github.com/SeanDorff/JConditionTools/actions/workflows/maven-build.yml)

# Deployment to OSSRH
The file `settings.xml` in `~/.m2` has to contain the following lines.
```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 https://maven.apache.org/xsd/settings-1.0.0.xsd">
    <servers>
        <server>
            <id>ossrh</id>
            <username>your-jira-id</username>
            <password>your-jira-pwd</password>
        </server>
    </servers>
</settings>
```