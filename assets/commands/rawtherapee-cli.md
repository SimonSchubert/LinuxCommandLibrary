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

**-o** _path_
> Output file or directory.

**-p** _file_
> Processing profile (.pp3).

**-c** _files_
> Input files to convert.

**-j** [_quality_]
> Output JPEG (quality 1-100).

**-t**
> Output TIFF.

**-n**
> Output PNG.

**-b** _bits_
> Bit depth (8 or 16).

**-Y**
> Overwrite existing.

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

# CAVEATS

Requires RawTherapee installation. Processing is CPU-intensive. Supports most RAW formats.

# HISTORY

RawTherapee was created by **Gábor Horváth** in 2004, with CLI added for batch processing workflows.

# SEE ALSO

[darktable-cli](/man/darktable-cli)(1), [dcraw](/man/dcraw)(1), [convert](/man/convert)(1)
