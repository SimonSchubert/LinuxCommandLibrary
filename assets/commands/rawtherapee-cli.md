# TAGLINE

Batch process RAW photos from the command line

# TLDR

**Convert RAW to JPEG**

```rawtherapee-cli -o [output.jpg] -c [input.raw]```

**Apply processing profile**

```rawtherapee-cli -p [profile.pp3] -o [output.jpg] -c [input.raw]```

**Batch convert directory**

```rawtherapee-cli -o [output_dir/] -c [input_dir/]```

**Output as TIFF**

```rawtherapee-cli -t -o [output.tif] -c [input.raw]```

# SYNOPSIS

**rawtherapee-cli** [_options_] **-c** _input_files_

# PARAMETERS

**-c** _FILES_
> Specify input files/directories to convert. Must be the **last** argument.

**-o** _PATH_
> Output file or directory.

**-O** _PATH_
> Like **-o** but also copies the applied .pp3 profile as a sidecar file next to the output.

**-p** _FILE.pp3_
> Apply the given processing profile.

**-d**
> Use the built-in default processing profile.

**-s**, **-S**
> Use an existing sidecar .pp3 next to the input. **-S** skips images with no sidecar; **-s** silently falls back to the default profile.

**-q** _FILE_
> Use an alternative sidecar file for every processed image.

**-a**
> Process all supported files, including hidden ones.

**-j**[_1-100_]
> Output JPEG; quality is **attached** with no space (e.g. `-j95`). Forces 8-bit output.

**-js**_1_|_2_|_3_
> JPEG chroma subsampling: **1** = 4:2:0, **2** = 4:2:2, **3** = 4:4:4.

**-t**[**z**]
> Output TIFF; append **z** (`-tz`) for ZIP compression.

**-n**
> Output PNG (uncompressed).

**-b**_8_|_16_|_16f_|_32_
> Output bit depth for TIFF/PNG (JPEG is always 8-bit).

**-f**
> Fast-export mode (reduced quality, faster processing).

**-Y**
> Overwrite existing output files.

**-h**, **-?**
> Display help.

# DESCRIPTION

**rawtherapee-cli** is the command-line interface for RawTherapee, processing RAW image files. It applies the same powerful processing as the GUI version in batch mode.

# EXAMPLES

```bash
# Basic conversion
rawtherapee-cli -o output.jpg -c photo.CR2

# With profile
rawtherapee-cli -p default.pp3 -o output.jpg -c input.NEF

# Batch convert folder
rawtherapee-cli -o processed/ -c raw_photos/

# High quality JPEG
rawtherapee-cli -j95 -o high_quality.jpg -c input.raw

# 16-bit TIFF
rawtherapee-cli -t -b16 -o output.tif -c input.raw
```

# PROFILES

Processing profiles (.pp3) can be:
- Created in RawTherapee GUI
- Found in /usr/share/rawtherapee/profiles/
- Sidecar files (filename.pp3)

# CONFIGURATION

**/usr/share/rawtherapee/profiles/**
> System-wide processing profiles (.pp3) providing preset development settings for different styles and corrections.

**~/.config/RawTherapee/profiles/**
> User-created processing profiles saved from the RawTherapee GUI.

**Sidecar .pp3 files**
> Per-image processing profiles stored alongside the RAW file (e.g., photo.CR2.pp3), automatically applied when no explicit profile is specified.

# CAVEATS

Requires RawTherapee installation. Processing is CPU-intensive. Supports most RAW formats.

# HISTORY

RawTherapee was created by **Gábor Horváth** in 2004, with CLI added for batch processing workflows.

# SEE ALSO

[darktable-cli](/man/darktable-cli)(1), [dcraw](/man/dcraw)(1), [convert](/man/convert)(1)
