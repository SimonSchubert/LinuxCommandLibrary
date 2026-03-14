# TAGLINE

Fast, simple TUI for systemd services

# TLDR

**Launch the interactive service manager**

```systemctl-tui```

**Limit displayed units** by pattern

```systemctl-tui --limit-units "[pattern]"```

# SYNOPSIS

**systemctl-tui** [_options_]

# DESCRIPTION

**systemctl-tui** lets you quickly browse systemd service status and logs, start/stop/restart/reload services, and view/edit unit files from an interactive terminal interface.

It aims to do a small number of things well: viewing service status, reading logs, and managing services without needing to remember `systemctl` and `journalctl` subcommands.

# PARAMETERS

**--limit-units** _pattern_
> Limit the view to units matching the given pattern.

# CAVEATS

Linux only. WSL requires systemd to be enabled. Service management operations (start, stop, restart) require appropriate privileges.

# HISTORY

**systemctl-tui** was created by **Reilly Wood** (rgwood) and is written in **Rust**.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemd-manager-tui](/man/systemd-manager-tui)(1), [journalctl](/man/journalctl)(1)
