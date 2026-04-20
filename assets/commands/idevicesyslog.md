# TAGLINE

streams the system log from iOS devices

# TLDR

**Stream system log** from the attached device

```idevicesyslog```

**Include only** messages from specific processes (pipe-separated)

```idevicesyslog -p [Safari|WebKit]```

**Target a specific device** by UDID

```idevicesyslog -u [udid]```

**Print only** lines containing a pattern

```idevicesyslog -m "[error]"```

**Exclude processes** (pipe-separated)

```idevicesyslog -e "[SpringBoard|backboardd]"```

**Stream over network** instead of USB

```idevicesyslog -n```

**Save output** to a file

```idevicesyslog -o [device.log]```

# SYNOPSIS

**idevicesyslog** [_options_]

**idevicesyslog** **pidlist**

**idevicesyslog** **archive** _PATH_ [_options_]

# PARAMETERS

**-u**, **--udid** _UDID_
> Target a specific device by UDID.

**-n**, **--network**
> Connect to a network-attached device instead of USB.

**-p**, **--process** _PROCESS_
> Include messages from the given process names (**|** separated).

**-e**, **--exclude** _PROCESS_
> Exclude messages from the given process names (**|** separated).

**-m**, **--match** _STRING_
> Print only messages containing _STRING_.

**-M**, **--unmatch** _STRING_
> Print only messages **not** containing _STRING_.

**-t**, **--trigger** _STRING_
> Start logging when a message containing _STRING_ is seen.

**-T**, **--untrigger** _STRING_
> Stop logging when a message containing _STRING_ is seen.

**-k**, **--kernel**, **-K**, **--no-kernel**
> Include or exclude kernel messages.

**-o**, **--output** _FILE_
> Write the log stream to _FILE_ in addition to the terminal.

**-x**, **--exit**
> Exit when the device disconnects.

**--no-colors**, **--colors**
> Disable or force ANSI color output.

**-q**, **--quiet**
> Suppress banner / status output.

**-d**, **--debug**
> Enable debug output.

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

[idevice_id](/man/idevice_id)(1), [ideviceinfo](/man/ideviceinfo)(1), [idevicepair](/man/idevicepair)(1), [adb](/man/adb)(1)
