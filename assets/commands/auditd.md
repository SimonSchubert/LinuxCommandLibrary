# TAGLINE

Linux audit daemon for tracking security-relevant events.

# TLDR

**Start** audit daemon

```sudo auditd```

Run in the **foreground** for debugging

```sudo auditd -f```

Do **not fork** (for systemd or inittab)

```sudo auditd -n```

Use an **alternate config directory**

```sudo auditd -c [/path/to/config_dir]```

Start without changing the kernel **enabled flag**

```sudo auditd -s nochange```

# SYNOPSIS

**auditd** [_-f_] [_-l_] [_-n_] [_-s disable|enable|nochange_] [_-c config_dir_]

# DESCRIPTION

**auditd** is the Linux Audit daemon that collects audit events from the kernel and writes them to disk. It's part of the Linux Audit framework for tracking security-relevant events.

The daemon logs file accesses, system calls, authentication events, and other activities based on configured rules.

# PARAMETERS

**-f**
> Leave the daemon in the foreground for debugging. Messages also go to stderr rather than the audit log.

**-l**
> Allow the daemon to follow symbolic links for config files.

**-n**
> Do not fork. Useful for running from inittab or systemd.

**-s** _disable|enable|nochange_
> Set the kernel audit enabled flag state at startup. The default enables the flag on start and disables it on termination. The flag can also be changed at runtime with **auditctl**.

**-c** _config_dir_
> Use an alternate config directory. The same directory is also passed to the dispatcher (default: /etc/audit/).

# CONFIGURATION

**/etc/audit/auditd.conf**
> Main daemon configuration controlling log file location, retention, disk space handling, and dispatcher settings.

**/etc/audit/rules.d/**
> Directory containing audit rule files compiled by **augenrules** into the active ruleset. Rules define which system calls and file accesses to monitor.

**/etc/audit/plugins.d/**
> Directory of plugin (dispatcher) configuration files for routing events to external programs.

# CAVEATS

Requires root privileges. Heavy auditing can impact performance, and log files grow quickly with verbose rules. On modern systems the daemon should be started, stopped, and reloaded through its service manager (for example **systemctl** or **service auditd rotate**) rather than by sending signals directly.

# HISTORY

**auditd** was developed as part of the Linux Audit project to meet Common Criteria security requirements, becoming part of the mainline kernel in **2.6.6** (2004).

# SEE ALSO

[auditctl](/man/auditctl)(8), [ausearch](/man/ausearch)(8), [aureport](/man/aureport)(8)

# RESOURCES

```[Source code](https://github.com/linux-audit/audit-userspace)```

<!-- verified: 2026-06-17 -->
