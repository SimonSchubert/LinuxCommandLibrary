# TAGLINE

Terminal hex editor for editing bytes by the nibble

# TLDR

**Open a file** in the hex editor

```heh [path/to/file]```

# SYNOPSIS

**heh** [_options_] _file_

# DESCRIPTION

**heh** is a cross-platform terminal hex editor used for modifying file data at the byte level. It aims to replicate the visual style of **hexyl** while functionally acting as a terminal UI version of **GHex**. The editor supports viewing and editing in both hexadecimal and ASCII modes, with editing granularity down to the nibble (half-byte).

The interface displays offset addresses, hex values, and ASCII representation side by side, with color-coded byte categories for easy identification of different data types.

# KEY BINDINGS

**h/j/k/l** — Move cursor left/down/up/right
**i** — Enter insert mode
**Esc** — Return to normal mode
**/** — Search
**:w** — Save
**:q** — Quit
**:wq** — Save and quit

# CAVEATS

Large files may consume significant memory as the entire file is loaded. The editor uses vim-like key bindings which may require familiarity with modal editing.

# HISTORY

**heh** was created by **ndd7xv** and is written in **Rust**. It was designed to provide a lightweight, terminal-native hex editing experience with a familiar visual layout.

# SEE ALSO

[hexyl](/man/hexyl)(1), [xxd](/man/xxd)(1), [hexdump](/man/hexdump)(1)
