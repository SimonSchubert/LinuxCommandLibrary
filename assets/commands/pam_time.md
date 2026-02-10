# TAGLINE

restricts login by time

# TLDR

**Enable time-based access**

```account required pam_time.so```

**Configure in time.conf**

```echo "login ; * ; * ; Al0800-1700" >> /etc/security/time.conf```

# SYNOPSIS

**pam_time.so**

# PARAMETERS

Configuration in /etc/security/time.conf:

Format: services ; ttys ; users ; times

Time syntax: day/hour ranges

# DESCRIPTION

**pam_time** restricts login by time. Configures access schedules.

The module enforces time windows. Based on time.conf rules.

# CAVEATS

Account module. Requires time.conf. Time-based restrictions.

# HISTORY

pam_time provides **time-based access control** for system logins.

# SEE ALSO

[pam](/man/pam)(8), [time.conf](/man/time.conf)(5)

