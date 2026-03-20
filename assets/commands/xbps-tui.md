# TAGLINE

TUI wrapper for Void Linux package manager

# TLDR

**Launch the package manager TUI**

```xbps-tui```

**Launch in dry-run mode** (preview actions without executing)

```xbps-tui --dry-run```

# SYNOPSIS

**xbps-tui** [_options_]

# PARAMETERS

**--dry-run**
> Preview install/remove actions without executing them.

# DESCRIPTION

**xbps-tui** is an interactive terminal frontend for the xbps package manager used by Void Linux. It supports fuzzy searching packages by name and description, filtering by installed, updatable, or marked packages, and marking packages for installation or removal with root execution.

Press **/** or **Ctrl+f** to enter fuzzy search mode. Use **h**/**k** or arrow keys to filter between all packages, installed, updatable, marked for install, and marked for removal. Set **XBPS_TUI_DATA** environment variable for a custom data directory.

# HISTORY

**xbps-tui** was created by **lukeflo** and is written in **Rust**.

# SEE ALSO

[xbps-install](/man/xbps-install)(1), [xbps-query](/man/xbps-query)(1), [xbps-remove](/man/xbps-remove)(1)
