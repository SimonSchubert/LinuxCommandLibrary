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

**serialver** returns serialVersionUID. It helps Java serialization.

Computes UID for class. Based on class structure.

Used for Serializable classes. Version compatibility.

Part of JDK tools. Standard Java utility.

Helps migration. Maintain compatibility.

# CAVEATS

Class must be Serializable. JDK required. GUI mode deprecated.

# HISTORY

**serialver** is part of the **Java Development Kit**, providing serial version UID computation for Serializable classes.

# SEE ALSO

[java](/man/java)(1), [javac](/man/javac)(1), [jar](/man/jar)(1)
