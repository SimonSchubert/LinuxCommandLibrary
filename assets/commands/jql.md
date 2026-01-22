# TLDR

**Query JSON**

```cat [data.json] | jql '".name"'```

**Extract nested field**

```cat [data.json] | jql '".users[0].name"'```

**Array operations**

```cat [data.json] | jql '".items|length"'```

**Multiple queries**

```cat [data.json] | jql '".name" ".age"'```

**Raw output**

```cat [data.json] | jql -r '".name"'```

# SYNOPSIS

**jql** [_options_] _selectors_

# PARAMETERS

_SELECTORS_
> JQL query expressions.

**-r**, **--raw-output**
> Raw string output.

**-i** _FILE_
> Input file.

**--help**
> Display help information.

# DESCRIPTION

**jql** is a JSON query language tool written in Rust. It provides a simple syntax for extracting data from JSON.

The tool focuses on simplicity over jq's complexity. Queries use a straightforward dot notation.

jql extracts data from JSON.

# CAVEATS

Different syntax from jq. Rust-based. Simpler but less powerful.

# HISTORY

jql was created as a simpler alternative to jq with a more intuitive query syntax for common JSON operations.

# SEE ALSO

[jq](/man/jq)(1), [gron](/man/gron)(1), [fx](/man/fx)(1)
