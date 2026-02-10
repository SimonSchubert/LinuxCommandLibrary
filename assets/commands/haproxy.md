# TAGLINE

high-performance TCP/HTTP load balancer and proxy

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

**HAProxy** (High Availability Proxy) is a high-performance TCP/HTTP load balancer and reverse proxy that distributes incoming traffic across pools of backend servers. Its configuration is organized around frontends (which accept client connections on bound addresses and ports) and backends (which define the set of servers that handle requests, along with the balancing algorithm -- round-robin, least-connections, source-hash, and others). Active health checks continuously probe backend servers and automatically remove unhealthy nodes from rotation.

Beyond basic load balancing, HAProxy provides SSL/TLS termination, HTTP header manipulation, content-based routing via ACLs, connection rate limiting, stick tables for session persistence, and a real-time statistics dashboard. It operates in an event-driven, single-process architecture that can handle hundreds of thousands of concurrent connections with low latency and minimal resource consumption, making it a standard choice for high-traffic production environments.

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
