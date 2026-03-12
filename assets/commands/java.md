# TAGLINE

launches Java applications

# TLDR

**Run class file**

```java [ClassName]```

**Run JAR file**

```java -jar [application.jar]```

**Run with classpath**

```java -cp [path/to/classes] [ClassName]```

**Set heap size**

```java -Xmx[512m] -jar [app.jar]```

**Run with system property**

```java -D[property=value] [ClassName]```

**Show version**

```java -version```

**Run single source file**

```java [Source.java]```

# SYNOPSIS

**java** [_options_] _class_ [_args_...]
**java** [_options_] **-jar** _jarfile_ [_args_...]

# PARAMETERS

_CLASS_
> Main class to execute.

**-jar** _FILE_
> Execute JAR file.

**-cp** _PATH_
> Class path for dependencies.

**-Xmx** _SIZE_
> Maximum heap size.

**-Xms** _SIZE_
> Initial heap size.

**-D** _PROP=VAL_
> Set system property.

**-Xss** _SIZE_
> Thread stack size.

**-ea**, **--enableassertions**
> Enable assertions.

**--enable-preview**
> Enable preview language features.

**-verbose** _:class|:gc|:jni_
> Enable verbose output.

**-version**
> Show version information.

**--help**
> Display help information.

# DESCRIPTION

**java** launches Java applications by loading and executing compiled bytecode in the Java Virtual Machine (JVM). It supports class files, JAR archives, and since Java 11, single source-file programs.

The JVM handles memory management (garbage collection), threading, and platform abstraction. Memory is configured via **-Xms** (initial heap), **-Xmx** (max heap), and **-Xss** (stack size). System properties (**-D**) configure application behavior at runtime.

# CAVEATS

Requires JRE/JDK. Version compatibility matters. Memory settings may need tuning.

# HISTORY

Java was created by **James Gosling** at **Sun Microsystems** in 1995. It's now maintained by **Oracle** and the OpenJDK community.

# SEE ALSO

[javac](/man/javac)(1), [jar](/man/jar)(1), [jps](/man/jps)(1), [jstack](/man/jstack)(1)
