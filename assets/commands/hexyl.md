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
> File to display (use - for stdin).

**-n**, **--length** _N_
> Number of bytes to read (supports k, M, G suffixes and hex).

**-c**, **--bytes** _N_
> Alias for --length.

**-s**, **--skip** _N_
> Skip first N bytes (negative values seek from end).

**-o**, **--display-offset** _N_
> Add N bytes to the displayed file offset.

**--block-size** _SIZE_
> Size of the block unit (default: 512).

**-v**, **--no-squeezing**
> Display all data; don't collapse identical lines with an asterisk.

**--color** _WHEN_
> Color output: always (default), auto, never.

**-p**, **--plain**
> Plain output (shorthand for --no-characters --no-position --border=none --color=never).

**--no-characters**
> Hide the character panel.

**--no-position**
> Hide the position offset column.

**--border** _STYLE_
> Border style: unicode (default), ascii, none.

**--panels** _N_
> Number of hex data panels (or 'auto').

**--group-size** _N_
> Bytes per group: 1 (default), 2, 4, or 8.

**--endianness** _ENDIAN_
> Byte ordering within groups: little or big.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**hexyl** is a modern hex viewer for the terminal. It displays file contents with colored output distinguishing different byte types.

The tool uses colors to highlight ASCII, non-ASCII, null bytes, and whitespace. It provides a clean, readable hex dump with offset and character views.

# CAVEATS

Requires color terminal. Large files may be slow. Written in Rust.

# HISTORY

hexyl was created as a modern, colorful alternative to traditional hex dump tools like xxd and hexdump.

# SEE ALSO

[xxd](/man/xxd)(1), [hexdump](/man/hexdump)(1), [hd](/man/hd)(1)
