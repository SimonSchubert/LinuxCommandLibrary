# TAGLINE

Fast remote-first multi-host TUI log viewer with timeline histogram

# TLDR

**View logs from a remote host**

```nerdlog [user]@[host]```

**View logs from multiple hosts**

```nerdlog [user]@[host1] [user]@[host2]```

# SYNOPSIS

**nerdlog** [_options_] [_hosts_...]

# DESCRIPTION

**nerdlog** is a fast, remote-first, multi-host TUI log viewer with an interactive timeline histogram, inspired by Graylog and Kibana but without the bloat. It queries logs from multiple remote machines simultaneously over SSH, filters them by time range and patterns, and draws a visual timeline.

The tool reads system logs from /var/log/messages, /var/log/syslog, or journalctl, and uses standard GNU tools (bash, awk) on the remote side for filtering and histogram generation. No central server or agent installation is needed.

# CAVEATS

Requires SSH access to target hosts. Remote hosts must have bash and awk available.

# HISTORY

**nerdlog** was created by **dimonomid** and is written in **Go** using the tview library. It supports Linux, FreeBSD, macOS, and Windows (client only).

# SEE ALSO

[journalctl](/man/journalctl)(1), [lnav](/man/lnav)(1), [lazyjournal](/man/lazyjournal)(1)
