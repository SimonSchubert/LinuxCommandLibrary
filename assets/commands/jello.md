# TAGLINE

Filter JSON and JSON Lines data using Python expressions

# TLDR

**Filter JSON with Python**

```echo '[1,2,3]' | jello '[x*2 for x in _]'```

**Extract field**

```cat [data.json] | jello '_.name'```

**Filter array**

```cat [data.json] | jello '[x for x in _ if x["age"] > 30]'```

**Get nested value**

```cat [data.json] | jello '_.users[0].email'```

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

**-e**
> Empty data: initialize _ as None instead of reading input.

**-i**
> Initialize the data as a list for JSON Lines processing.

**-f** _FILE_
> Load input data from a JSON file.

**-q** _FILE_
> Load query from a file.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**jello** filters JSON and JSON Lines data using Python expressions. The input data is deserialized and made available as the underscore (**_**) variable. Any valid Python expression can be used to transform, filter, or extract data.

The tool combines jq-like filtering with Python's full expression power, including list comprehensions, dictionary methods, string operations, and standard library functions. It handles both JSON objects and JSON Lines (newline-delimited JSON) input.

# CAVEATS

Requires Python 3.6 or later. Slower than jq for simple tasks due to Python startup overhead. The underscore (**_**) variable name is a convention and cannot be changed. Importing external modules is not supported by default.

# HISTORY

jello was created by **Kelly Brazil** as a Python-based alternative to jq for users more familiar with Python syntax.

# SEE ALSO

[jq](/man/jq)(1), [jc](/man/jc)(1), [python](/man/python)(1), [gron](/man/gron)(1), [fx](/man/fx)(1), [yq](/man/yq)(1)
