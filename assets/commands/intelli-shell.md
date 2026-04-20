# TAGLINE

IntelliSense-style command template manager for your shell

# TLDR

**Search saved commands interactively (shell hotkey)**

```# Press Ctrl+Space in your shell```

**Bookmark the last executed command (shell hotkey)**

```# Press Ctrl+B in your shell```

**Fix the current command with AI (shell hotkey)**

```# Press Ctrl+X in your shell```

**Add a command template from the CLI**

```intelli-shell new "[command_template]" -d "[description]"```

**Search commands from the CLI**

```intelli-shell search "[query]"```

**Import commands from a file or URL**

```intelli-shell import [path_or_url]```

**Export your command library**

```intelli-shell export [path]```

# SYNOPSIS

**intelli-shell** _subcommand_ [_options_]

# SUBCOMMANDS

**new**
> Create a new command template.

**search**
> Search stored commands (optionally interactively).

**replace**
> Replace variables of a given command.

**import**
> Import commands from a file, URL, or Gist.

**export**
> Export commands to a file.

**fix**
> Use an LLM to suggest fixes for a command.

**completions**
> Generate shell completions.

# DESCRIPTION

**intelli-shell** is a cross-platform command template and snippet manager written in **Rust**. It turns your terminal into a searchable library of commands that can be recalled with a keybinding and expanded with parameterized variables.

It integrates with **Bash**, **Zsh**, **Fish**, **Nushell**, and **PowerShell**. Once the shell hook is installed, **Ctrl+Space** opens an interactive fuzzy search over your stored commands, **Ctrl+B** bookmarks the last executed line, and **Ctrl+X** asks a configured LLM to fix the current line.

Templates support dynamic variables such as `{{file}}` with optional suggestion generators, workspace-local command sets, and tag-based categorization.

# CAVEATS

Shell integration requires sourcing the hook script provided by **intelli-shell init** in your shell's rc file. AI-powered fixes require configuring an API key (OpenAI, Gemini, Anthropic, etc.) in **~/.config/intelli-shell/config.toml**. Workspace awareness relies on **.intellishell** files in project directories.

# HISTORY

**intelli-shell** is maintained by **lasantosr** and is written in **Rust**. It was created to bring IDE-like autocomplete and command management to the terminal.

# SEE ALSO

[fzf](/man/fzf)(1), [navi](/man/navi)(1), [atuin](/man/atuin)(1), [mcfly](/man/mcfly)(1)
