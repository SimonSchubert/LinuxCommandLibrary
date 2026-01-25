# TLDR

**Start HAProxy**

```haproxy -f [/etc/haproxy/haproxy.cfg]```

**Check configuration**

```haproxy -c -f [/etc/haproxy/haproxy.cfg]```

**Reload configuration**

```haproxy -f [config.cfg] -sf $(pidof haproxy)```

**Start in daemon mode**

```haproxy -D -f [config.cfg]```

**Show version**

```haproxy -v```

# SYNOPSIS

**haproxy** [_options_] **-f** _config_

# PARAMETERS

**-f** _file_
> Configuration file.

**-c**
> Check configuration and exit.

**-D**
> Daemon mode.

**-sf** _pids_
> Soft-stop old processes.

**-st** _pids_
> Hard-stop old processes.

**-p** _pidfile_
> PID file path.

**-n** _maxconn_
> Maximum connections.

**-N** _maxconn_
> Default per-proxy maxconn.

**-d**
> Debug mode.

**-V**
> Verbose mode.

# DESCRIPTION

**HAProxy** is a high-performance TCP/HTTP load balancer and proxy. It distributes traffic across multiple servers, providing high availability, health checking, and SSL termination.

HAProxy is widely used in production environments for its reliability, performance, and extensive feature set including ACLs, rate limiting, and detailed statistics.

# CONFIG EXAMPLE

```
frontend http_front
    bind *:80
    default_backend http_back

backend http_back
    balance roundrobin
    server web1 192.168.1.1:80 check
    server web2 192.168.1.2:80 check
```

# CAVEATS

Configuration changes require reload. Complex ACLs need careful testing. Statistics require separate configuration. SSL setup needs certificate management.

# HISTORY

HAProxy was created by **Willy Tarreau** in **2000** and has become one of the most widely deployed load balancers. It powers high-traffic sites including GitHub, Reddit, and Stack Overflow.

# SEE ALSO

[nginx](/man/nginx)(1), [envoy](/man/envoy)(1), [traefik](/man/traefik)(1)
