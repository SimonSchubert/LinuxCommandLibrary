# TAGLINE

Pretty-print XML documents

# TLDR

**Format an XML file with default indentation**

```xml format [input.xml]```

**Format with a specific number of spaces for indentation**

```xml format --indent-spaces [4] [input.xml]```

**Format with tab indentation**

```xml format --indent-tab [input.xml]```

**Format and omit the XML declaration**

```xml format --omit-decl [input.xml]```

**Recover and format a malformed XML file**

```xml format --recover [input.xml]```

**Format to output file**

```xml format [input.xml] > [output.xml]```

# SYNOPSIS

**xml format** [_options_] [_file_]

# PARAMETERS

**-n**, **--noindent**
> Remove indentation from output.

**-t**, **--indent-tab**
> Indent with tabs.

**-s** _n_, **--indent-spaces** _n_
> Indent with n spaces.

**-o**, **--omit-decl**
> Omit XML declaration.

**-D**, **--dropdtd**
> Remove DTD declarations.

**-R**, **--recover**
> Try to recover malformed XML.

**-C**, **--nocdata**
> Convert CDATA sections to text nodes.

**-N**, **--nsclean**
> Remove redundant namespace declarations.

**-e** _encoding_, **--encode** _encoding_
> Output in specified encoding (e.g., utf-8).

**-H**, **--html**
> Treat input as HTML.

# DESCRIPTION

**xml format** (also invoked as **xml fo**) pretty-prints XML documents. Part of the xmlstarlet toolkit. Reformats XML with proper indentation and line breaks for readability. Can also recover malformed XML and convert between encodings.

# SEE ALSO

[xml-validate](/man/xml-validate)(1), [xml-select](/man/xml-select)(1), [xmllint](/man/xmllint)(1), [xmlstarlet](/man/xmlstarlet)(1)

