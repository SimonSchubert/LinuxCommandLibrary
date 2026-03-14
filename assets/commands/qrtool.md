# TAGLINE

Command-line utility for encoding and decoding QR codes

# TLDR

**Encode text to a QR code PNG**

```qrtool encode "[text]" -o [output.png]```

**Encode text as terminal ASCII art**

```qrtool encode "[text]" -t ansi```

**Decode a QR code from an image**

```qrtool decode [image.png]```

**Encode as SVG with custom colors**

```qrtool encode "[text]" -t svg --foreground "#000000" --background "#ffffff" -o [output.svg]```

**Generate a Micro QR code**

```qrtool encode "[text]" --variant micro -o [output.png]```

**Read from stdin and output QR code**

```echo "[text]" | qrtool encode -o [output.png]```

# SYNOPSIS

**qrtool** _command_ [_options_]

# PARAMETERS

**encode** _TEXT_
> Encode text into a QR code.

**decode** _FILE_
> Decode a QR code from an image file.

**-t**, **--type** _FORMAT_
> Output format: png, svg, eps, pic, ansi, ascii, unicode.

**-o**, **--output** _FILE_
> Output file path.

**--variant** _TYPE_
> QR code type: normal, micro, rmqr.

**--foreground** _COLOR_
> Foreground color in CSS format.

**--background** _COLOR_
> Background color in CSS format.

**-v**, **--symbol-version** _VERSION_
> QR code symbol version (size). Auto-selected if omitted.

**--margin** _WIDTH_
> Width of margin around the QR code (default: 4 for normal, 2 for others).

# DESCRIPTION

**qrtool** is a command-line utility for encoding text into QR codes and decoding QR codes from images. It supports multiple output formats including PNG, SVG, EPS, ANSI terminal art, and Unicode, plus QR code variants including standard, Micro QR, and rMQR. It reads from stdin and writes to stdout for Unix pipeline integration.

# HISTORY

**qrtool** was created by **sorairolake** and is written in **Rust**.

# SEE ALSO

[qrc](/man/qrc)(1), [qrencode](/man/qrencode)(1)
