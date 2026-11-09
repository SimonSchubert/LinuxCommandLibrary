# TAGLINE

Java Archive tool

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

**List contents verbosely**

```jar tvf [archive.jar]```

**Create JAR from directory** using -C to change base dir

```jar cf [output.jar] -C [build/classes] .```

**Print the module descriptor** of a JAR

```jar --describe-module --file [archive.jar]```

**Validate** a JAR file

```jar --validate --file [archive.jar]```

# SYNOPSIS

**jar** [_OPTION_ ...] [[**--release** _VERSION_] [**-C** _dir_] _files_] ...

# PARAMETERS

**-c**, **--create**
> Create new archive.

**-x**, **--extract**
> Extract archive.

**-t**, **--list**
> List table of contents.

**-u**, **--update**
> Update existing archive.

**-d**, **--describe-module**
> Print the module descriptor or automatic module name.

**--validate**
> Validate the contents of the JAR file.

**-f** _file_, **--file=**_file_
> Specify archive filename.

**-m** _file_, **--manifest=**_file_
> Include manifest file.

**-e** _class_, **--main-class=**_class_
> Set entry point (main class).

**-v**, **--verbose**
> Verbose output.

**-0**, **--no-compress**
> Store only (no compression).

**-M**, **--no-manifest**
> Do not create a manifest file.

**-i** _file_, **--generate-index=**_file_
> Generate index information for the specified JAR file. Deprecated.

**-C** _dir_
> Change to directory before including the following files. In extract mode, sets the destination directory.

**--dir** _dir_
> Directory to extract into.

**-k**, **--keep-old-files**
> Do not overwrite existing files when extracting.

**--date=**_timestamp_
> Timestamp to use for entries, useful for reproducible builds.

**--module-version=**_version_
> Module version recorded when creating or updating a modular JAR.

**-p**, **--module-path**
> Location of module dependencies for generating hashes.

**--release** _VERSION_
> (Java 9+) Place following files in a versioned directory for multi-release JARs.

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

Order of flags matters when using legacy (non-dashed) syntax. The manifest file must end with a newline. Paths are relative to the current directory unless -C is used. In Java 9+ the `--module-version` and `--release` flags add module/multi-release support.

# HISTORY

The jar tool has been part of the **JDK** since Java 1.1 (1997). It's essential for Java deployment, evolving to support modules in Java 9+ and multi-release JARs.

# SEE ALSO

[java](/man/java)(1), [javac](/man/javac)(1), [jarsigner](/man/jarsigner)(1), [zip](/man/zip)(1), [unzip](/man/unzip)(1), [tar](/man/tar)(1)

# RESOURCES

```[Source code](https://github.com/openjdk/jdk)```

```[Documentation](https://docs.oracle.com/en/java/javase/25/docs/specs/man/jar.html)```

<!-- verified: 2026-11-09 -->
