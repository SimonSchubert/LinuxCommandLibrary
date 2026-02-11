# TAGLINE

XML processor using jq syntax

# TLDR

**Convert XML to JSON**

```xq . [file.xml]```

**Extract value using jq syntax**

```xq '.[key]' [file.xml]```

**Convert and format XML**

```cat [file.xml] | xq .```

**Convert JSON back to XML**

```xq -x . [file.json]```

**Process multiple XML files**

```xq . [a.xml] [b.xml]```

**Stream large XML document**

```xq . --xml-item-depth [2] [large.xml]```

**Wrap output in XML root element**

```xq -x --xml-root [root] . [file.json]```

# SYNOPSIS

**xq** [_options_] _jq-filter_ [_file_...]

# PARAMETERS

**-x**, **--xml-output**
> Transcode output back to XML.

**--xml-item-depth** _n_
> Stream items at depth n (for large documents).

**--xml-dtd**
> Preserve Document Type Definition.

**--xml-root** _name_
> Wrap XML output in element with this name.

**--xml-force-list** _element_
> Force element to always be a list.

**-i**, **--in-place**
> Edit files in place.

**-c**, **--compact-output**
> Compact JSON output.

**-r**, **--raw-output**
> Raw string output.

**--version**
> Display version.

**-h**, **--help**
> Display help.

# DESCRIPTION

**xq** is a command-line XML processor that wraps jq. It transcodes XML documents to JSON using xmltodict, pipes them through jq for processing, and optionally converts the result back to XML.

The tool enables using jq's powerful JSON query syntax on XML data. All standard jq filters and operations work on the converted JSON representation.

For large XML documents, the --xml-item-depth option enables streaming mode, processing elements at a specified depth without loading the entire document into memory.

Entity expansion and DTD resolution are disabled by default for security. Install via: `pip install yq` or `brew install python-yq`

# CAVEATS

XML attribute ordering may not be preserved. Some XML features have limited JSON representation. Part of the yq package (not the Go-based yq). Requires Python and jq.

# HISTORY

**xq** was created as part of the yq project by Andrey Kislyuk to provide jq-like functionality for YAML and XML. It fills the gap for command-line XML processing using the familiar jq syntax.

# SEE ALSO

[jq](/man/jq)(1), [yq](/man/yq)(1), [xmllint](/man/xmllint)(1), [xmlstarlet](/man/xmlstarlet)(1)
