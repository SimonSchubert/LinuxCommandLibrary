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

**Signature** scan with hex dump

```binwalk -W [firmware.bin]```

# SYNOPSIS

**binwalk** [_options_] _file_...

# DESCRIPTION

**binwalk** is a firmware analysis tool for searching binary images for embedded files and executable code. It identifies file signatures, compressed data, filesystems, and other patterns commonly found in firmware images.

The tool is essential for reverse engineering, security research, and firmware modification.

# PARAMETERS

**-e**, **--extract**
> Extract identified files

**-M**, **--matryoshka**
> Recursively scan extracted files

**-E**, **--entropy**
> Calculate entropy analysis

**-W**, **--hexdump**
> Show hex dump with results

**-D**, **--dd** _type:ext_
> Extract and rename by type

**-r**, **--raw** _string_
> Search for custom string

**-y**, **--disasm**
> Disassemble executable code

**--signature**
> Custom signature file

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

# Extract specific types
binwalk -D 'gzip:gz' firmware.bin
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

**binwalk** was created by Craig Heffner around **2010** for reverse engineering and analyzing firmware images from embedded devices.

# SEE ALSO

[foremost](/man/foremost)(1), [strings](/man/strings)(1), [file](/man/file)(1)
