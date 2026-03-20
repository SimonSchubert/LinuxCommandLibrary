# TAGLINE

parses JSON5 format and outputs standard JSON

# TLDR

**Parse JSON5 to JSON**

```json5 [file.json5]```

**Convert from stdin**

```echo '{name: "test"}' | json5```

**Pretty print**

```json5 --space [2] [file.json5]```

**Validate only**

```json5 --validate [file.json5]```

**Indent with tabs**

```json5 --space t [file.json5]```

**Convert and write to file**

```json5 --out-file [output.json] [file.json5]```

# SYNOPSIS

**json5** [_options_] [_file_]

# PARAMETERS

_FILE_
> JSON5 file to parse. Reads from stdin if omitted.

**-s**, **--space** _N_
> Number of spaces to indent, or "t" for tabs.

**-v**, **--validate**
> Validate JSON5 syntax without outputting JSON.

**-o**, **--out-file** _FILE_
> Write output to file instead of stdout.

**-V**, **--version**
> Display version number.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**json5** parses JSON5 format and outputs standard JSON. JSON5 extends JSON with comments, trailing commas, and unquoted keys.

The tool converts more readable JSON5 configs to strict JSON. It validates and formats JSON5 input.

# CAVEATS

Node.js tool. JSON5 is a superset of JSON. Output is standard JSON.

# HISTORY

json5 implements the **JSON5** specification, designed to make JSON more human-friendly for configuration files.

# SEE ALSO

[jq](/man/jq)(1), [json_pp](/man/json_pp)(1), [jsonlint](/man/jsonlint)(1)
