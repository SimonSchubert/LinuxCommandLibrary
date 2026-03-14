# TAGLINE

filters JSON using Python expressions

# TLDR

**Filter JSON with Python**

```echo '[1,2,3]' | jello '[x*2 for x in _]'```

**Extract field**

```cat [data.json] | jello '_.name'```

**Filter array**

```cat [data.json] | jello '[x for x in _ if x["age"] > 30]'```

**Pretty print**

```cat [data.json] | jello -p```

**Print JSON schema** in grep-able format

```cat [data.json] | jello -s```

**Output as lines** (for bash array assignment)

```cat [data.json] | jello -l '_.items'```

**Load input from a file** instead of stdin

```jello -f [data.json] '_.name'```

# SYNOPSIS

**jello** [_options_] [_expression_]

# PARAMETERS

_EXPRESSION_
> Python expression (input is _).

**-p**, **--pretty**
> Pretty print output.

**-l**, **--lines**
> Output JSON lines.

**-r**, **--raw**
> Raw string output.

**-c**, **--compact**
> Compact JSON output (no pretty printing).

**-C**
> Force color output even when using pipes.

**-m**, **--mono**
> Monochrome output (no colors).

**-n**, **--nulls**
> Print selected null values.

**-s**, **--schema**
> Print the JSON schema in grep-able format.

**-t**, **--types**
> Print type annotations in schema view.

**-f** _FILE_
> Load input data from a JSON file.

**-q** _FILE_
> Load query from a file.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**jello** filters JSON using Python expressions. The input JSON is available as underscore (_) variable.

The tool combines jq-like filtering with Python's full expression power. It handles both JSON and JSON Lines.

# CAVEATS

Requires Python. Slower than jq for simple tasks. Underscore convention.

# HISTORY

jello was created by **Kelly Brazil** as a Python-based alternative to jq for users more familiar with Python syntax.

# SEE ALSO

[jq](/man/jq)(1), [jc](/man/jc)(1), [python](/man/python)(1), [gron](/man/gron)(1)
