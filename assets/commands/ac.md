# TAGLINE

display user connect time statistics

# TLDR

Print how long the **current user** has been connected in hours

```ac```

Print how long **all users** have been connected in hours

```ac -p```

Print how long a **particular user** has been connected

```ac -p [username]```

Print connection time **per day** with totals

```ac -d -p [username]```

Display additional **compatibility** details

```ac --compatibility```

# SYNOPSIS

**ac** [_-d_] [_-p_] [_-y_] [_-f filename_] [_-a_] [_--compatibility_] [_people_]

# DESCRIPTION

**ac** generates a report of connect time in hours based on the logins and logouts recorded in the system's **wtmp** file. It calculates the difference between login and logout timestamps to determine how long each user has been connected. Output can be broken down by individual user, by day, or presented as an aggregate total. The wtmp file is maintained automatically by login-related system utilities such as **login**, **sshd**, and **init**.

# PARAMETERS

**-d, --daily-totals**
> Display totals for each calendar day instead of a single aggregate total

**-p, --individual-totals**
> Show connection time for each user separately plus overall total

**people**
> Calculate combined connect time for specified usernames (space-separated list)

**-f, --file filename**
> Read accounting data from specified file instead of system wtmp

**-a, --all-days**
> Include daily records even when no login activity occurred

**-y, --print-year**
> Display year alongside date information

**-z, --print-zeros**
> Print category totals that equal zero

**--complain**
> Display errors when wtmp file contains anomalies

**--reboots**
> Include time accrued between user login and system reboot events

**--supplants**
> Count time from login to next login when logout records are missing

**--timewarps**
> Include time when chronological inconsistencies occur in wtmp

**--compatibility**
> Enable all three compatibility flags (reboots, supplants, timewarps)

# CAVEATS

Connect time calculations depend on accurate wtmp records. System crashes or improper shutdowns may result in incomplete or inaccurate data.

# HISTORY

Part of **GNU Accounting Utilities**, based on traditional UNIX accounting tools. The GNU version offers enhanced functionality compared to traditional implementations.

# SEE ALSO

[last](/man/last)(1), [lastlog](/man/lastlog)(8), [login](/man/login)(1), [sa](/man/sa)(8), [wtmp](/man/wtmp)(5)
