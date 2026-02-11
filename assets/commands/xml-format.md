# TAGLINE

Pretty-print XML documents

# TLDR

**Format XML file**

```xml format [input.xml]```

**Format with indentation**

```xml format --indent-spaces [4] [input.xml]```

**Format to output file**

```xml format [input.xml] > [output.xml]```

# SYNOPSIS

**xml format** [_options_] [_file_]

# PARAMETERS

**--indent** _string_
> Indentation string.

**--indent-spaces** _n_
> Indent with n spaces.

**--indent-tab**
> Indent with tabs.

**--omit-decl**
> Omit XML declaration.

**--dropdtd**
> Remove DTD.

**--recover**
> Try to recover malformed XML.

# DESCRIPTION

**xml format** pretty-prints XML documents. Part of xmlstarlet toolkit. Reformats XML with proper indentation and line breaks for readability.

# SEE ALSO

[xml-validate](/man/xml-validate)(1), [xml-select](/man/xml-select)(1), [xmllint](/man/xmllint)(1)

