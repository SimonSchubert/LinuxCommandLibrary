# TLDR

**Display JSON as table**

```cat [data.json] | jtbl```

**Truncate long values**

```cat [data.json] | jtbl -t```

**No headers**

```cat [data.json] | jtbl -n```

**Markdown table**

```cat [data.json] | jtbl -m```

**Wrap long text**

```cat [data.json] | jtbl -w```

# SYNOPSIS

**jtbl** [_options_]

# PARAMETERS

**-t**, **--truncate**
> Truncate long cell values.

**-n**, **--no-headers**
> Don't print headers.

**-m**, **--markdown**
> Output Markdown table.

**-w**, **--wrap**
> Wrap text in cells.

**-v**, **--version**
> Show version.

**--help**
> Display help information.

# DESCRIPTION

**jtbl** converts JSON to ASCII tables for terminal display. It formats JSON arrays as readable tables.

The tool pairs well with jc for displaying command output. It supports Markdown output for documentation.

jtbl displays JSON as tables.

# CAVEATS

Expects array of objects. Python-based. Works with jc output.

# HISTORY

jtbl was created by **Kelly Brazil** as a companion to jc for displaying JSON data as formatted tables.

# SEE ALSO

[jc](/man/jc)(1), [jq](/man/jq)(1), [column](/man/column)(1), [tabulate](/man/tabulate)(1)
