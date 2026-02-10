# TAGLINE

validates and formats JSON files

# TLDR

**Validate JSON file**

```jsonlint [file.json]```

**Validate with quiet mode**

```jsonlint -q [file.json]```

**Validate and format**

```jsonlint -i [file.json]```

**Compact output**

```jsonlint -c [file.json]```

**Sort keys**

```jsonlint -s [file.json]```

**Validate multiple files**

```jsonlint [file1.json] [file2.json]```

# SYNOPSIS

**jsonlint** [_options_] [_files_...]

# PARAMETERS

**-q**, **--quiet**
> No output, just exit code.

**-c**, **--compact**
> Compact output.

**-i**, **--in-place**
> Format and overwrite file.

**-s**, **--sort-keys**
> Sort object keys.

**-t** _chars_
> Tab characters for indent.

**-e** _env_
> Use environment for input.

**-p**, **--pretty-print**
> Pretty print output.

**-V**, **--validate**
> Validate only, no output.

# DESCRIPTION

**jsonlint** validates and formats JSON files. It checks for syntax errors and can pretty-print or compact JSON data.

The tool is useful for validating configuration files, API responses, and data files. It provides clear error messages for malformed JSON.

# VALIDATION ERRORS

```
$ jsonlint bad.json
Error: Parse error on line 3:
...  "name": "test"  "value": 42
---------------------^
Expecting 'EOF', '}', ',', ']', got 'STRING'
```

# CAVEATS

Multiple implementations exist (Node.js, Python). Doesn't validate against JSON Schema. Comments not supported (per JSON spec).

# HISTORY

Various jsonlint implementations exist. The concept originated from JavaScript linting tools. Popular implementations include the npm jsonlint package by Zach Carter.

# SEE ALSO

[jq](/man/jq)(1), [python-json](/man/python-json)(1), [ajv](/man/ajv)(1)
