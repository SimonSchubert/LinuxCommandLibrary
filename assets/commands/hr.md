# TLDR

**Print horizontal rule**

```hr```

**Print with specific character**

```hr [=]```

**Print double line**

```hr [#] [-]```

**Custom width**

```hr -w [40] [*]```

# SYNOPSIS

**hr** [_options_] [_characters_]

# PARAMETERS

_CHARACTERS_
> Character(s) to use for rule.

**-w** _WIDTH_
> Rule width.

**-c** _CHAR_
> Character to use.

**--help**
> Display help information.

# DESCRIPTION

**hr** prints horizontal rules in the terminal. It outputs a line of characters spanning the terminal width.

The tool is useful for visual separation in scripts and terminal output. Multiple character patterns can create different line styles.

hr draws horizontal lines in terminal.

# CAVEATS

Width based on terminal size. Simple utility. Multiple implementations exist.

# HISTORY

hr is a simple terminal utility for creating horizontal dividers in terminal output.

# SEE ALSO

[echo](/man/echo)(1), [printf](/man/printf)(1), [tput](/man/tput)(1)
