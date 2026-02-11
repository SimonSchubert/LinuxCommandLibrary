# TAGLINE

Fast fuzzy finder written in Rust

# TLDR

**Start skim** to interactively select from input

```sk```

**Find files** and open selected in editor

```sk | xargs [vim]```

**Search with a preview** window

```sk --preview '[cat {}]'```

**Enable multi-select** mode (TAB to toggle)

```sk -m```

**Use as interactive command filter**

```sk -i -c '[rg --color=always {}]'```

**Pipe command output** through skim

```[ls -la] | sk```

**Search with regex** instead of fuzzy matching

```sk --regex```

**Generate shell completions**

```sk --shell [bash]```

# SYNOPSIS

**sk** [_options_]

# PARAMETERS

**-m**
> Enable multi-select mode; press TAB to select multiple items

**-i**
> Interactive mode; re-execute command as query changes

**-c** _command_
> Command to execute; {} is replaced with current query

**--ansi**
> Parse and display ANSI color codes in input

**--regex**
> Use regex patterns instead of fuzzy matching

**--preview** _command_
> Display preview of selected item; {} is replaced with item

**--preview-window** _opts_
> Configure preview pane (position, size, border)

**--bind** _key:action_
> Bind key to action; multiple bindings comma-separated

**--color** _scheme_
> Color scheme: dark, light, 16, bw, none, molokai

**--tiebreak** _criteria_
> Sorting criteria: score, index, begin, end, length

**--shell** _shell_
> Generate completions for bash, zsh, fish, powershell, elvish

**-q**, **--query** _string_
> Start with initial query string

**--height** _lines_
> Display height in lines or percentage

**--reverse**
> Reverse layout (prompt at top)

# DESCRIPTION

**sk** (skim) is a fast fuzzy finder written in Rust, serving as an alternative to fzf. It provides an interactive interface for filtering and selecting items from any list, making it ideal for file selection, command history search, and process management.

Search syntax supports AND (space-separated terms), OR (pipe-separated with spaces), exact match (prefix with **'**), and negation (prefix with **!**). For example, **src main** finds items containing both terms, while **.md$ | .markdown$** matches either extension.

The **-i** flag enables interactive mode where the command specified with **-c** is re-executed as you type. The **--preview** option shows a preview of the currently highlighted item, useful for viewing file contents or command help.

Skim can be used as a Rust library as well as a standalone binary, enabling integration into other Rust applications.

# CAVEATS

The fuzzy matching algorithm differs from fzf, so results may vary. Key bindings and some flags have slightly different behavior compared to fzf. Large input sets may affect performance depending on available memory.

# HISTORY

**skim** was created by **Jinzhou Zhang** (lotabout) and first released around **2016**. Written in **Rust**, it was developed as a faster, memory-safe alternative to fzf while maintaining compatibility with most fzf features. The project is actively maintained by the skim-rs community.

# SEE ALSO

[fzf](/man/fzf)(1), [grep](/man/grep)(1), [find](/man/find)(1), [rg](/man/rg)(1), [fd](/man/fd)(1)
