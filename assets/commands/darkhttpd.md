# TLDR

**Serve the current directory** on the default port

```darkhttpd .```

**Serve a specific directory** on a custom port

```darkhttpd [/path/to/webroot] --port [8080]```

**Bind to a specific address**

```darkhttpd . --addr [127.0.0.1]```

**Enable directory listing**

```darkhttpd . --index```

**Set a custom index file**

```darkhttpd . --index [home.html]```

**Serve with logging** to stdout

```darkhttpd . --log -```

**Serve with virtual hosting**

```darkhttpd . --forward [example.com] [http://backend:8000]```

**Run as a daemon** (background)

```darkhttpd . --daemon --pidfile [/var/run/darkhttpd.pid]```

# SYNOPSIS

**darkhttpd** _docroot_ [_--port port_] [_--addr address_] [_--daemon_] [_--log file_] [_--index file_] [_options_]

# PARAMETERS

**--port** _port_
> Port to listen on (default: 8080).

**--addr** _address_
> Address to bind to (default: all interfaces).

**--daemon**
> Fork into background.

**--pidfile** _file_
> Write PID to file when daemonized.

**--log** _file_
> Log requests to file (- for stdout).

**--index** _file_
> Default index file (or flag alone enables directory listing).

**--no-listing**
> Disable directory listing.

**--timeout** _seconds_
> Connection timeout (default: 60).

**--uid** _uid_
> Drop privileges to this user ID.

**--gid** _gid_
> Drop privileges to this group ID.

**--chroot**
> Chroot to docroot.

**--forward** _host_ _url_
> Forward requests for host to URL.

**--forward-https** _host_ _url_
> Forward HTTPS-originated requests.

**--no-keepalive**
> Disable HTTP keep-alive.

**--mimetypes** _file_
> Load MIME types from file.

# DESCRIPTION

**darkhttpd** is a simple, fast, and secure static web server. Written in C with no dependencies, it compiles to a single small binary that can serve static files with minimal resource usage.

The server is designed for simplicity: it serves files from a document root directory with proper MIME types, handles HTTP/1.1 keep-alive connections, and supports security features like chroot and privilege dropping. There's no configuration file; all options are command-line arguments.

Directory listing can be enabled with the **--index** flag (without a filename argument). Custom index files can be specified to override the default **index.html**. The server sends proper caching headers and handles range requests for resumable downloads.

For production use, darkhttpd supports daemonization, PID file creation, and logging. The chroot and uid/gid options provide security isolation. While not designed for high-traffic sites, it's excellent for local development, embedded systems, or serving static content where simplicity is valued.

# CAVEATS

Static files only; no CGI, PHP, or dynamic content support. No SSL/TLS; use a reverse proxy for HTTPS. No configuration file; all settings via command line. Limited to HTTP/1.1 features. Not suitable for high-concurrency production workloads.

# HISTORY

**darkhttpd** was created by Emil Mikulic in **2003** as a simple, portable HTTP server. The design philosophy emphasizes minimalism and security over features. The single-file C source compiles on virtually any Unix-like system without external dependencies, making it popular for embedded systems and minimal environments.

# SEE ALSO

[nginx](/man/nginx)(8), [python3](/man/python3)(1), [caddy](/man/caddy)(1), [lighttpd](/man/lighttpd)(8), [busybox](/man/busybox)(1)
