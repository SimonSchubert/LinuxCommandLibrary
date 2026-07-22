# TAGLINE

Apply XSLT stylesheets to XML

# TLDR

**Apply XSLT transformation**

```xml transform [stylesheet.xsl] [input.xml]```

**Transform with parameters**

```xml transform --xinclude -p "[param=value]" [stylesheet.xsl] [input.xml]```

**Output to file**

```xml transform [stylesheet.xsl] [input.xml] > [output.xml]```

# SYNOPSIS

**xml transform** [_options_] _stylesheet_ _file_

# PARAMETERS

**-p**, **--param** _name=value_
> Pass parameter to stylesheet.

**-s**, **--stringparam** _name=value_
> Pass string parameter.

**--xinclude**
> Process XInclude.

**--html**
> Input is HTML.

**--omit-decl**
> Omit XML declaration.

# DESCRIPTION

**xml transform** applies XSLT stylesheets to XML documents. Part of xmlstarlet toolkit. Transforms XML using XSLT 1.0 processor for document conversion and processing.

# INSTALL

```dnf: sudo dnf install xmlstarlet```

```pacman: sudo pacman -S xmlstarlet```

```apk: sudo apk add xmlstarlet```

```zypper: sudo zypper install xmlstarlet```

```brew: brew install xmlstarlet```

```nix: nix profile install nixpkgs#xmlstarlet```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[xml-select](/man/xml-select)(1), [xsltproc](/man/xsltproc)(1)

