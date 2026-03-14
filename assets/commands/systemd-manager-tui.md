# TAGLINE

TUI for managing systemd services via D-Bus

# TLDR

**Launch the service manager TUI**

```systemd-manager-tui```

# SYNOPSIS

**systemd-manager-tui**

# DESCRIPTION

**systemd-manager-tui** is a terminal user interface for managing systemd services. It supports viewing logs, listing services, viewing properties, editing unit files, and controlling service lifecycle (start, stop, restart, mask, unmask, enable, disable) using the D-Bus API.

Features Vim-like keyboard navigation and system/user unit switching. The interface is designed for keyboard-only operation.

# CAVEATS

Requires a running systemd system and D-Bus. Written in Rust.

# HISTORY

**systemd-manager-tui** was created by **matheus-git** and is written in **Rust**.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-tui](/man/systemctl-tui)(1), [journalctl](/man/journalctl)(1)
