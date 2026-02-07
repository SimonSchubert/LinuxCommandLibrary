# TAGLINE

universal RAW camera image decoder

# TLDR

**Convert RAW to PPM with default settings**

```dcraw [image.raw]```

**Convert to 16-bit linear TIFF**

```dcraw -T -4 [image.raw]```

**Extract embedded JPEG thumbnail**

```dcraw -e [image.raw]```

**Convert with automatic white balance**

```dcraw -a [image.raw]```

**Convert with camera white balance**

```dcraw -w [image.raw]```

**Output to stdout as PPM**

```dcraw -c [image.raw] > [output.ppm]```

**Half-size output** (faster, less noise)

```dcraw -h [image.raw]```

# SYNOPSIS

**dcraw** [_options_] _rawfile_...

# PARAMETERS

**-c**
> Write to stdout.

**-e**
> Extract embedded thumbnail.

**-T**
> Output TIFF instead of PPM.

**-4**
> Linear 16-bit, no gamma curve.

**-6**
> 16-bit output with gamma curve.

**-w**
> Use camera white balance.

**-a**
> Calculate white balance from entire image.

**-W**
> Don't automatically brighten image.

**-h**
> Half-size output (2x2 pixels averaged).

**-q** _n_
> Interpolation quality (0-3).

**-o** _n_
> Output colorspace (0=raw, 1=sRGB, 2=AdobeRGB, etc.).

**-v**
> Verbose output.

**-i**
> Identify file, don't decode.

# DESCRIPTION

**dcraw** is a universal RAW image decoder that converts proprietary camera RAW formats to standard PPM or TIFF images. It supports hundreds of camera models from all major manufacturers.

The tool performs demosaicing (converting Bayer pattern to full color), white balance, gamma correction, and color space conversion. Output can be 8-bit or 16-bit, linear or gamma-corrected, depending on intended use.

dcraw is often used as a backend by other applications (GIMP, digiKam) or in batch processing pipelines. Its predictable, consistent behavior makes it valuable for automated processing where reproducibility matters.

# CAVEATS

Development has slowed (last major update 2018); some newer cameras may not be supported. For actively maintained alternatives, consider libraw or RawTherapee. Output quality may not match camera-specific software. Some RAW features (lens corrections, proprietary algorithms) are not replicated.

# HISTORY

dcraw was written by **Dave Coffin** starting in **1997**, initially to decode his own camera's RAW files. It grew through reverse-engineering efforts to support nearly every camera manufacturer's format. The software became foundational in open-source photography, enabling Linux RAW processing years before manufacturers provided support. Dave Coffin maintained it as a personal project for over 20 years.

# SEE ALSO

[rawtherapee](/man/rawtherapee)(1), [darktable](/man/darktable)(1), [ufraw](/man/ufraw)(1), [exiftool](/man/exiftool)(1)
