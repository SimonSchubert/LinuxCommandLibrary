# TLDR

**List all fonts**

```fc-list```

**List fonts matching pattern**

```fc-list : family style | sort```

**Find specific font**

```fc-list | grep -i "[arial]"```

**List monospace fonts**

```fc-list :spacing=mono family```

**Show font file paths**

```fc-list : file family```

**List fonts with specific style**

```fc-list :style=Bold```

**List fonts by language**

```fc-list :lang=[zh]```

# SYNOPSIS

**fc-list** [_options_] [_pattern_] [_elements_]

# PARAMETERS

**-v**, **--verbose**
> Verbose output with all properties.

**-f** _format_
> Custom output format.

**-q**, **--quiet**
> Suppress normal output.

**--version**
> Show version.

_pattern_
> Font matching pattern.

_elements_
> Properties to display: family, style, file, etc.

# DESCRIPTION

**fc-list** lists fonts available to applications using fontconfig. It displays font family names, styles, file locations, and other properties.

The command is essential for discovering installed fonts, finding font file paths, and verifying font installation. It queries the fontconfig database which caches font information.

# EXAMPLES

```bash
# List all font families
fc-list : family | sort -u

# Find fonts supporting Japanese
fc-list :lang=ja family

# List all italic fonts
fc-list :slant=italic family style

# Custom format
fc-list --format="%{family}\n"
```

# CAVEATS

Output can be long; pipe to grep or sort. Font names may vary by language. Newly installed fonts need `fc-cache -fv`. Some applications cache fonts independently.

# HISTORY

fc-list is part of **fontconfig**, created by **Keith Packard** around **2000** to provide system-wide font configuration for X11 and other systems. It replaced the older X font system with a more flexible, file-based approach.

# SEE ALSO

[fc-cache](/man/fc-cache)(1), [fc-match](/man/fc-match)(1), [fc-query](/man/fc-query)(1), [fonts-conf](/man/fonts-conf)(5)
