# TAGLINE

copy files between containers and the host

# TLDR

**Copy file from container to host**

```docker cp [container]:[/path/to/file] [/local/path]```

**Copy file from host to container**

```docker cp [/local/file] [container]:[/path/in/container]```

**Copy directory recursively**

```docker cp [container]:[/path/to/dir] [/local/dir]```

**Copy preserving ownership**

```docker cp -a [container]:[/path] [/local/path]```

# SYNOPSIS

**docker** **cp** [_options_] _container:src_path_ _dest_path_

**docker** **cp** [_options_] _src_path_ _container:dest_path_

# PARAMETERS

**-a**, **--archive**
> Archive mode (copy all uid/gid information).

**-L**, **--follow-link**
> Follow symbolic links in source path.

**-q**, **--quiet**
> Suppress progress output.

# DESCRIPTION

**docker cp** copies files or directories between a container's filesystem and the local host filesystem, functioning bidirectionally for both container-to-host and host-to-container transfers. This command works with both running and stopped containers, making it useful for extracting logs, injecting configuration files, or backing up data.

The command uses tar internally for efficient transfer, streaming data between the container and host. Archive mode (**-a**) preserves file ownership and permissions, which is important when copying system files or maintaining consistent file attributes.

Unlike volume mounts which are configured at container creation, **docker cp** enables ad-hoc file transfer at any time during a container's lifecycle.

# SEE ALSO

[docker-container-cp](/man/docker-container-cp)(1), [docker](/man/docker)(1)
