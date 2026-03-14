# TAGLINE

lists Linux containers on the system

# TLDR

List **all** containers

```sudo lxc-ls```

List **active** containers

```sudo lxc-ls --active```

List **frozen** containers

```sudo lxc-ls --frozen```

List **stopped** containers

```sudo lxc-ls --stopped```

List with **fancy output**

```sudo lxc-ls --fancy```

List with **custom fancy columns**

```sudo lxc-ls --fancy -F [NAME,STATE,IPV4,IPV6]```

List containers matching a **regex filter**

```sudo lxc-ls --filter ['^web.*']```

# SYNOPSIS

**lxc-ls** [_options_]

# DESCRIPTION

**lxc-ls** lists Linux containers on the system. It can filter by state and display detailed information in various formats.

# PARAMETERS

**--active**
> Show running and frozen containers

**--frozen**
> Show only frozen containers

**--running**
> Show only running containers

**--stopped**
> Show only stopped containers

**-f, --fancy**
> Column-formatted detailed output

**-F, --fancy-format COLS**
> Custom columns for fancy output

**-1**
> One container per line

**--filter** _regex_
> Filter container names by regular expression

**-?, --help**
> Display help information

# FANCY OUTPUT COLUMNS

NAME, STATE, AUTOSTART, GROUPS, IPV4, IPV6, UNPRIVILEGED

# CAVEATS

Requires root or appropriate LXC permissions for system containers. Unprivileged containers can be listed without root if configured for the current user.

# SEE ALSO

[lxc-info](/man/lxc-info)(1), [lxc-start](/man/lxc-start)(1), [lxc-stop](/man/lxc-stop)(1), [lxc-create](/man/lxc-create)(1), [lxc-destroy](/man/lxc-destroy)(1)
