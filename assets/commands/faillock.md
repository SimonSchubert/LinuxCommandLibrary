# TAGLINE

authentication failure tracking and lockout manager

# TLDR

List **login failures** of current user

```faillock```

**Reset** failure records of current user

```faillock --reset```

List login failures of **all** users

```sudo faillock```

List failures of **specific** user

```sudo faillock --user [user]```

Reset failures of **specific** user

```sudo faillock --user [user] --reset```

# SYNOPSIS

**faillock** [_options_]

# DESCRIPTION

**faillock** displays and modifies authentication failure record files. Part of the PAM pam_faillock module, it tracks failed login attempts and can lock out accounts after too many failures.

Used for security monitoring and account lockout management.

# PARAMETERS

**--user** _user_
> Operate on specific user

**--reset**
> Reset failure records

**--dir** _dir_
> Use alternate tally directory

# CONFIGURATION

**/etc/security/faillock.conf**
> Configuration for pam_faillock module including lockout thresholds and duration.

# CAVEATS

Part of the Linux-PAM package. Records stored in /var/run/faillock/ by default. Requires root to view other users' records.

# SEE ALSO

[pam_faillock](/man/pam_faillock)(8), [pam](/man/pam)(8)
