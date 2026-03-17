# TAGLINE

configures the dynamic linker run-time bindings

# TLDR

**Update symlinks and rebuild the shared library cache**

```sudo ldconfig```

**Update symlinks for a specific directory only**

```sudo ldconfig -n [path/to/directory]```

**Print cached libraries and search for a specific library**

```ldconfig -p | grep [library_name]```

**Rebuild cache with verbose output**

```sudo ldconfig -v```

**Use an alternate configuration file**

```sudo ldconfig -f [path/to/ld.so.conf]```

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
> Use specified cache file instead of /etc/ld.so.cache.

**-r** _ROOT_
> Change to and use _ROOT_ as the root directory.

**-l**
> Library mode. Manually link individual libraries.

# DESCRIPTION

**ldconfig** configures the dynamic linker run-time bindings. It creates the necessary symbolic links and cache (stored in /etc/ld.so.cache) to the most recent shared libraries found in directories specified in /etc/ld.so.conf, in trusted directories (/lib and /usr/lib), and those specified on the command line.

The cache is used by the run-time linker (ld.so or ld-linux.so) to quickly resolve shared library dependencies without scanning directories at load time. Running ldconfig is typically necessary after installing new shared libraries or modifying /etc/ld.so.conf.

# CAVEATS

Requires root privileges to modify the system cache. Must be run after installing new shared libraries for them to be found by the dynamic linker. Libraries in non-standard paths must be listed in /etc/ld.so.conf or passed on the command line. Package managers typically run ldconfig automatically after installing library packages.

# HISTORY

ldconfig is part of the GNU C Library (glibc) and has been essential for dynamic linking on Linux systems since the adoption of shared libraries.

# SEE ALSO

[ldd](/man/ldd)(1), [ld.so](/man/ld.so)(8)
