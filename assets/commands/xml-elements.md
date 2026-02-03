# TLDR

**List element names**

```xml elements [file.xml]```

**List with paths**

```xml elements -a [file.xml]```

**List unique elements**

```xml elements -u [file.xml]```

# SYNOPSIS

**xml elements** [_options_] _file_

# PARAMETERS

**-a**
> Show XPath for each element.

**-u**
> Show unique elements only.

**-d** _depth_
> Maximum depth.

# DESCRIPTION

**xml elements** lists XML element names in a document. Part of xmlstarlet toolkit. Useful for exploring XML structure and discovering available element paths.

# SEE ALSO

[xml-select](/man/xml-select)(1), [xml-list](/man/xml-list)(1)

