# TAGLINE

Browse repository via web interface

# TLDR

**Start web interface**

```git instaweb```

**Start with specific HTTP daemon**

```git instaweb --httpd=[lighttpd]```

**Start on a specific port**

```git instaweb --port=[8080]```

**Start bound to localhost only**

```git instaweb --local```

**Stop the web server**

```git instaweb --stop```

**Restart the web server**

```git instaweb --restart```

# SYNOPSIS

**git** **instaweb** [_options_]

# PARAMETERS

**-d**, **--httpd** _daemon_
> HTTP daemon to use (lighttpd, apache2, mongoose, plackup, python, webrick). Default: lighttpd.

**-p**, **--port** _port_
> Port number to bind. Default: 1234.

**-b**, **--browser** _browser_
> Web browser to use for viewing.

**-m**, **--module-path** _path_
> Module path (only needed for Apache). Default: /usr/lib/apache2/modules.

**--start**
> Start the httpd instance and exit.

**--stop**
> Stop the httpd instance and exit.

**--restart**
> Restart the httpd instance and exit.

**-l**, **--local**
> Bind to localhost (127.0.0.1) only.

# DESCRIPTION

**git instaweb** instantly browses the working repository in gitweb by starting a temporary local web server. It provides a quick way to view repository history, branches, and files through a web interface without setting up a permanent server.

The command launches a web server (lighttpd by default, or apache2, mongoose, plackup, python, webrick) on port 1234 and opens the repository in your default browser. The interface shows commits, file browsing, blame annotations, and diff viewing. When done, use `--stop` to shut down the server.

This is particularly useful for demonstrating repository history to others or when you prefer a graphical view but don't want to use a full GUI application. The web interface is read-only and doesn't require network access.

# SEE ALSO

[gitweb](/man/gitweb)(1), [git-daemon](/man/git-daemon)(1)
