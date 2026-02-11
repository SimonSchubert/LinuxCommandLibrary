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

**Push to directory stack**

```print -P "%~"```

# SYNOPSIS

**print** [_options_] [_args_]

# PARAMETERS

**-n**
> No newline.

**-r**
> Raw mode.

**-l**
> One argument per line.

**-u** _N_
> File descriptor.

**-f** _FORMAT_
> Printf-style format.

**-P**
> Perform prompt expansion.

# DESCRIPTION

**print** in zsh is an enhanced built-in command for text output that extends the ksh version with additional features. It supports printf-style formatting via **-f**, prompt expansion with **-P** (for displaying prompt escape sequences like %~ for the current directory), and can print array elements one per line with **-l**.

The command provides reliable text output behavior compared to echo, whose handling of backslash escapes and option-like arguments varies across shells. Output can be directed to specific file descriptors with **-u** for writing to stderr or other open descriptors.

# CAVEATS

Zsh specific. Different from ksh print.

# HISTORY

print is a **zsh built-in** with extended functionality.

# SEE ALSO

[echo](/man/echo)(1), [printf](/man/printf)(1), [print](/man/print)(1)

