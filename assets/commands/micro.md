# TAGLINE

modern terminal text editor

# TLDR

**Open file**

```micro [file.txt]```

**Open at line**

```micro [file.txt]:[line]```

**Open multiple files**

```micro [file1.txt] [file2.txt]```

**Diff files**

```micro -diff [file1] [file2]```

**Read-only mode**

```micro -readonly [file.txt]```

**Show version**

```micro -version```

# SYNOPSIS

**micro** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files to edit. Append `:LINE` or `:LINE:COL` to jump to a position. A `+LINE` argument also works.

**-clean**
> Remove all configuration files (use with care).

**-config-dir** _PATH_
> Override the default config directory (`~/.config/micro`).

**-options**
> Print all available global options to stdout and exit.

**-debug**
> Open the editor with the log buffer (`Ctrl-E logbuffer`) shown.

**-readonly**
> Read-only mode.

**-plugin** _CMD_ [_PLUGIN..._]
> Manage plugins: `install`, `remove`, `update`, `list`, `available`, `search`.

**-multiopen** _GLOB_
> Open all files matching the glob pattern.

**-version**
> Show version information and exit.

**--help**
> Display help information.

# DESCRIPTION

**micro** is a modern terminal text editor written in Go that aims for the ease-of-use of nano with the power of richer editors. It supports common shortcuts (`Ctrl-S`, `Ctrl-C`, `Ctrl-V`, `Ctrl-Z`), mouse selection, multiple cursors, split panes, syntax highlighting for over 130 file types, and a Lua-based plugin system.

Settings are stored in `~/.config/micro/settings.json` and key bindings in `bindings.json` in the same directory. Most editor commands can also be invoked with `Ctrl-E` to open the command bar.

# CAVEATS

Single static binary; no external dependencies. Plugin system uses Lua and may not work for users who need vim-style modal editing.

# HISTORY

Micro was created by **Zachary Yedidia** as a modern, intuitive alternative to nano and vim.

# INSTALL

```apt: sudo apt install micro```

```dnf: sudo dnf install micro```

```pacman: sudo pacman -S micro```

```apk: sudo apk add micro```

```brew: brew install micro```

```nix: nix profile install nixpkgs#micro```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[nano](/man/nano)(1), [vim](/man/vim)(1), [emacs](/man/emacs)(1)

