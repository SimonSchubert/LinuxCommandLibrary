# TAGLINE

Blazingly fast general-purpose fuzzy finder TUI

# TLDR

**Fuzzy search files in the current directory**

```tv```

**Search through file contents**

```tv text```

**Find git repositories**

```tv git-repos```

# SYNOPSIS

**tv** [_options_] [_channel_] [_path_]

# DESCRIPTION

**television** is a fast, portable, and hackable fuzzy finder inspired by Neovim's Telescope plugin. It searches in real-time across files, text, git repos, environment variables, Docker containers, and more through a "channels" system. It uses the nucleo fuzzy matching library and ratatui for rendering.

# HISTORY

**television** was created by **Alex Pasmantier** (alexpasmantier) and is written in **Rust**.

# INSTALL

```pacman: sudo pacman -S television```

```brew: brew install television```

```nix: nix profile install nixpkgs#television```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[fzf](/man/fzf)(1)
