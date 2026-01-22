# TLDR

**Copy** to clipboard

```echo 123 | xsel -ib```

Copy **file** to clipboard

```cat [path/to/file] | xsel -ib```

**Output** clipboard

```xsel -ob```

Output to **file**

```xsel -ob > [path/to/file]```

**Clear** clipboard

```xsel -cb```

Output **primary** selection

```xsel -op```

# SYNOPSIS

**xsel** [_OPTIONS_]

# PARAMETERS

**-i, --input**
> Read from stdin

**-o, --output**
> Write to stdout

**-c, --clear**
> Clear selection

**-b, --clipboard**
> Use clipboard selection (Ctrl+C/V)

**-p, --primary**
> Use primary selection (middle click)

**-s, --secondary**
> Use secondary selection

**-a, --append**
> Append to selection

# DESCRIPTION

**xsel** manipulates X11 clipboard and selection buffers. It can read, write, clear, and exchange content between primary selection, secondary selection, and clipboard.

Similar to xclip but with different syntax and additional features.

# CAVEATS

X11 only. Content may be lost when X server restarts. Use wl-copy/wl-paste for Wayland.

# SEE ALSO

[xclip](/man/xclip)(1), [wl-copy](/man/wl-copy)(1), [wl-paste](/man/wl-paste)(1)
