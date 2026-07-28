# TAGLINE

Enable Uncomplicated Firewall and load rules on boot

# TLDR

**Reload** and enable ufw

```sudo ufw enable```

**Simulate** enabling without making changes

```sudo ufw --dry-run enable```

# SYNOPSIS

**ufw** [_--dry-run_] **enable**

# PARAMETERS

**enable**
> Enable the firewall, load configured rules, and activate them on boot

**--dry-run**
> Show what would change without applying it

# DESCRIPTION

**ufw enable** turns on Uncomplicated Firewall: configured rules are loaded into netfilter and the service is set so the firewall starts on boot. Pair with `ufw allow`/`deny` (or application profiles) before enabling on remote hosts so you do not lock yourself out of SSH.

This is the counterpart to `ufw disable`. After enabling, `ufw status` reports the active policy and rules.

# CAVEATS

On remote systems, allow SSH (e.g. `ufw allow OpenSSH` or port 22) **before** enabling. Enabling replaces or layers with other host firewall configuration depending on distro defaults. Requires root or sudo.

# HISTORY

Part of **ufw** (Uncomplicated Firewall), the Ubuntu-originated frontend for iptables/nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-07-28 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-disable](/man/ufw-disable)(8), [iptables](/man/iptables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://help.ubuntu.com/community/UFW)```

<!-- verified: 2026-07-28 -->
