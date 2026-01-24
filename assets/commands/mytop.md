# TLDR

**Monitor MySQL queries**

```mytop```

**Connect to specific database**

```mytop -u [user] -p [password] -d [database]```

**Connect to remote server**

```mytop -h [hostname] -u [user] -p [password]```

**Slow query mode**

```mytop -s [5]```

**Show idle connections**

```mytop -i```

**Specify refresh interval**

```mytop --delay [3]```

# SYNOPSIS

**mytop** [_-u user_] [_-p pass_] [_-h host_] [_-d database_] [_options_]

# PARAMETERS

**-u** _USER_
> MySQL username.

**-p** _PASS_
> MySQL password.

**-h** _HOST_
> MySQL server hostname.

**-d** _DB_
> Default database.

**-P** _PORT_
> MySQL port.

**-s** _SECONDS_
> Slow query threshold.

**-i**
> Show idle connections.

**--delay** _SECONDS_
> Refresh interval.

**--color**
> Use ANSI color.

**--batch**
> Batch mode (no updates).

# KEY COMMANDS

**q**
> Quit.

**k**
> Kill a query/thread.

**f**
> Toggle full query display.

**s**
> Change sort column.

**r**
> Reverse sort order.

**p**
> Pause display.

**?**
> Help.

# DESCRIPTION

**mytop** displays MySQL server activity in real-time, similar to top for processes. It shows running queries, connections, and server statistics.

The display includes query threads with their states, execution times, and SQL text. Long-running queries stand out for attention.

Server statistics show queries per second, slow queries, threads connected, and cache hit rates. These metrics help identify performance issues.

Slow query mode filters display to queries exceeding a time threshold. This focuses attention on problematic operations.

The kill command terminates runaway queries. Combined with filtering, it helps manage query overload situations.

Connection to remote servers enables monitoring multiple databases from one location.

# CAVEATS

Requires MySQL PROCESS privilege. Some features need SUPER privilege. Not actively maintained - consider alternatives like innotop. May not support all MariaDB features.

# HISTORY

**mytop** was written by **Jeremy Zawodny** around **2000** when he worked at Yahoo. It became a standard tool for MySQL administrators, filling the gap for real-time server monitoring before such features were built into management tools.

# SEE ALSO

[innotop](/man/innotop)(1), [mysql](/man/mysql)(1), [mysqladmin](/man/mysqladmin)(1), [pt-query-digest](/man/pt-query-digest)(1)
