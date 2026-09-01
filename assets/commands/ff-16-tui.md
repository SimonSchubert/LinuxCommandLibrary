# TAGLINE

Interactive TUI that finds frequent 16-bit patterns in a file

# TLDR

**Scan a file** (uses `dict.csv` in the current directory if present)

```ff-16-tui [file.bin]```

Use a **custom dictionary** of known byte patterns

```ff-16-tui [file.bin] -d [patterns.csv]```

Print **usage** (no file argument)

```ff-16-tui```

# SYNOPSIS

**ff-16-tui** _file_ [**-d** _dictionary_]

# PARAMETERS

_file_
> Binary or other file to inspect. Size must be between 256 bytes and 16 MiB

**-d** _dictionary_
> CSV dictionary of known patterns (default: **dict.csv** in the working directory). Missing file prints a warning and continues without labels

# KEYBOARD SHORTCUTS

**←** / **→**
> Move the 256-byte view one byte left or right

**↑** / **↓**
> Move the view one 16-byte line

**PgUp** / **PgDn**
> Move the view one 256-byte page

**Home** / **End**
> Jump to the start or end of the file

**0**–**9**
> Highlight the ranked pattern with that index (0 is most frequent among those above the threshold)

**q** / **a**
> Raise or lower the minimum gap between the two pattern bytes (0–127)

**w** / **s**
> Raise or lower the maximum gap (0–127; default range is 0–31)

**e** / **d**
> Raise or lower the minimum number of set bits across both bytes (0–16)

**r** / **f**
> Raise or lower the maximum number of set bits

**t** / **g**
> Raise or lower the frequency threshold (1–255; default 5). Patterns below it are hidden

**x**
> Exit and restore the terminal

# DESCRIPTION

**ff-16-tui** (Find Frequent 16-bit Text User Interface) is an interactive static-analysis viewer. For the current 256-byte window it counts two-byte patterns, including pairs separated by a configurable gap, and lists the ten most frequent matches that meet the threshold.

Each listed pattern shows hex (adjacent bytes, or `AA +(N) BB` when a gap is used), a printable ASCII pair, **Ones** (popcount of both bytes), **Freq** (hits in the window), and **Dict** (a label from the dictionary when the hex form matches). Selecting 0–9 highlights those occurrences in the hexdump.

The optional dictionary is a semicolon-separated CSV (`pattern; label`) with `#` comments. The upstream `dict.csv` tags common text bigrams, alignment padding, x86 opcodes, MSIL opcodes, and similar signatures. Dictionary lookup is case-insensitive on the hex field.

# CAVEATS

Requires a terminal that supports ANSI colors and raw keyboard input (`golang.org/x/term`). Files smaller than 256 bytes or larger than 16 MiB are rejected. Pattern search is per 256-byte block, not the whole file at once, so frequencies are local to the current view. Default dictionary path is relative to the working directory, not the binary. There is no mouse support; **x** is the only documented way to quit.

# HISTORY

Written in Go by HexLasso. The public repository and sample dictionary were published in 2026.

# SEE ALSO

[hexdump](/man/hexdump)(1), [xxd](/man/xxd)(1), [hexyl](/man/hexyl)(1), [strings](/man/strings)(1), [binwalk](/man/binwalk)(1), [radare2](/man/radare2)(1), [file](/man/file)(1)

# RESOURCES

```[Source code](https://github.com/HexLasso/FF-16-TUI)```

<!-- verified: 2026-09-01 -->
