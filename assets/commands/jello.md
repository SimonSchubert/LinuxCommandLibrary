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

**Initialize empty dict**

```jello -i 'result = {}'```

**Output as lines**

```cat [data.json] | jello -l '_.items'```

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

**-c**
> Compact output.

**-i**
> Initialize mode.

**--help**
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
