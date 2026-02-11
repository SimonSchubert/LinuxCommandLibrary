# TAGLINE

Generate Go structs from XML documents

# TLDR

**Generate Go struct from XML file**

```zek [file.xml]```

**Generate struct from XML stdin**

```cat [file.xml] | zek```

**Generate with custom struct name**

```zek -n [StructName] [file.xml]```

**Use compact output format**

```zek -c [file.xml]```

**Read from URL**

```zek [https://example.com/feed.xml]```

# SYNOPSIS

**zek** [_options_] [_file_|_url_]

# PARAMETERS

**-c**
> Compact output (minimize struct tags)

**-e**
> Add XMLName field to struct

**-n** _name_
> Use specified struct name (default: derived from root element)

**-p**
> Add xml.Name XMLName field for precise marshaling

**-t**
> Include type comments in output

**-x**
> Emit only the struct, no package declaration

**-max-examples** _n_
> Maximum examples to show in comments

**-version**
> Print version and exit

# DESCRIPTION

**zek** generates Go struct definitions from XML documents. It analyzes the XML structure and produces type-safe Go code that can unmarshal (and marshal) that XML format.

Given an XML file, zek infers the structure and generates appropriate Go types with proper xml struct tags. It handles nested elements, attributes, repeated elements (slices), and mixed content.

This is useful for quickly creating Go types for consuming XML APIs, parsing XML data files, or working with XML-based formats like RSS, Atom, or SOAP.

zek uses sampling to infer types, so providing representative XML with all possible fields yields the best results.

# CAVEATS

Type inference is heuristic. Rarely-used optional fields may be missed if not present in the sample XML.

Complex XML schemas with polymorphic elements or namespaces may require manual adjustment of generated structs.

For very large XML files, zek reads the entire document into memory for analysis.

Generated code should be reviewed and adjusted for production use, especially for null handling and validation.

# SEE ALSO

[xmllint](/man/xmllint)(1), [xq](/man/xq)(1), [xmlstarlet](/man/xmlstarlet)(1)
