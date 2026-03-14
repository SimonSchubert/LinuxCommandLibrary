# TAGLINE

Print large ASCII art text

# TLDR

**Print** banner text

```banner [HELLO]```

Print with a specific **width**

```banner -w [60] [HELLO]```

Print text read from **stdin**

```echo "[HELLO]" | banner```

# SYNOPSIS

**banner** [**-w** _cols_] _text_

# PARAMETERS

**-w** _cols_, **--width**=_cols_
> Set maximum output width in characters. Default is 132.

# DESCRIPTION

**banner** prints large ASCII art banner text to the terminal. It converts text into large block letters suitable for creating eye-catching messages or headers in terminal output. Each argument is truncated at 10 characters and printed on a separate line.

If text is not given on the command line, it is read from stdin. Long text is split across multiple lines at word boundaries when possible.

# CAVEATS

Output width can be very large at the default setting. Not all systems have banner installed. Modern alternatives (figlet, toilet) offer more fonts and features.

# HISTORY

**banner** has been part of Unix systems since the early days, originally used for printing large banners on line printers in the **1970s**.

# SEE ALSO

[figlet](/man/figlet)(6), [toilet](/man/toilet)(1), [cowsay](/man/cowsay)(1)
