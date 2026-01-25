# TLDR

**Embed data in image**

```outguess -d [secret.txt] [cover.jpg] [output.jpg]```

**Extract hidden data**

```outguess -r [stego.jpg] [output.txt]```

**Embed with password**

```outguess -k "[password]" -d [secret.txt] [cover.jpg] [output.jpg]```

**Extract with password**

```outguess -k "[password]" -r [stego.jpg] [output.txt]```

**Check embedding capacity**

```outguess -c [cover.jpg]```

# SYNOPSIS

**outguess** [_options_] [_input_] [_output_]

# PARAMETERS

**-d** _file_
> Data file to embed.

**-r**
> Extract mode.

**-k** _key_
> Password/key.

**-c**
> Check capacity.

**-F**
> Force embedding.

**-e**
> Use error correction.

# DESCRIPTION

**OutGuess** is a steganography tool that hides data in JPEG images. It preserves image statistics to resist statistical analysis, making detection harder than simpler methods.

OutGuess modifies DCT coefficients in ways that maintain expected statistical distributions.

# EXAMPLE

```bash
# Hide message
outguess -k "secret" -d message.txt photo.jpg stego.jpg

# Recover message
outguess -k "secret" -r stego.jpg recovered.txt
```

# CAVEATS

JPEG only. Repeated embedding degrades image. Capacity depends on image complexity. Password provides encryption.

# HISTORY

OutGuess was developed by **Niels Provos** as a steganographic tool resistant to statistical steganalysis techniques.

# SEE ALSO

[steghide](/man/steghide)(1), [openstego](/man/openstego)(1), [stegdetect](/man/stegdetect)(1)
