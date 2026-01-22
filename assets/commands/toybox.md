# TLDR

**List** all commands

```toybox```

Run **command** explicitly

```toybox [command] [arguments]```

**List** files

```toybox ls```

**Remove** a file

```toybox rm [path/to/file]```

Display **help** for command

```toybox [command] --help```

Show **version**

```toybox --version```

# SYNOPSIS

**toybox** [_COMMAND_ [_ARGS_...]]

# PARAMETERS

**--help**
> Display help for a command

**--version**
> Display version information

# DESCRIPTION

**toybox** is a multipurpose tool that combines many standard Unix utilities into a single executable. It provides lightweight implementations of common commands like ls, rm, cp, and many others.

Toybox is commonly used in Android and embedded Linux systems where minimizing binary size is important. Running toybox without arguments lists all available built-in commands.

# CAVEATS

Some commands may have fewer features than full GNU implementations. Command availability depends on build configuration. Primarily designed for embedded systems and Android.

# HISTORY

**toybox** was created by **Rob Landley** as a BSD-licensed alternative to BusyBox. It became the standard command-line toolbox in Android, replacing the older Toolbox implementation.

# SEE ALSO

[busybox](/man/busybox)(1)
