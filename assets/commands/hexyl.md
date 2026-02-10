# TAGLINE

modern hex viewer for the terminal

# TLDR

**View file in hex**

```hexyl [file]```

**Show specific length**

```hexyl -n [100] [file]```

**Skip bytes**

```hexyl --skip [50] [file]```

**Show in plain style**

```hexyl --plain [file]```

**Read from stdin**

```cat [file] | hexyl```

**No character panel**

```hexyl --no-characters [file]```

# SYNOPSIS

**hexyl** [_options_] [_file_]

# PARAMETERS

_FILE_
> File to display.

**-n**, **--length** _N_
> Number of bytes to read.

**-s**, **--skip** _N_
> Skip first N bytes.

**--color** _WHEN_
> Color output (auto/always/never).

**-p**, **--plain**
> Plain output (no styling).

**--no-characters**
> Hide character panel.

**-b**, **--border** _STYLE_
> Border style.

**--help**
> Display help information.

# DESCRIPTION

**hexyl** is a modern hex viewer for the terminal. It displays file contents with colored output distinguishing different byte types.

The tool uses colors to highlight ASCII, non-ASCII, null bytes, and whitespace. It provides a clean, readable hex dump with offset and character views.

# CAVEATS

Requires color terminal. Large files may be slow. Written in Rust.

# HISTORY

hexyl was created as a modern, colorful alternative to traditional hex dump tools like xxd and hexdump.

# SEE ALSO

[xxd](/man/xxd)(1), [hexdump](/man/hexdump)(1), [hd](/man/hd)(1)
