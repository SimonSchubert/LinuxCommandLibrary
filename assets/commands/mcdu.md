# TAGLINE

Fast disk usage analyzer and developer cleanup TUI

# TLDR

**Scan the current directory**

```mcdu```

**Scan a specific path**

```mcdu [path/to/directory]```

# SYNOPSIS

**mcdu** [_options_] [_path_]

# DESCRIPTION

**mcdu** is a fast, modern disk usage analyzer with a TUI. It sorts directories by size with color-coded visualization and vim-style navigation. It searches for build artifacts and caches across **18+ ecosystems** including node_modules, Cargo target, and Docker build artifacts.

On macOS, it detects orphaned application data in ~/Library. For safe deletion, it supports dry runs, double confirmation, and JSON audit logs.

# CAVEATS

Deletion of build artifacts requires rebuilding those projects. Use dry run mode to preview before deleting.

# HISTORY

**mcdu** was created by **mikalv** and is written in **Rust**.

# SEE ALSO

[ncdu](/man/ncdu)(1), [du](/man/du)(1), [kondo](/man/kondo)(1)
