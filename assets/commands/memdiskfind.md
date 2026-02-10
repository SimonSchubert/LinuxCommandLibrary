# TAGLINE

locates MEMDISK instances in memory

# TLDR

**Find MEMDISK location**

```memdiskfind```

**Find with verbose**

```memdiskfind -v```

# SYNOPSIS

**memdiskfind** [_options_]

# PARAMETERS

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**memdiskfind** locates MEMDISK instances in memory. MEMDISK is a SYSLINUX component for booting disk images.

The tool helps identify memory addresses of loaded disk images. Used for debugging and system analysis.

# CAVEATS

SYSLINUX specific. Requires MEMDISK boot. System-level tool.

# HISTORY

memdiskfind is part of **SYSLINUX** suite for locating MEMDISK loaded disk images in memory.

# SEE ALSO

[syslinux](/man/syslinux)(1), [memdisk](/man/memdisk)(1)

