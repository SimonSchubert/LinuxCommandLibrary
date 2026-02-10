# TAGLINE

converts PAM images to PNM format

# TLDR

**Convert PAM to PNM format**

```pamtopnm [input.pam] > [output.pnm]```

**Convert discarding alpha channel**

```pamtopnm -assume [input.pam] > [output.pnm]```

# SYNOPSIS

**pamtopnm** [_options_] [_file_]

# PARAMETERS

**-assume**
> Assume non-alpha interpretation of extra channel.

# DESCRIPTION

**pamtopnm** converts PAM images to PNM (PBM/PGM/PPM) format. If input has alpha channel, it is removed. Part of Netpbm toolkit.

# SEE ALSO

[pnmtopam](/man/pnmtopam)(1), [pamtopam](/man/pamtopam)(1)

