# TAGLINE

lists information about files opened by running processes on Linux

# TLDR

List **all open files**

```lsfd```

List files by **process ID**

```lsfd -Q 'PID == [pid]'```

Find process with **file open**

```lsfd -Q "NAME == '[path/to/file]'"```

List **IPv4 sockets**

```lsfd -i4```

List **IPv6 sockets**

```lsfd -i6```

Display **help**

```lsfd --help```

# SYNOPSIS

**lsfd** [_options_]

# DESCRIPTION

**lsfd** lists information about files opened by running processes on Linux. It is a modern replacement for lsof with better performance and filtering capabilities using a SQL-like query language.

# PARAMETERS

**-Q, --filter EXPR**
> Filter output with expression

**-i4**
> Show IPv4 sockets only

**-i6**
> Show IPv6 sockets only

**-o, --output COLUMNS**
> Specify output columns

**-J, --json**
> Output in JSON format

**-n, --noheadings**
> Suppress column headers

**-h, --help**
> Display help information

# CAVEATS

Part of util-linux package. Requires Linux 5.12+ for full functionality. Filter syntax differs from lsof.

# SEE ALSO

[lsof](/man/lsof)(8), [fuser](/man/fuser)(1), [ss](/man/ss)(8)
