# TAGLINE

Detect steganography in PNG and BMP images

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

**zsteg** detects and extracts data hidden through steganography in PNG and BMP image files. It analyzes multiple color channels (RGB, alpha, and individual colors) across various bit depths to identify concealed content such as text, embedded files, and binary patterns.

The tool's primary focus is LSB (Least Significant Bit) steganography, where data is hidden in the least significant bits of pixel color values. The **-a** flag performs a comprehensive check across all common methods and channel combinations, while the **-E** flag extracts data from a specific channel and bit configuration.

zsteg is widely used in CTF (Capture The Flag) competitions for solving steganography challenges and in forensic analysis of suspicious image files. It is written in Ruby.

# CAVEATS

PNG and BMP only. False positives possible. Requires Ruby.

# HISTORY

**zsteg** was created for CTF competitions and steganography analysis. It provides quick detection of hidden image data.

# SEE ALSO

[steghide](/man/steghide)(1), [binwalk](/man/binwalk)(1), [exiftool](/man/exiftool)(1)
