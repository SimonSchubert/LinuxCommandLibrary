# TLDR

**Detect edges**

```pamedge [input.pam] > [output.pam]```

**From pipe**

```cat [image.pam] | pamedge > [edges.pam]```

# SYNOPSIS

**pamedge** [_file_]

# PARAMETERS

_FILE_
> Input PAM/PNM image.

# DESCRIPTION

**pamedge** performs edge detection. Uses gradient-based method.

The tool highlights edges in images. Part of Netpbm.

pamedge detects image edges.

# CAVEATS

Part of Netpbm. Simple edge detection. Grayscale output.

# HISTORY

pamedge is part of **Netpbm** for basic edge detection.

# SEE ALSO

[pnmconvol](/man/pnmconvol)(1), [pgmedge](/man/pgmedge)(1), [netpbm](/man/netpbm)(1)

