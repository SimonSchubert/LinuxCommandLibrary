# TAGLINE

export container applications and binaries to host system

# TLDR

**Export an app** to the host

```distrobox-export -a [package] -ef "--foreground"```

**Export a binary** to host

```distrobox-export -b [path/to/binary] -ep [path/to/binary_on_host]```

Export binary to **~/.local/bin**

```distrobox-export -b [path/to/binary] -ep [path/to/export]```

**Export a service** as root

```distrobox-export --service [package] -ef "--allow-newer-config" -S```

**Delete** an exported application

```distrobox-export -a [package] -d```

# SYNOPSIS

**distrobox-export** [_options_]

# DESCRIPTION

**distrobox-export** exports applications, binaries, or services from a Distrobox container to the host system. Exported apps appear in the host's application menu, and binaries become available in the host's PATH.

Run this command from inside the container.

# PARAMETERS

**-a, --app** _app_
> Export application (creates desktop entry)

**-b, --bin** _binary_
> Export binary

**-s, --service** _service_
> Export systemd service

**-ep, --export-path** _path_
> Destination path for binary

**-ef, --extra-flags** _flags_
> Extra flags for exported item

**-S, --sudo**
> Run service as root inside container

**-d, --delete**
> Remove exported item

# CAVEATS

Must be run from inside the container. Exported apps depend on the container running. Deleting the container breaks exported applications.

# SEE ALSO

[distrobox](/man/distrobox)(1), [distrobox-enter](/man/distrobox-enter)(1)
