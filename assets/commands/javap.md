# TAGLINE

disassemble Java class files

# TLDR

**Show public method signatures of a class**

```javap [ClassName]```

**Disassemble bytecode instructions**

```javap -c [ClassName]```

**Show all members including private**

```javap -p [ClassName]```

**Verbose output with stack size, locals, and constant pool**

```javap -v [ClassName]```

**Disassemble a class from a JAR file**

```javap -cp [lib.jar] [com.example.ClassName]```

**Show line number and local variable tables**

```javap -l [ClassName]```

**Show internal type signatures**

```javap -s [ClassName]```

# SYNOPSIS

**javap** [_options_] _class_...

# PARAMETERS

_CLASS_
> One or more class names or .class file paths to disassemble.

**-c**
> Disassemble bytecode instructions for each method.

**-p**, **-private**
> Show all classes and members including private.

**-protected**
> Show only protected and public classes and members.

**-public**
> Show only public classes and members.

**-package**
> Show package, protected, and public classes and members (default).

**-v**, **-verbose**
> Print stack size, number of locals, method arguments, and constant pool.

**-l**
> Print line number and local variable tables.

**-s**
> Print internal type signatures.

**-sysinfo**
> Show system information (path, size, date, MD5 hash) of the class.

**-cp** _PATH_, **-classpath** _PATH_
> Classpath for locating classes. Overrides CLASSPATH environment variable.

**-bootclasspath** _PATH_
> Path from which to load bootstrap classes.

**-J** _FLAG_
> Pass a flag directly to the Java runtime system.

**--help**
> Display help information.

# DESCRIPTION

**javap** is the Java class file disassembler included in the JDK. It examines compiled .class files and displays information about their fields, methods, and optionally the bytecode instructions that comprise each method.

The tool is useful for understanding compiled Java code, debugging compilation issues, verifying method signatures, and inspecting bytecode without needing original source code.

# CAVEATS

Shows compiled bytecode, not original source code. Understanding JVM bytecode instructions is helpful for interpreting **-c** output. Class names should use dot notation (com.example.MyClass), not file paths. Part of the JDK; requires a Java installation.

# HISTORY

**javap** has been part of the **JDK** since **Java 1.0**, providing insight into compiled Java bytecode. It was significantly updated in **Java 7** with improved output formatting and additional options.

# SEE ALSO

[java](/man/java)(1), [javac](/man/javac)(1), [jar](/man/jar)(1)
