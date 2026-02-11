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

```systemctl list-machines [pattern*]```

# SYNOPSIS

**systemctl list-machines** [_PATTERN_...]

# DESCRIPTION

**systemctl list-machines** displays the host and all running local containers and virtual machines registered with systemd-machined. It shows the machine name, state, and number of failed units.

This provides an overview of all systemd-managed machines, including the local host and systemd-nspawn containers.

# CAVEATS

Only shows machines registered with systemd-machined. External containers (Docker, Podman without systemd integration) are not listed. The local host is always shown as the first entry.

# HISTORY

The **list-machines** subcommand integrates container and VM management into the standard systemctl interface, providing unified monitoring across the host and its managed machines.

# SEE ALSO

[systemctl](/man/systemctl)(1), [machinectl](/man/machinectl)(1), [systemd-nspawn](/man/systemd-nspawn)(1)
