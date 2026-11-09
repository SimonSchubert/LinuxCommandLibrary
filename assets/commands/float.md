# TAGLINE

Declare floating-point shell variables

# TLDR

**Declare a float variable** with a value

```float [myvar]=3.14```

**Display in fixed-point** with 2 decimal places

```float -F 2 [price]=19.99```

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

**float** [{**+**|**-**}**Hghlprtux**] [{**+**|**-**}**EFLRZ** [_n_]] [_name_[=_value_]...]

# PARAMETERS

**-E** [_n_]
> Display in scientific notation with n significant figures (default: 10)

**-F** [_n_]
> Display in fixed-point notation with n digits after the decimal point (default: 10)

**-L** [_n_]
> Left-justify and remove leading blanks on expansion

**-R** [_n_]
> Right-justify on expansion

**-Z** [_n_]
> Right-justify with leading zeros on expansion

**-g**
> Do not restrict the parameter to local scope when used inside a function

**-H**
> Do not display the value when listing parameters

**-h**
> Hide the special behavior of special parameters when made local

**-l**
> Convert the result to lower case on expansion

**-p**
> Print parameters and values as a typeset command

**-r**
> Make variable read-only

**-t**
> Tag the variable (for the user's own purposes)

**-u**
> Convert the result to upper case on expansion

**-x**
> Export variable to environment of child processes

**+**_attr_
> Remove the specified attribute

# DESCRIPTION

**float** is a zsh builtin command that declares variables with the floating-point attribute. It is equivalent to **typeset -E**, causing the variable to be stored and displayed in floating-point (scientific) notation.

When a value is assigned to a float variable, zsh performs arithmetic evaluation, allowing expressions like `float x=1.0/3.0`. The result is stored as a double-precision floating-point number. Variables declared with float display in scientific notation by default (e.g., `3.140000000e+00`).

Without arguments, **float** lists all currently declared floating-point variables and their values.

# CAVEATS

A **zsh** builtin; bash has no floating-point variables. Floating-point arithmetic is subject to the usual IEEE 754 precision limitations and rounding errors. Read-only float variables cannot be unset or modified.

# HISTORY

The **float** builtin was introduced in **zsh** as a convenience shorthand for **typeset -E**. Zsh has supported floating-point arithmetic since **version 4.0** (2001), part of its extended mathematical capabilities beyond what POSIX sh requires. The float, integer, and readonly builtins in zsh all serve as specialized wrappers around typeset.

# SEE ALSO

[typeset](/man/typeset)(1), [declare](/man/declare)(1), [readonly](/man/readonly)(1), [zsh](/man/zsh)(1)

# RESOURCES

```[Source code](https://github.com/zsh-users/zsh)```

```[Homepage](https://www.zsh.org/)```

```[Documentation](https://zsh.sourceforge.io/Doc/Release/Shell-Builtin-Commands.html)```

<!-- verified: 2026-11-09 -->
