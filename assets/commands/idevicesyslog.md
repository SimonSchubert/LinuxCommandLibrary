# TAGLINE

streams the system log from iOS devices

# TLDR

**Stream system log**

```idevicesyslog```

**Filter by process**

```idevicesyslog -p [Safari]```

**Target specific device**

```idevicesyslog -u [udid]```

**Match pattern**

```idevicesyslog -m "[error]"```

**Exclude pattern**

```idevicesyslog -e "[debug]"```

# SYNOPSIS

**idevicesyslog** [_options_]

# PARAMETERS

**-u** _UDID_
> Target device.

**-p** _PROCESS_
> Filter by process name.

**-m** _PATTERN_
> Match pattern.

**-e** _PATTERN_
> Exclude pattern.

**-n**
> Use network connection.

**-d**, **--debug**
> Debug output.

**--help**
> Display help information.

# DESCRIPTION

**idevicesyslog** streams the system log from iOS devices. It provides real-time access to device logs for debugging.

The tool shows messages from all processes or filtered subsets. It's essential for iOS app development and debugging.

# CAVEATS

Part of libimobiledevice. Continuous stream. May need developer mode on iOS 16+.

# HISTORY

idevicesyslog is part of **libimobiledevice** for iOS log streaming.

# SEE ALSO

[idevice_id](/man/idevice_id)(1), [ideviceinfo](/man/ideviceinfo)(1), [adb](/man/adb)(1)
