# TAGLINE

Encode text into QR code images

# TLDR

**Generate QR code to terminal**

```qrencode -t ANSI "[text]"```

**Generate a PNG image**

```qrencode -o [qr.png] "[text]"```

**Generate an SVG file**

```qrencode -t SVG -o [qr.svg] "[text]"```

**Set module pixel size**

```qrencode -s [10] -o [qr.png] "[text]"```

**Set custom foreground and background colors**

```qrencode --foreground=[000000] --background=[FFFFFF] -o [qr.png] "[text]"```

**Generate a Micro QR Code**

```qrencode -M -o [qr.png] "[text]"```

**Read from stdin**

```echo "[text]" | qrencode -o [qr.png]```

# SYNOPSIS

**qrencode** [_options_] [_string_]

# PARAMETERS

_STRING_
> Text to encode. If omitted, reads from stdin.

**-o** _FILE_, **--output=**_FILE_
> Output file. Use "-" for stdout.

**-t** _TYPE_, **--type=**_TYPE_
> Output type: PNG, PNG32, SVG, EPS, XPM, ANSI, ANSI256, ASCII, ASCIIi, UTF8, UTF8i, ANSIUTF8, ANSIUTF8i, ANSI256UTF8.

**-s** _NUMBER_, **--size=**_NUMBER_
> Module (dot) size in pixels (default: 3).

**-l** {L|M|Q|H}, **--level=**{L|M|Q|H}
> Error correction level from L (lowest) to H (highest). Default: L.

**-v** _NUMBER_, **--symversion=**_NUMBER_
> Minimum QR symbol version (default: auto).

**-m** _NUMBER_, **--margin=**_NUMBER_
> Margin width in modules (default: 4).

**-d** _NUMBER_, **--dpi=**_NUMBER_
> DPI for PNG output (default: 72).

**-r** _FILE_, **--read-from=**_FILE_
> Read input data from file.

**-8**, **--8bit**
> Encode entire data in 8-bit mode.

**-M**, **--micro**
> Encode as Micro QR Code.

**-i**, **--ignorecase**
> Ignore case and use only uppercase characters.

**--foreground=**_RRGGBB[AA]_
> Set foreground color in hexadecimal.

**--background=**_RRGGBB[AA]_
> Set background color in hexadecimal.

**--svg-path**
> Use single path to draw modules in SVG.

**--inline**
> Generate SVG without the XML declaration.

**--strict-version**
> Disable automatic version adjustment.

**-V**, **--version**
> Display version number.

# DESCRIPTION

**qrencode** is a command-line QR code generator built on the libqrencode library. It encodes text into QR codes and outputs them in multiple formats including PNG, SVG, EPS, ANSI terminal art, and ASCII, making it suitable for both display and print use cases.

Options control the error correction level (L/M/Q/H), QR version (which determines capacity and physical size), and module size for raster output. Input can come from command-line arguments or standard input, supporting integration into scripts and pipelines.

# CAVEATS

Maximum data capacity depends on QR version and error correction level. Higher error correction reduces capacity. Binary data may need **-8** flag for 8-bit mode.

# HISTORY

qrencode was written by **Kentaro Fukuchi** and is built on the **libqrencode** library. It provides command-line QR code generation in various output formats.

# SEE ALSO

[zbarimg](/man/zbarimg)(1), [zbarcam](/man/zbarcam)(1), [qr](/man/qr)(1)

