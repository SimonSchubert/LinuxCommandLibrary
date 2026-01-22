# TLDR

**Pretty print JSON**

```python -m json.tool [file.json]```

**Format from stdin**

```echo '{"key":"value"}' | python -m json.tool```

**Compact output**

```python -m json.tool --compact [file.json]```

**Sort keys**

```python -m json.tool --sort-keys [file.json]```

# SYNOPSIS

**python -m json.tool** [_options_] [_file_]

# PARAMETERS

_FILE_
> JSON file to format.

**--sort-keys**
> Sort object keys.

**--compact**
> Compact output.

**--indent** _N_
> Indentation level.

**--no-ensure-ascii**
> Allow non-ASCII.

# DESCRIPTION

**python -m json.tool** validates and pretty-prints JSON. Built-in formatter.

The tool formats JSON output. Validates JSON syntax.

json.tool formats JSON.

# CAVEATS

Part of Python standard library. Basic functionality.

# HISTORY

json.tool is a **Python standard library** module for JSON formatting.

# SEE ALSO

[jq](/man/jq)(1), [python](/man/python)(1)

