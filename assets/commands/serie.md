# TAGLINE

Rich git commit graph in your terminal

# TLDR

**Display the commit graph for the current repository**

```serie```

**Limit display to a number of commits**

```serie -n [100]```

**Use topological commit ordering**

```serie -o topo```

**Use angular edge style with double-width cells**

```serie -s angular --graph-width double```

# SYNOPSIS

**serie** [_options_]

# PARAMETERS

**-n**, **--max-count** _NUMBER_
> Maximum number of commits to render.

**-p**, **--protocol** _TYPE_
> Image protocol: auto, iterm, kitty, or kitty-unicode. Default: auto.

**-o**, **--order** _TYPE_
> Commit ordering: chrono or topo. Default: chrono.

**-g**, **--graph-width** _TYPE_
> Cell width: auto, double, or single.

**-s**, **--graph-style** _TYPE_
> Edge style: rounded or angular.

**-i**, **--initial-selection** _TYPE_
> Commit selected on startup: latest or head.

**-h**, **--help**
> Show help text and exit.

**-V**, **--version**
> Print version and exit.

# CONFIGURATION

**$SERIE_CONFIG_FILE**
> Path to a TOML configuration file. Falls back to **$XDG_CONFIG_HOME/serie/config.toml** when unset.

# DESCRIPTION

**serie** renders rich git commit graphs directly in the terminal using terminal image protocols (iTerm2 inline images or Kitty graphics). It provides a visual alternative to **git log --graph --all** with customizable graph styles, commit ordering, and interactive browsing. Press **?** inside the TUI to view the keybinding cheat sheet.

# CAVEATS

Requires a terminal that supports the iTerm2 inline images protocol or the Kitty graphics protocol. Sixel graphics are not supported, and rendering does not work reliably inside terminal multiplexers (tmux, screen, Zellij) that strip image escape sequences.

# HISTORY

**serie** was created by **Kyosuke Fujimoto** (lusingander) and is written in **Rust**.

# INSTALL

```pacman: sudo pacman -S serie```

```apk: sudo apk add serie```

```brew: brew install serie```

```nix: nix profile install nixpkgs#serie```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[tig](/man/tig)(1), [lazygit](/man/lazygit)(1), [gitui](/man/gitui)(1)
