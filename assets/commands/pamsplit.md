# TAGLINE

splits multi-image files

# TLDR

**Split multi-image file**

```pamsplit [input.pam] [output%d.pam]```

**Split with padding**

```pamsplit [input.pam] [output%03d.pam]```

# SYNOPSIS

**pamsplit** [_options_] _input_ _output_template_

# PARAMETERS

_INPUT_
> Multi-image PAM/PNM file.

_OUTPUT_TEMPLATE_
> Output filename with %d placeholder.

**-padname** _WIDTH_
> Pad sequence numbers.

# DESCRIPTION

**pamsplit** splits multi-image files. Creates separate files per image.

The tool extracts image sequences. Part of Netpbm.

# CAVEATS

Part of Netpbm. %d for sequence number. Multi-image input.

# HISTORY

pamsplit is part of **Netpbm** for splitting multi-image files.

# SEE ALSO

[pamundice](/man/pamundice)(1), [pnmcat](/man/pnmcat)(1), [netpbm](/man/netpbm)(1)

