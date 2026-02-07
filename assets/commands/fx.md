# TAGLINE

interactive JSON viewer and processor

# TLDR

**Interactive JSON viewer**

```cat [data.json] | fx```

**Apply transformation**

```cat [data.json] | fx '.items'```

**Filter with JavaScript**

```cat [data.json] | fx 'x => x.filter(i => i.active)'```

**Select multiple fields**

```cat [data.json] | fx '.name' '.age'```

**Format output**

```cat [data.json] | fx .```

# SYNOPSIS

**fx** [_options_] [_expressions_...]

# PARAMETERS

_EXPRESSIONS_
> JavaScript expressions or dot notation paths.

**.**
> Pretty print JSON.

**-r**, **--raw**
> Output raw strings.

**-s**, **--slurp**
> Read multiple JSON objects.

**--help**
> Display help information.

# DESCRIPTION

**fx** is a command-line JSON processing tool with interactive browsing. It combines jq-like filtering with JavaScript expression support for flexible data manipulation.

In interactive mode, fx provides a navigable tree view of JSON data. Expression mode allows piping data through JavaScript transformations. Multiple expressions chain together.

fx handles streaming JSON, object manipulation, and data extraction with familiar JavaScript syntax.

# CAVEATS

Large files may be slow in interactive mode. JavaScript expressions have learning curve. Different from jq syntax.

# HISTORY

fx was created as a modern JSON tool combining interactive exploration with JavaScript-based processing, providing an alternative to jq for developers familiar with JavaScript.

# SEE ALSO

[jq](/man/jq)(1), [gron](/man/gron)(1), [jless](/man/jless)(1)
