# TLDR

**Connect to WebDAV server**

```cadaver [http://dav.example.com/]```

**Connect with specific port**

```cadaver [http://example.com:8080/path/]```

**Connect via HTTPS**

```cadaver [https://secure.example.com/]```

**Connect through proxy**

```cadaver -p [proxy:8080] [http://dav.example.com/]```

**Use custom rcfile**

```cadaver -r [~/.myrc] [http://dav.example.com/]```

# SYNOPSIS

**cadaver** [_options_] _URL_

# DESCRIPTION

**cadaver** is a command-line WebDAV client for Unix systems. It supports file upload, download, on-screen display, in-place editing, namespace operations, collection management, property manipulation, and resource locking.

Operation is similar to ftp(1) and smbclient(1).

# PARAMETERS

**-t**, **--tolerant**
> Allow cd/open into non-WebDAV collections

**-r** _file_, **--rcfile**=_file_
> Use specified rcfile instead of ~/.cadaverrc

**-p** _host[:port]_, **--proxy**=_host[:port]_
> Connect through proxy server

**-V**, **--version**
> Show version

**-h**, **--help**
> Show help

# INTERACTIVE COMMANDS

**ls** [_path_]
> List collection contents

**cd** _path_
> Change to collection

**pwd**
> Show current collection

**get** _file_
> Download file

**put** _file_
> Upload file

**mkcol** _name_
> Create collection (directory)

**delete** _file_
> Delete resource

**copy** _src_ _dest_
> Copy resource

**move** _src_ _dest_
> Move resource

**edit** _file_
> Edit file in place

# CONFIGURATION

**~/.cadaverrc**
> User settings and scripts

**~/.netrc**
> Auto-login credentials

# CAVEATS

URL must be absolute with http: or https: scheme. Some servers may have WebDAV compliance issues; use -t flag for tolerance.

# SEE ALSO

[curl](/man/curl)(1), [ftp](/man/ftp)(1), [smbclient](/man/smbclient)(1)
