# TLDR

**Start GUI**

```openrgb```

**List devices**

```openrgb -l```

**Set color on device**

```openrgb -d [0] -c [FF0000]```

**Set mode**

```openrgb -d [0] -m [Static]```

**Apply profile**

```openrgb -p [profile.orp]```

**Start server**

```openrgb --server```

# SYNOPSIS

**openrgb** [_options_]

# PARAMETERS

**-l**
> List devices.

**-d** _INDEX_
> Select device.

**-c** _COLOR_
> Set color (hex).

**-m** _MODE_
> Set lighting mode.

**-p** _PROFILE_
> Load profile.

**--server**
> Start SDK server.

**--help**
> Display help information.

# DESCRIPTION

**openrgb** controls RGB lighting. Supports many hardware brands.

The tool provides unified RGB control. Cross-platform application.

openrgb manages RGB lighting.

# CAVEATS

Hardware support varies. May need kernel modules. Root for some devices.

# HISTORY

OpenRGB was created for **unified RGB lighting control** across different brands.

# SEE ALSO

[i2cdetect](/man/i2cdetect)(1)

