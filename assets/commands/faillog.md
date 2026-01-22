# TLDR

**Display failure** records

```faillog```

**Show failures for** user

```faillog -u [username]```

**Set failure limit**

```faillog -m [5] -u [username]```

**Reset failure count**

```faillog -r -u [username]```

**Set lockout time**

```faillog -l [600] -u [username]```

# SYNOPSIS

**faillog** [_options_]

# PARAMETERS

**-a**, **--all**
> Display all users with failures.

**-u** _USER_, **--user** _USER_
> Specify user to query or modify.

**-m** _MAX_, **--maximum** _MAX_
> Set maximum failures before lockout.

**-r**, **--reset**
> Reset failure count.

**-l** _SECONDS_, **--lock-time** _SECONDS_
> Set lockout duration.

**-t** _DAYS_, **--time** _DAYS_
> Show failures within N days.

**--help**
> Display help information.

# DESCRIPTION

**faillog** displays and manages login failure records from /var/log/faillog. It tracks failed login attempts and can enforce account lockouts after reaching a threshold.

Administrators use faillog to monitor suspicious login activity, set failure limits before account lockout, and reset counters after legitimate users are locked out. The database persists across reboots.

faillog integrates with PAM for automated account locking based on failed authentication attempts.

# CAVEATS

Requires root for modifications. Depends on PAM configuration. Not all systems use faillog database. May be superseded by pam_tally2.

# HISTORY

faillog is part of the **shadow-utils** package, providing login failure tracking since early Linux distributions. It predates more modern PAM-based accounting but remains available for compatibility.

# SEE ALSO

[lastlog](/man/lastlog)(1), [pam_tally2](/man/pam_tally2)(8), [login](/man/login)(1)
