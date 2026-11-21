# TAGLINE

Print a report from the running Uncomplicated Firewall

# TLDR

Show rules in the **form they were entered**

```sudo ufw show added```

Show **listening** ports and the rules that can match them

```sudo ufw show listening```

Show the **whole** running firewall

```sudo ufw show raw```

Show one **slice** of the ruleset

```sudo ufw show [builtins|before-rules|user-rules|after-rules|logging-rules]```

# SYNOPSIS

**ufw** [_--dry-run_] **show** _REPORT_

# PARAMETERS

**raw**
> The complete firewall, in raw iptables format (filter, nat, mangle, and raw tables).

**builtins**
> Built-in chains from the raw report.

**before-rules**
> Rules that run before the user rules.

**user-rules**
> The user rule chains.

**after-rules**
> Rules that run after the user rules.

**logging-rules**
> The logging chains.

**listening**
> TCP ports in the listen state and UDP ports in the open state, with the interface address and the program bound to the port. An asterisk means the program is bound on every address. Matching rules follow, in kernel evaluation order. The default policy is not listed. tcp6 and udp6 appear only when IPv6 is enabled.

**added**
> Rules as they were typed. This is not the live firewall state (use **ufw status** for that). ufw normalizes rules, so a line may not match what was typed, and IPv6-only rules are listed after the others.

**--dry-run**
> Global ufw flag. A show report reads the running firewall, so a dry run does not change it.

# DESCRIPTION

**ufw show** prints one report about the firewall ufw has loaded. It is a subcommand of **ufw**, not a separate program.

Every report except **listening** is a subset of the iptables rules, or the full set in the case of **raw**. **listening** inspects the live sockets and then lists rules that might apply to each port. The first matching rule wins.

# CAVEATS

Reading these reports usually needs root. **added** can disagree with the command you remember, because ufw stores a normalized rule and does not keep the original command order.

# HISTORY

Part of **ufw** (Uncomplicated Firewall), Ubuntu's frontend for iptables and nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-11-21 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-status](/man/ufw-status)(8), [ufw-logging](/man/ufw-logging)(8), [iptables](/man/iptables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://help.ubuntu.com/community/UFW)```

<!-- verified: 2026-11-21 -->
