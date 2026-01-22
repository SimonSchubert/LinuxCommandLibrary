# TLDR

**Pretty print JSON**

```cat [data.json] | jq '.'```

**Extract field**

```cat [data.json] | jq '.name'```

**Array indexing**

```cat [data.json] | jq '.[0]'```

**Filter array**

```cat [data.json] | jq '.[] | select(.age > 30)'```

**Map transformation**

```cat [data.json] | jq '[.[] | {name, age}]'```

**Raw string output**

```cat [data.json] | jq -r '.name'```

**Compact output**

```cat [data.json] | jq -c '.'```

# SYNOPSIS

**jq** [_options_] _filter_ [_file_...]

# PARAMETERS

_FILTER_
> jq filter expression.

_FILE_
> Input JSON file(s).

**-r**, **--raw-output**
> Output raw strings.

**-c**, **--compact-output**
> Compact output.

**-s**, **--slurp**
> Read entire input as array.

**-n**, **--null-input**
> No input.

**--arg** _NAME_ _VAL_
> Set variable.

**--help**
> Display help information.

# DESCRIPTION

**jq** is a command-line JSON processor. It filters, transforms, and formats JSON data.

The tool uses a powerful query language for JSON manipulation. It supports complex transformations and data extraction.

jq processes and transforms JSON.

# CAVEATS

Learning curve for complex queries. Streaming mode for large files. Null handling can be tricky.

# HISTORY

jq was created by **Stephen Dolan** as a sed/awk equivalent for JSON, becoming the standard CLI JSON tool.

# SEE ALSO

[jo](/man/jo)(1), [jc](/man/jc)(1), [yq](/man/yq)(1), [gron](/man/gron)(1)
