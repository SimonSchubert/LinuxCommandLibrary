# TAGLINE

TUI for managing macOS Bluetooth devices via blueutil

# TLDR

**Launch** the Bluetooth manager TUI

```blueutil-tui```

# SYNOPSIS

**blueutil-tui**

# DESCRIPTION

**blueutil-tui** is a terminal user interface for managing Bluetooth devices on macOS. It provides an interactive interface built on top of **blueutil**, allowing users to view paired devices, connect/disconnect devices, and discover new devices.

The TUI displays a list of paired Bluetooth devices with their connection status and supports device search and refresh through keyboard shortcuts.

# CAVEATS

Only works on **macOS** as it depends on the **blueutil** command-line utility, which must be installed separately via **brew install blueutil**. Install with **pipx install blueutil-tui** or **uv tool install blueutil-tui**.

# HISTORY

**blueutil-tui** is a community-developed Python-based TUI wrapper around the **blueutil** CLI tool. It uses the **Textual** framework for terminal rendering.

# SEE ALSO

[bluetuith](/man/bluetuith)(1)
