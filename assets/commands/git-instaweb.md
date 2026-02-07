# TAGLINE

Browse repository via web interface

# TLDR

**Start web interface**

```git instaweb```

**Start with specific server**

```git instaweb --httpd=[lighttpd]```

**Stop web server**

```git instaweb --stop```

**Restart web server**

```git instaweb --restart```

**Specify port**

```git instaweb --port=[8080]```

# SYNOPSIS

**git** **instaweb** [_options_]

# PARAMETERS

**--httpd** _daemon_
> HTTP daemon (lighttpd, apache2, webrick).

**--port** _port_
> Port number.

**--browser** _browser_
> Web browser to use.

**--stop**
> Stop the server.

**--restart**
> Restart the server.

**-l**, **--local**
> Bind to localhost only.

# DESCRIPTION

**git instaweb** instantly browses the working repository in gitweb by starting a temporary local web server. It provides a quick way to view repository history, branches, and files through a web interface without setting up a permanent server.

The command launches a web server (lighttpd, apache2, or webrick) and opens the repository in your default browser. The interface shows commits, file browsing, blame annotations, and diff viewing. When done, use `--stop` to shut down the server.

This is particularly useful for demonstrating repository history to others or when you prefer a graphical view but don't want to use a full GUI application. The web interface is read-only and doesn't require network access.

# SEE ALSO

[gitweb](/man/gitweb)(1), [git-daemon](/man/git-daemon)(1)
