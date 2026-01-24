# TLDR

**Select nodes** using an XPath expression

```xmlstarlet sel -t -v "[xpath]" [file.xml]```

**Format/pretty-print** an XML file

```xmlstarlet fo [file.xml]```

**Validate an XML file** against a schema

```xmlstarlet val -s [schema.xsd] [file.xml]```

**Edit an XML file** (update a node value)

```xmlstarlet ed -u "[xpath]" -v "[new_value]" [file.xml]```

**Transform XML** using an XSLT stylesheet

```xmlstarlet tr [stylesheet.xsl] [file.xml]```

**List element structure** of an XML document

```xmlstarlet el [file.xml]```

**Escape special characters** for XML

```echo "[text]" | xmlstarlet esc```

**Check well-formedness** of an XML file

```xmlstarlet val --well-formed [file.xml]```

# SYNOPSIS

**xmlstarlet** [_global_options_] _command_ [_command_options_] [_arguments_]

# PARAMETERS

**sel** (**select**)
> Select or query XML nodes using XPath expressions.

**ed** (**edit**)
> Edit XML documents by inserting, deleting, updating, or renaming nodes.

**tr** (**transform**)
> Perform XSLT transformations on XML documents.

**val** (**validate**)
> Validate XML documents against DTDs or XML Schemas.

**fo** (**format**)
> Format XML documents for readability with proper indentation.

**el** (**elements**)
> Display element structure of an XML document.

**c14n** (**canonic**)
> Canonicalize XML documents (C14N).

**ls** (**list**)
> List directory contents as XML.

**esc** (**escape**)
> Escape special XML characters in text.

**unesc** (**unescape**)
> Unescape XML entities to original characters.

**pyx**
> Convert XML to PYX format.

**p2x** (**depyx**)
> Convert PYX back to XML.

**--version**
> Display version information.

**--help**
> Display help message.

# DESCRIPTION

**XMLStarlet** is a command-line XML toolkit that provides Unix-style utilities for processing XML files. It allows querying, transforming, validating, and editing XML documents using familiar shell command patterns, similar to how grep, sed, and awk work with plain text.

The toolkit uses XPath for node selection and supports XSLT for transformations. It can validate against DTDs, XML Schema (XSD), and RelaxNG. Built on libxml2 and libxslt libraries, it provides robust XML processing capabilities.

Each command has its own options; use **xmlstarlet command --help** for detailed help on specific commands.

# CAVEATS

XMLStarlet requires well-formed XML input; malformed documents will cause errors. It primarily supports XPath 1.0 and XSLT 1.0, lacking features from newer specifications. Namespace handling can be complex and may require explicit prefix declarations.

# HISTORY

XMLStarlet was created by **Mikhail Grushinskiy** and first released in **2002**. It was developed to fill the need for command-line XML processing tools that could integrate with Unix shell workflows. The project is hosted on SourceForge and continues to be maintained as a standard utility for XML manipulation in scripting environments.

# SEE ALSO

[xsltproc](/man/xsltproc)(1), [xmllint](/man/xmllint)(1), [jq](/man/jq)(1), [yq](/man/yq)(1)
