# TLDR

**Compile a Java file**

```javac [File.java]```

**Compile multiple files**

```javac [File1.java] [File2.java]```

**Compile all Java files** in current directory

```javac *.java```

**Compile with classpath**

```javac -cp [lib/*:classes] [File.java]```

**Specify output directory** for class files

```javac -d [out] [File.java]```

**Compile with specific** Java version compatibility

```javac --release [11] [File.java]```

**Enable all warnings**

```javac -Xlint:all [File.java]```

**Compile with verbose output**

```javac -verbose [File.java]```

# SYNOPSIS

**javac** [_OPTIONS_] _SOURCE-FILES_

**javac** [_OPTIONS_] **@**_ARGFILE_

# PARAMETERS

**-d** _DIR_
> Output directory for compiled class files.

**-cp**, **-classpath** _PATH_
> Classpath for finding user class files and libraries.

**--module-path** _PATH_
> Module path for finding application modules.

**-sourcepath** _PATH_
> Path for finding source files.

**--release** _VERSION_
> Compile for specific Java SE release.

**-source** _VERSION_
> Source code compatibility version.

**-target** _VERSION_
> Generate class files for specific VM version.

**-Xlint**[**:**_WARNINGS_]
> Enable warnings (all, deprecation, unchecked, etc.).

**-g**
> Include debugging information.

**-verbose**
> Output messages about what the compiler is doing.

**-deprecation**
> Show description of deprecated API usage.

**-encoding** _ENCODING_
> Source file character encoding.

**-h** _DIR_
> Generate native header files for JNI.

**@**_FILE_
> Read options and filenames from file.

# DESCRIPTION

**javac** compiles Java source files (.java) into bytecode class files (.class) that run on the Java Virtual Machine. It performs syntax and type checking, optimizes code, and generates platform-independent bytecode.

The compiler uses the classpath to locate referenced classes and libraries. For modular projects (Java 9+), the module path specifies module locations. The **--release** flag ensures compatibility with a specific Java version for both compilation and available APIs.

When compiling many files, use @argfiles to avoid command-line length limits. Each line in the argfile can contain a source file or option.

# CAVEATS

Source and class files must match Java package structure with directory paths. Circular dependencies between source files require all files to be compiled together. The classpath separator is : on Unix and ; on Windows.

# HISTORY

javac has been part of the Java Development Kit since Java 1.0 in **1996**. The compiler has evolved significantly, adding generics (Java 5), modules (Java 9), and numerous language features. Modern versions support incremental compilation and annotation processing.

# SEE ALSO

[java](/man/java)(1), [jar](/man/jar)(1), [javadoc](/man/javadoc)(1), [jdb](/man/jdb)(1)
