# TAGLINE

Cross-platform utility to prevent system from sleeping

# TLDR

**Open the interactive terminal UI**

```keepalive```

**Keep the system awake for a specific duration**

```keepalive -d [2h30m]```

**Keep the system awake until a specific time**

```keepalive -c [22:00]```

**Keep awake and simulate activity for chat apps**

```keepalive -a```

**Keep awake during work hours**

```keepalive --schedule "[Mon-Fri 08:00-16:00]"```

**Keep awake while a command runs**

```keepalive run -- [make release]```

**Keep awake while a named process is running**

```keepalive --while [zoom]```

**Stop when the battery drops to a percentage**

```keepalive -d [4h] -b [20]```

**Show the running instance**

```keepalive status```

# SYNOPSIS

**keepalive** [_options_]

**keepalive** _command_ [_options_]

# PARAMETERS

**-d**, **--duration** _duration_
> Keep awake for this long: minutes ("150") or a duration ("2h30m"), at least 1m.

**-c**, **--clock**, **--until** _time_
> Keep awake until a time of day ("17:00" or "5:00PM").

**-b**, **--battery** _percent_
> Stop when the battery is at or below this percentage (1-100).

**--schedule** _spec_
> Keep awake only during weekly windows, e.g. "Mon-Fri 08:00-16:00".

**--while** _name_
> Keep awake while a process with this name runs.

**--pid** _pid_
> Keep awake until the process exits. Repeatable.

**--keep-display**=_false_
> Keep only the system awake and let the display sleep.

**-a**, **--active**
> Simulate activity so Teams and Slack keep showing you as active.

**--active-idle** _duration_
> Idle time before activity is simulated (default 3m).

**--active-interval** _duration_
> Mean gap between simulated activity bursts (default about 30s).

**--active-keys**
> Also tap Shift with each burst.

**--plain**
> Run headless with one line per event, even on a terminal.

**--json**
> Print NDJSON events (implies **--plain**).

**--replace**
> Stop a keepalive that is already running and take over.

**-l**, **--log**
> Write a log file and print its path at start.

**--log-file** _path_
> Log file path (default: keepalive/keepalive.log in the user cache directory).

**run** [_flags_] **--** _command_
> Run a command and keep awake until it exits.

**status**, **stop**, **active**, **extend**
> Inspect or control the running instance.

**service install**, **service status**, **service uninstall**
> Manage a login service.

**doctor**
> Diagnose input, monitoring and idle counters.

**-v**, **--version**
> Show version information.

**-h**, **--help**
> Show help message.

# DESCRIPTION

**keep-alive** (the binary is named **keepalive**) prevents a computer from sleeping for a set time, until a time of day, during work hours, while a process runs, or until the battery runs low. It holds the operating system's own sleep inhibitors, so power settings are not changed and the hold ends when the program does, even if it crashes.

It runs on **Linux**, **macOS** and **Windows**, using logind inhibitors plus GNOME, KDE or XFCE over D-Bus on Linux, IOKit power assertions on macOS, and power requests on Windows. Without options on a terminal it opens an interactive UI; **--plain** runs it headless.

# CAVEATS

Only one instance runs per user. Over SSH, logind may refuse the inhibitor on Linux, so run it in the desktop session. On Linux, **-a** needs access to **/dev/uinput**, or **ydotool** or **xdotool**, plus complete input monitoring; on macOS it needs Accessibility and Input Monitoring permissions. Activity simulation pauses while you use the mouse or keyboard.

# HISTORY

Version **2.0.0** requires macOS 13 or later, removed the menu-bar GUI, and moved the log from the current directory to the user cache directory. **-d** must now be at least one minute.

# SEE ALSO

[caffeinate](/man/caffeinate)(8), [systemd-inhibit](/man/systemd-inhibit)(1), [xset](/man/xset)(1)

# RESOURCES

```[Source code](https://github.com/stigoleg/keep-alive)```

<!-- verified: 2026-11-09 -->
