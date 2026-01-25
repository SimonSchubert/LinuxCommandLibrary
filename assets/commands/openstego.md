# TLDR

**Embed data in image**

```openstego embed -mf [secret.txt] -cf [cover.png] -sf [output.png]```

**Extract hidden data**

```openstego extract -sf [stego.png] -xd [output_dir]```

**Embed with password**

```openstego embed -mf [secret.txt] -cf [cover.png] -sf [output.png] -p [password]```

**Generate signature**

```openstego gensig -sf [image.png] -sgf [signature.sig]```

**Verify watermark**

```openstego checkmark -sf [image.png] -sgf [signature.sig]```

# SYNOPSIS

**openstego** _command_ [_options_]

# PARAMETERS

**embed**
> Hide data in image.

**extract**
> Extract hidden data.

**gensig**
> Generate signature.

**checkmark**
> Verify watermark.

**-mf** _file_
> Message file.

**-cf** _file_
> Cover file (input image).

**-sf** _file_
> Stego file (output image).

**-p** _password_
> Password.

**-xd** _dir_
> Extract directory.

# DESCRIPTION

**OpenStego** is a steganography tool for hiding data within images. It can embed secret messages in cover images and extract them later, with optional encryption.

Also supports digital watermarking for image authentication.

# SUPPORTED FORMATS

```
Cover images: PNG, BMP, GIF, JPEG, WBMP
```

# CAVEATS

Java required. Large messages need large cover images. JPEG quality loss affects data. GUI also available.

# HISTORY

OpenStego was created by **Samir Vaidya** as an open-source steganography application supporting multiple algorithms.

# SEE ALSO

[steghide](/man/steghide)(1), [outguess](/man/outguess)(1), [stegsnow](/man/stegsnow)(1)
