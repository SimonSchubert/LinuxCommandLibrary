# TAGLINE

Query JSON data using JSONPath expressions

# TLDR

**Query** a JSON file using JSONPath

```ajson '$.store.book[*].author' [file.json]```

Query from **stdin**

```echo '{"name":"John"}' | ajson '$.name'```

Filter with **condition**

```ajson '$.store.book[?(@.price < 10)]' [file.json]```

Read **multiline** JSON (one JSON object per line)

```ajson -m '$.name' [file.jsonl]```

**Evaluate** an expression over JSON data

```ajson 'avg($..price)' [file.json]```

# SYNOPSIS

**ajson** [**-mq**] _jsonpath_ [_file_]

# DESCRIPTION

**ajson** is a command-line tool written in Go for querying and evaluating JSON data using JSONPath expressions. It reads JSON from a file or stdin and supports filters, wildcards, recursive descent, and evaluation functions such as **avg**, **sum**, **length**, **first**, **last**, and math functions.

JSONPath syntax is similar to XPath for XML, with **$** representing the root object, **.** for property access, **[]** for array indexing or filtering, and **..** for recursive descent.

# PARAMETERS

**jsonpath**
> JSONPath expression or evaluation string to evaluate.

**file**
> Path to JSON file (reads stdin if omitted).

**-m**, **--multiline**
> Read input as multiline JSON, where each line is a separate valid JSON object.

**-q**, **--quiet**
> Do not print errors to stderr.

# CAVEATS

JSONPath implementations may vary in supported features. Complex nested queries may be slow on large files. Invalid JSONPath expressions produce errors rather than empty results.

# HISTORY

**ajson** implements the JSONPath query language proposed by Stefan Goessner in **2007**, providing command-line access to this popular JSON querying method.

# SEE ALSO

[jq](/man/jq)(1), [yq](/man/yq)(1), [fx](/man/fx)(1), [gron](/man/gron)(1)
