# TLDR

**List all open files**

```lsof```

**Files opened by user**

```lsof -u [username]```

**Files opened by process**

```lsof -p [pid]```

**Files using port**

```lsof -i :[port]```

**Network connections**

```lsof -i```

**Files in directory**

```lsof +D [/path/to/dir]```

**Process using file**

```lsof [/path/to/file]```

# SYNOPSIS

**lsof** [_options_] [_files_]

# PARAMETERS

_FILES_
> Specific files to check.

**-u** _USER_
> Files opened by user.

**-p** _PID_
> Files opened by process.

**-i** [_ADDR_]
> Network connections.

**+D** _DIR_
> Files in directory.

**-c** _COMMAND_
> Files opened by command.

**--help**
> Display help information.

# DESCRIPTION

**lsof** lists open files. On Unix, everything is a file including sockets and devices.

The tool shows processes using files, ports, and directories. Essential for troubleshooting.

lsof lists open files.

# CAVEATS

Requires root for all files. Output can be verbose. Performance impact on large systems.

# HISTORY

lsof was created by **Vic Abell** in 1988 and has become a standard Unix diagnostic tool.

# SEE ALSO

[fuser](/man/fuser)(1), [netstat](/man/netstat)(8), [ss](/man/ss)(8), [ps](/man/ps)(1)

