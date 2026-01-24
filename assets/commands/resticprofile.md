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

**resticprofile** manages restic backup configurations. It provides profiles for different backup scenarios.

Profiles define repositories, paths, and options. Multiple profiles handle different backup needs.

Scheduling creates system timers or cron jobs. Backups run automatically.

Retention policies are profile-specific. Different data gets different retention.

Hooks run before and after operations. Useful for notifications and cleanup.

# CAVEATS

Requires restic installed. Config file format specific to resticprofile. Scheduler varies by OS.

# HISTORY

**resticprofile** was created as a configuration wrapper for **restic** backup. It simplifies managing multiple backup profiles and scheduling.

# SEE ALSO

[restic](/man/restic)(1), [borgbackup](/man/borgbackup)(1), [cron](/man/cron)(1)
