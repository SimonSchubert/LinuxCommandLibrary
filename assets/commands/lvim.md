# TAGLINE

pre-configured Neovim distribution that provides an IDE-like experience out of

# TLDR

**Start LunarVim**

```lvim```

**Open a file** for editing

```lvim [file.py]```

**Open file at specific line**

```lvim +[10] [file.py]```

**Update LunarVim** from command line

```lvim +LvimUpdate +q```

**Open multiple files** in tabs

```lvim -p [file1.py] [file2.py]```

**Start in diff mode**

```lvim -d [file1.py] [file2.py]```

**Run headless** for scripting

```lvim --headless +'lua print("hello")' +q```

# SYNOPSIS

**lvim** [_options_] [_file_...]

# PARAMETERS

**+**[_num_]
> Position cursor on specified line number.

**+/**_pattern_
> Position cursor on first line matching pattern.

**-c** _command_
> Execute command after loading file.

**-o**[_N_]
> Open N windows split horizontally.

**-O**[_N_]
> Open N windows split vertically.

**-p**[_N_]
> Open N tab pages.

**-d**
> Start in diff mode.

**-R**
> Readonly mode.

**--headless**
> Start without UI for scripting.

**--clean**
> Start with minimal configuration.

**-u** _config_
> Use alternate config file.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Show version information.

# EDITOR COMMANDS

**:LvimUpdate**
> Update LunarVim to latest version.

**:LvimSyncCorePlugins**
> Refresh core plugins.

**:LvimCacheReset**
> Clear cached data.

**:LvimInfo**
> Display LunarVim information.

**:LvimDocs**
> Open documentation.

# DESCRIPTION

**lvim** (LunarVim) is a pre-configured Neovim distribution that provides an IDE-like experience out of the box. It includes curated plugins, keybindings, and sensible defaults while remaining fully customizable.

LunarVim includes built-in support for LSP (Language Server Protocol), providing intelligent code completion, diagnostics, and refactoring. Treesitter provides advanced syntax highlighting and code navigation. The which-key plugin displays available keybindings contextually.

Configuration is done via **~/.config/lvim/config.lua** using Lua. The **lvim** global object exposes settings for plugins, keybindings, and editor options. Custom plugins can be added through the lvim.plugins table.

Since LunarVim is built on Neovim, all Neovim command-line options are supported. The editor inherits Vim's modal editing paradigm with Normal, Insert, Visual, and Command-line modes.

# CAVEATS

Requires Neovim 0.9.0 or higher, along with git, make, pip, npm, node, cargo, and ripgrep. Initial installation downloads and compiles multiple plugins, requiring internet connectivity. Updates may occasionally require manual intervention if breaking changes occur.

# HISTORY

LunarVim was created in **2021** by Christian Chiarulli as a way to provide a batteries-included Neovim experience. It gained popularity as a more approachable alternative to building a custom Neovim configuration from scratch. The project emphasizes community-driven development with an active Discord community and regular releases. Version 1.4 was released in **May 2024**.

# SEE ALSO

[neovim](/man/neovim)(1), [lazyvim](/man/lazyvim)(1), [spacevim](/man/spacevim)(1), [vim](/man/vim)(1)
