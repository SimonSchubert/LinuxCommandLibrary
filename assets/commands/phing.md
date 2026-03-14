# TAGLINE

PHP build tool based on Apache Ant

# TLDR

**Run default target**

```phing```

**Run specific target**

```phing [target]```

**Use custom build file**

```phing -f [build.xml] [target]```

**List available targets**

```phing -l```

**Set a property value**

```phing -D[name]=[value] [target]```

**Run with verbose output**

```phing -verbose [target]```

**Run in debug mode**

```phing -debug [target]```

**Specify a logger**

```phing -logger phing.listener.DefaultLogger [target]```

# SYNOPSIS

**phing** [_options_] [_target_...]

# PARAMETERS

_TARGET_
> Build target to execute. If omitted, the default target is run.

**-f** _FILE_
> Use the specified build file instead of the default build.xml.

**-l**
> List available targets in the build file.

**-D**_PROP_**=**_VALUE_
> Set a build property to a given value, overriding the build file.

**-verbose**
> Produce verbose output for debugging.

**-debug**
> Produce debug-level output.

**-q**, **-quiet**
> Suppress most output, only show errors.

**-logger** _CLASS_
> Specify a custom logger class.

**-logfile** _FILE_
> Write output to a log file.

**-find** _FILE_
> Search parent directories for the build file.

# DESCRIPTION

**phing** (PHing Is Not GNU make) is a PHP project build tool based on Apache Ant. It uses XML build files to define targets and tasks for automating PHP project workflows such as compilation, testing, packaging, and deployment.

Phing provides a rich set of built-in tasks for file operations, PHP-specific tasks (PHPUnit, PHP_CodeSniffer, phpDocumentor), version control integration, and archive creation. Custom tasks can be written in PHP.

# CAVEATS

Requires PHP CLI. Build files use XML format with Ant-like syntax. Task names and attributes are case-sensitive. The default build file is build.xml in the current directory.

# HISTORY

Phing was originally created by **Andreas Aderhold** in 2002 as a PHP port of Apache Ant. The name is a recursive acronym: PHing Is Not GNU make.

# SEE ALSO

[ant](/man/ant)(1), [make](/man/make)(1), [composer](/man/composer)(1), [php](/man/php)(1)

