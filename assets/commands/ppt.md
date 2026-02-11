# TAGLINE

Display text as ASCII paper tape art

# TLDR

**Convert to paper tape format**

```ppt [text]```

**Convert file**

```cat [file.txt] | ppt```

**Display paper tape**

```echo "Hello" | ppt```

# SYNOPSIS

**ppt** [_text_]

# PARAMETERS

_TEXT_
> Text to convert.

# DESCRIPTION

**ppt** converts text input into an ASCII art representation of punched paper tape, the storage medium used by early computers and teleprinters. Each character is displayed as a row of holes (dots) corresponding to its binary encoding.

This novelty utility is part of the BSD games collection and serves as both entertainment and an educational tool for understanding historical data encoding formats.

# CAVEATS

Entertainment utility. Part of bsdgames.

# HISTORY

ppt was created as a **BSD games** utility for paper tape simulation.

# SEE ALSO

[banner](/man/banner)(1), [morse](/man/morse)(1)

