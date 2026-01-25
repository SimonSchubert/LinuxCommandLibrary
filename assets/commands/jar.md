# TLDR

**Create JAR file**

```jar cf [output.jar] [files...]```

**Create with manifest**

```jar cfm [output.jar] [MANIFEST.MF] [files...]```

**Extract JAR file**

```jar xf [archive.jar]```

**List contents**

```jar tf [archive.jar]```

**Create executable JAR**

```jar cfe [output.jar] [MainClass] [files...]```

**Update JAR file**

```jar uf [archive.jar] [newfiles...]```

**Extract specific file**

```jar xf [archive.jar] [path/to/file]```

# SYNOPSIS

**jar** [_options_] [_manifest_] _destination_ _input-files_

# PARAMETERS

**c**
> Create new archive.

**x**
> Extract archive.

**t**
> List table of contents.

**u**
> Update existing archive.

**f** _file_
> Specify archive filename.

**m** _manifest_
> Include manifest file.

**e** _class_
> Set entry point (main class).

**v**
> Verbose output.

**0**
> Store only (no compression).

**C** _dir_
> Change to directory.

# DESCRIPTION

**jar** is the Java Archive tool. It packages Java class files, resources, and metadata into a single JAR file for distribution and deployment.

JAR files use ZIP format with a manifest (META-INF/MANIFEST.MF) containing metadata. Executable JARs specify a main class in the manifest.

# MANIFEST EXAMPLE

```
Manifest-Version: 1.0
Main-Class: com.example.Main
Class-Path: lib/dependency.jar
```

# CAVEATS

Order of flags matters. Manifest file needs newline at end. Paths are relative to current directory. Use -C for changing base directory.

# HISTORY

The jar tool has been part of the **JDK** since Java 1.1 (1997). It's essential for Java deployment, evolving to support modules in Java 9+ and multi-release JARs.

# SEE ALSO

[java](/man/java)(1), [javac](/man/javac)(1), [zip](/man/zip)(1), [unzip](/man/unzip)(1)
