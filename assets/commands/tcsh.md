# TLDR

**Start an interactive tcsh shell**

```tcsh```

**Execute a command**

```tcsh -c "[command]"```

**Run a script**

```tcsh [script.csh]```

**Start as a login shell**

```tcsh -l```

**Start without reading startup files** (fast start)

```tcsh -f```

**Parse commands without executing** (syntax check)

```tcsh -n [script.csh]```

**Enable verbose mode** to echo commands after history substitution

```tcsh -v```

# SYNOPSIS

**tcsh** [_-bcefinstvVxX_] [_-l_] [_command_]

# PARAMETERS

**-c** _command_
> Read commands from the following argument string.

**-e**
> Exit immediately if a command exits with non-zero status.

**-f**
> Fast start; do not read ~/.tcshrc or ~/.cshrc startup files.

**-i**
> Force interactive mode even if input is not a terminal.

**-l**
> Act as a login shell; read .login and .logout files.

**-n**
> Parse commands but do not execute them (for debugging scripts).

**-s**
> Read command input from standard input.

**-t**
> Read and execute a single line of input.

**-v**
> Set verbose mode; echo commands after history substitution.

**-x**
> Set echo mode; echo commands before execution.

**-V**
> Set verbose mode before reading ~/.tcshrc.

**-X**
> Set echo mode before reading ~/.tcshrc.

**-b**
> Force a break from option processing.

**-m**
> Load ~/.tcshrc even if it doesn't belong to the effective user.

**-q**
> Accept SIGQUIT; for use under a debugger with job control disabled.

**--help**
> Print help message and exit.

**--version**
> Print version information and exit.

# DESCRIPTION

**tcsh** is an enhanced version of the Berkeley C shell (csh). It provides a command-line editor, programmable word completion, spelling correction, history mechanism, job control, and C-like syntax.

Interactive shells read **~/.tcshrc** (or ~/.cshrc) on startup. Login shells additionally read **~/.login** and execute **~/.logout** on exit. The shell supports command history with **!** syntax, aliases, and shell variables.

Features include filename completion with Tab, command history editing, directory stack manipulation with **pushd/popd**, and programmable completions for commands and arguments.

# CAVEATS

tcsh uses C shell syntax which differs from POSIX sh/bash. Scripts written for tcsh may not be portable. The C shell family has known issues with complex scripting, and POSIX-compatible shells are generally recommended for portable scripts.

# HISTORY

The C shell (csh) was created by **Bill Joy** at UC Berkeley in the late 1970s for BSD Unix. tcsh was developed as an enhanced version with additional features like command-line editing and completion. The name "tcsh" comes from the TENEX operating system which inspired some features. tcsh became the default shell on FreeBSD and was widely used on Unix systems before bash became dominant.

# SEE ALSO

[csh](/man/csh)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1), [sh](/man/sh)(1)
