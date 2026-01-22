# TLDR

List all **users**

```userdbctl user```

Show **specific** user

```userdbctl user [username]```

List all **groups**

```userdbctl group```

Show **specific** group

```userdbctl group [groupname]```

List **services** providing definitions

```userdbctl services```

# SYNOPSIS

**userdbctl** [_OPTIONS_] _COMMAND_ [_NAME_]

# COMMANDS

**user** [_NAME_]
> List users or show specific user

**group** [_NAME_]
> List groups or show specific group

**services**
> List services providing user/group definitions

# DESCRIPTION

**userdbctl** inspects users, groups, and group memberships on the system. It provides a unified interface to query user and group information from various sources including /etc/passwd, LDAP, and systemd-homed.

The tool aggregates information from all services registered with systemd-userdbd.

# CAVEATS

Systemd-based systems only. Output format differs from traditional getent. Some sources may require additional services running.

# SEE ALSO

[getent](/man/getent)(1), [id](/man/id)(1), [homectl](/man/homectl)(1)
