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

**scalafmt** formats Scala source code. It enforces consistent code style.

Configuration defines formatting rules. Line length, indentation, and alignment settings.

Check mode verifies formatting. Useful in CI pipelines.

In-place mode modifies files directly. Convenient for development.

Scala 2 and 3 syntax supported. Dialect configured per project.

# CAVEATS

May change code structure subtly. Configuration options are many. Editor integration recommended.

# HISTORY

**scalafmt** was created by **Olafur Pall Geirsson** for Scala formatting. It's widely used in the Scala ecosystem for code style enforcement.

# SEE ALSO

[scala](/man/scala)(1), [sbt](/man/sbt)(1), [metals](/man/metals)(1)
