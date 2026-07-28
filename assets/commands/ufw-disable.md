# TAGLINE

Disable Uncomplicated Firewall and unload rules

# TLDR

**Unload** and disable ufw

```sudo ufw disable```

**Simulate** disabling without making changes

```sudo ufw --dry-run disable```

# SYNOPSIS

**ufw** [_--dry-run_] **disable**

# PARAMETERS

**disable**
> Disable the firewall, unload rules, and prevent loading them on boot

**--dry-run**
> Show what would change without applying it

# DESCRIPTION

**ufw disable** turns off Uncomplicated Firewall: active netfilter rules are unloaded and the firewall will not be enabled automatically at boot until re-enabled with `ufw enable`.

This is the counterpart to `ufw enable`. Use dry-run first if you want to preview the operation. Disabling removes host packet filtering enforced by ufw until you enable it again.

# CAVEATS

Disabling the firewall leaves the host unprotected by ufw rules. Other firewall tools (firewalld, nftables managed outside ufw) may still apply. Requires root or sudo.

# HISTORY

Part of **ufw** (Uncomplicated Firewall), the Ubuntu-originated frontend for iptables/nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-07-28 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-enable](/man/ufw-enable)(8), [iptables](/man/iptables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://help.ubuntu.com/community/UFW)```

<!-- verified: 2026-07-28 -->
