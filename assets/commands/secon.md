# TAGLINE

Display SELinux security contexts

# TLDR

Get **current execution** context

```secon```

Get context of a **process**

```secon --pid 1```

Get context of a **file**

```secon --file path/to/file```

Get context of a **symlink** (don't resolve)

```secon --link path/to/symlink```

**Parse** a context specification

```secon system_u:system_r:container_t:s0```

# SYNOPSIS

**secon** [_options_] [_context_]

# PARAMETERS

**--pid** _pid_
> Get context of specified process

**--file** _path_
> Get context of file (follows symlinks)

**--link** _path_
> Get context of symlink (don't follow)

# DESCRIPTION

**secon** retrieves and displays SELinux security contexts. It can show the context of the current execution, processes, files, or parse context specifications.

Output includes user, role, type, and level components of the SELinux context.

# CAVEATS

Requires SELinux to be enabled. File context may differ from actual access context.

# HISTORY

Part of **libselinux-utils**, providing SELinux context inspection tools.

# SEE ALSO

[runcon](/man/runcon)(1), [chcon](/man/chcon)(1), [semanage](/man/semanage)(8)
