# TAGLINE

Display information about JPEG XL image files

# TLDR

**Show codestream header information** for a JPEG XL file

```jxlinfo [path/to/image.jxl]```

**Verbose output** with full details about the bitstream

```jxlinfo -v [path/to/image.jxl]```

**Inspect multiple files** in a single invocation

```jxlinfo [image1.jxl] [image2.jxl] [image3.jxl]```

**Display help** and exit

```jxlinfo -h```

# SYNOPSIS

**jxlinfo** [_-v_] [_-h_] _INPUT_

# PARAMETERS

**-v**, **--verbose**
> Produce more verbose output, including detailed bitstream and frame information.

**-h**, **--help**, **-?**
> Display the help message listing all available options and exit.

**_INPUT_**
> One or more input JPEG XL image filenames to inspect.

# DESCRIPTION

**jxlinfo** prints information about JPEG XL (**.jxl**) image files by parsing the codestream header without performing a full decode. It reports image dimensions, bit depth, color encoding (including ICC profile presence), animation properties, and container box structure.

The tool is part of **libjxl-tools**, the reference implementation distribution for JPEG XL maintained by the JPEG XL Project. It is commonly used to verify that a file is a valid JPEG XL codestream, to inspect encoding parameters before decoding, and to debug encoder output.

In verbose mode, **jxlinfo** prints additional details such as frame headers, extra channels, animation timing, and intensity target. The non-verbose mode is suitable for scripting where a brief summary is needed.

# CAVEATS

Output format is not stable across versions of libjxl and should not be parsed by scripts that depend on exact field names. The tool inspects only the codestream header; it does not validate that the file can be decoded without errors. For full decoding, use **djxl**(1).

# HISTORY

**jxlinfo** ships with **libjxl**, the reference implementation of the JPEG XL image coding system developed by the **JPEG XL Project** and contributors from Google, Cloudinary, and others. JPEG XL was standardized as **ISO/IEC 18181** starting in **2021**. The tool is packaged in **libjxl-tools** on Debian, Ubuntu, Fedora, and other distributions.

# INSTALL

```apt: sudo apt install libjxl-tools```

```apk: sudo apk add libjxl-tools```

```zypper: sudo zypper install libjxl-tools```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[djxl](/man/djxl)(1), [cjxl](/man/cjxl)(1), [identify](/man/identify)(1), [exiftool](/man/exiftool)(1)
