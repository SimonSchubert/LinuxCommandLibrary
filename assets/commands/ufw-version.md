# TAGLINE

Print Uncomplicated Firewall version and copyright

# TLDR

Show the **installed ufw version**

```ufw version```

Same output via the **long option**

```ufw --version```

# SYNOPSIS

**ufw** **version**

**ufw** **--version**

# PARAMETERS

**version**, **--version**
> Print the program name, version number, and copyright, then exit.

# DESCRIPTION

**ufw version** (and the equivalent **ufw --version**) prints the Uncomplicated Firewall package version and a Canonical copyright line, then exits. Typical output looks like:

```
ufw 0.36.2
Copyright 2008-2023 Canonical Ltd.
```

The version string is substituted at package build time. This is a **ufw** subcommand (and matching long option), not a separate binary. It is handled before the firewall frontend starts, so it does not load rules, touch netfilter, or require root.

Use it to confirm which **ufw** is on `PATH` when diagnosing rule behavior across distributions or comparing against the man page for that release.

# CAVEATS

Does not report whether the firewall is enabled, which backend (iptables vs nftables) is in use, or kernel/netfilter versions. For runtime state use **ufw status**. The tldr-pages example uses `sudo ufw version`; sudo is unnecessary.

# HISTORY

Part of **ufw** (Uncomplicated Firewall), Ubuntu's frontend for iptables/nftables, first shipped in Ubuntu 8.04 (2008). The version action has been present since early releases.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-09-06 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-status](/man/ufw-status)(8), [iptables](/man/iptables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Homepage](https://launchpad.net/ufw)```

```[Documentation](https://help.ubuntu.com/community/UFW)```

<!-- verified: 2026-09-06 -->
