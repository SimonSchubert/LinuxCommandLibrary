# TAGLINE

Batch scan from automatic document feeder

# TLDR

**Scan all pages from the document feeder**

```scanadf -o [output_%d.pnm]```

**Scan pages 1 to 5** only

```scanadf -s [1] -e [5] -o [page_%d.pnm]```

**Scan starting from a specific page number**

```scanadf -s [1] -o [scan_%d.pnm]```

**Scan with a specific device**

```scanadf -d [device_name] -o [output_%d.pnm]```

**Run a script after each page** is scanned

```scanadf -S [process.sh] -o [page_%d.pnm]```

**Scan without overwriting existing files**

```scanadf -N -o [output_%d.pnm]```

**Scan at 300 DPI in grayscale** using device-specific options

```scanadf --mode Gray --resolution 300 -o [page_%04d.pnm]```

**Show device-specific options** for a scanner

```scanadf --help -d [device_name]```

# SYNOPSIS

**scanadf** [**-d** _device_] [**-o** _file_] [**-s** _num_] [**-e** _num_] [**-S** _script_] [**--script-wait**] [**-N**] [**-r**] [_device-options_]

# PARAMETERS

**-d** _device_, **--device-name**=_device_
> Use the specified scanner device

**-o** _file_, **--output-file**=_file_
> Output filename format; %d is replaced with the page number. Default: image-%04d

**-s** _num_, **--start-count**=_num_
> Page number of first scanned image

**-e** _num_, **--end-count**=_num_
> Last page number to scan

**-S** _script_, **--scan-script**=_script_
> Script to run after each image is acquired. It gets the image filename as its argument and the environment variables SCAN_RES, SCAN_WIDTH, SCAN_HEIGHT, SCAN_DEPTH, SCAN_FORMAT and SCAN_FORMAT_ID

**--script-wait**
> Wait for all scan scripts to finish before exiting

**-N**, **--no-overwrite**
> Prevent overwriting existing image files

**-r**, **--raw**
> Write raw image data without interpretation

**-L**, **--list-devices**
> List available scanner devices

**-v**, **--verbose**
> Increase verbosity level; may be repeated

**-V**, **--version**
> Print the program and SANE version

**-h**, **--help**
> Show help, including device-specific options when combined with **-d**

# DESCRIPTION

**scanadf** is a command-line tool for acquiring multiple images from scanners with automatic document feeders (ADF). It scans pages sequentially until the feeder is empty, writing each page to a numbered output file.

The tool uses the SANE interface and supports any scanner with a SANE backend. Output is typically in PNM format (PBM, PGM, or PPM depending on scan mode). Scanner-specific options like resolution and source can be passed directly.

If no device is given, the first available device is used. Some scanners require specific source options: UMAX uses **--source="Automatic Document Feeder"**, HP uses **--scantype=ADF**.

# CAVEATS

The scanner backend must support ADF and return SANE_STATUS_NO_DOCS when the feeder is empty. Using scanadf with flatbed-only scanners will repeatedly scan the same page; always use **-e** to limit page count. The **%d** placeholder in output filenames is required for multiple pages. Device-specific options such as **--mode**, **--resolution** and **--source** vary by backend. sane-frontends has seen no release since 1.0.14 (2005) and is missing from some distributions; **scanimage --batch** provides similar multi-page ADF scanning.

# HISTORY

scanadf is part of the **SANE** (Scanner Access Now Easy) project and ships in the **sane-frontends** package (not sane-backends, which provides scanimage). It complements scanimage by handling the multi-page workflow common in document scanning scenarios.

# SEE ALSO

[scanimage](/man/scanimage)(1), [sane-find-scanner](/man/sane-find-scanner)(1), [convert](/man/convert)(1)

# RESOURCES

```[Source code](https://gitlab.com/sane-project/frontends)```

```[Homepage](http://www.sane-project.org/)```

<!-- verified: 2026-11-23 -->
