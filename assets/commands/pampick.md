# TLDR

**Extract specific images from stream**

```pampick [0] [2] [5] < [input.pam] > [output.pam]```

# SYNOPSIS

**pampick** _index_ [_index_ ...] < _file_

# PARAMETERS

_index_
> Zero-based image indices to extract.

# DESCRIPTION

**pampick** extracts specific images from a multi-image PAM stream by index number. Useful for selecting frames from animation or video sequences. Part of Netpbm toolkit.

# SEE ALSO

[pamsplit](/man/pamsplit)(1), [pamcat](/man/pamcat)(1)

