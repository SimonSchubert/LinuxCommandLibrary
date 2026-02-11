# TAGLINE

Validate and pretty-print JSON data

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

**python -m json.tool** is a built-in Python module that validates and pretty-prints JSON data. It reads JSON from a file argument or standard input, checks for syntax errors, and outputs a formatted version with proper indentation for readability.

The tool is useful for quickly inspecting API responses, configuration files, or any JSON output piped from other commands. Options control key sorting, indentation depth, and compact output mode. Since it ships with Python's standard library, it requires no additional installation.

# CAVEATS

Part of Python standard library. Basic functionality.

# HISTORY

json.tool is a **Python standard library** module for JSON formatting.

# SEE ALSO

[jq](/man/jq)(1), [python](/man/python)(1)

