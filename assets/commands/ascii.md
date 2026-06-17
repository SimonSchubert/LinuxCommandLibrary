# TAGLINE

Display ASCII character table and aliases

# TLDR

Show **aliases** for character

```ascii a```

**Script-friendly** output

```ascii -t a```

Show for **multiple** characters

```ascii -s tldr```

Table in **decimal**

```ascii -d```

Table in **hexadecimal**

```ascii -x```

Table in **binary**

```ascii -b```

# SYNOPSIS

**ascii** [_OPTIONS_] [_characters_]

# DESCRIPTION

**ascii** displays ASCII character information including aliases, numeric codes in various bases, and provides quick ASCII table lookups for character encoding reference.

# PARAMETERS

**-t**
> Terse mode for script-friendly output

**-s**
> Process multiple characters in string

**-d**
> Display ASCII table in decimal

**-x**
> Display ASCII table in hexadecimal

**-o**
> Display ASCII table in octal

**-b**
> Display ASCII table in binary

**-h**, **-?**
> Display a summary of options and a simple ASCII table

**-v**
> Display program version

# CAVEATS

Without arguments, shows an options summary and the complete ASCII table. The base flags (**-d**, **-x**, **-o**, **-b**) have dual behavior: with no argument they print the full table in that base; with arguments they interpret those values in that base and print only the matching character records. Character aliases include common names like NUL, TAB, LF, CR, ESC, DEL for control characters.

# HISTORY

**ascii** was written by Eric S. Raymond as a handy ASCII reference utility.

# SEE ALSO

[man](/man/man)(1), [charmap](/man/charmap)(1)

# RESOURCES

```[Source code](https://gitlab.com/esr/ascii)```

```[Homepage](http://www.catb.org/~esr/ascii/)```

```[Documentation](http://www.catb.org/~esr/ascii/ascii.html)```

<!-- verified: 2026-06-16 -->
