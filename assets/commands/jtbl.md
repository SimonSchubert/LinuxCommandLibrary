# TAGLINE

converts JSON to ASCII tables for terminal display

# TLDR

**Display JSON as table**

```cat [data.json] | jtbl```

**Truncate long values**

```cat [data.json] | jtbl -t```

**No headers**

```cat [data.json] | jtbl -n```

**Markdown table**

```cat [data.json] | jtbl -m```

**Wrap long text** at column count

```cat [data.json] | jtbl -w [80]```

**Rotate output** (one row per page, columns become rows)

```cat [data.json] | jtbl -r```

# SYNOPSIS

**jtbl** [_options_]

# PARAMETERS

**-t**, **--truncate**
> Truncate long cell values to fit terminal width.

**-n**, **--no-headers**
> Don't print column headers.

**-m**, **--markdown**
> Output as a Markdown table.

**-c**, **--csv**
> Output as CSV.

**-H**, **--html**
> Output as an HTML table.

**-r**, **--rotate**
> Rotate output so columns become rows (useful for wide tables).

**-w** _COLS_, **--wrap**=_COLS_
> Wrap long cell values at the specified column count.

**-q**, **--quiet**
> Suppress warning messages.

**-v**, **--version**
> Show version.

**--help**
> Display help information.

# DESCRIPTION

**jtbl** converts JSON to ASCII tables for terminal display. It formats JSON arrays as readable tables.

The tool pairs well with jc for displaying command output. It supports Markdown output for documentation.

# CAVEATS

Expects array of objects. Python-based. Works with jc output.

# HISTORY

jtbl was created by **Kelly Brazil** as a companion to jc for displaying JSON data as formatted tables.

# INSTALL

```brew: brew install jtbl```

```nix: nix profile install nixpkgs#jtbl```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[jc](/man/jc)(1), [jq](/man/jq)(1), [column](/man/column)(1)
