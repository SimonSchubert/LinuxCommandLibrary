# TAGLINE

shell builtin for dynamic command execution

# TLDR

**Execute dynamically** built command

```cmd="ls -la"; eval "$cmd"```

**Expand variables** twice (variable indirection)

```var="PATH"; eval "echo \$$var"```

**Set a variable** with a dynamic name

```key="myvar"; eval "$key=hello"; echo "$myvar"```

**Execute a command stored** in a variable with pipes

```cmd="ps aux | grep bash"; eval "$cmd"```

**Use eval with command substitution**

```eval "$(ssh-agent -s)"```

# SYNOPSIS

**eval** [_argument_...]

# PARAMETERS

_ARGUMENT_
> Arguments to concatenate and execute.

# DESCRIPTION

**eval** is a POSIX special shell builtin that concatenates its arguments separated by spaces, then reads and executes the resulting string as a shell command. This enables dynamic command construction and double expansion of variables.

The command is useful when command strings are built programmatically or stored in variables. It allows variable indirection (accessing a variable whose name is in another variable). A common real-world use is initializing ssh-agent with `eval "$(ssh-agent -s)"`.

If there are no arguments or only null arguments, eval returns exit status 0. Otherwise it returns the exit status of the executed command.

# CAVEATS

Security risk with untrusted input. Can execute arbitrary commands. Debugging eval'd commands is difficult. Quoting must be handled carefully.

# HISTORY

**eval** is a standard POSIX special shell builtin defined in **IEEE Std 1003.1** (POSIX.1), present in the original Bourne shell and all its derivatives including bash, zsh, ksh, and dash. It provides essential metaprogramming capabilities for shell scripts.

# SEE ALSO

[bash](/man/bash)(1), [sh](/man/sh)(1), [exec](/man/exec)(1), [set](/man/set)(1)
