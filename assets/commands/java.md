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

**-version**
> Show version information.

**--help**
> Display help information.

# DESCRIPTION

**java** launches Java applications. It loads and executes compiled bytecode in the Java Virtual Machine.

The runtime handles memory management, threading, and platform abstraction. It supports both class files and JAR archives.

# CAVEATS

Requires JRE/JDK. Version compatibility matters. Memory settings may need tuning.

# HISTORY

Java was created by **James Gosling** at **Sun Microsystems** in 1995. It's now maintained by **Oracle** and the OpenJDK community.

# SEE ALSO

[javac](/man/javac)(1), [jar](/man/jar)(1), [jps](/man/jps)(1), [jstack](/man/jstack)(1)
