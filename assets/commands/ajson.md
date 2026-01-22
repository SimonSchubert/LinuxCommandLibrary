# TLDR

**Query** JSON using JSONPath

```ajson '$.store.book[*].author' [file.json]```

Query from **stdin**

```echo '{"name":"John"}' | ajson '$.name'```

Get array **element**

```ajson '$[0]' [array.json]```

Filter with **condition**

```ajson '$.store.book[?(@.price < 10)]' [file.json]```

# SYNOPSIS

**ajson** [_options_] _jsonpath_ [_file_]

# DESCRIPTION

**ajson** is a command-line tool for querying JSON data using JSONPath expressions. It provides a powerful way to extract specific data from JSON structures, supporting filters, wildcards, and recursive descent.

JSONPath syntax is similar to XPath for XML, with **$** representing the root object, **.** for property access, and **[]** for array indexing or filtering.

# PARAMETERS

**jsonpath**
> JSONPath expression to evaluate

**file**
> JSON file to query (reads stdin if omitted)

**-c**, **--compact**
> Compact output (no pretty printing)

**-r**, **--raw**
> Output raw strings without quotes

# CAVEATS

JSONPath implementations may vary in supported features. Complex nested queries may be slow on large files. Invalid JSONPath expressions produce errors rather than empty results.

# HISTORY

**ajson** implements the JSONPath query language proposed by Stefan Goessner in **2007**, providing command-line access to this popular JSON querying method.

# SEE ALSO

[jq](/man/jq)(1), [jsonpath](/man/jsonpath)(1), [json](/man/json)(1)
