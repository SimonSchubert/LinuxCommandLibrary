# TAGLINE

Command-line tool for useful command examples

# TLDR

**Show** examples for a command

```eg [command]```

**Show** examples for a subcommand

```eg git log```

**List** all available example topics

```eg --list```

**Use a custom examples directory**

```eg --examples-dir [path/to/examples] [command]```

**Use a custom pager** for output

```eg --pager-cmd [less] [command]```

# SYNOPSIS

**eg** [_options_] _command_

# PARAMETERS

**--list**
> List all available commands with examples.

**--color**
> Colorize output.

**--squeeze**
> Remove blank lines from output.

**--pager-cmd** _PAGER_
> Use specified pager program for output.

**--examples-dir** _DIR_
> Use custom examples directory.

**--custom-dir** _DIR_
> Use custom user-provided examples directory.

**-v**, **--version**
> Display version and exit.

**-h**, **--help**
> Display help and exit.

# DESCRIPTION

**eg** is a command-line tool that provides practical examples for common commands. Unlike traditional man pages that focus on comprehensive documentation, eg shows the most common and useful usage patterns with clear explanations.

Written in Python, eg works out of the box with no configuration required. It depends only on standard Python libraries and supports both Python 2 and 3. Users can add custom examples by placing files in a custom directory alongside the built-in examples.

The tool is particularly helpful for developers who know what they want to do but need a quick reminder of the exact syntax. It covers popular tools like git, docker, and many Unix utilities.

# CAVEATS

Example database may not cover all command variations. Examples prioritize common use cases over edge cases. Updates to built-in examples require updating the tool itself. Custom examples can supplement but not override built-in ones by default.

# HISTORY

**eg** was created by **Sam Sudar** to provide a more practical alternative to man pages, focusing on real-world usage examples that developers actually need in their daily work. The source is available on GitHub at **github.com/srsudar/eg**.

# SEE ALSO

[man](/man/man)(1), [tldr](/man/tldr)(1), [cheat](/man/cheat)(1)