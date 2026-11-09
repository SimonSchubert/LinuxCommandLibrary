# TAGLINE

manages launchd services on macOS

# TLDR

**List loaded services**

```launchctl list```

**Show details of a service**

```launchctl print gui/[uid]/[com.example.service]```

**Show all services in the user's GUI domain**

```launchctl print gui/[uid]```

**Load a user agent** (modern replacement for load)

```launchctl bootstrap gui/[uid] [~/Library/LaunchAgents/com.example.plist]```

**Unload a user agent** (modern replacement for unload)

```launchctl bootout gui/[uid]/[com.example.service]```

**Load a system daemon**

```sudo launchctl bootstrap system [/Library/LaunchDaemons/com.example.plist]```

**Start a service immediately, restarting it if running**

```launchctl kickstart -k gui/[uid]/[com.example.service]```

**Enable or disable a service** across reboots

```launchctl [enable|disable] gui/[uid]/[com.example.service]```

**List disabled services in a domain**

```launchctl print-disabled gui/[uid]```

**Send a signal to a service**

```launchctl kill SIGTERM gui/[uid]/[com.example.service]```

# SYNOPSIS

**launchctl** _subcommand_ [_arguments_]

# PARAMETERS

**bootstrap** _domain-target_ _path_ ...
> Load services from plist files, XPC bundles or directories into a domain.

**bootout** _domain-target_ [_path_ ...] | _service-target_
> Remove a service, or a domain's services, from launchd.

**enable** | **disable** _service-target_
> Allow or prevent loading of a service. Persists across boots.

**kickstart** [**-kp**] _service-target_
> Run a service immediately. **-k** kills a running instance first, **-p** prints the PID.

**kill** _signal_ _service-target_
> Send a signal, by name or number, to a running service.

**print** _domain-target_ | _service-target_
> Print information about a service or domain. Not a stable format.

**print-disabled** _domain-target_
> List disabled services in a domain.

**blame** _service-target_
> Print why launchd launched a running service.

**debug** _service-target_ [_options_]
> Configure the next invocation of a service for debugging.

**config** **system** | **user** _parameter_ _value_
> Persistently set umask or PATH for a domain. Requires a reboot.

**reboot** [**system** | **userspace** | **halt** | **logout** | **apps**]
> Tear down userspace, then reboot or restart as requested.

**error** [**posix** | **mach** | **bootstrap**] _code_
> Print a human-readable string for an error code.

**dumpstate**
> Dump launchd state to stdout.

**version**
> Print the launchd version string.

**list** [**-x**] [_label_]
> Legacy: list loaded services.

**load** | **unload** [**-wF**] [**-S** _sessiontype_] [**-D** _searchpath_] _paths_
> Legacy: load or unload plists. Prefer bootstrap, bootout, enable and disable.

**start** | **stop** _label_
> Legacy: start or stop a service.

**remove** _label_
> Legacy: remove a job by label.

**help**
> Print a usage statement.

# DESCRIPTION

**launchctl** interfaces with launchd to manage and inspect daemons, agents and XPC services on macOS, using property list (plist) files to define services.

Most subcommands take a target: **system/** for system daemons, **gui/UID/** for the agents of a logged-in user, **user/UID/** for a user domain, and **pid/PID/** for a process. A service target appends the label, as in **gui/501/com.example.service**.

# CAVEATS

macOS only. The legacy **load**, **unload**, **start** and **stop** subcommands date from before OS X 10.10; they pick the domain by whether they run as root. Modifying the system domain requires root. Output of the newer subcommands is for humans and is not a stable API, so do not parse it. **launchctl** no longer has an interactive mode and no longer reads **/etc/launchd.conf**.

# HISTORY

**launchctl** is part of **launchd**, introduced in **Mac OS X 10.4 Tiger** (2005) by **Apple**, with Dave Zarzycki leading its development. launchd unified the roles of init, rc scripts, cron and inetd. Apple's published source for launchd stops at an older release, before the subcommand syntax used today.

# SEE ALSO

[systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/apple-oss-distributions/launchd)```

```[Documentation](https://developer.apple.com/library/archive/documentation/MacOSX/Conceptual/BPSystemStartup/Chapters/CreatingLaunchdJobs.html)```

<!-- verified: 2026-11-09 -->
