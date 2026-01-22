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

**qrencode** generates QR code images. Versatile QR encoder.

The tool supports multiple formats. Full QR code generation.

qrencode creates QR codes.

# CAVEATS

libqrencode based. Multiple output formats.

# HISTORY

qrencode uses **libqrencode** for QR code generation.

# SEE ALSO

[zbarimg](/man/zbarimg)(1), [qr](/man/qr)(1)

