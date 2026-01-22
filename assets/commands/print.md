# TLDR

**Print text (zsh/ksh)**

```print "Hello, World!"```

**Print without newline**

```print -n "text"```

**Print to file descriptor**

```print -u [2] "Error message"```

**Print with escape sequences**

```print "Line1\nLine2"```

# SYNOPSIS

**print** [_options_] [_args_]

# PARAMETERS

_ARGS_
> Text to print.

**-n**
> No trailing newline.

**-r**
> Ignore escape sequences.

**-u** _N_
> Print to file descriptor N.

**-l**
> Print arguments on separate lines.

# DESCRIPTION

**print** outputs text to stdout. Shell built-in command.

The tool is more powerful than echo. Available in ksh and zsh.

print displays text.

# CAVEATS

Shell built-in. Not available in bash (use printf).

# HISTORY

print is a **ksh/zsh built-in** for text output.

# SEE ALSO

[echo](/man/echo)(1), [printf](/man/printf)(1)

