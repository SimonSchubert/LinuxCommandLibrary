# TLDR

**Decrypt text effect**

```echo "[text]" | nms```

**Auto reveal**

```echo "[text]" | nms -a```

**Foreground color**

```echo "[text]" | nms -f [green]```

**Clear screen first**

```echo "[text]" | nms -c```

**Set reveal speed**

```echo "[text]" | nms -s```

# SYNOPSIS

**nms** [_options_]

# PARAMETERS

**-a**
> Auto-reveal (no key press).

**-f** _COLOR_
> Foreground color.

**-c**
> Clear screen first.

**-s**
> Slow reveal effect.

**--help**
> Display help information.

# DESCRIPTION

**nms** creates a decrypting text effect. Inspired by movie hacking scenes.

The tool animates text reveal. Fun terminal effect for presentations.

nms is text decryption effect.

# CAVEATS

Visual effect only. Reads from stdin. Terminal required.

# HISTORY

nms recreates the **movie-style** text decryption effect seen in films like Sneakers.

# SEE ALSO

[cmatrix](/man/cmatrix)(1), [figlet](/man/figlet)(1), [cowsay](/man/cowsay)(1)

