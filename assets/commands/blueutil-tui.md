# TAGLINE

TUI for managing macOS Bluetooth devices via blueutil

# TLDR

**Launch** the Bluetooth manager TUI

```blueutil-tui```

# SYNOPSIS

**blueutil-tui**

# DESCRIPTION

**blueutil-tui** is a terminal user interface for managing Bluetooth devices on macOS. It provides an interactive interface built on top of **blueutil**, allowing users to view paired devices, connect/disconnect devices, and toggle Bluetooth power without leaving the terminal.

The TUI displays a list of paired Bluetooth devices with their connection status and allows quick toggling through keyboard navigation.

# CAVEATS

Only works on **macOS** as it depends on the **blueutil** command-line utility, which must be installed separately (typically via Homebrew). Cannot discover new devices — only manages already-paired devices.

# HISTORY

**blueutil-tui** is a community-developed Rust-based TUI wrapper around the **blueutil** CLI tool. It uses the **ratatui** library for terminal rendering.

# SEE ALSO

[bluetuith](/man/bluetuith)(1), [blueutil](/man/blueutil)(1)
