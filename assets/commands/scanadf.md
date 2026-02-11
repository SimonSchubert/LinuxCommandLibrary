# TAGLINE

Batch scan from automatic document feeder

# TLDR

**Scan all pages from the document feeder**

```scanadf -o [output_%d.pnm]```

**Scan a specific number of pages**

```scanadf -e [5] -o [page_%d.pnm]```

**Scan starting from a specific page number**

```scanadf -s [1] -o [scan_%d.pnm]```

**Scan with a specific device**

```scanadf -d [device_name] -o [output_%d.pnm]```

**Run a script after each page** is scanned

```scanadf -S [process.sh] -o [page_%d.pnm]```

**Scan without overwriting existing files**

```scanadf -N -o [output_%d.pnm]```

# SYNOPSIS

**scanadf** [_-d device_] [_-o file_] [_-s num_] [_-e num_] [_-S script_] [_device-options_]

# PARAMETERS

**-d** _device_, **--device-name**=_device_
> Use the specified scanner device

**-o** _file_, **--output-file**=_file_
> Output filename format; %d is replaced with page number

**-s** _num_, **--start-count**=_num_
> Page number of first scanned image

**-e** _num_, **--end-count**=_num_
> Last page number to scan

**-S** _script_, **--scan-script**=_script_
> Script to run after each image is acquired

**-N**, **--no-overwrite**
> Prevent overwriting existing image files

**-r**, **--raw**
> Write raw image data without interpretation

**-L**, **--list-devices**
> List available scanner devices

**-v**, **--verbose**
> Increase verbosity level

# DESCRIPTION

**scanadf** is a command-line tool for acquiring multiple images from scanners with automatic document feeders (ADF). It scans pages sequentially until the feeder is empty, writing each page to a numbered output file.

The tool uses the SANE interface and supports any scanner with a SANE backend. Output is typically in PNM format (PBM, PGM, or PPM depending on scan mode). Scanner-specific options like resolution and source can be passed directly.

Some scanners require specific source options: UMAX uses **--source="Automatic Document Feeder"**, HP uses **--scantype=ADF**.

# CAVEATS

The scanner backend must support ADF and return SANE_STATUS_NO_DOCS when the feeder is empty. Using scanadf with flatbed-only scanners will repeatedly scan the same page; always use **-e** to limit page count. The **%d** placeholder in output filenames is required for multiple pages.

# HISTORY

scanadf is part of the **SANE** (Scanner Access Now Easy) project, providing specialized support for document feeders. It complements scanimage by handling the multi-page workflow common in document scanning scenarios.

# SEE ALSO

[scanimage](/man/scanimage)(1), [sane-find-scanner](/man/sane-find-scanner)(1), [xsane](/man/xsane)(1), [convert](/man/convert)(1)
