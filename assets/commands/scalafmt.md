# TAGLINE

Opinionated Scala code formatter

# TLDR

**Format files**

```scalafmt [file.scala]```

**Format in place**

```scalafmt -i [file.scala]```

**Check formatting**

```scalafmt --check [file.scala]```

**Format directory**

```scalafmt [src/]```

**Use config file**

```scalafmt -c [.scalafmt.conf] [file.scala]```

**Show diff**

```scalafmt --diff [file.scala]```

**Format stdin**

```cat [file.scala] | scalafmt --stdin```

# SYNOPSIS

**scalafmt** [_-i_] [_--check_] [_-c config_] [_options_] [_files_]

# PARAMETERS

**-i**, **--inplace**
> Modify files in place.

**--check**
> Check only, no changes.

**-c**, **--config** _FILE_
> Config file.

**--diff**
> Show changes.

**--stdin**
> Read from stdin.

**--stdout**
> Write to stdout.

**--exclude** _PATTERN_
> Exclude files.

**--help**
> Show help.

# DESCRIPTION

**scalafmt** is an opinionated code formatter for Scala that enforces consistent style across projects. It reformats source code according to configurable rules covering line length, indentation, alignment, and import ordering, supporting both Scala 2 and Scala 3 syntax through dialect configuration.

The **--check** mode verifies formatting without modifying files, returning a non-zero exit code when changes would be made, which is useful for CI pipeline enforcement. The **-i** (in-place) mode directly modifies files during development. Configuration is defined in a **.scalafmt.conf** file at the project root using HOCON format.

# CONFIGURATION

**.scalafmt.conf**
> Project-level configuration file in HOCON format defining formatting rules including maxColumn, dialect, align settings, and rewrite rules.

# CAVEATS

May change code structure subtly. Configuration options are many. Editor integration recommended.

# HISTORY

**scalafmt** was created by **Olafur Pall Geirsson** for Scala formatting. It's widely used in the Scala ecosystem for code style enforcement.

# SEE ALSO

[scala](/man/scala)(1), [sbt](/man/sbt)(1), [metals](/man/metals)(1)
