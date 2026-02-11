# TAGLINE

Remove scheduled restic backup jobs

# TLDR

**Remove scheduled backup**

```resticprofile unschedule [profile]```

**Remove all schedules**

```resticprofile unschedule --all```

# SYNOPSIS

**resticprofile unschedule** [_options_] [_profile_]

# PARAMETERS

_profile_
> Profile name to unschedule.

**--all**
> Remove all scheduled profiles.

# DESCRIPTION

**resticprofile unschedule** removes scheduled backup jobs created by resticprofile schedule. Removes systemd timers, launchd jobs, or Windows Task Scheduler entries.

# SEE ALSO

[resticprofile](/man/resticprofile)(1), [resticprofile-schedule](/man/resticprofile-schedule)(1)

