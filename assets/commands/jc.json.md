# TAGLINE

JSON output produced by the jc command-output converter

# TLDR

**Convert command output to JSON**

```[dig example.com] | jc --[dig]```

**Use magic syntax** (jc runs the command itself)

```jc [dig example.com]```

**Pretty print** the JSON output

```jc -p [df -h]```

**Raw output** without type conversion or added fields

```jc -r [df -h]```

**Convert to YAML** instead of JSON

```jc -y [free -m]```

**Add metadata** (parser, timestamp, exit code) to the output

```jc -M [uptime]```

**Pipe the JSON into jq** to query it

```jc [ifconfig] | jq '[.[].name]'```

**Stream JSON Lines** from a streaming parser

```ls -l | jc --ls-s```

# SYNOPSIS

**jc** [_options_] **--**_parser_ [_file_]

**jc** [_options_] _command_ [_args_...]

# PARAMETERS

**-p**, **--pretty**
> Pretty format the JSON output.

**-r**, **--raw**
> Raw output: more literal values, typically strings with no additional semantic processing.

**-y**, **--yaml-out**
> Output YAML instead of JSON.

**-M**, **--meta-out**
> Add metadata (timestamp, parser name, magic command and exit code).

**-s**, **--slurp**
> Slurp multiple input lines into a single JSON array (supported parsers only).

**-q**, **--quiet**
> Suppress parser warnings (**-qq** also ignores streaming parser errors).

**-C**, **--force-color**, **-m**, **--monochrome**
> Force or disable colored JSON output.

**-a**, **--about**
> Print information about jc and its parsers as JSON.

**-h** **--**_parser_
> Show documentation, including the JSON schema, for a parser.

# DESCRIPTION

**jc** converts the output of many CLI tools, file types and common strings (such as **dig**, **ps**, **ifconfig**, **/etc/fstab**, CSV, YAML, TOML) into **JSON**, so it can be processed with **jq** or loaded directly into scripts. Every parser documents the JSON schema it emits, and values are converted to numbers, booleans and null where appropriate unless **--raw** is used.

Regular parsers print a single JSON document (an object or array). Streaming parsers, whose names end in **-s**, print **JSON Lines**: one compact JSON object per line, suitable for very large or continuous input. The same output is available as Python dictionaries via **jc.parse()** when jc is used as a library.

# CAVEATS

jc has **no JSON input parser** (no **--json** or **--jsonl** option): JSON is always its output format. To validate or reformat existing JSON, use **jq** or **jsonlint**. Schemas can change between jc versions, so pin the version in scripts that depend on specific fields.

# HISTORY

**jc** was created by **Kelly Brazil** and first released in **2019**. It is written in Python and also available as a library, and its JSON output is used by projects such as Ansible (**community.general.jc** filter).

# SEE ALSO

[jc](/man/jc)(1), [jq](/man/jq)(1), [yq](/man/yq)(1), [jsonlint](/man/jsonlint)(1)

# RESOURCES

```[Source code](https://github.com/kellyjonbrazil/jc)```

```[Documentation](https://kellyjonbrazil.github.io/jc/)```

<!-- verified: 2026-09-29 -->
