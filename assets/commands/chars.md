# TAGLINE

display Unicode character information

# TLDR

**Display character information**

```chars [character]```

**Look up by Unicode codepoint**

```chars [U+1F63C]```

**Look up by numeric code** (ambiguous match)

```chars [10]```

**Look up a control character**

```chars "[^C]"```

**Search for characters** by name

```chars [query]```

# SYNOPSIS

**chars** [_options_] [_character|codepoint|query_]...

# PARAMETERS

_CHARACTER_
> Character literal, Unicode codepoint (e.g. U+1F63C), numeric code, or control character notation (e.g. ^C).

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**chars** is a command-line tool for displaying detailed information about ASCII and Unicode characters and code points. Inspired by `ascii(1)` and `unicode.py`, it supports whitespace and control characters.

For each character it prints the Unicode codepoint, encoding representations (hex, octal, UTF-8, UTF-16), display width, Unicode name and aliases, case variants, and escape sequences. Characters can be looked up by literal form, by `U+` codepoint, by numeric code, or by control-character notation.

It is written in Rust and useful for developers working with Unicode text or debugging encoding issues.

# SEE ALSO

[chardet](/man/chardet)(1), [iconv](/man/iconv)(1), [hexdump](/man/hexdump)(1)
