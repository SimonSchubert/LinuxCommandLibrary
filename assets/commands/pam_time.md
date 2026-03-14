# TAGLINE

PAM module for time-based access control

# TLDR

**Enable time-based access** in a PAM service configuration

```account required pam_time.so```

**Allow login only during business hours** (Mon-Fri 08:00-17:00)

```echo "login ; * ; * ; Wk0800-1700" >> /etc/security/time.conf```

**Restrict SSH access** for a specific user to weekdays

```echo "sshd ; * ; john ; Wk0000-2400" >> /etc/security/time.conf```

**Deny console login on weekends** for all users

```echo "login ; tty* ; !root ; !Wd0000-2400" >> /etc/security/time.conf```

# SYNOPSIS

**pam_time.so** [_debug_] [_noaudit_]

# PARAMETERS

**debug**
> Log verbose debugging information via syslog.

**noaudit**
> Do not report login denials to the audit subsystem.

# CONFIGURATION

Rules in **/etc/security/time.conf** use the format:

_services_ ; _ttys_ ; _users_ ; _times_

**services**
> PAM service names (e.g., login, sshd, su). Use * for all.

**ttys**
> Terminal names (e.g., tty1, pts/*). Use * for all.

**users**
> Usernames or groups. Prefix with ! to negate.

**times**
> Day/time ranges. Days: Mo Tu We Th Fr Sa Su Wk Wd Al. Times in HHMM-HHMM format. Prefix with ! to negate.

# DESCRIPTION

**pam_time** is a PAM module that restricts access to a system and/or specific applications at various times of the day and on specific days of the week. It does not authenticate the user but instead denies or allows access based on time rules defined in /etc/security/time.conf.

Rules are evaluated in order. Each rule specifies which services, terminals, and users are affected, along with permitted time windows. The module is typically used as an **account** type in PAM configuration.

# CAVEATS

The module only enforces restrictions at login time; it does not terminate active sessions when the allowed window expires. Lines in time.conf beginning with # are treated as comments. White space is ignored and lines can be extended with backslash continuation.

# HISTORY

**pam_time** is part of **Linux-PAM** (Pluggable Authentication Modules), providing time-based access control for system logins and services.

# SEE ALSO

[pam](/man/pam)(8), [pam_limits](/man/pam_limits)(8)

