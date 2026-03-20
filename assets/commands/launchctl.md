# TAGLINE

manages launchd services on macOS

# TLDR

**List loaded services**

```launchctl list```

**Load service**

```launchctl load [/path/to/service.plist]```

**Unload service**

```launchctl unload [/path/to/service.plist]```

**Start service**

```launchctl start [com.example.service]```

**Stop service**

```launchctl stop [com.example.service]```

**Bootstrap service** (modern replacement for load)

```sudo launchctl bootstrap gui/[uid] [/path/to/service.plist]```

**Bootout service** (modern replacement for unload)

```sudo launchctl bootout gui/[uid]/[com.example.service]```

**Print service info**

```launchctl print gui/[uid]/[com.example.service]```

# SYNOPSIS

**launchctl** _subcommand_ [_options_]

# DESCRIPTION

**launchctl** manages launchd services on macOS. It controls system and user daemons, handling service lifecycle, scheduling, and resource limits.

The tool replaces traditional init scripts on macOS, using property list (plist) files to define services.

# PARAMETERS

**list**
> List loaded services.

**load** _plist_
> Load service (deprecated).

**unload** _plist_
> Unload service (deprecated).

**start** _label_
> Start service.

**stop** _label_
> Stop service.

**bootstrap** _domain_ _plist_
> Load service (modern).

**bootout** _domain_ _plist_
> Unload service (modern).

**print** _target_
> Print service info.

**kickstart** _target_
> Force start service.

**enable** _service_
> Enable service.

**disable** _service_
> Disable service.

**blame** _target_
> Print reason for service being loaded/started.

**dumpstate**
> Dump launchd state to stdout.

# CAVEATS

macOS only. The **load/unload** subcommands are deprecated since macOS 10.10; use **bootstrap/bootout** instead. System services require root. GUI services use the user domain (gui/UID).

# HISTORY

**launchctl** is part of **launchd**, introduced in **Mac OS X 10.4 Tiger** (2005) by **Apple**. It replaced the traditional init, xinetd, and cron systems, unifying daemon management. Dave Zarzycki led its development.

# SEE ALSO

[systemctl](/man/systemctl)(1)
