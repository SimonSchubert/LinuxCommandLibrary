# TAGLINE

manages ICE authorization entries

# TLDR

**List entries**

```iceauth list```

**Extract to file**

```iceauth extract [auth-file]```

**Add entry**

```iceauth add [protocol] [address] [auth-name] [auth-data]```

**Merge from file**

```iceauth merge [auth-file]```

# SYNOPSIS

**iceauth** [_options_] [_command_]

# PARAMETERS

_COMMAND_
> Command (list, add, remove, extract, merge).

**list**
> List authorization entries.

**add**
> Add entry.

**remove**
> Remove entry.

**extract**
> Extract to file.

**merge**
> Merge from file.

**--help**
> Display help information.

# DESCRIPTION

**iceauth** manages ICE (Inter-Client Exchange) authorization entries. ICE is used for communication between X11 clients.

The tool handles authentication records for X session managers and similar applications. It's analogous to xauth for X display connections.

# CAVEATS

X11 specific. Used by session managers. Low-level utility.

# HISTORY

iceauth is part of **X.Org** for managing ICE protocol authentication, used in X session management.

# SEE ALSO

[xauth](/man/xauth)(1), [xsm](/man/xsm)(1), [Xorg](/man/Xorg)(1)
