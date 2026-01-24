# TLDR

**Analyze image**

```zsteg [image.png]```

**Check all channels**

```zsteg -a [image.png]```

**Extract specific data**

```zsteg -E "[b1,rgb,lsb]" [image.png]```

**Verbose output**

```zsteg -v [image.png]```

**Check BMP file**

```zsteg [image.bmp]```

**Limit output**

```zsteg --limit [1000] [image.png]```

# SYNOPSIS

**zsteg** [_-a_] [_-v_] [_-E extract_] [_options_] _image_

# PARAMETERS

**-a**, **--all**
> Check all methods.

**-v**, **--verbose**
> Verbose output.

**-E** _SPEC_
> Extract data.

**--limit** _N_
> Output limit.

**-o** _FILE_
> Output file.

**--bits** _BITS_
> Bits to check.

**--order** _ORDER_
> Bit order.

# DESCRIPTION

**zsteg** detects steganography in images. It finds hidden data in PNG and BMP.

Multiple channels analyzed. RGB, alpha, individual colors.

LSB extraction is primary focus. Least significant bits hide data.

Automatic detection finds common methods. Text, files, patterns.

Extraction outputs hidden content. Specify channel and method.

CTF-oriented tool. Competition steganography challenges.

# CAVEATS

PNG and BMP only. False positives possible. Requires Ruby.

# HISTORY

**zsteg** was created for CTF competitions and steganography analysis. It provides quick detection of hidden image data.

# SEE ALSO

[steghide](/man/steghide)(1), [binwalk](/man/binwalk)(1), [exiftool](/man/exiftool)(1)
