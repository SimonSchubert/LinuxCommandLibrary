# TAGLINE

Simple Git protocol server for repository access

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

**git daemon** provides a simple, lightweight server for Git repositories using the git:// protocol. It enables anonymous read access to repositories by default, with optional write access when explicitly enabled, making it suitable for public repository hosting and internal network sharing.

The daemon listens on port 9418 by default and serves repositories from a specified base path. Unlike HTTP-based Git servers, git daemon requires no web server setup, offering minimal overhead for read-only repository access.

Security is intentionally limited: repositories must be explicitly exported (via --export-all or git-daemon-export-ok file), and write access should only be enabled in trusted environments. For production systems requiring authentication and encryption, HTTPS or SSH protocols are recommended instead.

# SEE ALSO

[git-http-backend](/man/git-http-backend)(1)
