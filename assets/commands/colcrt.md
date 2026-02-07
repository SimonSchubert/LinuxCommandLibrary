# TAGLINE

nroff output filter for terminal display

# TLDR

**Filter nroff output** for terminal display

```colcrt [file]```

**Suppress underlining**

```colcrt -2 [file]```

**Half-line handling**

```colcrt - [file]```

**Process nroff output** via pipe

```nroff -man [man.1] | colcrt```

# SYNOPSIS

**colcrt** [_options_] [_file_...]

# DESCRIPTION

**colcrt** filters nroff output for CRT (terminal) preview. It handles reverse line feeds and translates underlines and half-line motions into forms suitable for terminal display.

The tool is primarily useful for previewing formatted man pages and other nroff output on terminals that cannot handle overstriking. It converts underlining to dashes on a separate line.

# PARAMETERS

**-**
> Print half-lines as full lines, useful for terminals without half-line capability.

**-2**
> Suppress underlining entirely, printing only the text.

# CAVEATS

Designed for older terminal handling. Modern terminals typically handle nroff output directly. Output may not preserve all formatting. Primarily historical utility.

# HISTORY

**colcrt** is a traditional Unix utility dating back to **BSD** systems in the **1970s**. It was created when terminals had varied capabilities and could not all handle the escape sequences in nroff output. Though rarely needed today, it remains in many Unix distributions.

# SEE ALSO

[nroff](/man/nroff)(1), [col](/man/col)(1), [ul](/man/ul)(1), [man](/man/man)(1)
