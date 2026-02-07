# TAGLINE

Linux audit daemon for tracking security-relevant events.

# TLDR

**Start** audit daemon

```sudo auditd```

**Stop** audit daemon

```sudo auditd -s stop```

**Rotate** audit logs

```sudo auditd -s rotate```

Run in **foreground**

```sudo auditd -f```

# SYNOPSIS

**auditd** [_-f_] [_-l_] [_-n_] [_-s action_]

# DESCRIPTION

**auditd** is the Linux Audit daemon that collects audit events from the kernel and writes them to disk. It's part of the Linux Audit framework for tracking security-relevant events.

The daemon logs file accesses, system calls, authentication events, and other activities based on configured rules.

# PARAMETERS

**-f**
> Run in foreground (don't daemonize)

**-l**
> Allow only one copy running

**-n**
> Don't fork (for systemd compatibility)

**-s** _action_
> Send signal to daemon (stop, term, cont, rotate, resume)

# CONFIGURATION

**/etc/audit/auditd.conf**
> Main daemon configuration controlling log file location, retention, disk space handling, and dispatcher settings.

**/etc/audit/rules.d/**
> Directory containing audit rule files loaded at startup. Rules define which system calls and file accesses to monitor.

# CAVEATS

Requires root privileges. Heavy auditing can impact performance. Log files grow quickly with verbose rules. Should be managed through systemd on modern systems.

# HISTORY

**auditd** was developed as part of the Linux Audit project to meet Common Criteria security requirements, becoming part of the mainline kernel in **2.6.6** (2004).

# SEE ALSO

[auditctl](/man/auditctl)(8), [ausearch](/man/ausearch)(8), [aureport](/man/aureport)(8)
