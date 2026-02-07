# TAGLINE

shell builtin for dynamic command execution

# TLDR

**Evaluate and execute** arguments

```eval "[echo \$HOME]"```

**Execute dynamically** built command

```cmd="ls -la"; eval "$cmd"```

**Expand variables** twice

```var="PATH"; eval "echo \$$var"```

**Execute command** from variable

```action="date"; eval "$action"```

# SYNOPSIS

**eval** [_argument_...]

# PARAMETERS

_ARGUMENT_
> Arguments to concatenate and execute.

# DESCRIPTION

**eval** is a shell builtin that concatenates its arguments, performs shell expansions, and executes the result as a command. It enables dynamic command construction and double expansion of variables.

The command is useful when command strings are built programmatically or stored in variables. It allows variable indirection (accessing a variable whose name is in another variable).

eval's two-pass evaluation makes it powerful but also potentially dangerous with untrusted input.

# CAVEATS

Security risk with untrusted input. Can execute arbitrary commands. Debugging eval'd commands is difficult. Quoting must be handled carefully.

# HISTORY

eval is a standard POSIX shell builtin, present in Bourne shell and all its derivatives. It provides essential metaprogramming capabilities for shell scripts.

# SEE ALSO

[bash](/man/bash)(1), [sh](/man/sh)(1), [exec](/man/exec)(1)
