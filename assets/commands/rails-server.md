# TLDR

**Start the Rails development server**

```rails server```

**Start the server on a specific port**

```rails server -p [port]```

**Start the server binding to all interfaces**

```rails server -b 0.0.0.0```

**Start the server in production environment**

```rails server -e production```

**Start using a specific server** (Puma, Thin, etc.)

```rails server -u [puma|thin|webrick]```

**Start in daemon mode** (background)

```rails server -d```

# SYNOPSIS

**rails server** [**-p** _port_] [**-b** _address_] [**-e** _environment_] [**-d**] [**-u** _server_]

# PARAMETERS

**-p**, **--port** _PORT_
> Run server on specified port (default: 3000)

**-b**, **--binding** _IP_
> Bind to specified IP address (default: localhost)

**-e**, **--environment** _ENV_
> Run in specified environment (development, test, production)

**-d**, **--daemon**
> Run server as a daemon (background process)

**-u**, **--using** _SERVER_
> Use specified Rack server (puma, thin, webrick, etc.)

**-P**, **--pid** _FILE_
> Specify PID file path

**-C**, **--dev-caching**
> Toggle development mode caching

**--early-hints**
> Enable HTTP/2 early hints

**-h**, **--help**
> Show help information

# DESCRIPTION

**rails server** starts a web server for the Rails application. By default, it uses Puma and listens on http://localhost:3000 in the development environment.

The server automatically reloads code changes in development mode, allowing rapid iteration without restarts. It displays request logs in the terminal, showing HTTP methods, paths, response codes, and timing information.

Binding to 0.0.0.0 makes the server accessible from other machines on the network, useful for testing on mobile devices or from other computers.

# CAVEATS

The default binding to localhost (127.0.0.1) only accepts connections from the local machine. Use **-b 0.0.0.0** to accept external connections, but be aware of security implications.

Development mode is not suitable for production. It lacks performance optimizations and may expose debugging information. Always use **-e production** with a proper production configuration for deployed applications.

The daemon mode (**-d**) requires manual process management. Use process managers like systemd or Passenger for production deployments.

# SEE ALSO

[rails](/man/rails)(1), [puma](/man/puma)(1), [rails-routes](/man/rails-routes)(1), [bundle](/man/bundle)(1)
