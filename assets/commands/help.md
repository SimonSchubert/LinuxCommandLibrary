# TLDR

**Get help for builtin**

```help [cd]```

**List all builtins**

```help```

**Short description**

```help -d [command]```

**Man page format**

```help -m [command]```

**Show usage synopsis**

```help -s [command]```

# SYNOPSIS

**help** [_options_] [_pattern_]

# PARAMETERS

_PATTERN_
> Shell builtin name or pattern.

**-d**
> Short description only.

**-m**
> Man page format.

**-s**
> Usage synopsis only.

# DESCRIPTION

**help** displays information about shell builtin commands. It's a Bash builtin that provides documentation for commands built into the shell.

The command shows usage, options, and descriptions for Bash builtins. It's useful for learning about commands like cd, export, and source.

help documents Bash builtin commands.

# CAVEATS

Bash specific. Only for builtins, not external commands. Use man for external commands.

# HISTORY

help has been part of **Bash** since early versions, providing built-in documentation for shell commands.

# SEE ALSO

[man](/man/man)(1), [info](/man/info)(1), [bash](/man/bash)(1)
