# TLDR

**Start Git daemon**

```git daemon --base-path=[/path/to/repos]```

**Enable upload-pack**

```git daemon --enable=upload-pack --base-path=[/repos]```

**Allow push**

```git daemon --enable=receive-pack --base-path=[/repos]```

**Run in foreground**

```git daemon --verbose --base-path=[/repos]```

**Export all directories**

```git daemon --export-all --base-path=[/repos]```

# SYNOPSIS

**git** **daemon** [_options_] [_directory_...]

# PARAMETERS

**--base-path** _path_
> Base path for repositories.

**--export-all**
> Export all repositories.

**--enable** _service_
> Enable service.

**--disable** _service_
> Disable service.

**--port** _port_
> Listen port (default 9418).

**--listen** _host_
> Listen address.

**--verbose**
> Log details.

**--inetd**
> Run from inetd.

# DESCRIPTION

**git daemon** provides a simple server for Git repositories using the git:// protocol. Allows anonymous read (and optionally write) access.

# SEE ALSO

[git-http-backend](/man/git-http-backend)(1)

