# TAGLINE

Display ZFS pool event log

# TLDR

**Show pool events**

```zpool events```

**Show verbose event details**

```zpool events -v```

**Show events for specific pool**

```zpool events [poolname]```

**Follow events in real-time**

```zpool events -f```

**Clear event log**

```zpool events -c```

**Show verbose and follow**

```zpool events -vf```

# SYNOPSIS

**zpool events** [_options_] [_pool_]

# PARAMETERS

**-v**
> Verbose output with full event payloads.

**-f**
> Follow mode; wait for new events.

**-c**
> Clear event log after displaying.

**-H**
> Scripted mode; no headers, tab-separated.

# EVENT CLASSES

**ereport.fs.zfs.checksum**: Checksum error detected.

**ereport.fs.zfs.io**: I/O error on vdev.

**ereport.fs.zfs.delay**: Slow I/O completion.

**sysevent.fs.zfs.pool_import**: Pool imported.

**sysevent.fs.zfs.pool_export**: Pool exported.

**sysevent.fs.zfs.scrub_start**: Scrub started.

**sysevent.fs.zfs.resilver_finish**: Resilver completed.

# DESCRIPTION

**zpool events** displays the internal event log maintained by ZFS since the kernel module was loaded. Events include errors, pool state changes, scrub operations, and device status updates.

The event log is stored in RAM with a configurable maximum size. Events are invaluable for diagnosing hardware problems, tracking pool operations, and understanding ZFS behavior.

The ZFS Event Daemon (zed) monitors these events in real-time and can trigger scripts for notifications or automated responses to events.

# CAVEATS

Events stored in RAM; lost on reboot or module unload. Log size limited by zfs_event_len_max parameter. Use zed for persistent event handling and alerting.

# HISTORY

The ZFS event system provides visibility into pool operations and errors that traditional filesystems lack. It enables proactive monitoring and automated responses through the zed daemon, making ZFS self-healing capabilities more accessible.

# SEE ALSO

[zpool-status](/man/zpool-status)(8), [zpool](/man/zpool)(8), [zed](/man/zed)(8), [zfs](/man/zfs)(8)
