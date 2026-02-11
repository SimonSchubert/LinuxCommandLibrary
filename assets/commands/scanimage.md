# TAGLINE

Scan images from SANE-compatible scanners

# TLDR

**List** available scanners

```scanimage -L```

Scan an image and **save** to file

```scanimage --format png > image.png```

Scan with a **specific device**

```scanimage -d device_name > image.pnm```

Scan at **high resolution**

```scanimage --resolution 300 > image.pnm```

Scan in **color mode**

```scanimage --mode Color > image.pnm```

Scan a specific **area**

```scanimage -l 0 -t 0 -x 210 -y 297 > image.pnm```

# SYNOPSIS

**scanimage** [_-d device_] [_--format format_] [_--resolution dpi_] [_-L_]

# DESCRIPTION

**scanimage** scans images using the SANE (Scanner Access Now Easy) interface. It provides command-line access to image scanners, supporting various output formats and scanner-specific options.

# PARAMETERS

**-L, --list-devices**
> List available scanner devices

**-d, --device-name device**
> Use the specified scanner device

**--format format**
> Output format (pnm, tiff, png, jpeg, pdf)

**--resolution dpi**
> Set scanning resolution in DPI (default: 75)

**--mode mode**
> Scan mode (Lineart, Gray, Color)

**-l, --left mm**
> Left edge of scan area in mm

**-t, --top mm**
> Top edge of scan area in mm

**-x, --width mm**
> Width of scan area in mm

**-y, --height mm**
> Height of scan area in mm

**--brightness value**
> Set brightness level

**--contrast value**
> Set contrast level

**-b, --batch**
> Enable batch scanning mode

**-p, --progress**
> Show progress during scan

**-v, --verbose**
> Enable verbose output

**-A, --all-options**
> List all available options for the device

# CAVEATS

Scanner-specific options vary by device. Use **-A** to see available options for your scanner. Some features require root access depending on USB permissions.

# HISTORY

**scanimage** is part of the **SANE** (Scanner Access Now Easy) project, providing a standardized interface for image scanners on Unix-like systems since 1996.

# SEE ALSO

[scanadf](/man/scanadf)(1), [sane-find-scanner](/man/sane-find-scanner)(1), [saned](/man/saned)(8)
