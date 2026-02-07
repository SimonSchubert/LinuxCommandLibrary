# TAGLINE

Colorize text with pride flag colors

# TLDR

**Display a colorful shark**

```blahaj --shark```

**Display a pride flag**

```blahaj --flag```

**Colorize text input** with trans colors

```echo "[text]" | blahaj```

**Colorize with a specific flag**

```echo "[text]" | blahaj --colors [rainbow]```

**Color individual words**

```echo "[text]" | blahaj --words```

**Color the background** instead of text

```echo "[text]" | blahaj --background```

**List all available flags**

```blahaj --flags```

**Use a random color scheme**

```echo "[text]" | blahaj --random```

# SYNOPSIS

**blahaj** [_options_] [_text_]

# DESCRIPTION

**blahaj** is a lolcat-like CLI tool that colorizes text input using pride flag colors and displays ASCII art sharks. Named after the popular IKEA shark plushie, it brings colorful output to your terminal.

The tool can colorize text by character, word, or line using various pride flag color schemes, and can also display the beloved BLAHAJ shark in ASCII art.

# PARAMETERS

**-s, --shark**
> Display the BLAHAJ shark ASCII art

**-f, --flag**
> Display a pride flag

**-c, --colors** _flag_
> Color scheme to use (default: trans)

**-r, --random**
> Use a random color scheme

**-i, --individual**
> Color individual characters

**-w, --words**
> Color individual words

**-b, --background**
> Color the background instead of text

**-m, --multiplier** _n_
> Multiplier for flag size

**--flags**
> List all available color schemes/flags

**-h, --help**
> Show help message

# AVAILABLE FLAGS

Common color schemes include: trans, rainbow, gay, lesbian, bi, pan, nonbinary, ace, aro, genderqueer, genderfluid, and many more.

# CAVEATS

Output requires a terminal that supports ANSI color codes. Some color schemes may not display correctly on terminals with limited color support. The tool is primarily for entertainment and terminal customization.

# HISTORY

BLAHAJ was created by **GeopJr** as a fun terminal tool inspired by lolcat and the viral popularity of the IKEA BLAHAJ shark plushie, particularly within LGBTQ+ communities. Multiple implementations exist in Crystal, Node.js, and Rust.

# SEE ALSO

[lolcat](/man/lolcat)(1), [figlet](/man/figlet)(1), [cowsay](/man/cowsay)(1)
