# TAGLINE

Declare floating-point shell variables

# TLDR

**Declare a float variable** with a value

```float [myvar]=3.14```

**Declare multiple float variables**

```float [x]=1.5 [y]=2.7```

**Declare a float with arithmetic expression**

```float [result]='10.0 / 3.0'```

**List all float variables** currently set

```float```

**Declare a float and export** to environment

```float -x [myvar]=9.81```

**Make a float variable read-only**

```float -r [PI]=3.14159265```

# SYNOPSIS

**float** [**-ghlrtux**] [_name_[=_value_]...]

# PARAMETERS

**-g**
> Create global variable when used inside a function

**-h**
> Hide variable; do not export to child processes even if exported in outer scope

**-l**
> Left-justify and strip leading blanks

**-r**
> Make variable read-only

**-t**
> Tag the variable (user-defined attribute)

**-u**
> Force uppercase on assignment (for string context)

**-x**
> Export variable to environment of child processes

**+**_attr_
> Remove the specified attribute

# DESCRIPTION

**float** is a zsh builtin command that declares variables with the floating-point attribute. It is equivalent to **typeset -E**, causing the variable to be stored and displayed in floating-point (scientific) notation.

When a value is assigned to a float variable, zsh performs arithmetic evaluation, allowing expressions like `float x=1.0/3.0`. The result is stored as a double-precision floating-point number. Variables declared with float display in scientific notation by default (e.g., `3.1400000000000000e+00`).

Without arguments, **float** lists all currently declared floating-point variables and their values.

# CAVEATS

Only available in **zsh**; not a builtin in bash or other POSIX shells. Floating-point arithmetic is subject to the usual IEEE 754 precision limitations and rounding errors. Read-only float variables cannot be unset or modified.

# HISTORY

The **float** builtin was introduced in **zsh** as a convenience shorthand for **typeset -E**. Zsh has supported floating-point arithmetic since **version 4.0** (2001), part of its extended mathematical capabilities beyond what POSIX sh requires. The float, integer, and readonly builtins in zsh all serve as specialized wrappers around typeset.

# SEE ALSO

[typeset](/man/typeset)(1), [declare](/man/declare)(1), [readonly](/man/readonly)(1), [zsh](/man/zsh)(1)
