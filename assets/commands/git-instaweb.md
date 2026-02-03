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

**git instaweb** instantly browses the working repository in gitweb. Starts a temporary web server for viewing repository history.

# SEE ALSO

[gitweb](/man/gitweb)(1), [git-daemon](/man/git-daemon)(1)

