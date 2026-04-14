# TAGLINE

TUI for viewing logs from journald, Docker, and Kubernetes

# TLDR

**Launch the interactive log viewer**

```lazyjournal```

**Pipe logs and filter with fuzzy search**

```cat [/var/log/syslog] | lazyjournal -f "[error]"```

**Pipe logs and filter with regex**

```cat [/var/log/syslog] | lazyjournal -r "[error|fatal]"```

**Connect to a remote system via SSH**

```lazyjournal --ssh "[user@host -p 2222]"```

# SYNOPSIS

**lazyjournal** [_options_]

# PARAMETERS

**-f**
> Enable fuzzy search filtering mode (case-insensitive inexact matching, similar to fzf).

**-r**
> Enable regex filtering mode.

**-c**
> Enable output highlighting in command-line mode.

**-l**, **--logging**
> Write executed commands to a log file for debugging.

**-m**
> Disable mouse control.

**-t**, **--timezone-filter** _offset_
> Set UTC offset for date/time range filtering (default: `+00:00`).

**--ssh** _args_
> Connect to a remote system via SSH. Accepts standard SSH arguments as a single quoted string.

# DESCRIPTION

**lazyjournal** is a TUI for reading logs from multiple sources including journald, auditd, file system, Docker and Podman containers, Compose stacks, and Kubernetes pods. It supports log highlighting and several filtering modes.

Filtering capabilities include case-sensitive exact matching, fuzzy search (similar to fzf), regex patterns, and timestamp-based date/time range selection. It can list all systemd services with their current state and stream new events in real time like **tail**.

# CAVEATS

Log source availability depends on the host system. Docker and Kubernetes log sources require their respective runtimes to be installed and running.

# HISTORY

**lazyjournal** was created by **Lifailon** and is written in **Go**. It is inspired by lazydocker and lazygit, and supports Linux, macOS, BSD, and Windows.

# SEE ALSO

[journalctl](/man/journalctl)(1), [lazydocker](/man/lazydocker)(1), [lazygit](/man/lazygit)(1), [tail](/man/tail)(1)
