# TAGLINE

same as last, but shows failed login attempts as recorded in /var/log/btmp

# TLDR

List **failed login attempts**

```sudo lastb```

List failed logins **since** a date

```sudo lastb -s [YYYY-MM-DD]```

List failed logins **until** a date

```sudo lastb -t [YYYY-MM-DD]```

Show users who were **present** at a specific time

```sudo lastb -p [YYYY-MM-DD HH:MM]```

Resolve IPs to **hostnames**

```sudo lastb -d```

Limit output to a specific **number of entries**

```sudo lastb -n [10]```

Show **full timestamps** including year and seconds

```sudo lastb -F```

Read from a **specific btmp file**

```sudo lastb -f [/var/log/btmp.1]```

# SYNOPSIS

**lastb** [_options_] [_username_...] [_tty_...]

# PARAMETERS

**-s**, **--since** _TIME_
> Display records since specified time

**-t**, **--until** _TIME_
> Display records until specified time

**-p**, **--present** _TIME_
> Display users who were present at specified time

**-d**, **--dns**
> Translate IP addresses to hostnames

**-n**, **--limit** _NUM_
> Limit output to NUM records

**-f**, **--file** _FILE_
> Read from specified file instead of /var/log/btmp

**-F**, **--fulltimes**
> Print full login and logout times and dates

**-i**, **--ip**
> Display IP addresses instead of hostnames

**-R**, **--nohostname**
> Suppress display of the hostname field

**-w**, **--fullnames**
> Display full user and domain names

**-x**, **--system**
> Display system shutdown entries and run level changes

**--time-format** _FORMAT_
> Output timestamp format: notime, short, full, or iso

# DESCRIPTION

**lastb** is the same as last, but shows failed login attempts as recorded in /var/log/btmp. It is useful for security auditing to identify brute force attacks or unauthorized access attempts.

The output shows username attempted, terminal, source address, and timestamp of each failed login.

# CAVEATS

Requires root privileges to read /var/log/btmp. The btmp file can grow large under attack; log rotation is recommended. File may not exist if never written to.

# HISTORY

lastb provides security auditing for failed logins, complementing the last command. The btmp file format mirrors wtmp but records failures instead of successful logins.

# SEE ALSO

[last](/man/last)(1), [lastlog](/man/lastlog)(8), [faillog](/man/faillog)(8), [utmpdump](/man/utmpdump)(1), [login](/man/login)(1)
