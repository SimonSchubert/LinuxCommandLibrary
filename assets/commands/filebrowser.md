# TAGLINE

web-based file management interface

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

# CONFIGURATION

**config.json**
> Configuration file for server settings, authentication, and permissions.

**database.db**
> SQLite database storing users, permissions, and settings.

# DESCRIPTION

**filebrowser** provides a self-hosted web-based file management interface accessible through any browser. It creates a complete file server with upload, download, preview, search, and sharing capabilities, along with a built-in code editor for text files.

The application supports user authentication with granular permissions, allowing different access levels for different directories. Multiple users can be configured with individual permissions controlling read, write, execute, and sharing capabilities.

filebrowser is ideal for personal cloud storage, team file sharing, or providing controlled access to server directories without SSH. It includes features like drag-and-drop uploads, multi-file operations, and custom command execution hooks.

# SEE ALSO

[nginx](/man/nginx)(8)

