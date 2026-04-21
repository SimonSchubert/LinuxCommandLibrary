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
> Encode text into a QR code. Reads from stdin when TEXT is omitted.

**decode** _FILE_
> Decode a QR code from an image file.

**-t**, **--type** _FORMAT_
> Output format: png (default), svg, eps, pic, ansi, ascii, unicode, and color variants.

**-o**, **--output** _FILE_
> Output file path (stdout if omitted).

**-r**, **--read-from** _FILE_
> Read input data from a file instead of the command line.

**--variant** _TYPE_
> QR code type: `normal` (default), `micro`, or `rmqr`.

**--foreground** _COLOR_
> Foreground color in CSS format (default: black).

**--background** _COLOR_
> Background color in CSS format (default: white).

**-v**, **--symbol-version** _N_
> Symbol version: 1-40 for normal, 1-4 for micro. Auto-selected if omitted.

**-l**, **--error-correction-level** _LEVEL_
> Error correction level: `l`, `m`, `q`, or `h`.

**--mode** _MODE_
> Encoding mode: `numeric`, `alphanumeric`, `byte`, or `kanji`.

**--mask** _N_
> Mask pattern 0-7. Auto-selected if omitted.

**-s**, **--size** _N_
> Module size in pixels for raster/vector outputs.

**-m**, **--margin** _N_
> Margin width in modules (default: 4 for normal, 2 for others).

**--verbose**
> Print QR code metadata to stderr.

# DESCRIPTION

**qrtool** is a command-line utility for encoding text into QR codes and decoding QR codes from images. It supports multiple output formats including PNG, SVG, EPS, ANSI terminal art, and Unicode, plus QR code variants including standard, Micro QR, and rMQR. It reads from stdin and writes to stdout for Unix pipeline integration.

# HISTORY

**qrtool** was created by **sorairolake** and is written in **Rust**.

# SEE ALSO

[qrc](/man/qrc)(1), [qrencode](/man/qrencode)(1), [zbarimg](/man/zbarimg)(1)
