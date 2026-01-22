# TLDR

**Update** symlinks and rebuild cache

```sudo ldconfig```

Update symlinks for a **specific directory**

```sudo ldconfig -n [path/to/directory]```

**Print** cached libraries and search for specific library

```ldconfig -p | grep [library_name]```

# SYNOPSIS

**ldconfig** [_options_] [_directory_...]

# PARAMETERS

**-n**
> Process only specified directories (don't update cache)

**-p**, **--print-cache**
> Print libraries stored in the cache

**-v**, **--verbose**
> Verbose mode

**-N**
> Don't rebuild the cache

**-X**
> Don't update symbolic links

**-f** _FILE_
> Use specified config file instead of /etc/ld.so.conf

**-C** _FILE_
> Use specified cache file

# DESCRIPTION

**ldconfig** configures the dynamic linker run-time bindings. It creates the necessary links and cache to the shared libraries found in directories specified in /etc/ld.so.conf, trusted directories (/lib, /usr/lib), and those specified on the command line.

The cache is used by the run-time linker (ld.so) to quickly find shared libraries. Running ldconfig is typically necessary after installing new shared libraries.

# CAVEATS

Requires root privileges to modify system cache. Must be run after installing new libraries for them to be found. Does not update libraries in non-standard paths not listed in ld.so.conf.

# HISTORY

ldconfig is part of the GNU C Library (glibc) and has been essential for dynamic linking on Linux systems since the adoption of shared libraries.

# SEE ALSO

[ldd](/man/ldd)(1), [ld.so](/man/ld.so)(8), [ld.so.conf](/man/ld.so.conf)(5)
