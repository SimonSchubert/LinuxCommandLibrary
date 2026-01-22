# TLDR

**Generate QR code**

```qr "[text]"```

**Generate from stdin**

```echo "[text]" | qr```

**Output as image**

```qr --output=[qr.png] "[text]"```

# SYNOPSIS

**qr** [_options_] [_text_]

# PARAMETERS

_TEXT_
> Text to encode.

**--output** _FILE_
> Output file.

**-o** _FILE_
> Output file.

# DESCRIPTION

**qr** generates QR codes from text. Simple QR tool.

The tool creates terminal or image QR codes. Quick encoding.

qr makes QR codes.

# CAVEATS

Various implementations. Check installed version.

# HISTORY

qr provides **quick QR code** generation from command line.

# SEE ALSO

[qrencode](/man/qrencode)(1), [zbarimg](/man/zbarimg)(1)

