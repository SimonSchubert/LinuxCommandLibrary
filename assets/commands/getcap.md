# TAGLINE

Linux capabilities viewer for files

# TLDR

Get **capabilities**

```getcap path/to/file```

**Recursive** search

```getcap -r path/to/dir```

Show **all** entries

```getcap -v path/to/file```

# SYNOPSIS

**getcap** [_OPTIONS_] _files_...

# DESCRIPTION

**getcap** displays the capabilities of specified files. Linux capabilities allow fine-grained privileges instead of running as root, enabling specific elevated permissions without full root access.

# PARAMETERS

**-r**
> Recursively search directories

**-v**
> Display all searched entries even if no capabilities set

**-n**
> Display numeric capability values

# CAVEATS

Capabilities are an alternative to setuid programs, providing more granular privilege control. Only files with capabilities set will show output by default.

# HISTORY

**getcap** is part of **libcap**, implementing POSIX 1003.1e capabilities on Linux.

# SEE ALSO

[setcap](/man/setcap)(8), [capabilities](/man/capabilities)(7)
