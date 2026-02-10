# TAGLINE

extracts image slices

# TLDR

**Extract horizontal slice**

```pamslice -row=[100] [input.pam]```

**Extract vertical slice**

```pamslice -col=[50] [input.pam]```

# SYNOPSIS

**pamslice** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PAM/PNM image.

**-row** _N_
> Extract row N.

**-col** _N_
> Extract column N.

# DESCRIPTION

**pamslice** extracts image slices. Outputs pixel values along line.

The tool creates profile data. Part of Netpbm.

# CAVEATS

Part of Netpbm. Text output. For analysis.

# HISTORY

pamslice is part of **Netpbm** for extracting image profile data.

# SEE ALSO

[pamcut](/man/pamcut)(1), [netpbm](/man/netpbm)(1)

