# TAGLINE

CLI tool to get help with CLI tools

# TLDR

**Check help flags** for a command

```halp [command]```

**Show the manual page** or cheat sheet for a command

```halp plz [command]```

**Check a specific argument for a command**

```halp --check [--flag] [command]```

**Set a custom timeout** for checking

```halp -t [10] [command]```

# SYNOPSIS

**halp** [_options_] _command_

**halp** **plz** [_options_] _command_

# PARAMETERS

**--check** _ARG_
> Set the argument to check

**--no-version**
> Disable checking version information

**--no-help**
> Disable checking help information

**-c**, **--config** _PATH_
> Set the configuration file

**-t**, **--timeout** _S_
> Set the timeout for commands (default: 5 seconds)

**-v**, **--verbose**
> Enable verbose logging

**-h**, **--help**
> Print help

**-V**, **--version**
> Print version

# DESCRIPTION

**halp** is a CLI tool that helps you find the correct help flags for command-line tools. Instead of manually trying **-h**, **--help**, **-?**, **help**, or other variations, halp checks a predefined list of commonly used help options and reports which ones work for the given command.

The **plz** subcommand goes further by providing quick access to the manual page or **cheat.sh** cheat sheet for a command, using your preferred pager.

# CAVEATS

Some commands may produce side effects when invoked with certain flags, even help-related ones. The default timeout of 5 seconds may be too short for slow commands. Cheat sheet lookups via **cheat.sh** require an internet connection.

# HISTORY

**halp** was created by **Orhun Parmaksiz** and is written in **Rust**. It was designed to eliminate the frustration of guessing which flag a command uses for its help output.

# SEE ALSO

[man](/man/man)(1), [tldr](/man/tldr)(1), [cheat](/man/cheat)(1)
