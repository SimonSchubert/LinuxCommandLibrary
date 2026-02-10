# TAGLINE

same as last, but shows failed login attempts as recorded in /var/log/btmp

# TLDR

List **failed login attempts**

```sudo lastb```

List failed logins **since** a date

```sudo lastb -s [YYYY-MM-DD]```

List failed logins **until** a date

```sudo lastb -t [YYYY-MM-DD]```

List failed logins **at** a specific time

```sudo lastb -p [hh:mm]```

Resolve IPs to **hostnames**

```sudo lastb -d```

# SYNOPSIS

**lastb** [_options_] [_username_]

# PARAMETERS

**-s**, **--since** _TIME_
> Show records since specified time

**-t**, **--until** _TIME_
> Show records until specified time

**-p**, **--present** _TIME_
> Show records at specified time

**-d**, **--dns**
> Translate IP addresses to hostnames

**-n**, **--limit** _NUM_
> Limit output to NUM records

**-i**, **--ip**
> Display IP addresses

# DESCRIPTION

**lastb** is the same as last, but shows failed login attempts as recorded in /var/log/btmp. It is useful for security auditing to identify brute force attacks or unauthorized access attempts.

The output shows username attempted, terminal, source address, and timestamp of each failed login.

# CAVEATS

Requires root privileges to read /var/log/btmp. The btmp file can grow large under attack; log rotation is recommended. File may not exist if never written to.

# HISTORY

lastb provides security auditing for failed logins, complementing the last command. The btmp file format mirrors wtmp but records failures instead of successful logins.

# SEE ALSO

[last](/man/last)(1), [lastlog](/man/lastlog)(8), [faillog](/man/faillog)(8)
