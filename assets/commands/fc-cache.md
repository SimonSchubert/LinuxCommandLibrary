# TAGLINE

build fontconfig cache files

# TLDR

**Rebuild font cache** for all directories

```fc-cache```

**Force rebuild** with verbose output

```fc-cache -fv```

**Rebuild system-wide caches** only (requires root)

```sudo fc-cache -fvs```

**Rebuild cache** for a specific directory

```fc-cache [path/to/fonts/directory]```

**Erase all caches** and rebuild from scratch

```fc-cache -r```

**Check if cache files** are up to date (really verbose)

```fc-cache -rv```

# SYNOPSIS

**fc-cache** [**-EfrsvVh**] [**--error-on-no-fonts**] [**--force**] [**--really-force**] [**--system-only**] [**--verbose**] [**--version**] [**--help**] [_DIR_...]

# PARAMETERS

**-f**, **--force**
> Force re-generation of cache files, overriding timestamp checking.

**-r**, **--really-force**
> Erase all existing cache files and rescan.

**-s**, **--system-only**
> Only scan system-wide directories, omitting user home directory locations.

**-v**, **--verbose**
> Display status information while processing.

**-E**, **--error-on-no-fonts**
> Raise an error if there are no fonts in the specified directory.

**-V**, **--version**
> Display fontconfig version and exit.

**-h**, **--help**
> Display help message and exit.

# DESCRIPTION

**fc-cache** scans font directories and builds font information cache files for applications using fontconfig. These caches map font file names to font properties, enabling fast font lookup at application startup without scanning all font files.

If no directory arguments are given, fc-cache processes all directories in the current fontconfig configuration. Each directory is scanned for font files readable by FreeType, and cache files are created containing font properties and associated filenames.

User caches are stored in **~/.cache/fontconfig/** while system caches are stored in **/var/cache/fontconfig/**. Cache files must be regenerated when fonts are added or removed.

# CONFIGURATION

**~/.cache/fontconfig/**
> User-specific font cache files.

**/var/cache/fontconfig/**
> System-wide font cache files.

**/etc/fonts/fonts.conf**
> Main fontconfig configuration specifying font directories.

**~/.config/fontconfig/fonts.conf**
> User-specific fontconfig configuration.

# CAVEATS

fc-cache must be run once per architecture to generate properly customized font information. When installing new fonts, running **fc-cache -fv** ensures the fonts become immediately available to applications. Some applications may need to be restarted to pick up new fonts even after cache regeneration.

# HISTORY

Fontconfig was initiated by Keith Packard in **2000** for improved font handling in X11, evolving from the older bitmap-focused X font system to support scalable fonts. The fc-cache utility became stable with Fontconfig 2.0 in **2002**. Fontconfig has become the standard font configuration system on Linux desktops.

# SEE ALSO

[fc-list](/man/fc-list)(1), [fc-match](/man/fc-match)(1), [fc-query](/man/fc-query)(1), [fc-scan](/man/fc-scan)(1), [fc-cat](/man/fc-cat)(1)
