# TLDR

View **all login** history

```last```

View logins for a **specific user**

```last username```

Show **last 10** logins

```last -n 10```

Show logins with **full timestamps**

```last -F```

Show logins with **IP addresses** instead of hostnames

```last -i```

Show logins **since** a specific date

```last -s -7days```

View **system reboots**

```last reboot```

View **failed logins** (requires root)

```lastb```

# SYNOPSIS

**last** [_options_] [_username_...] [_tty_...]

# DESCRIPTION

**last** searches back through the /var/log/wtmp file and displays a list of all users logged in and out since that file was created. The related **lastb** command shows failed login attempts from /var/log/btmp.

# PARAMETERS

**-a, --hostlast**
> Display the hostname in the last column

**-d, --dns**
> Translate IP addresses to hostnames for remote logins

**-f, --file FILE**
> Use a different file instead of /var/log/wtmp

**-F, --fulltimes**
> Print full login and logout times and dates

**-i, --ip**
> Display IP addresses instead of hostnames

**-n, --limit NUM**
> Show only the specified number of lines

**-R, --nohostname**
> Do not display the hostname field

**-s, --since TIME**
> Display logins since the specified time

**-t, --until TIME**
> Display logins until the specified time

**-w, --fullnames**
> Display full user and domain names

**-x, --system**
> Display system shutdown entries and runlevel changes

**--time-format FORMAT**
> Define output time format (notime, short, full, iso)

# CAVEATS

The pseudo-user "reboot" logs entries each time the system is restarted, allowing boot history tracking. The wtmp and btmp files must exist; administrators may need to create them using **touch**.

# HISTORY

**last** has been a standard Unix utility since the early BSD systems, providing user login accounting functionality.

# SEE ALSO

[lastb](/man/lastb)(1), [who](/man/who)(1), [w](/man/w)(1), [utmp](/man/utmp)(5)
