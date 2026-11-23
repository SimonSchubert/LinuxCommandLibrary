# TAGLINE

PolicyKit authorization daemon

# TLDR

**Check the status** of the polkit service

```systemctl status polkit.service```

**Restart** the daemon after changing rules

```sudo systemctl restart polkit.service```

**Follow the daemon's log** to debug rule evaluation

```journalctl -u polkit.service -f```

**Run in the foreground** with debug logging, replacing the running instance

```sudo /usr/lib/polkit-1/polkitd --replace --log-level=debug```

# SYNOPSIS

**polkitd** [**-r**] [**-n**] [**-l** _level_]

# PARAMETERS

**-r**, **--replace**
> Replace an already running polkitd instance on the system bus.

**-n**, **--no-debug**
> Don't print debug information to stdout and stderr.

**-l**, **--log-level** _level_
> Set the syslog-style log level: emerg, alert, crit, err, warning, notice (default), info or debug.

**-h**, **--help**
> Show help options.

# DESCRIPTION

**polkitd** provides the **org.freedesktop.PolicyKit1** D-Bus service on the system bus and processes authorization requests from applications. It evaluates actions declared in **/usr/share/polkit-1/actions/** against JavaScript rules in **/etc/polkit-1/rules.d/** and **/usr/share/polkit-1/rules.d/** to decide whether a user or process may perform a specific action.

Users never need to start it manually: it is started automatically by D-Bus or systemd (**polkit.service**) when an application calls into the service. It runs as the unprivileged **polkitd** system user, dropping privileges early if started as root. The binary normally lives in **/usr/lib/polkit-1/** or **/usr/libexec/polkit-1/** and is not on **PATH**.

# CONFIGURATION

**/etc/polkit-1/polkitd.conf**
> INI-style daemon settings, falling back to **/run/polkit-1/polkitd.conf** and **/usr/lib/polkit-1/polkitd.conf**. The **[Polkitd]** section accepts **ExpirationSeconds=**, the lifetime of temporary authorizations (default 300).

**/etc/polkit-1/rules.d/*.rules**
> Local authorization rules written in JavaScript; **polkit.log()** output from rules appears in the daemon's journal.

# CAVEATS

Rule files are reloaded automatically when they change, so a restart is rarely needed. Legacy **.pkla** files are only honored by pre-0.106 polkit or distribution forks that kept the old local authority backend. Running a second instance without **--replace** fails because the bus name is already taken.

# HISTORY

PolicyKit was written by **David Zeuthen** at Red Hat, starting in 2007. The 2009 rewrite renamed the project to **polkit** and introduced the current **polkitd** daemon; version 0.106 (2012) replaced .pkla files with JavaScript rules. Since version 121 (2022) releases use plain integer version numbers, and development later moved from freedesktop.org GitLab to the **polkit-org** organization on GitHub.

# SEE ALSO

[polkit](/man/polkit)(8), [pkexec](/man/pkexec)(1), [pkaction](/man/pkaction)(1), [pkcheck](/man/pkcheck)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/polkit-org/polkit)```

```[Documentation](https://www.freedesktop.org/software/polkit/docs/latest/polkitd.8.html)```

<!-- verified: 2026-11-23 -->
