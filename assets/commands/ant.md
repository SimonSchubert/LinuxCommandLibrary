# TLDR

**Run** default target

```ant```

Run **specific target**

```ant [build]```

Run with **build file**

```ant -f [build.xml] [target]```

Run with **property**

```ant -Dproperty=[value] [target]```

**List** available targets

```ant -p```

Run **quietly**

```ant -q [target]```

# SYNOPSIS

**ant** [_-f buildfile_] [_-D property=value_] [_options_] [_target_]

# DESCRIPTION

**ant** (Another Neat Tool) is a Java-based build tool using XML configuration files. It automates software build processes including compiling, testing, packaging, and deploying Java applications.

Build files (typically build.xml) define targets containing tasks. Ant executes tasks in dependency order, similar to make but using XML syntax and platform-independent operation.

# PARAMETERS

**-f** _file_, **-buildfile** _file_
> Build file (default: build.xml)

**-D** _prop=val_
> Set property value

**-p**, **-projecthelp**
> List available targets

**-q**, **-quiet**
> Minimal output

**-v**, **-verbose**
> Verbose output

**-d**, **-debug**
> Debug output

**-e**, **-emacs**
> Output without adornment

**-k**, **-keep-going**
> Continue on error

**-lib** _path_
> Additional classpath

**-version**
> Show version

# CAVEATS

Requires Java Runtime Environment. XML build files can become verbose for complex projects. Largely superseded by Maven and Gradle for modern Java projects.

# HISTORY

**Apache Ant** was created by James Duncan Davidson as part of the Tomcat project, with the first standalone release in **2000**. It was the dominant Java build tool until Maven gained popularity in the mid-2000s.

# SEE ALSO

[mvn](/man/mvn)(1), [gradle](/man/gradle)(1), [make](/man/make)(1)
