# TAGLINE

Java-based build automation tool

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

**-S**, **-silent**
> Print nothing but task outputs and build failures

**-k**, **-keep-going**
> Execute all targets that do not depend on failed targets

**-lib** _path_
> Specify a path to search for jars and classes

**-l** _file_, **-logfile** _file_
> Write log output to the given file

**-logger** _classname_
> Class that performs logging

**-propertyfile** _name_
> Load all properties from file (-D properties take precedence)

**-noinput**
> Do not allow interactive input

**-s** _file_, **-find** _file_
> Search for the buildfile towards the root of the filesystem and use it

**-nice** _number_
> Niceness for the main thread: 1 (lowest) to 10 (highest), default 5

**-diagnostics**
> Print information helpful for diagnosing problems and exit

**-version**
> Show version

# CAVEATS

Requires Java Runtime Environment. XML build files can become verbose for complex projects. Largely superseded by Maven and Gradle for modern Java projects.

# HISTORY

**Apache Ant** was created by James Duncan Davidson as part of the Tomcat project, with the first standalone release in **2000**. It was the dominant Java build tool until Maven gained popularity in the mid-2000s.

# INSTALL

```dnf: sudo dnf install ant```

```pacman: sudo pacman -S ant```

```apk: sudo apk add apache-ant```

```zypper: sudo zypper install ant```

```brew: brew install ant```

```nix: nix profile install nixpkgs#ant```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[mvn](/man/mvn)(1), [gradle](/man/gradle)(1), [make](/man/make)(1)

# RESOURCES

```[Source code](https://github.com/apache/ant)```

```[Homepage](https://ant.apache.org/)```

```[Documentation](https://ant.apache.org/manual/)```

<!-- verified: 2026-06-11 -->
