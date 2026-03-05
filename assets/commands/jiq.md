# TAGLINE

Interactive JSON query tool using jq expressions

# TLDR

**Query JSON from stdin**

```echo '[1, 2, 3]' | jiq```

**Query a JSON file**

```cat [path/to/file.json] | jiq```

**Query from a curl response**

```curl -s [https://api.example.com/data] | jiq```

# SYNOPSIS

**jiq** < _json_input_

# DESCRIPTION

**jiq** is an interactive JSON query tool that uses **jq** filter expressions. It reads JSON from stdin and provides a terminal interface where you can type jq queries and see the results update in real time as you type. This makes it easy to explore and drill down into complex JSON structures incrementally.

jiq requires **jq** to be installed and available in your PATH, as it delegates query execution to jq.

# CAVEATS

Requires **jq** to be installed separately. Only reads from stdin; cannot open files directly. The entire JSON input is loaded into memory.

# HISTORY

**jiq** was created by **fiatjaf** and is written in **Go**. It was inspired by **jid** (JSON incremental digger) but uses jq's query syntax instead of a custom one.

# SEE ALSO

[jq](/man/jq)(1), [fx](/man/fx)(1), [jaq](/man/jaq)(1)
