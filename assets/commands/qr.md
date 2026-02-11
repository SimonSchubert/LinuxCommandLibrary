# TAGLINE

Generate QR codes from the command line

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

**qr** is a simple command-line utility for generating QR codes from text input. It can display QR codes directly in the terminal using Unicode block characters or save them as image files, making it useful for quickly sharing URLs, WiFi credentials, or other short text via scannable codes.

The tool accepts text as a command-line argument or reads from standard input, allowing it to be used in shell pipelines. Various implementations of the **qr** command exist across different packages.

# CAVEATS

Various implementations. Check installed version.

# HISTORY

qr provides **quick QR code** generation from command line.

# SEE ALSO

[qrencode](/man/qrencode)(1), [zbarimg](/man/zbarimg)(1)

