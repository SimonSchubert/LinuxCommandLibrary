# TAGLINE

scans the system for packages with broken shared library links

# TLDR

Find packages with **broken library links**

```lddd```

# SYNOPSIS

**lddd**

# DESCRIPTION

**lddd** scans the system for packages with broken shared library links. It identifies binaries that depend on libraries that have been removed or updated, indicating packages that may need to be rebuilt.

This tool is specifically designed for Arch Linux systems and helps maintain system health after library updates.

# CAVEATS

Only available on Arch Linux. May take considerable time on systems with many packages. Requires root privileges for complete system scanning.

# SEE ALSO

[ldd](/man/ldd)(1), [pacman](/man/pacman)(8), [checkupdates](/man/checkupdates)(8)
