# TAGLINE

IPS and BPS patch creation and application

# TLDR

**Create IPS patch**

```flips --create [original.rom] [modified.rom] [patch.ips]```

**Apply IPS patch**

```flips --apply [patch.ips] [input.rom] [output.rom]```

**Create BPS patch**

```flips --create --bps [original] [modified] [patch.bps]```

**Apply BPS patch**

```flips --apply [patch.bps] [input] [output]```

# SYNOPSIS

**flips** [_options_] [_files_...]

# PARAMETERS

**--create**
> Create a patch.

**--apply**
> Apply a patch.

**--bps**
> Use BPS format instead of IPS.

**--exact**
> Create exact BPS patch.

# DESCRIPTION

**Flips** (Floating IPS) is a patch creation and application tool for binary files, commonly used in ROM hacking and game modification communities. It supports both the legacy IPS (International Patching System) format and the modern BPS (Binary Patching System) format.

The IPS format has been the standard for ROM patches since the 1990s but has limitations including a 16MB file size restriction and lack of error detection. BPS addresses these issues with support for files of any size, built-in CRC32 checksums for verification, and better compression for smaller patch files.

Flips can create patches by comparing original and modified files, then apply those patches to reproduce the modifications. The BPS format includes metadata and verification to ensure patches apply correctly, preventing corruption from applying patches to incorrect source files.

# SEE ALSO

[bsdiff](/man/bsdiff)(1), [xdelta](/man/xdelta)(1)

