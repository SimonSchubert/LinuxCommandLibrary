# TAGLINE

Filter platforms from a container image manifest index

# TLDR

**Filter an index to keep only linux/amd64**

```crane index filter [image] --platform linux/amd64```

**Filter to multiple platforms and tag the result**

```crane index filter [image] --platform linux/amd64 --platform linux/arm64 -t [registry/image:tag]```

**Filter with verbose output**

```crane index filter [image] --platform [linux/amd64] -v```

**Filter allowing insecure registries**

```crane index filter [image] --platform [linux/arm64] --insecure -t [registry/image:filtered]```

# SYNOPSIS

**crane** **index** **filter** [_options_] _image_

# PARAMETERS

**--platform** _platform_
> Platform(s) to keep in the form os/arch[/variant][:osversion]. Can be specified multiple times.

**-t**, **--tag** _tag_
> Tag to apply to the resulting filtered image.

**--insecure**
> Allow image references to be fetched without TLS.

**--allow-nondistributable-artifacts**
> Allow pushing non-distributable (foreign) layers.

**-v**, **--verbose**
> Enable debug logs.

**-h**, **--help**
> Show help for the filter command.

# DESCRIPTION

**crane index filter** modifies a remote multi-platform image index by removing platforms that do not match the specified **--platform** flags. The result is a new index containing only the selected architectures and OS combinations.

This is useful for reducing the size of a multi-architecture image index, creating platform-specific distributions, or removing unwanted platforms before pushing to a registry.

The **--platform** flag uses the format **os/arch[/variant][:osversion]**, such as `linux/amd64`, `linux/arm64`, or `linux/arm/v7`.

# SEE ALSO

[crane](/man/crane)(1), [crane-index](/man/crane-index)(1), [crane-index-append](/man/crane-index-append)(1), [crane-manifest](/man/crane-manifest)(1), [crane-push](/man/crane-push)(1)
