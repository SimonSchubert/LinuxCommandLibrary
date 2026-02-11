# TAGLINE

Encode text into QR code images

# TLDR

**Generate QR code to terminal**

```qrencode -t ANSI "[text]"```

**Generate PNG image**

```qrencode -o [qr.png] "[text]"```

**Generate SVG**

```qrencode -t SVG -o [qr.svg] "[text]"```

**Set size**

```qrencode -s [10] -o [qr.png] "[text]"```

**Read from stdin**

```echo "[text]" | qrencode -o [qr.png]```

# SYNOPSIS

**qrencode** [_options_] [_string_]

# PARAMETERS

_STRING_
> Text to encode.

**-o** _FILE_
> Output file.

**-t** _TYPE_
> Output type (PNG, SVG, ANSI).

**-s** _SIZE_
> Module size.

**-l** _LEVEL_
> Error correction level.

**-v** _VERSION_
> QR version (size).

# DESCRIPTION

**qrencode** is a command-line QR code generator built on the libqrencode library. It encodes text into QR codes and outputs them in multiple formats including PNG, SVG, EPS, ANSI terminal art, and ASCII, making it suitable for both display and print use cases.

Options control the error correction level (L/M/Q/H), QR version (which determines capacity and physical size), and module size for raster output. Input can come from command-line arguments or standard input, supporting integration into scripts and pipelines.

# CAVEATS

libqrencode based. Multiple output formats.

# HISTORY

qrencode uses **libqrencode** for QR code generation.

# SEE ALSO

[zbarimg](/man/zbarimg)(1), [qr](/man/qr)(1)

