# TLDR

**Add image to index**

```crane index append -t [index:tag] -m [image:tag]```

**Create new index** with multiple images

```crane index append -t [index:tag] -m [linux/amd64:tag] -m [linux/arm64:tag]```

# SYNOPSIS

**crane** **index** **append** [_options_]

# PARAMETERS

**-t**, **--tag** _tag_
> Tag for the resulting index.

**-m**, **--manifest** _image_
> Image to add to the index (repeatable).

# DESCRIPTION

**crane index append** adds images to a multi-platform manifest index. This creates or updates an index that allows pulling platform-specific images automatically.

# SEE ALSO

[crane](/man/crane)(1), [crane-index](/man/crane-index)(1)
