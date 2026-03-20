# TAGLINE

manages Linux containers using the LXD REST API

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

**Launch** container (create + start)

```lxc launch [remote:]image [container]```

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

**launch**
> Create and start a container (combines init + start)

**delete**
> Delete container

**copy**
> Copy container

**move**
> Move container between servers

**file** push|pull
> Transfer files to/from container

**config**
> Manage container configuration

**profile**
> Manage container profiles

**network**
> Manage networks

**storage**
> Manage storage pools and volumes

**remote**
> Manage remote servers

**--debug**
> Show all debug messages

**--force-local**
> Force using the local unix socket

**-h**, **--help**
> Print help

**--project** _PROJECT_
> Override the source project

**-q**, **--quiet**
> Do not show progress information

**-v**, **--verbose**
> Show all information messages

# CAVEATS

Requires LXD daemon running (lxd init to configure). Container names can be prefixed with remote server names for cluster operations. Manages both system containers and virtual machines. Note that lxc (LXD client) is distinct from the older lxc-* tools (liblxc).

# HISTORY

**lxc** is the command-line client for LXD, originally developed by **Canonical** starting in **2014** as a next-generation container manager. LXD provides system containers (similar to lightweight VMs) and virtual machines, managed through a REST API that the lxc client communicates with.

# SEE ALSO

[lxc-attach](/man/lxc-attach)(1), [lxc-start](/man/lxc-start)(1), [docker](/man/docker)(1), [podman](/man/podman)(1)
