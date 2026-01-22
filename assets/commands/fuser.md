# TLDR

Find processes accessing a **file or directory**

```fuser path/to/file```

Show **verbose** output with user and command

```fuser -v path/to/file```

Find processes using a **TCP port**

```fuser 80/tcp```

Find processes using a **UDP port**

```fuser 53/udp```

**Kill** processes accessing a file

```fuser -k path/to/file```

Find processes accessing a **mounted filesystem**

```fuser -m /mnt/usb```

Kill processes on a **TCP port**

```fuser -k 8080/tcp```

# SYNOPSIS

**fuser** [_-fuv_] [_-a_|_-s_] [_-4_|_-6_] [_-c_|_-m_|_-n space_] [_-k_ [_-i_] [_-SIGNAL_]] _name_...

# DESCRIPTION

**fuser** displays the PIDs of processes using specified files or file systems. It can identify which processes have files open, executables running, or sockets in use, and optionally terminate them.

# ACCESS TYPE INDICATORS

**c**: Current directory
**e**: Executable being run
**f**: Open file
**F**: Open file for writing
**r**: Root directory
**m**: Memory-mapped file or shared library

# PARAMETERS

**-a, --all**
> Display all specified files, including those not accessed

**-k, --kill**
> Kill processes accessing the file (SIGKILL by default)

**-i, --interactive**
> Ask for confirmation before killing

**-m, --mount NAME**
> Target processes accessing a mounted filesystem

**-M, --ismountpoint**
> Only match if target is a mount point

**-n, --namespace SPACE**
> Select namespace: file, tcp, or udp

**-u, --user**
> Include process owner usernames

**-v, --verbose**
> Display processes in ps-like format

**-s, --silent**
> Operate silently

**-4, --ipv4**
> Search IPv4 sockets only

**-6, --ipv6**
> Search IPv6 sockets only

**-SIGNAL**
> Send specified signal instead of SIGKILL

**-l, --list-signals**
> List available signal names

# CAVEATS

The **-k** option kills processes with SIGKILL by default, which cannot be caught. Use **-i** to confirm before killing. Root privileges may be needed to see all processes.

# HISTORY

**fuser** is part of the **psmisc** package, providing tools for managing processes by file access.

# SEE ALSO

[lsof](/man/lsof)(8), [kill](/man/kill)(1), [killall](/man/killall)(1), [ps](/man/ps)(1)
