# TAGLINE

command-line interface for batch RAW photo processing

# TLDR

**Export a RAW file to JPEG**

```darktable-cli [input.raw] [output.jpg]```

**Export with specific XMP sidecar**

```darktable-cli [input.raw] [preset.xmp] [output.jpg]```

**Export as 16-bit TIFF**

```darktable-cli [input.raw] [output.tiff] --bpp 16```

**Export with specific dimensions**

```darktable-cli [input.raw] [output.jpg] --width [1920] --height [1080]```

**Export all RAWs in directory**

```for f in *.raw; do darktable-cli "$f" "${f%.raw}.jpg"; done```

**Apply style during export**

```darktable-cli [input.raw] [output.jpg] --style "[style_name]"```

# SYNOPSIS

**darktable-cli** [_options_] _input_ [_xmp_] _output_

# PARAMETERS

**--width** _pixels_
> Maximum output width.

**--height** _pixels_
> Maximum output height.

**--bpp** _bits_
> Bits per pixel (8, 16, 32).

**--hq** _true_|_false_
> High quality resampling.

**--upscale** _true_|_false_
> Allow upscaling.

**--style** _name_
> Apply named darktable style.

**--style-overwrite**
> Overwrite existing history with style.

**--out-ext** _ext_
> Output format extension (jpg, tif, png, etc.).

**--core**
> Pass options to darktable core.

**--verbose**
> Enable verbose output.

# DESCRIPTION

**darktable-cli** is the command-line interface for darktable, enabling batch processing of RAW photographs without the graphical interface. It applies darktable's non-destructive edits stored in XMP sidecar files to produce final images.

The tool uses the same processing engine as the GUI application, ensuring identical results. If an XMP file exists alongside the input (same name with .xmp extension), its edits are automatically applied. Explicit XMP files can also be specified.

Common uses include batch export of edited photos, automated processing pipelines, server-side image processing, and generating different output sizes from the same RAW file.

# CAVEATS

Requires OpenCL for GPU acceleration (same as GUI). Processing is single-threaded per image; use parallel for batch processing. Large RAW files require significant memory. XMP edits must be compatible with the darktable version used.

# HISTORY

darktable was created by **Johannes Hanika** and first released in **2009** as an open-source photography workflow application, inspired by Adobe Lightroom. The CLI interface was added to enable scripted processing and integration with other tools. darktable has grown to become one of the premier open-source RAW processing applications.

# SEE ALSO

[darktable](/man/darktable)(1), [rawtherapee-cli](/man/rawtherapee-cli)(1), [dcraw](/man/dcraw)(1), [exiftool](/man/exiftool)(1)
