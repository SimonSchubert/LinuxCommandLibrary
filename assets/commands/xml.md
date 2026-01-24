# TLDR

**Validate XML**

```xml val [file.xml]```

**Format/pretty print**

```xml fo [file.xml]```

**XPath query**

```xml sel -t -v "[//element]" [file.xml]```

**Transform with XSLT**

```xml tr [transform.xsl] [file.xml]```

**Edit in place**

```xml ed -u "[//node]" -v "[value]" [file.xml]```

# SYNOPSIS

**xml** _command_ [_options_] _files_

# PARAMETERS

**val**
> Validate.

**fo**
> Format.

**sel**
> Select (XPath).

**tr**
> Transform.

**ed**
> Edit.

**-t** **-v** _XPATH_
> Template value.

# DESCRIPTION

**xml** is XMLStarlet. It processes XML.

Validation. Schema checking.

Formatting. Pretty printing.

XPath queries. Select data.

XSLT transform. Apply stylesheets.

# CAVEATS

XMLStarlet specific. Complex XPath syntax. Many subcommands.

# HISTORY

**XMLStarlet** (xml command) is a command-line XML toolkit for querying, validating, and transforming XML.

# SEE ALSO

[xmllint](/man/xmllint)(1), [xsltproc](/man/xsltproc)(1), [jq](/man/jq)(1)
