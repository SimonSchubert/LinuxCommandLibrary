# TAGLINE

shell function definition keyword

# TLDR

**Define a function**

```function greet() { echo "Hello $1"; }```

**Define a function** without parentheses

```function greet { echo "Hello $1"; }```

**Define a function** the POSIX-portable way

```greet() { echo "Hello $1"; }```

**Call the function**

```greet [World]```

**List defined functions**

```declare -F```

**Show function definition**

```declare -f [function_name]```

**Unset function**

```unset -f [function_name]```

**Export a function** to child bash processes

```export -f [function_name]```

# SYNOPSIS

**function** _name_ [**()**] _compound-command_ [_redirections_]

_name_ **()** _compound-command_ [_redirections_]

# PARAMETERS

_NAME_
> Function name.

_COMMANDS_
> Function body commands.

**$1**, **$2**, etc.
> Positional parameters.

**$@**
> All parameters.

**return** _N_
> Exit function with status.

**local** _VAR_
> Declare local variable.

# DESCRIPTION

**function** is a shell keyword for defining reusable command groups. Functions encapsulate commands, accept parameters, and can return exit status values.

Functions run in the current shell, without creating a new process. Variables are global unless declared with `local`. Parameters are accessed through positional variables ($1, $2, etc.).

In bash, `function name() { ...; }`, `function name { ...; }` and `name() { ...; }` all define functions: when the `function` reserved word is supplied the parentheses are optional. The POSIX-portable form omits the `function` keyword. In ksh and zsh, the `function` keyword is also supported.

# CAVEATS

Functions must be defined before use. `return` only sets exit status (0-255), not output values: use command substitution to capture output. Variable scope requires explicit `local` declarations; without it, variables are global.

# SEE ALSO

[bash](/man/bash)(1), [declare](/man/declare)(1), [local](/man/local)(1), [unset](/man/unset)(1)
