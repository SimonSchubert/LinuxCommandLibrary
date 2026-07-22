# TAGLINE

Decode min12xxw printer driver output for debugging

# TLDR

**Decode a driver data stream** piped from stdin

```min12xxw < [document.pbm] | esc-m```

**Inspect a captured** printer data file

```esc-m < [captured.prn]```

# SYNOPSIS

**esc-m**

# DESCRIPTION

**esc-m** is a small debugging filter shipped with the **min12xxw** printer driver. It reads a driver data stream on standard input and prints a human-readable description of the ESC-M (compressed page) commands it contains to standard output.

The tool takes no arguments and no options: it is only meant to help developers and users understand what the min12xxw driver emits for a KonicaMinolta PagePro 1200W-class printer, for example when diagnosing a printing problem or verifying the compressed raster output.

# CAVEATS

esc-m is a diagnostic aid, not a print command; it does not talk to a printer. It only understands the data format produced by the min12xxw driver, so feeding it arbitrary files produces meaningless output. It is packaged together with min12xxw (Debian's printer-driver-min12xxw) rather than as a standalone tool.

# INSTALL

```apt: sudo apt install printer-driver-min12xxw```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[min12xxw](/man/min12xxw)(1)

# RESOURCES

```[Homepage](http://www.hinterbergen.de/mala/min12xxw/)```

<!-- verified: 2026-07-14 -->
