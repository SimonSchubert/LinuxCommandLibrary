# TAGLINE

Make JSON greppable

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

**gron** transforms JSON into discrete path-value assignments, making it greppable with standard Unix tools. Each JSON value becomes a single line showing its full path from the root.

Results can be filtered with grep and converted back to valid JSON using ungron mode (**-u**), enabling powerful JSON querying without specialized tools.

# CAVEATS

Large JSON files produce many lines. Path syntax may vary. Ungron requires valid gron format.

# HISTORY

gron was created by **Tom Hudson** to solve the problem of searching complex JSON structures with traditional Unix tools.

# SEE ALSO

[jq](/man/jq)(1), [grep](/man/grep)(1), [json_pp](/man/json_pp)(1)
