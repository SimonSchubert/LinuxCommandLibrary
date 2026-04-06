# TAGLINE

repairs corrupted Netpbm images

# TLDR

**Clip sample values that exceed the maxval**

```pamfix -clip [corrupted.pam] > [fixed.pam]```

**Raise the maxval to accommodate out-of-range values**

```pamfix -changemaxval [corrupted.pam] > [fixed.pam]```

**Truncate the image at the first invalid sample value**

```pamfix -truncate [corrupted.pam] > [fixed.pam]```

**Fix with verbose output**

```pamfix -clip -verbose [corrupted.pam] > [fixed.pam]```

# SYNOPSIS

**pamfix** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PAM/PNM file. Reads from standard input if not specified.

**-clip**
> Clip all pixel values that exceed the maxval stated in the header to the maxval. Cannot be combined with **-changemaxval**.

**-changemaxval**
> Raise the maxval to accommodate pixel values that exceed the maxval stated in the header, lowering the fraction represented by every sample. Cannot be combined with **-clip**.

**-truncate**
> Truncate the image at the first invalid sample value. When neither **-clip** nor **-changemaxval** is specified, this is the default behavior for out-of-range values.

**-verbose**
> Report details of the repair to standard error.

# DESCRIPTION

**pamfix** reads a stream that is mostly a Netpbm image but may have certain types of corruptions and produces a valid Netpbm image that preserves much of the information in the original. It handles two primary corruption types: truncated streams and illegally large sample values. Part of the Netpbm package.

# CAVEATS

You cannot specify both **-clip** and **-changemaxval**. May not fix all types of corruption. Some data loss is possible with truncation.

# SEE ALSO

[pamfixtrunc](/man/pamfixtrunc)(1), [pamfile](/man/pamfile)(1), [pamvalidate](/man/pamvalidate)(1), [pamcut](/man/pamcut)(1), [netpbm](/man/netpbm)(1)

