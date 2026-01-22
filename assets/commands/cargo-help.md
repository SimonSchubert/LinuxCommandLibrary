# TLDR

**Show general help**

```cargo help```

**Show help for specific command**

```cargo help [build]```

**List all installed commands**

```cargo --list```

**Verbose command list**

```cargo --list --verbose```

**Explain error code**

```cargo --explain [E0004]```

# SYNOPSIS

**cargo help** [_command_]
**cargo** --help
**cargo** --list

# DESCRIPTION

**cargo help** displays help information for Cargo commands. Use it to learn about available commands, their options, and usage patterns.

# PARAMETERS

**--help**, **-h**
> Show help message

**--list**
> List all installed Cargo subcommands

**--verbose**, **-v**
> Print extra information with --list

**--explain** _code_
> Run rustc --explain for error code

# COMMAND CATEGORIES

**General Commands**
> cargo, cargo help

**Build Commands**
> build, check, clean, run, test, bench

**Manifest Commands**
> add, remove, fetch, generate-lockfile, update

**Package Commands**
> init, new, search, install, uninstall

**Publishing Commands**
> package, publish, yank, owner

# CUSTOM COMMANDS

Custom subcommands installed via cargo install are listed with --list. Any executable named cargo-* in PATH becomes a cargo subcommand.

# SEE ALSO

[cargo](/man/cargo)(1), [rustc](/man/rustc)(1)
