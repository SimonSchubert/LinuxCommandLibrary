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

**flips** (Floating IPS) creates and applies IPS and BPS patches for ROMs and binary files. BPS provides better support for larger files than IPS.

# SEE ALSO

[bsdiff](/man/bsdiff)(1), [xdelta](/man/xdelta)(1)

