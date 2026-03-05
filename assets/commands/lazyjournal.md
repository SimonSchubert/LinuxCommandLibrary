# TAGLINE

TUI for viewing logs from journald, Docker, and Kubernetes

# TLDR

**Launch the log viewer**

```lazyjournal```

**View logs from a specific file**

```lazyjournal -f [path/to/logfile]```

# SYNOPSIS

**lazyjournal** [_options_]

# DESCRIPTION

**lazyjournal** is a TUI for reading logs from multiple sources including journald, auditd, file system, Docker and Podman containers, Compose stacks, and Kubernetes pods. It supports log highlighting and several filtering modes.

Filtering capabilities include case-sensitive exact matching, fuzzy search (similar to fzf), regex patterns, and timestamp-based date/time range selection. It can list all systemd services with their current state and stream new events in real time like **tail**.

# CAVEATS

Log source availability depends on the host system. Docker and Kubernetes log sources require their respective runtimes to be installed and running.

# HISTORY

**lazyjournal** was created by **Lifailon** and is written in **Go**. It is inspired by lazydocker and lazygit, and supports Linux, macOS, BSD, and Windows.

# SEE ALSO

[journalctl](/man/journalctl)(1), [lazydocker](/man/lazydocker)(1), [tail](/man/tail)(1)
