# TLDR

Set **capability**

```setcap 'cap_net_raw' path/to/file```

Set **multiple** capabilities

```setcap 'cap_dac_read_search,cap_sys_tty_config+ep' path/to/file```

**Remove** all capabilities

```setcap -r path/to/file```

**Verify** capabilities

```setcap -v 'cap_net_raw' path/to/file```

Set for **namespace**

```setcap -n root_uid 'cap_net_admin' path/to/file```

# SYNOPSIS

**setcap** [_OPTIONS_] _capabilities_ _file_

# DESCRIPTION

**setcap** sets capabilities on files, allowing processes to gain specific elevated privileges without full root access. This provides fine-grained security control as an alternative to setuid binaries.

# PARAMETERS

**-r**
> Remove all capabilities from file

**-v**
> Verify specified capabilities match file

**-n** _rootuid_
> Set capabilities for specific user namespace

**+e**
> Effective flag - capability is active

**+p**
> Permitted flag - capability can be used

**+i**
> Inheritable flag - passed to child processes

# CAVEATS

Modifying capabilities requires root privileges. Capabilities are cleared when a file is modified. Common capabilities include cap_net_raw (raw sockets), cap_net_admin (network admin), and cap_sys_admin (various system admin tasks).

# HISTORY

**setcap** is part of **libcap**, implementing POSIX 1003.1e capabilities on Linux.

# SEE ALSO

[getcap](/man/getcap)(8), [capabilities](/man/capabilities)(7)
