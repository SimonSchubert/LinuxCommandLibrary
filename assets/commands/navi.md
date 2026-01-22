# TLDR

**Browse** all available cheatsheets

```navi```

Browse the **navi cheatsheet** itself

```navi fn welcome```

**Print** a command without executing it

```navi --print```

Output **shell widget** source code

```navi widget [bash|zsh|fish]```

**Autoselect** best match for a query

```navi -q '[query]' --best-match```

**Add** a new cheatsheet repository

```navi repo add [url]```

# SYNOPSIS

**navi** [**--print**] [**--query** _query_] [**--best-match**] [_command_]

# PARAMETERS

**--print**
> Print selected command without executing

**-q, --query _query_**
> Filter cheatsheets by query string

**--best-match**
> Automatically select best matching snippet

**--path _path_**
> Use specified path for cheatsheets

**--fzf-overrides _opts_**
> Override fzf options

# COMMANDS

**fn welcome**
> Show navi's own cheatsheet

**widget _shell_**
> Output shell widget code for integration

**repo add _url_**
> Add cheatsheet repository

**repo browse**
> Browse available repositories

**info cheats-path**
> Show cheatsheet directory path

# DESCRIPTION

**navi** is an interactive cheatsheet tool for the command-line. It allows browsing through categorized command snippets with fuzzy search, variable substitution, and direct execution.

Cheatsheets are stored as simple text files with a specific format. The tool integrates with shell keybindings (Ctrl+G by default) for quick access. Custom cheatsheets can be added locally or from community repositories.

# CAVEATS

Requires fzf for fuzzy finding interface. Shell widget installation requires adding source command to shell config. Cheatsheets use a specific syntax for variable placeholders.

# HISTORY

**navi** was created by **Denis Isidoro** as a modern alternative to traditional cheatsheet tools. It emphasizes interactivity, fuzzy search, and community-contributed cheatsheets. Written in Rust for performance.

# SEE ALSO

[tldr](/man/tldr)(1), [cheat](/man/cheat)(1), [fzf](/man/fzf)(1)
