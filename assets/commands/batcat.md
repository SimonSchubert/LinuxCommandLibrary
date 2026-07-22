# TAGLINE

Debian/Ubuntu name for the bat file viewer

# TLDR

> On Debian and Ubuntu the **bat** binary is installed as **batcat**. All options below are **bat** options.

**Print** a file with syntax highlighting and line numbers

```batcat [path/to/file]```

**Concatenate** multiple files (like **cat**)

```batcat [file1] [file2]```

**Print** without decorations (no line numbers, headers, or grid)

```batcat --plain [path/to/file]```

**Show** non-printable characters

```batcat --show-all [path/to/file]```

**Highlight** a specific line range

```batcat --line-range [40:60] [path/to/file]```

**Force** a language for highlighting

```batcat --language [json] [path/to/file]```

**Make** the bat alias permanent in your shell config

```alias bat=batcat```

# SYNOPSIS

**batcat** [_options_] [_file_...]

# DESCRIPTION

**batcat** is the command name used by the **bat** binary on Debian and Ubuntu. The package ships the program as **batcat** because the name **bat** is already taken by the unrelated **bacula-console-qt** package. Functionally it is identical to **bat**: a **cat** clone with syntax highlighting, Git integration, automatic paging, and file headers.

Many distributions other than Debian/Ubuntu install it as **bat**. To use the **bat** name on Debian-based systems, add `alias bat=batcat` to your shell configuration, or create a symlink such as `~/.local/bin/bat`.

See **bat** for the full set of options and configuration. Common flags include **-p**/**--plain**, **-A**/**--show-all**, **-n**/**--number**, **--language**, **--theme**, **--style**, **--paging**, **--line-range**, and **--diff**.

# ENVIRONMENT

**BAT_THEME**
> Default syntax-highlighting theme.

**BAT_PAGER**
> Pager command used by bat (defaults to **less**).

**BAT_STYLE**
> Default value for the **--style** option.

# CONFIGURATION

**~/.config/bat/config**
> Default command-line options applied automatically. Shared with bat. Run `batcat --config-file` to print the active path.

# INSTALL

```apt: sudo apt install bat```

```dnf: sudo dnf install bat```

```pacman: sudo pacman -S bat```

```zypper: sudo zypper install bat```

```brew: brew install bat```

```nix: nix profile install nixpkgs#bat```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[bat](/man/bat)(1), [cat](/man/cat)(1), [less](/man/less)(1), [highlight](/man/highlight)(1)

# RESOURCES

```[Source code](https://github.com/sharkdp/bat)```

<!-- verified: 2026-06-19 -->
