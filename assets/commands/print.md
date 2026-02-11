# TAGLINE

Shell built-in text output command

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

**print** is a shell built-in command available in ksh and zsh that outputs text to stdout. It provides more control than **echo**, supporting escape sequence processing, output to specific file descriptors, and suppression of the trailing newline.

The **-u** option directs output to a numbered file descriptor (useful for writing to stderr or other open descriptors), while **-l** prints each argument on a separate line. Unlike echo, print's behavior is consistent and not affected by argument values that look like options.

# CAVEATS

Shell built-in. Not available in bash (use printf).

# HISTORY

print is a **ksh/zsh built-in** for text output.

# SEE ALSO

[echo](/man/echo)(1), [printf](/man/printf)(1)

