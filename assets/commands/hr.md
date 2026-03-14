# TAGLINE

prints horizontal rules in the terminal

# TLDR

**Print a horizontal rule using the default # character**

```hr```

**Print a horizontal rule with a specific character**

```hr [=]```

**Print multiple horizontal rules with different characters**

```hr [#] [-]```

**Print a horizontal rule with a multi-character pattern**

```hr [-#-]```

# SYNOPSIS

**hr** [_characters_ ...]

# DESCRIPTION

**hr** prints horizontal rules spanning the terminal width. Each argument is used as a character or pattern to repeat across one line. If no argument is given, **#** is used by default. Multiple arguments produce multiple lines, one per argument.

The terminal width is determined by `tput cols`, falling back to the **COLUMNS** environment variable or 80 columns if neither is available.

# CAVEATS

Multiple implementations of **hr** exist with different features. The most common (LuRsT/hr) is a pure Bash script with no flags or options. Other implementations may support additional features like color or width control.

# SEE ALSO

[echo](/man/echo)(1), [printf](/man/printf)(1), [tput](/man/tput)(1)
