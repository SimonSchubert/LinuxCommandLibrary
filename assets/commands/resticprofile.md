# TAGLINE

Manage restic backup profiles and schedules

# TLDR

**Run backup**

```resticprofile backup```

**Run specific profile**

```resticprofile -n [profile] backup```

**Show configuration**

```resticprofile show```

**Initialize repository**

```resticprofile -n [profile] init```

**Schedule backups**

```resticprofile schedule```

**Run forget and prune**

```resticprofile forget```

**List snapshots**

```resticprofile snapshots```

**Generate config template**

```resticprofile generate```

# SYNOPSIS

**resticprofile** [_-n profile_] [_options_] _command_ [_args_]

# PARAMETERS

**-n**, **--name** _PROFILE_
> Profile to use.

**-c**, **--config** _FILE_
> Configuration file.

**-v**, **--verbose**
> Verbose output.

**-q**, **--quiet**
> Quiet mode.

**--dry-run**
> Simulate only.

# COMMANDS

**backup**
> Run backup.

**forget**
> Apply retention.

**prune**
> Remove unused data.

**snapshots**
> List snapshots.

**restore**
> Restore files.

**schedule**
> Manage schedules.

**init**
> Initialize repository.

# DESCRIPTION

**resticprofile** is a configuration wrapper for the restic backup tool that organizes backup settings into named profiles. Each profile defines a repository location, backup paths, exclusion patterns, retention policies, and scheduling rules, allowing complex backup strategies to be managed through a single configuration file rather than lengthy command-line arguments.

The tool integrates with system schedulers to automate backup operations. On Linux it creates systemd timers or cron jobs, and on macOS it uses launchd. Retention policies can differ between profiles, so frequently changing data can have short retention while archives keep longer histories. Pre- and post-operation hooks enable notifications, database dumps before backup, and cleanup tasks after completion.

All standard restic commands (backup, forget, prune, restore, snapshots) can be run through resticprofile with profile-specific settings automatically applied. The **generate** command creates starter configuration templates.

# CONFIGURATION

**profiles.conf** / **profiles.toml** / **profiles.yaml**
> Default configuration file (searched in current directory) defining backup profiles, repositories, schedules, and retention policies. Format auto-detected by extension.

# CAVEATS

Requires restic installed. Config file format specific to resticprofile. Scheduler varies by OS.

# HISTORY

**resticprofile** was created as a configuration wrapper for **restic** backup. It simplifies managing multiple backup profiles and scheduling.

# SEE ALSO

[restic](/man/restic)(1), [borgbackup](/man/borgbackup)(1), [cron](/man/cron)(1)
