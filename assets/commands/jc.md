# TAGLINE

converts command output to JSON format

# TLDR

**Parse command output**

```[command] | jc --[parser]```

**Parse ps output**

```ps aux | jc --ps```

**Parse ls output**

```ls -l | jc --ls```

**Parse ifconfig**

```ifconfig | jc --ifconfig```

**Parse with pretty output**

```df | jc --df -p```

**List available parsers**

```jc -a```

**Parse file contents**

```jc --[parser] < [file.txt]```

# SYNOPSIS

**jc** [_options_] --_parser_ [_file_]

# PARAMETERS

**--_PARSER_**
> Parser name (ps, ls, df, ifconfig, etc.).

**-a**, **--about**
> List available parsers.

**-p**, **--pretty**
> Pretty print JSON output.

**-r**, **--raw**
> Raw parser output.

**-q**, **--quiet**
> Suppress warnings.

**-m**, **--monochrome**
> Disable colored output.

**-M**, **--meta-out**
> Include metadata in output (timestamp, parser name, exit codes).

**-C**, **--force-color**
> Force colored output even when piping.

**-d**, **--debug**
> Enable debug mode (use -dd for verbose).

**-y**, **--yaml-out**
> Output in YAML format instead of JSON.

**-s**, **--slurp**
> Combine multiple lines into a JSON array.

**-u**, **--unbuffer**
> Disable output buffering for streaming.

**-v**, **--version**
> Display version information.

**--help**
> Display help information.

# DESCRIPTION

**jc** converts the output of dozens of standard Unix commands into structured JSON or YAML format, enabling piping to JSON-aware tools like jq for automated processing and scripting.

# CAVEATS

Parser accuracy varies. Not all command versions supported. May need updates for format changes.

# HISTORY

jc was created by **Kelly Brazil** to enable JSON-based automation from traditional Unix command output.

# SEE ALSO

[jq](/man/jq)(1), [jo](/man/jo)(1), [gron](/man/gron)(1), [mlr](/man/mlr)(1)
