# TAGLINE

generates Lorem Ipsum placeholder text

# TLDR

**Generate paragraphs**

```lorem [5]```

**Generate sentences**

```lorem -s [10]```

**Generate words**

```lorem -w [50]```

**Generate bytes**

```lorem -b [500]```

**Copy to clipboard**

```lorem [3] | pbcopy```

# SYNOPSIS

**lorem** [_options_] [_count_]

# PARAMETERS

_COUNT_
> Number of units to generate.

**-s**
> Generate sentences.

**-w**
> Generate words.

**-b**
> Generate bytes.

**-p**
> Generate paragraphs (default).

**--help**
> Display help information.

# DESCRIPTION

**lorem** generates Lorem Ipsum placeholder text. It creates dummy text for design and development.

The tool produces paragraphs, sentences, or words of standard Lorem Ipsum text.

# CAVEATS

Various implementations exist. Output format varies. Development/design use.

# HISTORY

Lorem Ipsum text originates from **Cicero's "De finibus bonorum et malorum"** (45 BC), used as placeholder text since the 1500s.

# INSTALL

```pacman: sudo pacman -S lorem```

```brew: brew install lorem```

```nix: nix profile install nixpkgs#lorem```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[shuf](/man/shuf)(1), [fortune](/man/fortune)(1)

