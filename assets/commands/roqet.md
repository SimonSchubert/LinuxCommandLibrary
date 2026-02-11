# TAGLINE

Execute SPARQL and RDQL queries on RDF data

# TLDR

**Execute SPARQL query**

```roqet -i sparql "[query]" [data.rdf]```

**Query file**

```roqet -i sparql [query.rq] [data.rdf]```

**Query with results**

```roqet -r json -i sparql "[SELECT * WHERE { ?s ?p ?o }]" [data.rdf]```

**Explain query**

```roqet -e "[query]"```

# SYNOPSIS

**roqet** [_options_] [_query_] [_data_]

# PARAMETERS

**-i**, **--input** _format_
> Query format (sparql, rdql).

**-r**, **--results** _format_
> Output format (xml, json, csv).

**-e**, **--exec** _query_
> Execute query string.

**-D**, **--data** _uri_
> Data source.

**-d**, **--dump-query**
> Show parsed query.

# DESCRIPTION

**roqet** is a SPARQL/RDQL query utility from the Redland RDF library. It executes queries against RDF data and outputs results in various formats.

Part of Redland RDF libraries.

# EXAMPLES

```bash
# Simple SPARQL query
roqet -i sparql "SELECT * WHERE { ?s ?p ?o } LIMIT 10" data.rdf

# Query from file
roqet -i sparql query.rq data.ttl

# JSON results
roqet -r json -i sparql "SELECT * WHERE { ?s ?p ?o }" data.rdf

# Query remote endpoint
roqet -i sparql "SELECT * WHERE { ?s ?p ?o } LIMIT 5" \
  -D http://dbpedia.org/sparql

# Explain query
roqet -d "SELECT * WHERE { ?s ?p ?o }"
```

# OUTPUT FORMATS

```
xml    - SPARQL Results XML
json   - SPARQL Results JSON
csv    - Comma-separated values
tsv    - Tab-separated values
```

# CAVEATS

Part of Redland RDF libraries. SPARQL 1.0 support. Use rapper for parsing only.

# HISTORY

roqet is part of **Rasqal** RDF query library by **Dave Beckett** within the Redland framework.

# SEE ALSO

[rapper](/man/rapper)(1), [rdfproc](/man/rdfproc)(1), [redland](/man/redland)(3)
