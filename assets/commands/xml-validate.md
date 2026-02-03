# TLDR

**Validate against DTD**

```xml validate [file.xml]```

**Validate against schema**

```xml validate --xsd [schema.xsd] [file.xml]```

**Validate against RelaxNG**

```xml validate --relaxng [schema.rng] [file.xml]```

**Validate well-formedness only**

```xml validate --well-formed [file.xml]```

# SYNOPSIS

**xml validate** [_options_] _file_...

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

**xml validate** validates XML documents against schemas. Part of xmlstarlet toolkit. Supports DTD, XML Schema (XSD), and RelaxNG validation.

# SEE ALSO

[xml-format](/man/xml-format)(1), [xmllint](/man/xmllint)(1)

