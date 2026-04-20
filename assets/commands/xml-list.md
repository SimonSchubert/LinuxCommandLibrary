# TAGLINE

List element structure of an XML document

# TLDR

**List all elements** in the document

```xml el [file.xml]```

**Show elements with attributes**

```xml el -a [file.xml]```

**Show elements with attributes and values**

```xml el -v [file.xml]```

**Show unique element paths**

```xml el -u [file.xml]```

# SYNOPSIS

**xml el** [_options_] _file_

# PARAMETERS

_FILE_
> XML input file (use - for stdin).

**-a**
> Show attributes of each element.

**-v**
> Show attributes and values.

**-u**
> Show only unique element paths.

# DESCRIPTION

**xml el** (also accepted as **xml elements** / **xml list**) prints the element structure of an XML document as XPath-like paths, one per line. It is part of the **xmlstarlet** toolkit.

Useful for quickly exploring unfamiliar XML files, producing summaries of element hierarchies, or generating templates for **xml sel** queries.

# SEE ALSO

[xml-elements](/man/xml-elements)(1), [xml-select](/man/xml-select)(1), [xmlstarlet](/man/xmlstarlet)(1)

