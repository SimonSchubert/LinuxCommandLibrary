# TLDR

**Start web file browser**

```filebrowser```

**Serve specific directory**

```filebrowser -r [/path/to/directory]```

**Specify address and port**

```filebrowser -a [0.0.0.0] -p [8080]```

**Use config file**

```filebrowser -c [config.json]```

**Create admin user**

```filebrowser users add [admin] [password] --perm.admin```

**Configure database**

```filebrowser -d [database.db]```

# SYNOPSIS

**filebrowser** [_options_]

# PARAMETERS

**-r**, **--root** _path_
> Root directory to serve.

**-a**, **--address** _addr_
> Listen address.

**-p**, **--port** _port_
> Listen port.

**-d**, **--database** _file_
> Database file path.

**-c**, **--config** _file_
> Config file path.

**--cert** _file_
> TLS certificate.

**--key** _file_
> TLS key.

# DESCRIPTION

**filebrowser** provides a web-based file management interface. Supports file upload, download, sharing, and includes a built-in editor. Useful for self-hosted file access.

# SEE ALSO

[nginx](/man/nginx)(8)

