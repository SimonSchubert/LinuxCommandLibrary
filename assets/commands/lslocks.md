# TLDR

List **all locks**

```lslocks```

List with **specific columns**

```lslocks -o PID,COMMAND,PATH```

**Raw** output without headers

```lslocks --raw --noheadings```

List locks for **specific PID**

```lslocks --pid [pid]```

Output as **JSON**

```lslocks --json```

# SYNOPSIS

**lslocks** [_options_]

# DESCRIPTION

**lslocks** lists information about all file locks held on the local system. It shows advisory and mandatory locks, the holding process, and lock details.

# PARAMETERS

**-o, --output COLUMNS**
> Specify output columns

**-p, --pid PID**
> Show locks for specific process

**-J, --json**
> JSON output format

**-r, --raw**
> Raw output without formatting

**-n, --noheadings**
> Suppress column headers

**-u, --notruncate**
> Don't truncate output

# OUTPUT COLUMNS

**COMMAND**: Process name
**PID**: Process ID
**TYPE**: Lock type (FLOCK, POSIX, LEASE)
**SIZE**: Size of locked region
**PATH**: Locked file path

# SEE ALSO

[flock](/man/flock)(1), [lsof](/man/lsof)(8)
