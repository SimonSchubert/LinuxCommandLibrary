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

**pam_time.so** [**conffile=**_file_] [**debug**] [**noaudit**]

# PARAMETERS

**conffile=**_file_
> Use an alternative time.conf style configuration file.

**debug**
> Log debugging information via syslog.

**noaudit**
> Do not report login denials to the audit subsystem.

# CONFIGURATION

Rules in **/etc/security/time.conf** use the format:

_services_ ; _ttys_ ; _users_ ; _times_

**services**
> Logic list of PAM service names (e.g., login, sshd, su). Use * for all. Tokens can be combined with & (and) and | (or).

**ttys**
> Terminal names (e.g., tty1, pts/*). Use * for all.

**users**
> Logic list of users, or a netgroup. Prefix with ! to negate.

**times**
> Day/time ranges during which access is allowed. Days: Mo Tu We Th Fr Sa Su Wk (weekdays) Wd (weekend) Al (all). Times in HHMM-HHMM format. Prefix with ! to negate. A finish time smaller than the start time applies to the following day.

# DESCRIPTION

**pam_time** is a PAM module that restricts access to a system and/or specific applications at various times of the day and on specific days of the week. It does not authenticate the user but instead denies or allows access based on time rules defined in /etc/security/time.conf.

Each rule specifies which services, terminals, and users are affected, along with permitted time windows. All rules are checked, and access is denied if any matching rule's time field is not satisfied. The module provides only the **account** type.

# CAVEATS

The module only enforces restrictions at login time; it does not terminate active sessions when the allowed window expires. Text following # in time.conf is ignored to the end of the line. White space is ignored and lines can be extended with backslash continuation.

# HISTORY

**pam_time** is part of **Linux-PAM** (Pluggable Authentication Modules), providing time-based access control for system logins and services.

# SEE ALSO

[pam](/man/pam)(8), [pam_limits](/man/pam_limits)(8)

# RESOURCES

```[Source code](https://github.com/linux-pam/linux-pam)```

```[Documentation](https://man7.org/linux/man-pages/man8/pam_time.8.html)```

<!-- verified: 2026-11-09 -->
