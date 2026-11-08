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

**python -m json.tool** [_options_] [_infile_] [_outfile_]

# PARAMETERS

_INFILE_
> JSON file to validate (default stdin).

_OUTFILE_
> Where to write the result (default stdout).

**--sort-keys**
> Sort object keys alphabetically.

**--json-lines**
> Parse every input line as a separate JSON object.

**--indent** _N_
> Spaces per indentation level (default 4).

**--tab**
> Indent with tabs.

**--no-indent**
> Single line with default separators.

**--compact**
> Suppress all whitespace.

**--no-ensure-ascii**
> Do not escape non-ASCII characters.

# DESCRIPTION

**python -m json.tool** is a built-in Python module that validates and pretty-prints JSON data. It reads JSON from a file argument or standard input, checks for syntax errors, and outputs a formatted version with proper indentation for readability.

The tool is useful for quickly inspecting API responses, configuration files, or any JSON output piped from other commands. Options control key sorting, indentation depth, and compact output mode. Since it ships with Python's standard library, it requires no additional installation.

# CAVEATS

**--indent**, **--tab**, **--no-indent**, **--compact** and **--no-ensure-ascii** need Python 3.9+, and the whitespace options are mutually exclusive.

# HISTORY

json.tool is a **Python standard library** module for JSON formatting.

# SEE ALSO

[jq](/man/jq)(1), [python](/man/python)(1)

# RESOURCES

```[Source code](https://github.com/python/cpython)```

```[Documentation](https://docs.python.org/3/library/json.html)```

<!-- verified: 2026-11-08 -->
