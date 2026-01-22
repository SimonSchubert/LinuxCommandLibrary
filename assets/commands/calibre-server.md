# TLDR

**Start content server with library**

```calibre-server [/path/to/library]```

**Start on specific port**

```calibre-server --port [8080] [/path/to/library]```

**Enable authentication**

```calibre-server --enable-auth --userdb [users.sqlite] [/path/to/library]```

**Manage user accounts**

```calibre-server --manage-users --userdb [users.sqlite]```

**Enable local write access**

```calibre-server --enable-local-write [/path/to/library]```

**Serve multiple libraries**

```calibre-server [/library1] [/library2]```

**Advertise via Bonjour**

```calibre-server --enable-use-bonjour [/path/to/library]```

# SYNOPSIS

**calibre-server** [_options_] [_library_path_...]

# DESCRIPTION

**calibre-server** exposes Calibre ebook libraries over the network. Users can access, browse, and read books directly in a web browser. The server supports OPDS feeds, offline caching, and authentication.

# PARAMETERS

**--port**=_number_
> Port to listen on (default: 8080)

**--listen-on**=_address_
> Interface to bind to (default: all)

**--enable-auth**
> Require password authentication

**--userdb**=_path_
> Path to SQLite user database

**--manage-users**
> Interactive user management mode

**--enable-local-write**
> Allow local clients to modify library

**--enable-use-bonjour**
> Advertise OPDS via Bonjour/mDNS

**--url-prefix**=_prefix_
> URL path prefix for reverse proxy

**--daemonize**
> Run as background daemon

**--pidfile**=_path_
> Write process ID to file

# FEATURES

**OPDS Feeds**
> Compatible with OPDS-based reading apps

**Offline Reading**
> Browser caches books for offline access

**Remote Access**
> Access library from any device on network

# CAVEATS

Enable authentication before exposing to internet. On macOS, binary is inside calibre.app bundle. Use --enable-local-write for calibredb remote access.

# SEE ALSO

[calibredb](/man/calibredb)(1), [calibre](/man/calibre)(1), [ebook-convert](/man/ebook-convert)(1)
