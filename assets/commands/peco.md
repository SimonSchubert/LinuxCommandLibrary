# TAGLINE

interactive filtering tool

# TLDR

**Interactive filter**

```ls | peco```

**Filter with query**

```history | peco --query "[pattern]"```

**Select file**

```find . -type f | peco | xargs [command]```

**With custom prompt**

```peco --prompt="Select> "```

# SYNOPSIS

**peco** [_options_]

# PARAMETERS

**--query** _STRING_
> Initial query.

**--prompt** _STRING_
> Custom prompt.

**--layout** _TYPE_
> Display layout (top-down, bottom-up).

**--initial-index** _N_
> Start at line N.

# DESCRIPTION

**peco** is an interactive filtering tool. Select from stdin with fuzzy matching.

The tool provides incremental search. Similar to fzf and percol.

# CAVEATS

Terminal UI. Similar to fzf. Go-based.

# HISTORY

peco was created as an **interactive grep** tool inspired by percol.

# SEE ALSO

[fzf](/man/fzf)(1), [percol](/man/percol)(1), [grep](/man/grep)(1)

