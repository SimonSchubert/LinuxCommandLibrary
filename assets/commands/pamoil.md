# TLDR

**Apply oil painting effect**

```pamoil [input.pam] > [output.pam]```

**Set smear size**

```pamoil -n [3] [input.pam] > [output.pam]```

# SYNOPSIS

**pamoil** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PAM/PNM file.

**-n** _SIZE_
> Neighborhood size (default 3).

# DESCRIPTION

**pamoil** creates oil painting effect. Smears colors based on frequency.

The tool applies artistic filter. Part of Netpbm.

pamoil creates oil paint effect.

# CAVEATS

Part of Netpbm. Larger sizes slower. Artistic effect.

# HISTORY

pamoil is part of **Netpbm** for applying oil painting effects.

# SEE ALSO

[ppmrelief](/man/ppmrelief)(1), [pgmedge](/man/pgmedge)(1), [netpbm](/man/netpbm)(1)

