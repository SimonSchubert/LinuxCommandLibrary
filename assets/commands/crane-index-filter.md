# TLDR

**Filter platforms** from an index

```crane index filter [image] --platform [linux/amd64] -t [filtered:tag]```

# SYNOPSIS

**crane** **index** **filter** [_options_] _image_

# PARAMETERS

**--platform** _platform_
> Platform to include (repeatable).

**-t**, **--tag** _tag_
> Tag for the filtered index.

# DESCRIPTION

**crane index filter** creates a new index with only specified platforms. Useful for reducing index size or creating platform-specific distributions.

# SEE ALSO

[crane](/man/crane)(1), [crane-index](/man/crane-index)(1)
