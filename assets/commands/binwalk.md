# TAGLINE

Analyze and extract firmware images

# TLDR

**Scan** firmware for signatures

```binwalk [firmware.bin]```

**Extract** embedded files

```binwalk -e [firmware.bin]```

**Entropy** analysis

```binwalk -E [firmware.bin]```

**Recursive** extraction

```binwalk -Me [firmware.bin]```

**Carve** known and unknown contents to disk

```binwalk -c [firmware.bin]```

**List** supported signatures and extractors

```binwalk -L```

# SYNOPSIS

**binwalk** [_options_] _file_...

# DESCRIPTION

**binwalk** is a firmware analysis tool for searching binary images for embedded files and executable code. It identifies file signatures, compressed data, filesystems, and other patterns commonly found in firmware images.

The tool is essential for reverse engineering, security research, and firmware modification.

As of version 3 (released 2024), binwalk was completely rewritten in Rust for greatly improved scanning speed, fewer false positives, and more built-in extractors. Several options from the older Python implementation (such as **--dd**, **--hexdump**, **--raw**, and **--disasm**) were removed or replaced.

# PARAMETERS

**-e**, **--extract**
> Automatically extract known file types

**-M**, **--matryoshka**
> Recursively scan extracted files

**-c**, **--carve**
> Carve both known and unknown file contents to disk

**-E**, **--entropy**
> Generate an entropy graph (rendered with Plotly)

**-p**, **--png**
> Save the entropy graph as a PNG file

**-a**, **--search-all**
> Search for all signatures at all offsets

**-d**, **--directory** _path_
> Extract files and folders to a custom directory

**-t**, **--threads** _count_
> Manually specify the number of threads to use

**-y**, **--include** _signatures_
> Only scan for the given signatures

**-x**, **--exclude** _signatures_
> Do not scan for the given signatures

**-l**, **--log** _file_
> Log JSON results to a file ('-' for stdout)

**-L**, **--list**
> List supported signatures and extractors

**-s**, **--stdin**
> Read data from standard input

**-q**, **--quiet**
> Suppress normal stdout output

**-v**, **--verbose**
> During recursive extraction, display all results

# FEATURES

- File signature identification
- Embedded filesystem detection
- Compression detection
- Entropy visualization
- Automatic extraction
- Custom signature support
- Plugin system

# WORKFLOW

```bash
# Scan firmware
binwalk firmware.bin

# Extract all files
binwalk -e firmware.bin

# Recursive extraction
binwalk -Me firmware.bin

# Entropy analysis (finds compressed/encrypted regions)
binwalk -E firmware.bin

# Extract into a custom directory
binwalk -e -d extracted/ firmware.bin
```

# COMMON FINDINGS

- **Filesystem images** (squashfs, cramfs, jffs2)
- **Bootloaders** (U-Boot, LILO)
- **Kernels** (Linux, VxWorks)
- **Compressed data** (gzip, lzma, zlib)
- **Certificates and keys**

# CAVEATS

Extraction may not work for custom formats. Encrypted sections appear as high entropy. Some signatures produce false positives. Requires appropriate tools for extraction (sasquatch, jefferson, etc.). Large firmware images slow to process.

# HISTORY

**binwalk** was created by Craig Heffner around **2010** for reverse engineering and analyzing firmware images from embedded devices. It is now maintained by ReFirmLabs. Version 3, a full rewrite in Rust, debuted in 2024.

# INSTALL

```dnf: sudo dnf install binwalk```

```pacman: sudo pacman -S binwalk```

```zypper: sudo zypper install binwalk```

```brew: brew install binwalk```

```nix: nix profile install nixpkgs#binwalk```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[foremost](/man/foremost)(1), [strings](/man/strings)(1), [file](/man/file)(1), [dd](/man/dd)(1), [hexdump](/man/hexdump)(1)

# RESOURCES

```[Source code](https://github.com/ReFirmLabs/binwalk)```

```[Homepage](https://github.com/ReFirmLabs/binwalk)```

<!-- verified: 2026-06-19 -->
