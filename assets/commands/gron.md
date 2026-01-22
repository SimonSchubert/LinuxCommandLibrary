# TLDR

**Convert JSON to gron**

```gron [file.json]```

**Pipe JSON to gron**

```curl [api/url] | gron```

**Filter with grep**

```gron [file.json] | grep [pattern]```

**Convert back to JSON**

```gron [file.json] | grep [filter] | gron -u```

**Colorize output**

```gron --color [file.json]```

# SYNOPSIS

**gron** [_options_] [_file_]

# PARAMETERS

_FILE_
> JSON file to process.

**-u**, **--ungron**
> Convert gron back to JSON.

**-s**, **--stream**
> Stream processing mode.

**--color**
> Colorize output.

**--no-sort**
> Preserve original order.

**-j**, **--json**
> Output as JSON.

**--help**
> Display help information.

# DESCRIPTION

**gron** transforms JSON into discrete path-value assignments, making it greppable. Each JSON value becomes a line showing its full path.

The tool enables searching JSON with standard Unix tools like grep. Results can be converted back to valid JSON using ungron mode.

gron makes JSON greppable.

# CAVEATS

Large JSON files produce many lines. Path syntax may vary. Ungron requires valid gron format.

# HISTORY

gron was created by **Tom Hudson** to solve the problem of searching complex JSON structures with traditional Unix tools.

# SEE ALSO

[jq](/man/jq)(1), [grep](/man/grep)(1), [json_pp](/man/json_pp)(1)
