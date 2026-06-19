# TAGLINE

Reformat input as a punched card

# TLDR

**Print text** as a punched card

```bcd [Hello]```

**Read text** from standard input

```echo [hello world] | bcd```

**Decode** a punched card back to text

```bcd -d < [card.txt]```

# SYNOPSIS

**bcd** [_-l_] [_string_...]

**bcd** **-d** [_-l_]

# DESCRIPTION

**bcd** reads the given input and reformats it as a visual representation of an IBM-style punched card, drawn with ASCII art. It is one of the classic novelty filters from the BSD games collection, alongside **ppt** (paper tape) and **morse** (Morse code).

Input may be supplied as command-line arguments or on standard input. With no decode flag, the text is encoded into a punch card; only the first line is read when reading from standard input.

# PARAMETERS

**-d**
> Decode a punched card on standard input back into ASCII text.

**-l**
> Produce or decode 80-column cards. The default is 48 columns.

# CAVEATS

This is a novelty program, not a data tool. Only the first line of input is encoded, and characters outside the supported set are ignored. It does not perform binary, decimal, or hexadecimal base conversion: for that use **bc** or **dc**.

# HISTORY

**bcd** first appeared in Version 6 AT&T UNIX and emulates the punched cards used by the GE 635 and GE 645 computers at Bell Labs in the late 1960s and early 1970s. It is distributed today as part of the **bsdgames** package.

# SEE ALSO

[ppt](/man/ppt)(6), [morse](/man/morse)(6), [number](/man/number)(6), [bsdgames](/man/bsdgames)(6)
