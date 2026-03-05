# TAGLINE

Like IntelliSense but for shells

# TLDR

**Search saved commands** interactively

```# Press Ctrl+Space in your shell```

**Bookmark the last command**

```# Press Ctrl+B in your shell```

**Fix the current command with AI**

```# Press Ctrl+X in your shell```

**Add a command template**

```intelli-shell add "[command_template]"```

**Search commands**

```intelli-shell search "[query]"```

# SYNOPSIS

**intelli-shell** _command_ [_options_]

# DESCRIPTION

**intelli-shell** is a command template and snippet manager that transforms your terminal into a structured, searchable library of commands. It works on **Bash**, **Zsh**, **Fish**, **Nushell**, and **PowerShell** with standalone binaries for Linux, macOS, and Windows.

Features include seamless shell integration with **Ctrl+Space** for search, **Ctrl+B** for bookmarking, dynamic variables with smart completions, AI-powered command generation, and workspace awareness. When a search query matches an alias, it is autocompleted instantly.

# CAVEATS

Shell plugin installation is required for keybinding integration. AI-powered features require an API key configuration. Workspace awareness relies on directory-specific configuration files.

# HISTORY

**intelli-shell** was created by **lasantosr** and is written in **Rust**. It was designed to bring IDE-like autocomplete and command management capabilities to the terminal shell.

# SEE ALSO

[fzf](/man/fzf)(1), [navi](/man/navi)(1), [hoard](/man/hoard)(1)
