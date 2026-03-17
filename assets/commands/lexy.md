# TAGLINE

CLI for reading Learn X in Y Minutes tutorials in the terminal

# TLDR

**Read a tutorial** for a programming language

```lexy [language]```

**List all available languages**

```lexy list```

**Force update** the local documentation cache

```lexy update```

# SYNOPSIS

**lexy** [_options_] [_language_]

# PARAMETERS

_LANGUAGE_
> Name of the programming language to display the tutorial for.

**list**
> List all available languages using fzf for fuzzy selection.

**update**
> Force update the local documentation cache.

# DESCRIPTION

**lexy** is a lightweight CLI tool that fetches programming tutorials from "Learn X in Y Minutes" directly into your terminal. It allows you to quickly search, learn, and reference code examples without leaving your workflow.

Tutorials are cached locally in **$HOME/.config/lexy** and automatically updated every 60 days. Output includes syntax highlighting using bat, with a default Catppuccin Mocha color palette that can be customized via config.toml.

# CAVEATS

Requires an internet connection for the initial download and periodic updates. Depends on **bat** for syntax highlighting and **fzf** for fuzzy search. Tutorials are automatically updated every 60 days.

# HISTORY

**lexy** was created by **antoniorodr** and is written in **Rust**.

# SEE ALSO

[tldr](/man/tldr)(1), [cheat](/man/cheat)(1), [bat](/man/bat)(1)
