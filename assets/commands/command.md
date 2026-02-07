# TAGLINE

execute commands bypassing shell functions

# TLDR

**Run a command ignoring shell functions**

```command [ls]```

**Check if a command exists**

```command -v [git] && echo "git is installed"```

**Get the path of a command**

```command -v [python3]```

**Describe a command's type**

```command -V [cd]```

**Run external command when function exists with same name**

```ls() { command ls --color=auto "$@"; }```

# SYNOPSIS

**command** [**-pVv**] _command_ [_arguments_]

# PARAMETERS

**-v**
> Print the pathname or alias that would be used (like **which**).

**-V**
> Verbose description of command type.

**-p**
> Use default PATH to find command, ignoring custom PATH.

# DESCRIPTION

**command** is a shell builtin that executes a command, bypassing shell functions with the same name. This is essential when writing wrapper functions that need to call the original command they're wrapping.

With **-v**, it prints how the command would be resolved: the path for external commands, the definition for aliases, or indication for builtins and functions. This is the POSIX-portable way to check if a command exists (preferred over **which**).

The **-V** option provides verbose output describing what type of command it is (builtin, function, alias, or external) and where it's defined.

# CAVEATS

**command** is a shell builtin, not an external program. Behavior may vary slightly between shells (bash, zsh, dash). The **-v** option returns success (0) if the command exists, making it ideal for conditional checks. Unlike **which**, it handles builtins and functions correctly.

# HISTORY

The **command** builtin was specified in **POSIX.2** (1992) to provide a standard way to bypass function lookup and check command availability. It was designed to replace non-portable utilities like **which** for determining command paths. The builtin is available in all POSIX-compliant shells including bash, dash, zsh, and ksh.

# SEE ALSO

[type](/man/type)(1), [which](/man/which)(1), [builtin](/man/builtin)(1), [hash](/man/hash)(1)
