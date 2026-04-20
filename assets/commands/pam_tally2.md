# TAGLINE

tracks login attempts

# TLDR

**Enable login attempt tracking**

```auth required pam_tally2.so deny=5 unlock_time=900```

**View user's tally**

```pam_tally2 --user=[username]```

**Reset user's tally**

```pam_tally2 --user=[username] --reset```

**Reset all tallies**

```pam_tally2 --reset```

# SYNOPSIS

**pam_tally2** [_options_]

# PARAMETERS

**deny=**_N_
> Lock the account after N consecutive failures.

**unlock_time=**_SECONDS_
> Auto-unlock a locked account after this many seconds.

**magic_root**
> Do not increment the counter for attempts made by uid 0.

**even_deny_root**
> Apply the deny policy to root too.

**root_unlock_time=**_SECONDS_
> Root unlock time (implies **even_deny_root**).

**no_lock_time**
> Do not apply the default lock time for repeated rapid attempts.

**lock_time=**_SECONDS_
> Pause this many seconds between failure and next prompt.

**file=**_PATH_
> Path to the tally database (default `/var/log/tallylog`).

**audit**
> Write details about every action to the audit subsystem.

**silent**, **no_log_info**
> Reduce syslog verbosity.

**--user** _NAME_
> Restrict the CLI action to a single user.

**--reset**[=_N_]
> Reset counter (optionally to _N_ instead of zero).

**--quiet**
> Suppress output when the user has no tally.

# DESCRIPTION

**pam_tally2** tracks login attempts. Locks accounts after failed attempts.

The module prevents brute force attacks. Successor to pam_tally.

# CAVEATS

**Deprecated**: removed from Linux-PAM 1.5.0 (2020). Modern distributions (RHEL 9+, Fedora 33+, Debian 12+) ship only **pam_faillock**. The tally database `/var/log/tallylog` is shared with the old `pam_tally` and is not compatible with pam_faillock's per-user files under `/var/run/faillock/`.

# HISTORY

pam_tally2 replaced pam_tally for **improved login tracking** and lockout.

# SEE ALSO

[pam](/man/pam)(8), [pam_faillock](/man/pam_faillock)(8)

