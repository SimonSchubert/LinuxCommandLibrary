# TAGLINE

Display help for Alire package manager commands.

# TLDR

**Display help** for a specific alr command

```alr help [command]```

**List all available** alr commands

```alr help```

**Display global options** and general help

```alr --help```

# SYNOPSIS

**alr** **help** [_command_]

# PARAMETERS

**command**
> The name of the alr subcommand to get help for.

# DESCRIPTION

**alr help** displays detailed help information for Alire (Ada/SPARK package manager) commands. When run without arguments, it shows a list of all available commands. When a command name is provided, it displays detailed usage information for that specific command.

Alire is a source package manager for Ada/SPARK, similar to Rust's cargo or OCaml's opam. The **alr** command-line tool manages dependencies, builds projects, and incorporates libraries from the Alire catalog.

# SEE ALSO

[alr](/man/alr)(1), [alr-version](/man/alr-version)(1)
