# TAGLINE

Concurrent Ruby web server

# TLDR

**Start Puma server**

```puma```

**Start with config**

```puma -C [config/puma.rb]```

**Start on specific port**

```puma -p [3000]```

**Start with workers**

```puma -w [4]```

**Start in daemon mode**

```puma -d```

# SYNOPSIS

**puma** [_options_] [_rackup file_]

# PARAMETERS

**-p**, **--port** _port_
> Listen port.

**-b**, **--bind** _uri_
> Bind URI.

**-C**, **--config** _file_
> Configuration file.

**-w**, **--workers** _n_
> Number of workers.

**-t**, **--threads** _min:max_
> Thread pool size.

**-d**, **--daemon**
> Daemonize process.

**-e**, **--environment** _env_
> Environment (development, production).

# DESCRIPTION

**Puma** is a fast, concurrent Ruby/Rack web server. It uses threads and optional workers for parallelism, making it suitable for production Rails deployments.

# EXAMPLES

```bash
# Start on port 3000
puma -p 3000

# With workers and threads
puma -w 4 -t 8:32

# Bind to Unix socket
puma -b unix:///tmp/puma.sock

# Production mode
puma -e production -w 4

# With config file
puma -C config/puma.rb
```

# CONFIGURATION (puma.rb)

```ruby
workers 4
threads 4, 16
port 3000
environment 'production'
preload_app!

on_worker_boot do
  ActiveRecord::Base.establish_connection
end
```

# CAVEATS

Ruby/Rack required. Workers require copy-on-write. Use with reverse proxy in production.

# HISTORY

Puma was created by **Evan Phoenix** in 2011 as a replacement for Mongrel, focusing on concurrent request handling.

# SEE ALSO

[unicorn](/man/unicorn)(1), [passenger](/man/passenger)(1), [rails](/man/rails)(1), [rack](/man/rack)(1)
