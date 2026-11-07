# TAGLINE

Reload Uncomplicated Firewall rules

# TLDR

Reload the firewall

```sudo ufw reload```

Show what a reload **would change**

```sudo ufw --dry-run reload```

# SYNOPSIS

**ufw** [_--dry-run_] **reload**

# PARAMETERS

**reload**

> Rebuild the firewall from the current ruleset and apply it

**--dry-run**

> Print the changes a reload would make, without applying them

# DESCRIPTION

**ufw reload** reloads Uncomplicated Firewall. It is a **ufw** subcommand, not a separate binary. Root or sudo is required, the same as for other commands that change the ruleset.

Use **--dry-run** when you want to see the generated iptables or nftables changes before they go live. A reload does not edit `/etc/ufw/` by itself. It reapplies the rules already stored there, including application profiles and user rules.

# CAVEATS

Reloading briefly replaces the live ruleset. Existing connections follow the firewall's connection-tracking policy. **--dry-run** does not change the kernel rules.

Do not confuse **ufw reload** with **ufw app update**, which refreshes rules that were added from an application profile after that profile file changed, or with **ufw enable**, which turns the firewall on.

# HISTORY

Reload has been part of **ufw** (Uncomplicated Firewall) since the tool's early Ubuntu releases. **ufw** was developed by Canonical as a frontend for iptables and, on newer releases, nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-11-07 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-allow](/man/ufw-allow)(8), [ufw-deny](/man/ufw-deny)(8), [ufw-default](/man/ufw-default)(8), [ufw-status](/man/ufw-status)(8), [ufw-enable](/man/ufw-enable)(8), [iptables](/man/iptables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://help.ubuntu.com/community/UFW)```

<!-- verified: 2026-11-07 -->
