# TAGLINE

Interactive process-aware network connection monitor

# TLDR

**Launch the network monitor**

```netshow```

**Run with elevated privileges** for full process info

```sudo netshow```

**Install and run via uvx**

```uvx netshow```

# SYNOPSIS

**netshow**

# DESCRIPTION

**netshow** is a lightweight, interactive TUI for monitoring active TCP connections and their associated processes with human-friendly service names (e.g. "Docker", "VS Code", "Plex"). It provides live connection counts, bandwidth monitoring with per-interface selection, and regex-powered search with live filtering.

When run as root, it uses psutil for full fidelity process information; as a regular user, it falls back to lsof. Selecting a connection reveals process details including path, PID, resource usage, and open files. The interface supports keyboard navigation, sortable columns, and configurable refresh intervals.

# CAVEATS

Full process information requires root privileges. Falls back to limited information when run unprivileged.

# HISTORY

**netshow** was created by **Taylor Wilsdon** and is written in **Python**. It can be installed via **uvx**, **pip**, or from source with **uv**.

# SEE ALSO

[ss](/man/ss)(8), [netstat](/man/netstat)(8), [lsof](/man/lsof)(8), [iftop](/man/iftop)(8), [nethogs](/man/nethogs)(8)
