# TAGLINE

pre-configured Neovim distribution with IDE-like features

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

**:LvimReload**
> Reload the LunarVim configuration.

**:LvimVersion**
> Show the LunarVim version.

**:LvimChangelog**
> Show the changelog.

# DESCRIPTION

**lvim** (LunarVim) is a pre-configured Neovim distribution that provides an IDE-like experience out of the box. It includes curated plugins, keybindings, and sensible defaults while remaining fully customizable.

LunarVim includes built-in support for LSP (Language Server Protocol), providing intelligent code completion, diagnostics, and refactoring. Treesitter provides advanced syntax highlighting and code navigation. The which-key plugin displays available keybindings contextually.

Configuration is done via **~/.config/lvim/config.lua** using Lua. The **lvim** global object exposes settings for plugins, keybindings, and editor options. Custom plugins can be added through the lvim.plugins table.

The **lvim** command is a wrapper script that runs **nvim -u** with LunarVim's own init.lua and forwards all other arguments, so Neovim command-line options work. The editor inherits Vim's modal editing paradigm with Normal, Insert, Visual, and Command-line modes.

# CAVEATS

Requires Neovim 0.9 on the 1.4 release branch and 0.10 on master, along with git, make, pip, npm, node, cargo, and ripgrep. Initial installation downloads and compiles multiple plugins, requiring internet connectivity. Updates may occasionally require manual intervention if breaking changes occur.

# HISTORY

LunarVim was created in **2021** by **Christian Chiarulli** as a way to provide a batteries-included Neovim experience. It gained popularity as a more approachable alternative to building a custom Neovim configuration from scratch. The repository is not formally archived, but the last release is **1.4.0** (May **2024**) and the last commit dates from June **2025**, so the project is effectively unmaintained.

# SEE ALSO

[nvim](/man/nvim)(1), [vim](/man/vim)(1)

# RESOURCES

```[Source code](https://github.com/LunarVim/LunarVim)```

<!-- verified: 2026-11-09 -->
