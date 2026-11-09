# TAGLINE

Compute Java serialization version UID

# TLDR

**Get serial version UID**

```serialver [ClassName]```

**With classpath**

```serialver -classpath [path] [ClassName]```

**Show for JAR class**

```serialver -classpath [app.jar] [com.example.MyClass]```

**Several classes** at once

```serialver -classpath [path] [ClassA] [ClassB]```

# SYNOPSIS

**serialver** [_-classpath path_] [_-J option_] _classname_...

# PARAMETERS

**-classpath** _PATH_
> Search path for application classes and resources, separated by colons.

**-J** _OPTION_
> Pass an option to the Java runtime (e.g., -J-Xms48m).

# DESCRIPTION

**serialver** prints the serialVersionUID for one or more Java classes in a form suitable for copying into an evolving class. This UID is a hash derived from the class structure (fields, methods, interfaces) and is used by Java's serialization mechanism to verify that sender and receiver of a serialized object have compatible class definitions.

When a class does not explicitly declare a serialVersionUID, the JVM computes one automatically at runtime. Using serialver to obtain and hardcode this value in the class source prevents incompatible class version errors when the class structure changes in ways that remain compatible with older serialized forms.

# CAVEATS

**serialver** loads and initializes the classes it inspects, so never run it on untrusted classes. The class must implement Serializable. With no arguments it prints a usage line.

# HISTORY

The GUI inspector option **-show** was documented through JDK 8 and is absent from JDK 9 and later.

# SEE ALSO

[java](/man/java)(1), [javac](/man/javac)(1), [jar](/man/jar)(1)

# RESOURCES

```[Source code](https://github.com/openjdk/jdk)```

```[Homepage](https://openjdk.org/)```

```[Documentation](https://docs.oracle.com/en/java/javase/25/docs/specs/man/serialver.html)```

<!-- verified: 2026-11-09 -->
