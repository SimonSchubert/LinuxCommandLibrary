# TAGLINE

Process and query RDF data stores

# TLDR

**Query RDF store**

```rdfproc [store] query sparql - "[SELECT * WHERE { ?s ?p ?o }]"```

**Parse RDF file**

```rdfproc [store] parse [file.rdf]```

**Serialize to format**

```rdfproc [store] serialize ntriples```

**Add statement**

```rdfproc [store] add [subject] [predicate] [object]```

**Print all statements**

```rdfproc [store] print```

# SYNOPSIS

**rdfproc** [_options_] _store_ _command_ [_args_]

# PARAMETERS

**parse** _file_
> Parse and load RDF file.

**query** _lang_ _uri_ _query_
> Execute query.

**serialize** _format_
> Output in format.

**print**
> Print all statements.

**add** _s_ _p_ _o_
> Add triple.

**remove** _s_ _p_ _o_
> Remove triple.

# DESCRIPTION

**rdfproc** is a command-line utility for processing RDF data using the Redland RDF library. It can parse, store, query, and serialize RDF data.

# EXAMPLES

```bash
# Create store and parse file
rdfproc mystore parse data.rdf

# SPARQL query
rdfproc mystore query sparql - "SELECT * WHERE { ?s ?p ?o } LIMIT 10"

# Serialize as N-Triples
rdfproc mystore serialize ntriples

# Add triple
rdfproc mystore add "http://example.org/s" "http://example.org/p" "value"

# Print all
rdfproc mystore print
```

# FORMATS

```
rdfxml   - RDF/XML
ntriples - N-Triples
turtle   - Turtle
```

# CAVEATS

Part of Redland RDF libraries. Stores are persistent by default. Use - for stdin/stdout.

# HISTORY

rdfproc is part of **Redland** RDF Libraries by **Dave Beckett**, providing RDF processing since 2000.

# SEE ALSO

[rapper](/man/rapper)(1), [roqet](/man/roqet)(1), [redland](/man/redland)(3)
