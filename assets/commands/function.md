# TAGLINE

shell function definition keyword

# TLDR

**Define a function**

```function greet() { echo "Hello $1"; }```

**Call the function**

```greet [World]```

**List defined functions**

```declare -F```

**Show function definition**

```declare -f [function_name]```

**Unset function**

```unset -f [function_name]```

# SYNOPSIS

**function** _name_() { _commands_; }

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

Functions enable code reuse, modularity, and cleaner scripts. They have local scope for variables with the local keyword. Parameters are accessed through positional variables.

In bash, both "function name()" and "name()" syntax define functions.

# CAVEATS

Functions must be defined before use. Return only provides exit status, not values. Variable scope requires explicit local declarations.

# HISTORY

Functions were added to the **Bourne shell** and expanded in bash and ksh. They're now a fundamental shell scripting construct supported by all POSIX shells.

# SEE ALSO

[bash](/man/bash)(1), [return](/man/return)(1), [local](/man/local)(1)
