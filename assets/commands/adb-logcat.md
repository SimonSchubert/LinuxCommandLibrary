# TAGLINE

Android system log viewer

# TLDR

**View** device logs

```adb logcat```

**Filter** by priority level (Verbose, Debug, Info, Warn, Error, Fatal)

```adb logcat *:[E]```

Filter by **tag** and priority

```adb logcat [ActivityManager]:I *:S```

**Clear** the log buffer

```adb logcat -c```

View logs from **specific buffer**

```adb logcat -b [main|system|crash|events]```

Save logs to **file**

```adb logcat -f [logfile.txt]```

# SYNOPSIS

**adb logcat** [_-v format_] [_-b buffer_] [_-c_] [_-f file_] [_filter-spec_]

# DESCRIPTION

**adb logcat** displays the Android system log in real-time. It shows log messages from the system, apps, and various Android components. The output includes timestamp, process ID, thread ID, priority level, tag, and message.

Filter expressions allow you to select which log messages to display based on tag name and minimum priority level. Multiple filters can be combined to create complex filtering rules.

# PARAMETERS

**-v** _format_
> Output format: brief, process, tag, thread, raw, time, threadtime, long

**-b** _buffer_
> Log buffer: main, system, radio, events, crash, all

**-c**
> Clear the log buffers

**-d**
> Dump log and exit (don't block)

**-f** _file_
> Write output to file

**-s**
> Set default filter to silent (equivalent to *:S)

**-e** _regex_
> Only print lines matching regex

**--pid=**_pid_
> Only show logs from specified process ID

# FILTER FORMAT

```tag:priority``` where priority is:
- **V**: Verbose
- **D**: Debug
- **I**: Info
- **W**: Warning
- **E**: Error
- **F**: Fatal
- **S**: Silent (suppress output)

# CAVEATS

Log buffers have limited size; old messages are overwritten. Some system logs may require root access. Excessive logging can slow down the device. Use filters to reduce output volume.

# HISTORY

Logcat has been part of the Android SDK since the initial release in **2008**, based on the Linux kernel's printk logging system but adapted for Android's needs with tag-based filtering.

# SEE ALSO

[adb](/man/adb)(1), [dmesg](/man/dmesg)(1), [journalctl](/man/journalctl)(1)
