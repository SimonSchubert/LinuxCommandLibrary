# TAGLINE

Reset Uncomplicated Firewall to installation defaults

# TLDR

**Simulate** a reset without changing anything

```sudo ufw --dry-run reset```

**Reset** the firewall to its default state

```sudo ufw reset```

Reset **without confirmation**

```sudo ufw --force reset```

# SYNOPSIS

**ufw** [_--dry-run_] [_--force_] **reset**

# PARAMETERS

**reset**
> Disable the firewall and restore installation defaults

**--dry-run**
> Show what would change without applying it

**--force**
> Do not ask for confirmation

# DESCRIPTION

**ufw reset** disables Uncomplicated Firewall and restores it to the installation defaults. It is a **ufw** subcommand, not a separate binary.

The command removes the rules you added, reloads the default policies, and leaves the firewall disabled. After a reset, enable it again with **ufw enable** and add rules with **ufw allow**, **ufw deny**, **ufw reject**, or **ufw limit**.

# CAVEATS

Requires root or sudo. A reset deletes existing ufw rules. On a remote host this can lock you out once you enable the firewall again unless you add SSH (or another management) rules first. **--dry-run** shows the planned change; **--force** skips the confirmation prompt.

# HISTORY

Part of **ufw** (Uncomplicated Firewall), the Ubuntu-originated frontend for iptables/nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-11-12 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-enable](/man/ufw-enable)(8), [ufw-disable](/man/ufw-disable)(8), [ufw-status](/man/ufw-status)(8), [ufw-allow](/man/ufw-allow)(8), [iptables](/man/iptables)(8), [nftables](/man/nftables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://help.ubuntu.com/community/UFW)```

<!-- verified: 2026-11-12 -->
