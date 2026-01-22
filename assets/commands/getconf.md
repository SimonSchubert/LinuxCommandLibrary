# TLDR

List **all** configuration values available

```getconf -a```

List the configuration values for a **specific directory**

```getconf -a [path/to/directory]```

Check if the system is **32-bit or 64-bit**

```getconf LONG_BIT```

Check how many **processes** the current user can run at once

```getconf CHILD_MAX```

List every configuration value and filter with **grep**

```getconf -a | grep MAX```

# SYNOPSIS

**getconf** [_-v spec_] _system_var_
**getconf** [_-v spec_] _path_var_ _pathname_

# PARAMETERS

**-a**
> Display all configuration variables and their values

**-v** _SPEC_
> Use specification _SPEC_ for configuration values

**LONG_BIT**
> Number of bits in a long integer (32 or 64)

**CHILD_MAX**
> Maximum number of processes per user

**OPEN_MAX**
> Maximum number of files a process can have open

**PAGE_SIZE**
> System memory page size in bytes

**PATH_MAX**
> Maximum length of a file path

**HOST_NAME_MAX**
> Maximum length of a hostname

**_NPROCESSORS_ONLN**
> Number of processors currently online

# DESCRIPTION

**getconf** retrieves system configuration variables defined by POSIX and system-specific extensions. These values represent system limits and capabilities that applications can query to adapt their behavior.

Variables fall into two categories: system-wide values (like CHILD_MAX, PAGE_SIZE) and pathname-specific values (like PATH_MAX, NAME_MAX) that may vary by filesystem.

This is useful for shell scripts that need to query system limits without hardcoding values, ensuring portability across different systems.

# CAVEATS

Some values may be indeterminate (shown as "undefined"). Pathname-specific variables can return different values for different filesystems. Not all variables are supported on all systems.

# HISTORY

getconf is part of the POSIX standard and has been available on Unix-like systems since the early 1990s. It provides a standardized way to query the same configuration values that the C functions sysconf(), pathconf(), and confstr() return.

# SEE ALSO

[sysctl](/man/sysctl)(8), [ulimit](/man/ulimit)(1), [nproc](/man/nproc)(1)
