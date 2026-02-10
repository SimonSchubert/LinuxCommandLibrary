# TAGLINE

loads output character translation maps

# TLDR

**Load screen map**

```mapscrn [mapfile]```

**Load from default directory**

```mapscrn [trivstrk.trans]```

**Show current map**

```mapscrn -o```

**Clear screen map**

```mapscrn -c```

# SYNOPSIS

**mapscrn** [_options_] [_mapfile_]

# PARAMETERS

_MAPFILE_
> Screen map file.

**-o**
> Output current map.

**-c**
> Clear (set default) map.

**-V**
> Show version.

**--help**
> Display help information.

# DESCRIPTION

**mapscrn** loads output character translation maps. It sets up screen character mapping for consoles.

The tool handles character set translation for virtual terminals. Used for non-ASCII display.

# CAVEATS

Linux console specific. UTF-8 makes this less necessary. Part of kbd package.

# HISTORY

mapscrn is part of the **kbd** package for Linux console configuration.

# SEE ALSO

[setfont](/man/setfont)(8), [loadkeys](/man/loadkeys)(1), [consoletype](/man/consoletype)(1)

