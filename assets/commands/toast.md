# TAGLINE

batteries-included in-terminal IDE

# TLDR

**Open** the current directory

```toast```

Open a **project directory**

```toast [path/to/dir]```

Open a **file** (workspace is the git root when one exists)

```toast [path/to/file]```

Open a **new file** whose parent directory already exists

```toast [path/to/new-file.go]```

**Import a VSCode theme** into Toast's theme directory

```toast migrate-theme vscode [path/to/theme.json]```

Print the **version**

```toast --version```

# SYNOPSIS

**toast** [_path_]

**toast** **migrate-theme** **vscode** _theme.json_

# PARAMETERS

_path_
> File or directory to open. Defaults to the current directory. A file argument sets the workspace to the enclosing git repository when one is found, otherwise the file's parent directory. A path that does not exist is opened as a new buffer if its parent directory exists.

**migrate-theme vscode** _theme.json_
> Convert a VSCode theme JSON file and write it to `~/.config/toast/themes/`. Set `"theme"` in the config to the imported name to use it.

**-v**, **--version**
> Print the version and exit.

**-h**, **--help**
> Print usage and exit.

# DESCRIPTION

**toast** is a terminal IDE written in Go. It opens a file tree, tabbed buffers, tree-sitter syntax highlighting, and language-server features without a plugin setup. The binary is a Bubble Tea TUI; an experimental macOS **Toast.app** wraps the same editor in a bundled libghostty window.

Project-wide search shells out to **rg** (ripgrep). In-file find and replace, a command palette (`Ctrl+Shift+P`), Markdown preview for `.md` / `.markdown` / `.mdx`, and mouse support are built in.

When a managed language server is missing, Toast can install it for that language. Defaults cover Go (**gopls**), Python (**pyright-langserver**), JavaScript and TypeScript (**typescript-language-server**), Rust (**rust-analyzer**), Terraform (**terraform-ls**), and Markdown/plain text spell checking (**harper-ls**). Servers already on `$PATH` are used as-is. Set `"lsp": {}` in the config to disable all language servers, or add an entry to cover another language.

Built-in themes are **system** (derived from the terminal palette at runtime), **toast-dark**, and **toast-light**. The default theme is **toast-dark**.

# KEYBINDINGS

Defaults can be remapped or unbound in `~/.config/toast/config.json`. `Cmd` is accepted as `super` on macOS.

**Ctrl+P**
> Fuzzy quick-open for files in the workspace.

**Ctrl+Shift+P**
> Command palette over every editor action.

**Ctrl+S**
> Save the current buffer.

**Ctrl+W**
> Close the current tab.

**Ctrl+B**
> Toggle the file-tree sidebar.

**Ctrl+Shift+E**
> Move focus between the editor and the file tree.

**Ctrl+Shift+F**
> Project-wide search.

**Ctrl+F**
> Find and replace in the current file.

**Ctrl+G**
> Go to line.

**Ctrl+Shift+M**
> Toggle Markdown preview.

**Ctrl+Space**
> Trigger completion.

**Ctrl+Shift+K**
> Show hover documentation.

**F12**
> Go to definition at the cursor (`Ctrl`-click also follows a definition).

**Ctrl+Z** / **Ctrl+Y**
> Undo / redo.

**Ctrl+Alt+Left** / **Ctrl+Alt+Right**
> Previous / next tab.

**Ctrl+Q**
> Quit.

# CONFIGURATION

Toast reads `~/.config/toast/config.json` on startup. Missing keys fall back to defaults. Custom themes live in `~/.config/toast/themes/`.

```
{
  "theme": "toast-dark",
  "editor": {
    "tab_width": 4,
    "auto_indent": true,
    "auto_save": "auto",
    "auto_save_delay_ms": 300
  },
  "sidebar": {
    "visible": true,
    "width": 30
  },
  "keybindings": {
    "save": ["ctrl+s"],
    "quick_open": ["ctrl+p"],
    "quit": []
  },
  "lsp": {
    "zig": {
      "command": "zls",
      "args": [],
      "extensions": [".zig"]
    }
  },
  "ignored_patterns": [".git", "node_modules", "__pycache__", ".DS_Store"]
}
```

**auto_save** is `"auto"` (write dirty buffers after **auto_save_delay_ms** of inactivity; default 300) or `"manual"` (save only on `Ctrl+S`). An empty **keybindings** list unbinds that action. Omitting **lsp** keeps the managed defaults; `"lsp": {}` turns every language server off.

# CAVEATS

The project is in early development and still changes quickly.

The command name **toast** is shared with other tools. Distro packages and Homebrew core `toast` are typically the **libgsm** GSM 06.10 encoder or **stepchowfun/toast** (containerized task runner), not this editor. Install this Toast from its GitHub releases, by building from source, or with `brew install paradise-runner/tap/toast`.

Only the first path argument is used. Project-wide search needs **rg** on `$PATH`. Language-server install prompts need the matching toolchain (**go**, **npm**, **rustup**, and so on). The standalone macOS app is experimental and is not the primary interface.

# HISTORY

Toast was started by **paradise-runner** in **2026** as a batteries-included terminal IDE in Go, using the Bubble Tea TUI library.

# SEE ALSO

[hx](/man/hx)(1), [nvim](/man/nvim)(1), [micro](/man/micro)(1), [vim](/man/vim)(1), [rg](/man/rg)(1)

# RESOURCES

```[Source code](https://github.com/paradise-runner/toast)```

```[Homepage](https://paradise-runner.github.io/toast/)```

<!-- verified: 2026-09-11 -->
