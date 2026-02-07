# TAGLINE

Unix shell with C-like syntax

# TLDR

**Start an interactive** C shell session

```csh```

**Execute a C shell script**

```csh [script.csh]```

**Execute commands from a string**

```csh -c "[echo Hello; echo World]"```

**Start a login shell**

```csh -l```

**Execute script with verbose** output

```csh -v [script.csh]```

**Execute script with command** tracing

```csh -x [script.csh]```

# SYNOPSIS

**csh** [_options_] [_script_ [_arguments_]]

# PARAMETERS

**-c** _STRING_
> Execute commands from the string.

**-e**
> Exit immediately if any command fails.

**-f**
> Fast start; don't read .cshrc.

**-i**
> Force interactive mode.

**-l**
> Act as a login shell.

**-n**
> Parse but don't execute commands (syntax check).

**-s**
> Read commands from standard input.

**-v**
> Verbose mode; print commands before execution.

**-x**
> Echo commands after variable substitution.

**-V**
> Verbose mode before reading .cshrc.

**-X**
> Echo mode before reading .cshrc.

# DESCRIPTION

**csh** (C shell) is a Unix shell with C-like syntax, featuring job control, command history, and aliasing. It was designed to be more user-friendly than the Bourne shell while providing a syntax familiar to C programmers.

The shell provides interactive features like history substitution (!!, !$), command completion, and aliases. Its scripting syntax differs significantly from Bourne-style shells, using C-like constructs for conditionals and loops.

Configuration files include **~/.cshrc** (read for every shell) and **~/.login** (read for login shells). The shell sets various environment variables and provides built-in commands for job control and directory navigation.

# CONFIGURATION

**~/.cshrc**
> Read for every shell, sets aliases and environment variables.

**~/.login**
> Read for login shells, sets up environment.

# CAVEATS

csh scripting has known deficiencies and is not recommended for complex scripts. Variable handling and quoting behave differently from Bourne shells. Modern systems often use tcsh instead, which extends csh with additional features. Portability of csh scripts is limited.

# HISTORY

The C shell was written by Bill Joy at UC Berkeley in **1978** as part of BSD Unix. It introduced command history and job control to Unix shells. While influential, its scripting limitations led to recommendations against using it for scripts, famously documented in "Csh Programming Considered Harmful."

# SEE ALSO

[tcsh](/man/tcsh)(1), [bash](/man/bash)(1), [sh](/man/sh)(1), [zsh](/man/zsh)(1)
