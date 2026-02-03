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

**docker cp** copies files or directories between a container and the local filesystem. Works with both running and stopped containers. Uses tar internally for efficient transfer.

# SEE ALSO

[docker-container-cp](/man/docker-container-cp)(1), [docker](/man/docker)(1)

