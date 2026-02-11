# TAGLINE

Parse and validate XML documents

# TLDR

**Check if an XML file is well-formed**

```xmllint [file.xml]```

**Format and pretty-print** an XML file

```xmllint --format [file.xml]```

**Validate against a DTD**

```xmllint --valid [file.xml]```

**Validate against an XSD schema**

```xmllint --schema [schema.xsd] [file.xml]```

**Extract data using XPath**

```xmllint --xpath "[//element/@attribute]" [file.xml]```

**Format in place** (output to same file)

```xmllint --format [file.xml] -o [file.xml]```

**Remove blank nodes** from output

```xmllint --noblanks [file.xml]```

# SYNOPSIS

**xmllint** [_options_] _xmlfile..._

# PARAMETERS

**--format**
> Reformat and reindent the output

**--valid**
> Validate against the DTD declared in the document

**--schema** _file_
> Validate against the specified XSD schema

**--relaxng** _file_
> Validate against a RelaxNG schema

**--dtdvalid** _file_
> Validate against the specified DTD

**--xpath** _expression_
> Evaluate XPath expression and print results

**--output** _file_, **-o** _file_
> Write output to specified file

**--noout**
> Suppress normal output (useful with validation)

**--noblanks**
> Remove ignorable blank nodes from output

**--encode** _encoding_
> Output in specified encoding

**--html**
> Parse input as HTML instead of XML

**--recover**
> Try to recover from parsing errors

**--nonet**
> Don't fetch external entities from network

**--c14n**
> Canonicalize output (for digital signatures)

**--shell**
> Enter interactive shell mode

**--version**
> Display version information

# DESCRIPTION

**xmllint** is a command-line XML parser and processor from the **libxml2** library. It can parse XML files to check for well-formedness, validate documents against DTDs or schemas (XSD, RelaxNG), format XML for readability, and query documents using XPath expressions.

The tool is indispensable for working with XML data in shell scripts and automated workflows. It can detect syntax errors, validate against various schema types, extract specific data using XPath, and transform or clean up XML output.

Common uses include validating configuration files, extracting data from XML APIs, formatting machine-generated XML for human readability, and preprocessing XML before further transformation with XSLT.

# CAVEATS

XPath support is limited to XPath 1.0; for XPath 2.0+ use tools like **saxon**. Large files may consume significant memory as the entire document is loaded. External entity expansion is enabled by default and can pose security risks with untrusted input; use **--nonet** and **--noent** flags for untrusted data. Some HTML parsing may require the **--html --recover** combination for malformed documents.

# HISTORY

**xmllint** was developed as part of the **libxml2** project, created by **Daniel Veillard** starting in **1998**. The library and its tools became the standard XML processing toolkit on Unix-like systems, used by projects like GNOME, PHP, and countless others. It is installed by default on most Linux distributions and macOS. The tool has been continuously maintained and updated to support evolving XML standards.

# SEE ALSO

[xsltproc](/man/xsltproc)(1), [xmlstarlet](/man/xmlstarlet)(1), [jq](/man/jq)(1), [yq](/man/yq)(1), [xq](/man/xq)(1)
