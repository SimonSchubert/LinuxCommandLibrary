# TLDR

**Interactively explore JSON file**

```jid < [file.json]```

**Explore JSON from command output**

```curl -s [https://api.example.com/data] | jid```

**Explore with initial query**

```jid -q ".[0].name" < [file.json]```

**Output with monochrome**

```jid -M < [file.json]```

**Pretty print output**

```jid -p < [file.json]```

# SYNOPSIS

**jid** [_options_]

# PARAMETERS

**-q** _query_
> Initial query string to start with.

**-M**
> Monochrome output (no colors).

**-p**
> Pretty print the output JSON.

**-h**
> Display help information.

**-version**
> Display version information.

# KEYBOARD COMMANDS

**Tab**
> Trigger autocomplete suggestions.

**Ctrl+w**
> Delete word backward.

**Ctrl+u**
> Clear entire query line.

**Ctrl+f** / **Right**
> Move cursor forward.

**Ctrl+b** / **Left**
> Move cursor backward.

**Ctrl+a** / **Home**
> Jump to start of line.

**Ctrl+e** / **End**
> Jump to end of line.

**Ctrl+n** / **Down**
> Next suggestion.

**Ctrl+p** / **Up**
> Previous suggestion.

**Enter**
> Accept and output result.

**Ctrl+c**
> Exit without output.

# QUERY SYNTAX

**.**
> Access object property.

**.foo**
> Access property "foo".

**[0]**
> Access array index 0.

**.[0:5]**
> Array slice from index 0 to 5.

**.[]**
> Iterate all array elements.

**|**
> Pipe output to next filter.

# DESCRIPTION

**jid** (JSON Incremental Digger) is an interactive JSON query tool. It displays JSON data and provides real-time filtering with autocomplete as you type queries.

Unlike jq which runs queries non-interactively, jid shows immediate results as you build your query. Tab completion suggests available keys and indices, making it easy to explore unfamiliar JSON structures.

The query syntax follows jq conventions. Type **.** to access object keys, **[n]** for array indices, and **.[]** to iterate arrays. Autocomplete shows available options at each level.

When you press Enter, jid outputs the current filtered result to stdout, which can be piped to other commands. This makes it useful for interactively building jq queries.

# CAVEATS

Reads entire JSON into memory, so very large files may be slow. Query syntax is a subset of jq; some advanced jq features are not supported. Input must be valid JSON.

# HISTORY

jid was created by **simeji** and first released around **2016**. Written in Go, it was designed to make JSON exploration interactive rather than requiring query construction upfront. The project provides a bridge between exploring unknown JSON structures and building jq queries for automation.

# SEE ALSO

[jq](/man/jq)(1), [gojq](/man/gojq)(1), [jless](/man/jless)(1), [fx](/man/fx)(1)
