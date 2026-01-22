# TLDR

Run Docker **daemon**

```dockerd```

Listen on **specific sockets**

```dockerd -H unix://[path/to/tmp.sock] -H tcp://[ip_address]```

Specify **PID file**

```dockerd -p [path/to/pid_file]```

Run in **debug mode**

```dockerd -D```

Set **log level**

```dockerd -l [debug|info|warn|error|fatal]```

# SYNOPSIS

**dockerd** [_options_]

# DESCRIPTION

**dockerd** is the Docker daemon process that manages containers, images, networks, and volumes. It's a persistent background service that listens for Docker API requests.

Usually managed by systemd rather than run directly.

# PARAMETERS

**-H, --host** _socket_
> Socket to listen on (unix://, tcp://, fd://)

**-p, --pidfile** _file_
> PID file path

**-D, --debug**
> Enable debug mode

**-l, --log-level** _level_
> Logging level

**--storage-driver** _driver_
> Storage driver (overlay2, devicemapper, etc.)

**--data-root** _path_
> Root directory for Docker data

# CAVEATS

Requires root privileges or proper group membership. Configuration typically via /etc/docker/daemon.json. Exposing TCP socket without TLS is insecure.

# SEE ALSO

[docker](/man/docker)(1), [systemctl](/man/systemctl)(1), [containerd](/man/containerd)(8)
