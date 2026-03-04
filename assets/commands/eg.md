# TAGLINE

Command-line tool for useful command examples

# TLDR

**Show** examples for a command

```eg [command]```

**Show** examples for git log

```eg git log```

**Show** examples with explanations

```eg -x [command]```

**List** all available examples

```eg --list```

# SYNOPSIS

**eg** [_options_] _command_

# PARAMETERS

**-x, --explain**
> Show detailed explanations with examples

**-l, --list**
> List all available commands with examples

**-c, --color** _MODE_
> Color mode: auto, always, never

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**eg** is a command-line tool that provides practical examples for common commands. Unlike traditional man pages that focus on comprehensive documentation, eg shows the most common and useful usage patterns with clear explanations.

The tool is particularly helpful for developers who know what they want to do but need a quick reminder of the exact syntax. It covers popular tools like git, docker, kubectl, and many Unix utilities.

# CAVEATS

Example database may not cover all command variations. Examples prioritize common use cases over edge cases. Updates to examples require updating the tool itself.

# HISTORY

**eg** was created by Sam Sudar to provide a more practical alternative to man pages, focusing on real-world usage examples that developers actually need in their daily work.

# SEE ALSO

[man](/man/man)(1), [tldr](/man/tldr)(1), [cheat](/man/cheat)(1), [curl](/man/curl)(1)