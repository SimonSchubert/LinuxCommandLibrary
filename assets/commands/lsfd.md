# TAGLINE

lists information about files opened by running processes on Linux

# TLDR

List **all open files**

```lsfd```

List files by **process ID**

```lsfd -Q 'PID == [pid]'```

Find process with **file open**

```lsfd -Q "NAME == '[path/to/file]'"```

List files for **specific PID** (efficient)

```lsfd -p [pid]```

List **IPv4 sockets**

```lsfd -i4```

List **IPv6 sockets**

```lsfd -i6```

List with **specific columns**

```lsfd -o COMMAND,PID,TYPE,NAME```

# SYNOPSIS

**lsfd** [_options_]

# DESCRIPTION

**lsfd** lists information about file descriptors opened by running processes on Linux. It is a modern, Linux-specific replacement for lsof with better performance and filtering capabilities using a SQL-like query language. Part of util-linux.

# PARAMETERS

**-p, --pid** _PIDS_
> Collect information only for specified processes (more efficient than -Q).

**-Q, --filter** _EXPR_
> Filter output with expression (e.g. 'PID == 1234', "NAME == '/path'").

**-l, --threads**
> List in threads level.

**-i4**
> Show IPv4 sockets only.

**-i6**
> Show IPv6 sockets only.

**-o, --output** _COLUMNS_
> Specify output columns (use -H to list available columns).

**-r, --raw**
> Use raw output format.

**-J, --json**
> Output in JSON format.

**-n, --noheadings**
> Suppress column headers.

**-u, --notruncate**
> Do not truncate text in columns.

**-H, --list-columns**
> List available output columns.

**--summary**[=_WHEN_]
> Print summary information (only, append, or never).

# CAVEATS

Part of util-linux package. Requires Linux 5.12+ for full functionality. Filter syntax differs from lsof. Using **-p** is more efficient than **-Q** for filtering by PID. Column names may change in future releases.

# SEE ALSO

[lsof](/man/lsof)(8), [fuser](/man/fuser)(1), [ss](/man/ss)(8)
