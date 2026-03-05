# TAGLINE

QR code generator for text terminals

# TLDR

**Generate a QR code from text**

```qrc "[text]"```

**Generate a QR code from stdin**

```echo "[text]" | qrc```

# SYNOPSIS

**qrc** [_options_] [_text_]

# DESCRIPTION

**qrc** is a QR code generator that outputs scannable QR codes directly in the terminal using ASCII art or Sixel graphics. It accepts text from command-line arguments or standard input, with options for QR code inversion, margin adjustment, and foreground/background color customization.

# HISTORY

**qrc** was created by **SATOH Fumiyasu** (fumiyas) and is written in **Go**.

# SEE ALSO

[qrtool](/man/qrtool)(1), [qrencode](/man/qrencode)(1)
