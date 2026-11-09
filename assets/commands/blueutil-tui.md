# TAGLINE

TUI for managing macOS Bluetooth devices via blueutil

# TLDR

**Launch** the Bluetooth manager TUI (the installed command is `btui`)

```btui```

# SYNOPSIS

**btui**

# DESCRIPTION

**blueutil-tui** is a terminal user interface for connecting Bluetooth devices on macOS. It is built on top of **blueutil** and is started with the **btui** command.

By default only paired devices are listed. Press **s** to search for more devices, **r** to refresh the view and remove unpaired devices from it again, and **ctrl+q** to quit.

# CAVEATS

Only works on **macOS** as it depends on the **blueutil** command-line utility, which must be installed separately via **brew install blueutil**. Install with **pipx install blueutil-tui** or **uv tool install blueutil-tui**. There is no **blueutil-tui** executable; the package only installs **btui**.

# HISTORY

**blueutil-tui** is a community-developed Python-based TUI wrapper around the **blueutil** CLI tool. It uses the **Textual** framework for terminal rendering.

# SEE ALSO

[bluetuith](/man/bluetuith)(1)

# RESOURCES

```[Source code](https://github.com/Zaloog/blueutil-tui)```

<!-- verified: 2026-11-09 -->
