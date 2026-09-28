# TAGLINE

displays Android system and application logs

# TLDR

**View all logs**

```adb logcat```

Show only one **tag**, silencing everything else

```adb logcat -s [TAG]```

Show only **errors and above**

```adb logcat "*:E"```

Show a tag at **debug** level and silence the rest

```adb logcat [TAG]:D "*:S"```

Show logs from a **single app** by process ID

```adb logcat --pid=$(adb shell pidof -s [com.example.app])```

**Dump** the current log and exit

```adb logcat -d > [logfile.txt]```

Show the **last lines** and exit

```adb logcat -t [100]```

**Clear** the log buffers

```adb logcat -c```

Show the **crash** buffer only

```adb logcat -b crash```

Filter lines with a **regular expression**

```adb logcat -e "[pattern]"```

Use a **colored** output format with timestamps

```adb logcat -v color,time```

# SYNOPSIS

**adb** [**shell**] **logcat** [_options_] [_filterspec_...]

# DESCRIPTION

**logcat** displays Android system and application logs. It runs on the device and is usually invoked from a host through **adb logcat**, which is shorthand for **adb shell logcat**.

Messages are read from the ring buffers kept by the **logd** daemon. Each message has a **tag** and a **priority**, and filter specifications of the form _tag_[:_priority_] select what is printed. A bare tag means _tag_:V, and a bare `*` means `*:D`. If no filterspec is given, **$ANDROID_LOG_TAGS** is used.

Available options depend on the Android version of the device; run **adb logcat --help** for the exact list.

# PARAMETERS

**-s**
> Set the default filter to silent (like `*:S`). Combined with tags, only those tags are shown.

**-b**, **--buffer** _buffer_
> Ring buffer(s) to read: main, system, radio, events, crash, default, all (plus kernel and security on some builds). Repeatable or comma separated. Default is main,system,crash.

**-c**, **--clear**
> Clear (flush) the selected buffers and exit.

**-d**
> Dump the log and exit instead of blocking.

**-L**, **--last**
> Dump logs from before the last reboot (pstore).

**-f**, **--file** _file_
> Write to _file_ instead of stdout.

**-r**, **--rotate-kbytes** _N_
> Rotate the log file every _N_ KiB (requires **-f**).

**-n**, **--rotate-count** _N_
> Maximum number of rotated logs (default 4).

**-v**, **--format** _format_
> Output format: brief, long, process, raw, tag, thread, threadtime (default), time. Modifiers: color, descriptive, epoch, monotonic, printable, uid, usec, UTC, year, zone.

**-D**, **--dividers**
> Print dividers between log buffers.

**-B**, **--binary**
> Output the log in binary.

**-e**, **--regex** _expr_
> Only print lines matching an ECMAScript regex.

**-m**, **--max-count** _N_
> Exit after printing _N_ lines.

**-t** _N_ | _time_
> Print the most recent _N_ lines, or lines since _time_ ('MM-DD hh:mm:ss.mmm'), then exit (implies **-d**).

**-T** _N_ | _time_
> Like **-t** but keeps following the log.

**--pid** _pid_
> Only print logs from the given process ID.

**--uid** _uids_
> Only print logs from the given comma-separated numeric UIDs.

**-g**, **--buffer-size**
> Print the size of the ring buffers.

**-G**, **--buffer-size**=_size_
> Set the ring buffer size (suffix K or M).

**-S**, **--statistics**
> Print logging statistics.

**-p**, **--prune** / **-P** '_list_'
> Get or set the prune (allow/deny) rules.

**--wrap**
> Sleep for 2 hours or until the buffer is about to wrap.

# PRIORITY LEVELS

**V**: Verbose
**D**: Debug
**I**: Info
**W**: Warning
**E**: Error
**F**: Fatal
**S**: Silent (suppress all output)

# CAVEATS

Requires an adb connection (or a shell on the device). Buffers are small ring buffers, so older messages are overwritten, and logs are lost on reboot unless read with **-L**. Apps can only see their own logs; reading other apps' logs requires adb, root, or the READ_LOGS permission. Many logd control options require root.

# HISTORY

**logcat** is part of the Android platform, developed by **Google**. It has been the primary Android logging tool since Android's release in **2008**. The logd daemon replaced the old kernel logger driver in Android 5.0.

# SEE ALSO

[adb](/man/adb)(1), [adb-logcat](/man/adb-logcat)(1), [dmesg](/man/dmesg)(1), [journalctl](/man/journalctl)(1)

# RESOURCES

```[Documentation](https://developer.android.com/tools/logcat)```

<!-- verified: 2026-09-29 -->
