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

Print **raw**, safe for arbitrary data (no escapes, no option parsing)

```print -r -- "$var"```

Print each argument **on its own line**

```print -l [one] [two] [three]```

**Format** output printf-style

```print -f "%s=%d\n" [name] [42]```

**Sort** arguments and print them in **columns** (zsh)

```print -oc -- *(N)```

# SYNOPSIS

**print** [_options_] [_args_]

# PARAMETERS

_ARGS_
> Text to print.

**-n**
> No trailing newline.

**-r**
> Ignore echo escape conventions (raw output).

**-R**
> Emulate BSD echo: escape sequences only with **-e**; only **-e** and **-n** are recognized after **-R**.

**-u** _N_
> Print to file descriptor N (e.g., -u2 for stderr).

**-l**
> Print arguments on separate lines.

**-N**
> Separate and terminate arguments with null bytes.

**-f** _format_
> Format arguments using printf-style format string.

**-P** (zsh)
> Perform prompt expansion on the arguments.

**-s**
> Save arguments in the history list instead of printing.

**-v** _name_ (zsh)
> Store the output in the parameter _name_ instead of printing.

**-c** (zsh)
> Print arguments in columns.

**-C** _cols_ (zsh)
> Print arguments in exactly _cols_ columns; **-C1** prints a possibly empty list one per line.

**-o**, **-O** (zsh)
> Sort arguments in ascending or descending order (add **-i** for case-insensitive).

**-p**
> Print to the input of the coprocess.

**-z** (zsh)
> Push the arguments onto the line editing buffer stack.

**--**
> End of options; following arguments are printed even if they start with **-**.

# DESCRIPTION

**print** is a shell built-in command available in ksh and zsh that outputs text to stdout. It provides more control than **echo**, supporting escape sequence processing, output to specific file descriptors, and suppression of the trailing newline.

The **-u** option directs output to a numbered file descriptor (useful for writing to stderr or other open descriptors), while **-l** prints each argument on a separate line. Unlike bash's echo, print reliably supports **--** to end option parsing, so **print -r --** is the idiomatic way to output arbitrary strings verbatim.

# CAVEATS

Shell built-in. Not available in bash or POSIX sh (use **printf** there). By default print interprets backslash escapes like **echo -e**, so use **-r** for untrusted data. In zsh, **print -l** with an empty argument list still prints one empty line; use **print -C1** instead. Some flags (**-c**, **-C**, **-o**, **-P**, **-z**) are zsh-only.

# HISTORY

**print** originated in the **KornShell** (ksh) by **David Korn** at Bell Labs as a more predictable alternative to echo. **zsh** adopted it and added many extensions such as column output, sorting and prompt expansion.

# SEE ALSO

[echo](/man/echo)(1), [printf](/man/printf)(1), [zsh](/man/zsh)(1), [ksh](/man/ksh)(1)

# RESOURCES

```[Documentation](https://zsh.sourceforge.io/Doc/Release/Shell-Builtin-Commands.html)```

<!-- verified: 2026-11-23 -->

