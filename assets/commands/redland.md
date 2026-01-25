# TLDR

**Parse RDF file**

```rapper -i rdfxml -o ntriples [file.rdf]```

**Query RDF store**

```roqet -i sparql "[query]" [data.rdf]```

**Process RDF**

```rdfproc [store] parse [file.rdf]```

# SYNOPSIS

Redland RDF Libraries and utilities

# UTILITIES

**rapper**
> RDF parser utility.

**roqet**
> RDF query utility.

**rdfproc**
> RDF processing utility.

# DESCRIPTION

**Redland** is a set of libraries for RDF (Resource Description Framework) processing. It provides parsing, storage, querying (SPARQL), and serialization of RDF data.

# EXAMPLES

```bash
# Parse RDF/XML to N-Triples
rapper -i rdfxml -o ntriples data.rdf

# Validate RDF
rapper -c data.rdf

# SPARQL query
roqet -i sparql "SELECT * WHERE { ?s ?p ?o } LIMIT 10" data.rdf

# Convert formats
rapper -i turtle -o rdfxml data.ttl > data.rdf

# Create and query store
rdfproc mystore parse data.rdf
rdfproc mystore query sparql - "SELECT * WHERE { ?s ?p ?o }"
```

# FORMATS

```
rdfxml   - RDF/XML
ntriples - N-Triples
turtle   - Turtle
nquads   - N-Quads
trig     - TriG
```

# CAVEATS

Library-based (librdf). Multiple tools for different tasks. SPARQL 1.0 support.

# HISTORY

Redland was created by **Dave Beckett** starting in 2000 as a comprehensive RDF library suite.

# SEE ALSO

[rapper](/man/rapper)(1), [roqet](/man/roqet)(1), [rdfproc](/man/rdfproc)(1)
