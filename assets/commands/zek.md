# TAGLINE

Generate Go structs from XML documents

# TLDR

**Generate Go struct from XML file**

```zek [file.xml]```

**Generate struct from XML stdin**

```cat [file.xml] | zek```

**Generate with custom struct name**

```zek -n [StructName] [file.xml]```

**Add comments with example values**

```zek -e [file.xml]```

**Read from URL**

```zek [https://example.com/feed.xml]```

**Infer one struct from several files** and write it to a package

```zek -P [main] -o [struct.go] [a.xml] [b.xml]```

**Write out a runnable example program**

```zek -p [file.xml] > [sample.go]```

# SYNOPSIS

**zek** [_options_] [_file_|_url_...]

# PARAMETERS

**-n** _name_
> Use a different name for the top-level struct.

**-e**
> Add comments with examples.

**-max-examples** _n_
> Limit the number of examples (default 10).

**-x** _n_
> Maximum characters per example (default 25).

**-u**
> Filter out duplicated examples.

**-j**
> Add JSON tags.

**-C**
> Emit a less compact struct. Compact output is the default since 0.1.7, so **-c** is a no-op.

**-m**
> Omit empty Text fields.

**-t** _tag_
> Emit the struct for the tag matching this name.

**-I**
> Use verbatim innerxml instead of chardata.

**-P** _package_
> Write out the struct within a package with the given name.

**-o** _file_
> Write to an output file, not stdout.

**-p**
> Write out an example program.

**-S** _n_
> Read at most this many tags, approximately (0 is unlimited).

**-s**
> Strict parsing and writing.

**-F**
> Skip formatting.

**-B**
> Use a fixed banner string, for example for CI.

**-d**
> Debug output.

**-version**
> Show version.

# DESCRIPTION

**zek** generates Go struct definitions from XML documents. Given one or more XML files or URLs, it produces a single struct with xml struct tags, handling nested elements, attributes and repeated elements (slices). Multiple inputs are combined for schema inference across files.

This is useful for quickly creating Go types for consuming XML APIs, parsing XML data files, or working with XML-based formats like RSS, Atom, or SOAP. Providing representative XML with all possible fields yields the best results.

# CAVEATS

There is no type inference: everything is accessible as a string. Recursive types are not supported.

The generated struct works best for reading XML. Upstream describes zek as an experimental prototype.

Fields not present in the sample XML will be missing from the struct.

# SEE ALSO

[xmllint](/man/xmllint)(1), [xq](/man/xq)(1), [xmlstarlet](/man/xmlstarlet)(1)

# RESOURCES

```[Source code](https://github.com/miku/zek)```

<!-- verified: 2026-11-09 -->
