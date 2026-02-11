# TAGLINE

Compute Java serialization version UID

# TLDR

**Get serial version UID**

```serialver [ClassName]```

**With classpath**

```serialver -classpath [path] [ClassName]```

**Show for JAR class**

```serialver -classpath [app.jar] [com.example.MyClass]```

# SYNOPSIS

**serialver** [_-classpath path_] [_options_] _classname_

# PARAMETERS

**-classpath** _PATH_
> Class search path.

**-J** _FLAG_
> Pass to Java runtime.

**-show**
> Show GUI (deprecated).

# DESCRIPTION

**serialver** computes and displays the serialVersionUID for Java classes that implement the Serializable interface. This UID is a hash derived from the class structure (fields, methods, interfaces) and is used by Java's serialization mechanism to verify that sender and receiver of a serialized object have compatible class definitions.

When a class does not explicitly declare a serialVersionUID, the JVM computes one automatically at runtime. Using serialver to obtain and hardcode this value in the class source prevents incompatible class version errors when the class structure changes in ways that remain compatible with older serialized forms.

# CAVEATS

Class must be Serializable. JDK required. GUI mode deprecated.

# HISTORY

**serialver** is part of the **Java Development Kit**, providing serial version UID computation for Serializable classes.

# SEE ALSO

[java](/man/java)(1), [javac](/man/javac)(1), [jar](/man/jar)(1)
