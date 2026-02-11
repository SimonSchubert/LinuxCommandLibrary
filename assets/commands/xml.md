# TAGLINE

XMLStarlet command-line XML toolkit

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

**xml** is the main command of XMLStarlet, a comprehensive command-line XML toolkit for querying, editing, validating, and transforming XML documents. It provides a set of subcommands that cover common XML processing tasks without requiring a full programming language.

Key subcommands include **val** for validating XML against DTDs or schemas, **fo** for pretty-printing and reformatting XML, **sel** for selecting data using XPath expressions, **ed** for editing XML elements and attributes in place, and **tr** for applying XSLT transformations. Each subcommand has its own set of options tailored to its specific operation.

XMLStarlet is designed for shell scripting and automation, allowing XML processing tasks to be integrated into pipelines and build scripts. It reads from files or stdin and writes to stdout, following Unix conventions for composability.

# CAVEATS

XMLStarlet specific. Complex XPath syntax. Many subcommands.

# HISTORY

**XMLStarlet** (xml command) is a command-line XML toolkit for querying, validating, and transforming XML.

# SEE ALSO

[xmllint](/man/xmllint)(1), [xsltproc](/man/xsltproc)(1), [jq](/man/jq)(1)
