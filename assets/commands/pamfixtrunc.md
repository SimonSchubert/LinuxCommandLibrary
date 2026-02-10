# TAGLINE

fixes truncated images

# TLDR

**Fix truncated image**

```pamfixtrunc [truncated.pam] > [fixed.pam]```

**Fill with specific value**

```pamfixtrunc -fillvalue=[0] [truncated.pam] > [fixed.pam]```

# SYNOPSIS

**pamfixtrunc** [_options_] [_file_]

# PARAMETERS

_FILE_
> Truncated PAM/PNM file.

**-fillvalue** _VALUE_
> Fill value for missing pixels.

# DESCRIPTION

**pamfixtrunc** fixes truncated images. Pads missing data.

The tool completes incomplete files. Part of Netpbm.

# CAVEATS

Part of Netpbm. Fills missing data. Original data lost.

# HISTORY

pamfixtrunc is part of **Netpbm** for fixing truncated image files.

# SEE ALSO

[pamfix](/man/pamfix)(1), [netpbm](/man/netpbm)(1)

