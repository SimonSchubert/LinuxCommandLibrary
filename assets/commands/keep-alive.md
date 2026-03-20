# TAGLINE

Cross-platform utility to prevent system from sleeping

# TLDR

**Keep the system awake interactively**

```keep-alive```

**Keep the system awake for a specific duration**

```keep-alive -d [2h30m]```

**Keep the system awake until a specific time**

```keep-alive -c [22:00]```

**Keep the system awake and simulate activity for chat apps**

```keep-alive -a```

# SYNOPSIS

**keep-alive** [_options_]

# PARAMETERS

**-d**, **--duration** _duration_
> Duration to keep system alive (e.g., "2h30m" or "150" for minutes).

**-c**, **--clock** _time_
> Keep system alive until the specified time (e.g., "22:00" or "10:00PM").

**-a**, **--active**
> Simulate activity to keep chat apps (Slack/Teams) showing active status.

**-l**, **--log**
> Enable logging to debug.log file.

**-v**, **--version**
> Show version information.

**-h**, **--help**
> Show help message.

# DESCRIPTION

**keep-alive** is a lightweight, cross-platform utility that prevents your system from sleeping, dimming displays, or pausing background processes. It ensures that downloads, builds, and other long-running tasks remain active without interruption.

The tool works on **Linux**, **macOS**, and **Windows** by using OS-specific APIs to inhibit sleep. On macOS it uses caffeinate, on Linux it uses systemd-inhibit or xset, and on Windows it uses the SetThreadExecutionState API. It provides an interactive TUI with duration selection when run without flags.

# CAVEATS

May require appropriate permissions depending on the operating system. Does not prevent manual sleep triggered by the user. Power settings are restored when the program exits.

# SEE ALSO

[caffeinate](/man/caffeinate)(8), [systemd-inhibit](/man/systemd-inhibit)(1), [xset](/man/xset)(1)
