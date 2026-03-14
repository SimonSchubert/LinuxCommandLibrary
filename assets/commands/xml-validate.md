# TAGLINE

Validate XML against schemas

# TLDR

**Validate against embedded DTD**

```xml val [file.xml]```

**Validate against an XSD schema**

```xml val --xsd [schema.xsd] [file.xml]```

**Validate against a RelaxNG schema**

```xml val --relaxng [schema.rng] [file.xml]```

**Check well-formedness only** (no schema validation)

```xml val --well-formed [file.xml]```

**Validate multiple files**

```xml val [file1.xml] [file2.xml]```

**Validate using embedded schema reference**

```xml val -E [file.xml]```

# SYNOPSIS

**xml val** [_options_] _file_...

# PARAMETERS

**--xsd** _file_
> Validate against XML Schema.

**--dtd** _file_
> Validate against DTD.

**--relaxng** _file_
> Validate against RelaxNG schema.

**--well-formed**
> Check well-formedness only.

**-E**, **--embed**
> Use embedded schema.

**-e**, **--err**
> Print errors.

# DESCRIPTION

**xml val** (or `xml validate`) validates XML documents against schemas. Part of the XMLStarlet toolkit. Supports DTD, XML Schema (XSD), and RelaxNG validation. Returns exit code 0 if valid, non-zero otherwise.

# SEE ALSO

[xml-format](/man/xml-format)(1), [xmllint](/man/xmllint)(1)

