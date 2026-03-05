# TAGLINE

TUI goroutine monitor for Go applications

# TLDR

**Monitor goroutines on localhost**

```roumon```

**Monitor a remote Go application**

```roumon -host=[192.168.10.1] -port=[8081]```

# SYNOPSIS

**roumon** [**-debug=**_logfile_] [**-host=**_host_] [**-port=**_port_]

# PARAMETERS

**-host** _HOST_
> Host address of the Go application's pprof server. Default: localhost.

**-port** _PORT_
> Port of the pprof HTTP server. Default: 6060.

**-debug** _LOGFILE_
> Enable debug logging to the specified file.

# DESCRIPTION

**roumon** is a TUI tool for monitoring goroutines in running Go applications. It connects to a Go app's pprof HTTP server and displays active goroutines in an interactive terminal interface, making it useful for debugging concurrency issues in Go programs.

# CAVEATS

Requires the target Go application to expose a pprof HTTP endpoint (typically via **net/http/pprof**).

# HISTORY

**roumon** was created by **Armin Becher** (becheran) and is written in **Go**.

# SEE ALSO

[pprof](/man/pprof)(1), [gotop](/man/gotop)(1), [htop](/man/htop)(1)
