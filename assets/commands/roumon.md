# TAGLINE

TUI goroutine monitor for Go applications

# TLDR

**Monitor goroutines on localhost:6060 (pprof default)**

```roumon```

**Monitor a Go application on a remote host and port**

```roumon -host=[192.168.10.1] -port=[8081]```

**Write debug output to a log file**

```roumon -debug=[roumon.log]```

**Combine remote connection with debug logging**

```roumon -host=[app.example.com] -port=[6060] -debug=[roumon.log]```

**Show built-in help**

```roumon -h```

# SYNOPSIS

**roumon** [**-host=**_host_] [**-port=**_port_] [**-debug=**_logfile_]

# PARAMETERS

**-host** _HOST_
> Hostname or IP address of the pprof HTTP server. Default: `localhost`.

**-port** _PORT_
> Port of the pprof HTTP server. Default: `6060`.

**-debug** _LOGFILE_
> Enable debug logging and write diagnostics to the given file.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**roumon** is a terminal user interface for monitoring goroutines in running Go applications. It connects to a Go program's `net/http/pprof` endpoint and renders the live list of goroutines together with their stack traces, states, and labels, which makes it useful for hunting goroutine leaks and debugging concurrency issues.

Inside the TUI, press **F1** for help and **F10** or **Ctrl+C** to quit.

# CAVEATS

The target Go application must import and expose **net/http/pprof** on an HTTP listener. Only one roumon session should be attached to a pprof endpoint at a time to avoid noisy sampling.

# HISTORY

**roumon** was created by **Armin Becher** (becheran) and is written in Go. It is distributed as an open-source project on GitHub.

# SEE ALSO

[pprof](/man/pprof)(1), [dlv](/man/dlv)(1), [go](/man/go)(1), [gotop](/man/gotop)(1), [htop](/man/htop)(1)
