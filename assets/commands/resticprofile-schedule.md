# TAGLINE

Schedule restic backup profile jobs

# TLDR

**Schedule backup profile**

```resticprofile schedule [profile]```

**Schedule all profiles**

```resticprofile schedule --all```

**Schedule with specific command**

```resticprofile schedule [profile] --[backup]```

# SYNOPSIS

**resticprofile schedule** [_options_] [_profile_]

# PARAMETERS

_profile_
> Profile name to schedule.

**--all**
> Schedule all profiles.

**--backup**
> Schedule backup command.

**--check**
> Schedule check command.

**--prune**
> Schedule prune command.

# DESCRIPTION

**resticprofile schedule** creates scheduled jobs for restic backup profiles. Integrates with systemd timers, launchd, or Windows Task Scheduler. Part of resticprofile wrapper for restic backup.

# INSTALL

```brew: brew install resticprofile```

```nix: nix profile install nixpkgs#resticprofile```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[resticprofile](/man/resticprofile)(1), [restic](/man/restic)(1), [resticprofile-unschedule](/man/resticprofile-unschedule)(1)

