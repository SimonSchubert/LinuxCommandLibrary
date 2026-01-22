# TLDR

**List** containers

```lxc list [match_string]```

List **images**

```lxc image list [remote:][match_string]```

**Create** container from image

```lxc init [remote:]image [container]```

**Start** container

```lxc start [remote:]container```

**Stop** container

```lxc stop [remote:]container```

Show container **info**

```lxc info [remote:]container```

Take **snapshot**

```lxc snapshot [remote:]container [snapshot_name]```

**Execute** command in container

```lxc exec [remote:]container [command]```

# SYNOPSIS

**lxc** _command_ [_options_]

# DESCRIPTION

**lxc** manages Linux containers using the LXD REST API. It provides a user-friendly interface for creating, managing, and interacting with system containers and virtual machines.

# PARAMETERS

**list**
> List containers

**image list**
> List available images

**init**
> Create container from image

**start**
> Start container

**stop**
> Stop container

**info**
> Show container details

**snapshot**
> Create container snapshot

**exec**
> Execute command in container

**delete**
> Delete container

**copy**
> Copy container

# CAVEATS

Requires LXD daemon running. Container names can be prefixed with remote server names for cluster operations.

# SEE ALSO

[lxc-attach](/man/lxc-attach)(1), [lxc-start](/man/lxc-start)(1), [docker](/man/docker)(1)
