# TAGLINE

command-line JSON processor

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

**jq** is a lightweight, command-line JSON processor often described as "sed for JSON." It reads JSON input from files or standard input, applies a filter expression, and writes the transformed result to standard output. Filters can be chained together with the pipe operator (`|`), enabling multi-step transformations that extract fields, restructure objects, compute values, and aggregate arrays in a single invocation.

The filter language supports object and array indexing (`.foo`, `.[0]`), iteration (`.[]`), conditionals (`if-then-else`), comparison and logic operators, built-in functions like `map`, `select`, `group_by`, and `sort_by`, as well as string interpolation and regular expressions. This makes jq well suited for tasks like extracting nested values from API responses, converting JSON records into CSV, or reshaping data for downstream tools. Output can be pretty-printed (the default), compacted with `-c` for piping, or emitted as raw strings with `-r` for shell integration.

# CAVEATS

Learning curve for complex queries. Streaming mode for large files. Null handling can be tricky.

# HISTORY

jq was created by **Stephen Dolan** as a sed/awk equivalent for JSON, becoming the standard CLI JSON tool.

# SEE ALSO

[jo](/man/jo)(1), [jc](/man/jc)(1), [yq](/man/yq)(1), [gron](/man/gron)(1)
