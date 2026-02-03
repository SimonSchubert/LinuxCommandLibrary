# TLDR

**Extract even field from interlaced video**

```pamdeinterlace -takeodd=false [input.pam] > [output.pam]```

**Extract odd field from interlaced video**

```pamdeinterlace -takeodd=true [input.pam] > [output.pam]```

# SYNOPSIS

**pamdeinterlace** [_options_] [_file_]

# PARAMETERS

**-takeodd**
> Take odd lines (true) or even lines (false).

# DESCRIPTION

**pamdeinterlace** extracts one field from an interlaced video frame, producing a half-height image. Used for processing interlaced video captures. Part of Netpbm toolkit.

# SEE ALSO

[pammixinterlace](/man/pammixinterlace)(1), [pamscale](/man/pamscale)(1)

