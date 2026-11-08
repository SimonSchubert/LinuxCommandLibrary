# TAGLINE

Zsh enhanced text output built-in

# TLDR

**Print text**

```print "Hello"```

**Print to stderr**

```print -u2 "Error"```

**Print array elements**

```print -l ${array[@]}```

**Print with format**

```print -f "%s: %d\n" "Count" [5]```

**Expand a prompt sequence** (current directory)

```print -P "%~"```

# SYNOPSIS

**print** [_options_] [_args_]

# PARAMETERS

**-n**
> No newline.

**-r**
> Ignore the escape conventions of echo.

**-l**
> One argument per line.

**-u** _N_
> File descriptor.

**-f** _FORMAT_
> Printf-style format.

**-P**
> Perform prompt expansion.

**-N**
> Separate and terminate arguments with nulls.

**-o**, **-O**
> Sort arguments in ascending or descending order.

**-c**, **-C** _cols_
> Print arguments in columns.

**-s**
> Place the results in the history list.

**-v** _name_
> Store the output in a parameter.

**-D**
> Replace directory prefixes with ~ expressions.

# DESCRIPTION

**print** in zsh is an enhanced built-in command for text output that extends the ksh version with additional features. It supports printf-style formatting via **-f**, prompt expansion with **-P** (for displaying prompt escape sequences like %~ for the current directory), and can print array elements one per line with **-l**.

The command provides reliable text output behavior compared to echo, whose handling of backslash escapes and option-like arguments varies across shells. Output can be directed to specific file descriptors with **-u** for writing to stderr or other open descriptors.

# CAVEATS

Zsh specific. Different from ksh print. **print -l** with an empty list still outputs one empty line, so use **print -rC1 --** for possibly empty lists.

# HISTORY

print is a **zsh built-in** with extended functionality.

# SEE ALSO

[echo](/man/echo)(1), [printf](/man/printf)(1), [print](/man/print)(1)

# RESOURCES

```[Homepage](https://www.zsh.org/)```

```[Documentation](https://zsh.sourceforge.io/Doc/Release/Shell-Builtin-Commands.html)```

<!-- verified: 2026-11-08 -->
