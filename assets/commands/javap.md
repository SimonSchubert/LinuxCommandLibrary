# TAGLINE

disassembles Java class files

# TLDR

**Disassemble class file**

```javap [ClassName]```

**Show bytecode**

```javap -c [ClassName]```

**Show private members**

```javap -p [ClassName]```

**Verbose output**

```javap -v [ClassName]```

**Disassemble from JAR**

```javap -cp [lib.jar] [com.example.Class]```

**Show line numbers**

```javap -l [ClassName]```

# SYNOPSIS

**javap** [_options_] _class_...

# PARAMETERS

_CLASS_
> Class name to disassemble.

**-c**
> Disassemble bytecode.

**-p**, **-private**
> Show all members.

**-v**, **-verbose**
> Verbose output.

**-l**
> Show line number tables.

**-s**
> Show internal signatures.

**-cp** _PATH_
> Classpath for classes.

**--help**
> Display help information.

# DESCRIPTION

**javap** disassembles Java class files. It shows method signatures, fields, and optionally bytecode instructions.

The tool is useful for understanding compiled Java code. It can analyze classes without source code access.

# CAVEATS

Shows compiled code, not source. Part of JDK. Bytecode knowledge helpful.

# HISTORY

javap has been part of the **JDK** since early versions, providing insight into compiled Java bytecode.

# SEE ALSO

[java](/man/java)(1), [javac](/man/javac)(1), [jad](/man/jad)(1), [jd-cli](/man/jd-cli)(1)
