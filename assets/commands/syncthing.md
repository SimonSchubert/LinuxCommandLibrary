# TLDR

**Start syncthing**

```syncthing```

**Start without opening browser**

```syncthing --no-browser```

**Start with specific home directory**

```syncthing --home=[/path/to/config]```

**Generate keys and config**

```syncthing --generate=[/path/to/config]```

**Reset to default config**

```syncthing --reset-deltas```

**Show device ID**

```syncthing --device-id```

**Show version**

```syncthing --version```

# SYNOPSIS

**syncthing** [_--home dir_] [_--no-browser_] [_--gui-address addr_] [_options_]

# PARAMETERS

**--home** _DIR_
> Configuration directory.

**--config** _DIR_
> Configuration file path.

**--data** _DIR_
> Data directory path.

**--no-browser**
> Don't open browser on start.

**--gui-address** _ADDR_
> GUI listen address.

**--gui-apikey** _KEY_
> Override GUI API key.

**--no-restart**
> Don't restart after upgrade.

**--device-id**
> Print device ID and exit.

**--generate** _DIR_
> Generate keys and config.

**--reset-database**
> Reset database.

**--reset-deltas**
> Reset delta index.

**--logfile** _FILE_
> Log to file.

**--logflags** _FLAGS_
> Log flags.

**--paused**
> Start with all devices paused.

**--verbose**
> Verbose output.

# DESCRIPTION

**Syncthing** is a continuous file synchronization program. It syncs files between devices in real-time, peer-to-peer, without requiring a central server.

Devices discover each other via local network, global discovery servers, or manual configuration. Data transfers directly between devices using TLS encryption. No third-party servers access file content.

The web GUI (default: localhost:8384) provides configuration and monitoring. Add devices by exchanging Device IDs - long cryptographic identifiers. Shared folders are configured per-device with specific folder IDs.

Conflict handling creates copies when the same file is modified on multiple devices before syncing. Version history can keep old file versions for recovery.

Selective sync allows ignoring files via patterns. File watching detects changes immediately on most platforms. Periodic scanning catches any missed changes.

Syncthing runs as a daemon, typically starting at login or as a system service. Multiple instances can run with different home directories.

# CAVEATS

Initial sync of large datasets takes time. Conflict files need manual resolution. Continuous syncing uses bandwidth. Discovery servers are public (though data isn't). Some filesystems don't support required features. Mobile battery usage can be significant.

# HISTORY

**Syncthing** was created by **Jakob Borg** in **2013** as an open-source alternative to proprietary sync services like Dropbox. It emphasizes privacy (no central server), security (all data encrypted), and openness (open-source, open protocol). The project has grown into a widely-used synchronization solution.

# SEE ALSO

[rsync](/man/rsync)(1), [rclone](/man/rclone)(1), [unison](/man/unison)(1)
