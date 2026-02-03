# TLDR

**Select nodes with XPath**

```xml select -t -v "[//element]" [file.xml]```

**Extract multiple values**

```xml select -t -m "[//item]" -v "[@name]" -n [file.xml]```

**Select with namespace**

```xml select -N [ns=http://example.com] -t -v "[//ns:element]" [file.xml]```

**Copy matching nodes**

```xml select -t -c "[//element]" [file.xml]```

# SYNOPSIS

**xml select** [_options_] _xpath_ [_file_...]

# PARAMETERS

**-t**, **--template**
> Start template.

**-v**, **--value-of** _xpath_
> Output value of XPath expression.

**-m**, **--match** _xpath_
> Match XPath expression.

**-c**, **--copy-of** _xpath_
> Copy matching nodes.

**-n**, **--nl**
> Output newline.

**-N** _prefix=uri_
> Define namespace prefix.

**-T**
> Text output mode.

# DESCRIPTION

**xml select** queries XML documents using XPath expressions. Part of xmlstarlet toolkit. Extracts values, attributes, and node sets from XML files.

# SEE ALSO

[xml-edit](/man/xml-edit)(1), [xml-format](/man/xml-format)(1), [xmllint](/man/xmllint)(1)

