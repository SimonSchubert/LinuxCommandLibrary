# TLDR

**Fix corrupted image**

```pamfix [corrupted.pam] > [fixed.pam]```

**Truncate on error**

```pamfix -truncate [corrupted.pam] > [fixed.pam]```

# SYNOPSIS

**pamfix** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PAM/PNM file.

**-truncate**
> Truncate at first error.

**-change**
> Fix values out of range.

# DESCRIPTION

**pamfix** repairs corrupted images. Fixes common PAM/PNM errors.

The tool salvages damaged files. Part of Netpbm.

pamfix repairs images.

# CAVEATS

Part of Netpbm. May not fix all corruption. Data loss possible.

# HISTORY

pamfix is part of **Netpbm** for repairing corrupted image files.

# SEE ALSO

[pamfixtrunc](/man/pamfixtrunc)(1), [netpbm](/man/netpbm)(1)

