# TAGLINE

create a macOS power-management assertion to keep the system awake

# TLDR

**Prevent idle sleep** indefinitely (press Ctrl-C to stop)

```caffeinate```

**Prevent the display from sleeping**

```caffeinate -d```

**Prevent idle sleep for a duration** (in seconds)

```caffeinate -t [3600]```

**Prevent sleep while a command runs**

```caffeinate -i [make]```

**Combine flags** — keep display and disk awake for 1 hour

```caffeinate -dim -t [3600]```

**Hold the assertion until a process** (by PID) exits

```caffeinate -w [pid]```

**Prevent system sleep** (stronger, only effective on AC power)

```caffeinate -s```

# SYNOPSIS

**caffeinate** [**-disum**] [**-t** _timeout_] [**-w** _pid_] [_utility_ [_arguments_]]

# PARAMETERS

**-d**
> Prevent the display from sleeping.

**-i**
> Prevent the system from idle sleeping. (default when no assertion flag is given)

**-m**
> Prevent the disk from idle sleeping.

**-s**
> Prevent the system from sleeping. Only effective when plugged into AC power on a laptop.

**-u**
> Declare that the user is active. The assertion is released automatically after 5 seconds (or sooner if cancelled) — useful to bump activity without holding it indefinitely.

**-t** _timeout_
> Release the assertion after _timeout_ seconds. Without this flag the assertion holds until caffeinate is terminated or the wrapped utility exits.

**-w** _pid_
> Hold the assertion until the process with the given PID exits.

_utility_ [_arguments_]
> If a utility is given, caffeinate runs it and holds the assertion until it exits. `caffeinate -i make` is the idiomatic pattern.

# DESCRIPTION

**caffeinate** creates one or more **IOKit power-management assertions** to suppress different kinds of sleep. It is the supported way to prevent macOS from entering display, idle, disk, or system sleep for the duration of a task.

When invoked with a utility, caffeinate forks and runs the utility with the assertion(s) held until the utility exits. Without a utility, it runs until it receives a signal (e.g. Ctrl-C) or until `-t` expires. Multiple flags may be combined; each adds its own assertion.

# CAVEATS

macOS only (shipped in `/usr/bin/caffeinate` since OS X 10.8 Mountain Lion). On battery, `-s` may be ignored — `-i` is the reliable choice for laptops. `-u` gives only a brief nudge; use `-d -i` for longer guarantees. Creating an assertion does not override closing the laptop lid (clamshell) — for that, use `pmset`.

For Linux, the equivalent is `systemd-inhibit` or `caffeine` (GNOME applet). For X11, `xset s off -dpms` controls screensaver and DPMS.

# HISTORY

**caffeinate** was introduced in **Mac OS X 10.8 (Mountain Lion, 2012)** by Apple as the supported CLI replacement for ad-hoc scripts that poked mouse events to keep the Mac awake. It wraps the IOKit `IOPMAssertion` API.

# SEE ALSO

[caffeine](/man/caffeine)(1), [xset](/man/xset)(1), [systemd-inhibit](/man/systemd-inhibit)(1)
