# TAGLINE

parses and validates JSON input

# TLDR

**Parse generic JSON**

```cat [file.json] | jc --json```

**Validate JSON**

```jc --json < [file.json]```

**Parse with pretty output**

```jc --json -p < [file.json]```

**Parse JSON Lines**

```jc --jsonl < [file.jsonl]```

# SYNOPSIS

**jc** **--json** [_options_]

# PARAMETERS

**--json**
> Parse JSON input.

**--jsonl**
> Parse JSON Lines format.

**-p**, **--pretty**
> Pretty print output.

**-r**, **--raw**
> Raw output mode.

**--help**
> Display help information.

# DESCRIPTION

**jc --json** parses and validates JSON input. It's the JSON passthrough parser in jc for format validation and normalization.

The parser accepts JSON from stdin and outputs formatted JSON. Useful for validating or reformatting JSON data.

# CAVEATS

Part of jc toolkit. JSON passthrough parser. Mostly for validation/formatting.

# HISTORY

The JSON parser was added to **jc** to provide a complete set of parsers including JSON input handling.

# SEE ALSO

[jc](/man/jc)(1), [jq](/man/jq)(1), [jsonlint](/man/jsonlint)(1)
