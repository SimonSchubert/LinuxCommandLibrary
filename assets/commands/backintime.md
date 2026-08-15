# TAGLINE

Incremental rsync backups with hard-link snapshots

# TLDR

**Create a backup** for the current profile

```backintime backup```

**Create a backup** of a named profile

```backintime --profile [NAME] backup```

**List backup IDs**

```backintime show```

**Show the last backup** and its disk usage

```backintime show --last --usage```

**List configured profiles**

```backintime show --profiles```

**Restore a file** from the latest backup to its original path

```backintime restore [/path/to/file]```

**Restore a file** from a specific backup ID to a new location

```backintime restore [/path/to/file] [/path/to/dest] [BACKUP_ID]```

**Remove a backup** after confirmation

```backintime remove [BACKUP_ID]```

**Apply the Remove & Retention policy**

```backintime prune```

**Validate the config** and install crontab entries

```backintime check-config```

# SYNOPSIS

**backintime** [_global options_] _command_ [_args_]

# DESCRIPTION

**backintime** is the command-line client for **Back In Time**, a Linux backup tool that uses **rsync**(1) and filesystem hard links. Each run is a complete tree of every selected file, but only changed files are copied; unchanged files are hard-linked to the previous backup, so a backup looks like a full copy while using incremental space.

Profiles can store backups **locally**, over **SSH**, or encrypted with **gocryptfs** (local or SSH). Scheduling is done with **cron**(1); **check-config** writes the crontab entries. The Qt GUI is **backintime-qt**. Restore can be done from this CLI, the GUI, or a file manager browsing the dated backup directories.

The term **snapshot** was used until version 1.6.0; starting with 1.6.0 the project says **backup** so it is not confused with volume images.

# PARAMETERS

**-h**, **--help**
> Show help.

**-p** _NAME_|_ID_, **--profile** _NAME_|_ID_
> Select the profile by name or numeric ID.

**--config** _PATH_
> Read configuration from _PATH_ (default **$XDG_CONFIG_HOME/backintime/config**).

**--quiet**
> Suppress status messages on standard output.

**--debug**
> Print debug messages.

**-v**, **--version**
> Print the version.

**--license**
> Print the license.

**--diagnostics**
> Print diagnostic information for bug reports.

**backup**
> Create a new backup. Foreground runs always take a backup. **--background** daemonizes and does **not** force a run, so a scheduled job may skip when the profile is not due or the machine is on battery. **--checksum** compares files by checksum instead of size and mtime.

**show**
> List backup IDs (or paths with **--path**). **--last** limits the list to the youngest backup. **--profiles** lists profiles. **--usage** reports logical size, real disk use, and space saved by hard links.

**restore** [_WHAT_] [_WHERE_] [_BACKUP_ID_]
> Restore a file or directory. Empty _WHERE_ restores to the original location. _BACKUP_ID_ is an ID or an index (**0** = last backup, **-1** = oldest). **--delete** removes destination files that are not in the backup (dangerous on **/**). **--local-backup** / **--no-local-backup** control **FILE.backup.YYYYMMDD** safety copies. **--only-new** uses rsync **--update**.

**remove** [_BACKUP_ID_ ...]
> Delete one or more backups. **--skip-confirmation** skips the prompt.

**prune**
> Delete backups according to the profile's Remove & Retention policy.

**unmount**
> Unmount the current profile.

**shutdown**
> Power off after the running backup finishes.

**check-config**
> Verify the configuration, create backup destination paths, and install crontab entries. **--no-crontab** skips crontab changes.

**pw-cache** [_start_|_stop_|_restart_|_reload_|_status_]
> Control the password-cache daemon used by non-interactive cron jobs.

# CONFIGURATION

Per-user file at **~/.config/backintime/config** (`$XDG_CONFIG_HOME/backintime/config`). Lines are **keyword=value**; values are not quoted. Profiles are numbered (**profile1**, **profile2**, …). A global **/etc/backintime/config** is no longer supported.

Typical keys:

```
profile1.snapshots.mode=local
profile1.snapshots.path=/mnt/backup
profile1.schedule.mode=20
profile1.schedule.time=200
```

**profile\<N\>.snapshots.mode** is **local**, **ssh**, or an encrypted gocryptfs mode. **profile\<N\>.snapshots.path** is the local destination and must contain a **backintime/\<HOST\>/\<USER\>/\<PROFILE_ID\>** tree. **profile\<N\>.schedule.mode** selects the crontab schedule (**0** = disabled, **20** = daily, **30** = weekly, and others). Run **backintime check-config** after editing to validate the file, create the destination, and refresh crontab. Example files ship under **/usr/share/doc/backintime-common/examples/**.

# CAVEATS

This is a file-level backup tool, not a full-system imager; use something like **timeshift** or a disk-clone tool for OS restore. Cloud drives that are not a real filesystem or SSH target do not work. EncFS modes were removed in 2.0; remaining EncFS profiles are stripped from the config on load (a backup of the file is kept). Destination filesystems should support Unix hard links; NTFS and many Samba shares are a poor fit. **restore --delete** can destroy a system if pointed at **/**. rsync exit code 23 is reported as an error even when only some files failed (for example dangling symlinks).

# HISTORY

**Back In Time** was created by **Oprea Dan** in **2008**, inspired by **FlyBack**. **Germar Reitze** maintained it from about **2012** to **2019**, adding SSH destinations, EncFS encryption, and a single **backintime-qt** GUI. After a quiet period, **Christian Buhtz**, **Jürgen Altfeld**, and **Michael Büker** restarted development in **2022**. Version **2.0** (release candidate **2026**) drops EncFS in favor of **gocryptfs**.

# INSTALL

```apt: sudo apt install backintime-common```

```dnf: sudo dnf install backintime-common```

```aur: yay -S backintime```

```zypper: sudo zypper install backintime```

```nix: nix profile install nixpkgs#backintime```

<!-- packages: 2026-08-15 -->

# SEE ALSO

[rsync](/man/rsync)(1), [cron](/man/cron)(8), [timeshift](/man/timeshift)(1), [restic](/man/restic)(1), [borg](/man/borg)(1), [duplicity](/man/duplicity)(1), [gocryptfs](/man/gocryptfs)(1), [ssh](/man/ssh)(1)

# RESOURCES

```[Source code](https://github.com/bit-team/backintime)```

```[Documentation](https://backintime.readthedocs.io)```

<!-- verified: 2026-08-16 -->
