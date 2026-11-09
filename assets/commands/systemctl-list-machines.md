# TAGLINE

List registered machines and containers

# TLDR

List **all** machines

```systemctl list-machines```

List **specific** machine

```systemctl list-machines [machine]```

List **multiple** machines

```systemctl list-machines [machine1 machine2 ...]```

Filter by **pattern**

```systemctl list-machines '[pattern*]'```

# SYNOPSIS

**systemctl list-machines** [_PATTERN_...]

# DESCRIPTION

**systemctl list-machines** displays the host and all running local containers registered with systemd-machined. It shows the machine name, state, and the number of failed units and queued jobs.

This provides an overview of all systemd-managed machines, including the local host and systemd-nspawn containers.

# CAVEATS

Only shows containers registered with systemd-machined. Virtual machines and external containers (Docker, Podman without systemd integration) are not listed. The local host is shown first, unless a pattern excludes it.

# HISTORY

The **list-machines** subcommand integrates container and VM management into the standard systemctl interface, providing unified monitoring across the host and its containers. It has been documented since systemd 212.

# SEE ALSO

[systemctl](/man/systemctl)(1), [machinectl](/man/machinectl)(1), [systemd-nspawn](/man/systemd-nspawn)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
