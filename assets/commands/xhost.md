# TAGLINE

Manage X server access control

# TLDR

**Display** the current access control list

```xhost```

**Allow** a specific host to connect

```xhost +[hostname]```

**Deny** a specific host from connecting

```xhost -[hostname]```

**Allow** all hosts to connect (disable access control - insecure)

```xhost +```

**Deny** all hosts except those explicitly allowed

```xhost -```

**Remove** a specific user or address using family prefix

```xhost -[family:name]```

# SYNOPSIS

**xhost** [[**+**|**-**]_name_...]

# PARAMETERS

**+_hostname_**
> Add host to access list

**-_hostname_**
> Remove host from access list

**+**
> Disable access control (allow all)

**-**
> Enable access control (restrict to list)

**+si:localuser:_user_**
> Allow local user

**-si:localuser:_user_**
> Deny local user

**+inet:_hostname_**
> Allow by IP family

# DESCRIPTION

**xhost** manages the X server access control list. It controls which hosts and users can connect to the X display server.

Family prefixes include: **inet** (IPv4), **inet6** (IPv6), **si** (server interpreted), **localuser** (local user), and **local** (local connections).

# CAVEATS

Using **xhost +** is a security risk as it allows any host to connect. For secure remote X access, use SSH X forwarding instead. Access changes are not persistent across X server restarts.

# HISTORY

**xhost** is one of the original X Window System utilities, providing basic access control since the early days of X11.

# SEE ALSO

[xauth](/man/xauth)(1), [X](/man/X)(7), [ssh](/man/ssh)(1)
