# TLDR

**Start es shell**

```es```

**Run command**

```es -c "[echo hello]"```

**Run script**

```es [script.es]```

**Start without initialization**

```es -p```

# SYNOPSIS

**es** [_options_] [_script_] [_args_]

# PARAMETERS

**-c** _command_
> Execute command string.

**-p**
> Don't load profile.

**-l**
> Act as login shell.

**-v**
> Print input to stderr.

**-x**
> Print commands before execution.

**-i**
> Force interactive mode.

**-n**
> Parse only, don't execute.

# DESCRIPTION

**es** is an extensible shell derived from rc (the Plan 9 shell) with first-class functions, lexical scoping, and exception handling. It provides a clean, programmable shell with functional programming features.

Unlike traditional shells, es treats functions as first-class values, supports closures, and has a simpler, more consistent syntax than bash or zsh.

# FEATURES

```es
# First-class functions
fn greet { echo Hello $1 }

# Lexical scope
let (x = 5) { echo $x }

# Exceptions
catch { risky-command } { echo failed }

# Pipelines with functions
map { |x| echo $x } a b c
```

# CAVEATS

Not POSIX-compatible; scripts need rewriting. Smaller community and fewer resources than bash. Some features differ from rc. May not be available on all systems.

# HISTORY

es was created by **Paul Haahr** and **Byron Rakitzis** in the early **1990s** as an enhanced version of rc, the Plan 9 shell. It added functional programming concepts like first-class functions and lexical scoping to shell scripting.

# SEE ALSO

[rc](/man/rc)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1)
