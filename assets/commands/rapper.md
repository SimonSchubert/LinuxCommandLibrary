# TLDR

**Parse RDF/XML and output as N-Triples**

```rapper [input.rdf]```

**Convert Turtle to RDF/XML**

```rapper -i turtle -o rdfxml [input.ttl]```

**Convert RDF/XML to Turtle format**

```rapper -i rdfxml -o turtle [input.rdf]```

**Count triples** in an RDF file without output

```rapper -c [input.rdf]```

**Parse from a URL**

```rapper [https://example.org/data.rdf]```

**Guess input format** from file extension or content

```rapper -g [input_file]```

**Validate RDF without producing output**

```rapper -c -q [input.rdf]```

# SYNOPSIS

**rapper** [_options_] _INPUT-URI_ [_INPUT-BASE-URI_]

# PARAMETERS

**-i**, **--input** _FORMAT_
> Set input format: rdfxml, ntriples, turtle, rss-tag-soup, rdfa, grddl, guess

**-o**, **--output** _FORMAT_
> Set output format: ntriples (default), rdfxml, rdfxml-abbrev, turtle, rss-1.0, atom, dot, json, json-triples

**-c**, **--count**
> Only count triples, produce no output

**-g**, **--guess**
> Guess parser from URI or content type

**-q**, **--quiet**
> Suppress informational messages

**-e**, **--ignore-errors**
> Continue parsing despite errors

**-w**, **--ignore-warnings**
> Ignore warning messages

**-f**, **--feature** _FEATURE_
> Set parser/serializer feature

**-v**, **--version**
> Print version and exit

**-h**, **--help**
> Display help information

# DESCRIPTION

**rapper** is a command-line utility from the Raptor RDF Parser Toolkit for parsing and serializing RDF (Resource Description Framework) data. It reads RDF content in various formats and outputs the triples in a chosen serialization.

The tool supports multiple RDF syntaxes including RDF/XML, N-Triples, Turtle, RDFa, and RSS/Atom feeds. Input can be from local files, standard input (using '-'), or remote URIs when Raptor is built with network support.

Common uses include format conversion between RDF serializations, validation of RDF files, counting triples for analysis, and extracting RDF data from web pages containing RDFa markup.

# CAVEATS

The default input format is RDF/XML and output format is N-Triples. Always specify formats explicitly with **-i** and **-o** when converting between formats.

Large RDF files may consume significant memory as the entire graph may be loaded for certain serialization formats. N-Triples output streams data and is more memory-efficient.

Some features depend on how Raptor was compiled. Network URI fetching requires libcurl or similar library support at build time.

# HISTORY

Raptor was created by **Dave Beckett** starting in **2000** as part of the Redland RDF Libraries project. The toolkit became one of the most widely used RDF parsing libraries, providing the foundation for many semantic web applications. The name Raptor stands for "RDF Parser Toolkit for Redland."

# SEE ALSO

[rdfproc](/man/rdfproc)(1), [redland](/man/redland)(3), [roqet](/man/roqet)(1)
