# TLDR

**View all logs**

```adb logcat```

**Filter by tag**

```adb logcat -s [TAG]```

**Filter by priority**

```adb logcat "*:[E]"```

**Clear log buffer**

```adb logcat -c```

**Output to file**

```adb logcat > [logfile.txt]```

**Show specific buffer**

```adb logcat -b [main,system,crash]```

**Format output**

```adb logcat -v [time]```

# SYNOPSIS

**logcat** [_options_] [_filter_...]

# DESCRIPTION

**logcat** displays Android system and application logs. It connects to an Android device or emulator via adb and streams log messages for debugging and analysis.

The tool supports filtering by tag, priority level, and buffer type. It's essential for Android development and troubleshooting.

# PARAMETERS

**-s** _tag_
> Filter to specific tag(s).

**-b** _buffer_
> Log buffer (main, system, radio, events, crash).

**-c**
> Clear log buffer.

**-d**
> Dump log and exit.

**-f** _file_
> Write to file.

**-v** _format_
> Output format (brief, time, long, color).

**-t** _count_
> Print last N lines.

**-g**
> Get buffer size.

**--pid** _pid_
> Filter by process ID.

# PRIORITY LEVELS

**V**: Verbose
**D**: Debug
**I**: Info
**W**: Warning
**E**: Error
**F**: Fatal

# CAVEATS

Requires adb connection. Buffer size limited. Old logs cleared on reboot. Some logs need root access.

# HISTORY

**logcat** is part of the **Android SDK**, developed by **Google**. It has been the primary Android logging tool since Android's release in **2008**, evolving to support more buffers and filtering options.

# SEE ALSO

[adb](/man/adb)(1), [dmesg](/man/dmesg)(1), [journalctl](/man/journalctl)(1)
