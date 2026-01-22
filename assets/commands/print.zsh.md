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

**print** is zsh's built-in print command. Enhanced output utility.

The tool provides flexible text output. More features than echo.

print outputs in zsh.

# CAVEATS

Zsh specific. Different from ksh print.

# HISTORY

print is a **zsh built-in** with extended functionality.

# SEE ALSO

[echo](/man/echo)(1), [printf](/man/printf)(1), [print](/man/print)(1)

