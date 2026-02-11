# TAGLINE

Filter records from scamper warts files

# TLDR

**Filter warts file records**

```sc_wartsfilter -i [input.warts] -o [output.warts] -t [traceroute]```

**Filter by destination**

```sc_wartsfilter -i [input.warts] -o [output.warts] -d [192.168.0.0/16]```

# SYNOPSIS

**sc_wartsfilter** [_options_]

# PARAMETERS

**-i** _file_
> Input warts file.

**-o** _file_
> Output warts file.

**-t** _type_
> Filter by measurement type.

**-d** _prefix_
> Filter by destination prefix.

# DESCRIPTION

**sc_wartsfilter** filters scamper warts files by various criteria. Part of scamper toolkit.

# SEE ALSO

[sc_wartscat](/man/sc_wartscat)(1), [scamper](/man/scamper)(1)

