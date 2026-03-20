# TAGLINE

Simplistic interactive filtering tool

# TLDR

**Interactive filter**

```ls | peco```

**Filter with query**

```history | peco --query "[pattern]"```

**Select file and open with a command**

```find . -type f | peco | xargs [command]```

**With custom prompt**

```peco --prompt="Select> "```

# SYNOPSIS

**peco** [_options_]

# PARAMETERS

**--query** _STRING_
> Initial query string.

**--prompt** _STRING_
> Custom prompt string.

**--layout** _TYPE_
> Display layout: top-down or bottom-up. Default is top-down.

**--initial-index** _N_
> Start selection at line N.

**--rcfile** _PATH_
> Path to the settings file.

**-b**, **--buffer-size** _N_
> Number of lines to keep in search buffer. Useful when piping from an infinite stream.

**--null**
> Expect NUL (\0) as separator for target/output.

**--select-1**
> Immediately select and exit if input contains only one item.

**--on-cancel** _ACTION_
> Action on user cancel: success or error. Default is success.

**--initial-filter** _FILTER_
> Specify the default filter (e.g., Regexp, SmartCase).

# DESCRIPTION

**peco** is an interactive filtering tool. Select from stdin with fuzzy matching.

The tool provides incremental search. Similar to fzf and percol.

# CAVEATS

Requires a terminal for interactive use. Written in Go. Configuration can be customized via a JSON config file (~/.config/peco/config.json).

# HISTORY

peco was created as an **interactive grep** tool inspired by percol.

# SEE ALSO

[fzf](/man/fzf)(1), [percol](/man/percol)(1), [grep](/man/grep)(1)

