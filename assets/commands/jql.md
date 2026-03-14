# TAGLINE

JSON query language tool written in Rust

# TLDR

**Query a top-level field**

```cat [data.json] | jql '"name"'```

**Extract nested field**

```cat [data.json] | jql '"users".[0]."name"'```

**Select multiple fields**

```cat [data.json] | jql '"name" "age"'```

**Raw string output** (no JSON quotes)

```cat [data.json] | jql -r '"name"'```

**Read from file** instead of stdin

```jql '"name"' [data.json]```

# SYNOPSIS

**jql** [_options_] _selectors_

# PARAMETERS

_SELECTORS_
> JQL query expressions (keys must be double-quoted).

**-r**, **--raw-output**
> Output raw strings without JSON double-quotes.

**-s**, **--stream**
> Read a stream of JSON lines (one JSON object per line).

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**jql** is a JSON query language CLI tool written in Rust. It provides a simple syntax for extracting and manipulating JSON data. Key selectors must be double-quoted to be JSON-compliant.

The tool focuses on simplicity over jq's complexity. It supports dot notation for nesting, array indexing with ranges, flattening with **..**, and multiple selectors in a single query. Input is read from stdin or a file argument.

# CAVEATS

Syntax is different from jq and not interchangeable. Key selectors must always be double-quoted. The tool consumes JSON input and outputs JSON back; use **-r** for raw strings.

# HISTORY

jql was created as a simpler alternative to jq with a more intuitive query syntax for common JSON operations.

# SEE ALSO

[jq](/man/jq)(1), [gron](/man/gron)(1), [fx](/man/fx)(1)
