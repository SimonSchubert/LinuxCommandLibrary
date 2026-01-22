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

**--help**
> Display help information.

# DESCRIPTION

**jc** converts command output to JSON format. It parses standard Unix commands and produces structured data.

The tool enables piping command output to JSON-aware tools like jq. It supports dozens of common commands.

jc converts CLI output to JSON.

# CAVEATS

Parser accuracy varies. Not all command versions supported. May need updates for format changes.

# HISTORY

jc was created by **Kelly Brazil** to enable JSON-based automation from traditional Unix command output.

# SEE ALSO

[jq](/man/jq)(1), [jo](/man/jo)(1), [gron](/man/gron)(1), [miller](/man/mlr)(1)
