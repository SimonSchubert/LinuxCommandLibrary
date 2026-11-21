# TAGLINE

Set how much Uncomplicated Firewall logs

# TLDR

Turn logging **on** at the default level (**low**)

```sudo ufw logging on```

Turn logging **off**

```sudo ufw logging off```

Set a **level**

```sudo ufw logging [low|medium|high|full]```

Log **new** connections that match a rule, or **every** packet

```sudo ufw [allow|deny|reject|limit] [log|log-all] [22/tcp]```

# SYNOPSIS

**ufw** [_--dry-run_] **logging** **on** | **off** | _LEVEL_

# PARAMETERS

**on**
> Enable logging. If logging is currently off, the level becomes **low**.

**off**
> Disable ufw-managed logging.

**low**
> Log blocked packets that do not match the default policy (rate limited), and packets that match a logged rule.

**medium**
> Everything **low** logs, plus allowed packets that do not match the default policy, INVALID packets, and new connections. Rate limited.

**high**
> Everything **medium** logs, without that rate limit, plus all packets with rate limiting.

**full**
> Everything **high** logs, without rate limiting.

**log**, **log-all**
> On an allow, deny, reject, or limit rule: log the new connection, or log every matching packet.

**--dry-run**
> Show what would change without applying it.

# DESCRIPTION

**ufw logging** sets the log level for Uncomplicated Firewall. It is a subcommand of **ufw**, not a separate program. When no level is given at setup, ufw uses **low**. **on** enables logging at **low** if it is currently disabled.

Levels above **medium** write a lot of kernel log lines and can fill the disk. **medium** can do the same on a busy host.

To log only some traffic, put **log** or **log-all** on the rule itself instead of raising the global level.

# CAVEATS

**high** and **full** are easy to leave on by mistake. Check **ufw status verbose** for the current level, and prefer a logged rule when you only need one port.

# HISTORY

Part of **ufw** (Uncomplicated Firewall), Ubuntu's frontend for iptables and nftables.

# INSTALL

```dnf: sudo dnf install ufw```

```pacman: sudo pacman -S ufw```

```apk: sudo apk add ufw```

```zypper: sudo zypper install ufw```

<!-- packages: 2026-11-21 -->

# SEE ALSO

[ufw](/man/ufw)(8), [ufw-status](/man/ufw-status)(8), [ufw-show](/man/ufw-show)(8), [ufw-allow](/man/ufw-allow)(8), [iptables](/man/iptables)(8)

# RESOURCES

```[Source code](https://git.launchpad.net/ufw)```

```[Documentation](https://help.ubuntu.com/community/UFW)```

<!-- verified: 2026-11-21 -->
