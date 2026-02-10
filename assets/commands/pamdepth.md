# TAGLINE

changes image bit depth

# TLDR

**Change bit depth**

```pamdepth [8] [input.pam] > [output.pam]```

**Convert to 16-bit**

```pamdepth 65535 [input.pam] > [output.pam]```

**Convert to 1-bit**

```pamdepth 1 [input.pam] > [output.pam]```

# SYNOPSIS

**pamdepth** _maxval_ [_file_]

# PARAMETERS

_MAXVAL_
> Maximum pixel value (determines bit depth).

_FILE_
> Input PAM/PNM file.

# DESCRIPTION

**pamdepth** changes image bit depth. Rescales pixel values.

The tool converts between depths. Part of Netpbm.

# CAVEATS

Part of Netpbm. Rescales values. May lose precision.

# HISTORY

pamdepth is part of **Netpbm** for bit depth conversion.

# SEE ALSO

[pnmdepth](/man/pnmdepth)(1), [pamrecolor](/man/pamrecolor)(1), [netpbm](/man/netpbm)(1)

