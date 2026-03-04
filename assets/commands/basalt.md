# TAGLINE

TUI for managing Obsidian vaults and notes from the terminal

# TLDR

**Launch basalt** to select and open an Obsidian vault

```basalt```

**Install via Cargo**

```cargo install basalt-tui```

# SYNOPSIS

**basalt**

# DESCRIPTION

**basalt** is a cross-platform terminal user interface (TUI) for managing Obsidian vaults and notes directly from the command line. It provides a minimalist interface with rendered markdown preview, vim-inspired navigation, and an experimental built-in editor.

The interface consists of three main panes: the **Explorer** pane on the left for browsing notes and folders, the **Note Editor** pane in the center for reading notes with rendered markdown, and the **Outline** pane on the right for navigating headings within a note. Only one pane has focus at a time, indicated by a thicker border.

basalt renders CommonMark and GitHub Flavored Markdown including headings, lists, task lists, code blocks, block quotes, Obsidian-style callouts, wiki-links, and inline code. Navigation uses vim-style keybindings: **j**/**k** or arrow keys to move, **Tab**/**Shift+Tab** to switch panes, **Enter** to open a note, **t** to toggle the explorer, **Ctrl+O** to toggle the outline, **Ctrl+U**/**Ctrl+D** for half-page scrolling, **s** to toggle sort order, and **r** to rename notes or folders. When renaming a note, all wiki-links referencing it are automatically updated throughout the vault.

Global shortcuts include **q** to quit, **?** to open the help modal, and **Ctrl+G** to open the vault selector for switching between Obsidian vaults. Custom commands can be configured to launch external editors or applications using the **exec:** and **spawn:** prefixes with dynamic variables **%vault**, **%note**, and **%note_path**.

Built with Rust using ratatui for terminal rendering and pulldown-cmark for markdown parsing. The project is organized into three crates: **basalt-core** for domain logic, **basalt-widgets** for reusable TUI widgets, and **basalt-tui** for the main application.

# CONFIGURATION

Configuration uses TOML files. The first discovered file takes precedence:

**macOS/Linux:**
> **$HOME/.basalt.toml** or **$XDG_CONFIG_HOME/basalt/config.toml**

**Windows:**
> **%USERPROFILE%\\.basalt.toml** or **%APPDATA%\\basalt\\config.toml**

**Top-level settings:**
> **experimental_editor** = true/false -- Enable the experimental built-in editor (default: false)
> **vim_mode** = true/false -- Activate vim-like keybinding preset (default: false)

**Sections:**
> **[global]** -- Universal keybindings applied across the application
> **[explorer]** -- Explorer pane keybindings and behavior
> **[outline]** -- Outline pane keybindings
> **[note_editor]** -- Note editor pane keybindings
> **[input_modal]** -- Input modal keybindings
> **[help_modal]** -- Help modal keybindings
> **[vault_selector_modal]** -- Vault selector keybindings

Each key mapping follows the format: **{ key = "binding", command = "action" }**. Custom commands use **exec:** for synchronous execution or **spawn:** for asynchronous launching.

# CAVEATS

The application is in active development. Images, tables, horizontal rules, footnotes, and HTML content are not rendered. External links are not clickable. Syntax highlighting in code blocks is not supported. Inline text styling (bold, italic, strikethrough) is parsed but not visually rendered in the terminal.

File operations are limited: creating, deleting, moving, copying, and searching notes are not supported. Only renaming and sorting are available.

The experimental editor has significant limitations including no undo/redo, no clipboard support, no text selection, no multi-line deletion, and non-customizable keybindings in edit mode. It operates on individual blocks rather than full documents.

Shell features like pipes, redirects, and command substitution are not supported in custom commands. Obsidian plugins, graph view, and the backlinks panel are not available.

# HISTORY

**basalt** was created by **Erik Juhani Nylund** with the repository established in **September 2023**. The first public release (v0.3.7) was published in **May 2025**. The project is written in Rust and licensed under the MIT license. As of early 2026, it has over 30 releases and around 1000 GitHub stars.

# SEE ALSO

[obsidian](/man/obsidian)(1), [glow](/man/glow)(1), [vim](/man/vim)(1), [nvim](/man/nvim)(1)
