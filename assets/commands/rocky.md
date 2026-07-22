# TAGLINE

Programmatic HTTP and WebSocket reverse proxy CLI

# TLDR

**Forward** all traffic from a local port to an upstream server

```rocky --port [8080] --forward [http://server:9000]```

**Forward selected routes** while ignoring everything else

```rocky --port [8080] --forward [http://server] --route "[/api/*, /images/*]"```

**Replay traffic** to a second backend (shadow / mirror requests)

```rocky --port [8080] --forward [http://primary] --replay [http://shadow]```

**Load balance** between multiple upstream servers

```rocky --port [8080] --balance "[http://a:9000, http://b:9000]"```

**Run from a TOML config file**

```rocky --config [path/to/rocky.toml]```

**Serve over HTTPS** with a key and certificate

```rocky --port [8443] --key [server.key] --cert [server.crt] --forward [http://backend]```

# SYNOPSIS

**rocky** [_options_]

# PARAMETERS

**-c** _file_, **--config** _file_
> Load configuration from a TOML file.

**-p** _port_, **--port** _port_
> TCP port for the local HTTP server.

**-f** _url_, **--forward** _url_
> Default upstream URL to forward traffic to.

**-r** _url_, **--replay** _url_
> Additional upstream that receives a copy of every request (replay/shadow target). Repeatable.

**-t** _routes_, **--route** _routes_
> Comma-separated list of route patterns to handle. Glob-style wildcards are supported.

**-b** _urls_, **--balance** _urls_
> Comma-separated list of upstream URLs to balance traffic between.

**-k** _file_, **--key** _file_
> Path to the SSL/TLS private key.

**-e** _file_, **--cert** _file_
> Path to the SSL/TLS certificate.

**-s**, **--secure**
> Enable strict SSL certificate validation when proxying to HTTPS upstreams.

**-m**, **--mute**
> Disable HTTP traffic logging.

**-d**, **--debug**
> Enable verbose debug output.

**-v**, **--version**
> Print the version and exit.

**-h**, **--help**
> Show usage help.

# DESCRIPTION

**rocky** is a middleware-oriented HTTP and WebSocket reverse proxy built on Node.js. The **rocky-cli** front-end exposes its core features through a single command so a proxy can be started without writing JavaScript. It can forward requests to one or more backends, replay traffic to shadow services, balance load across upstreams, and intercept or transform requests and responses on the fly.

Routes are expressed as glob patterns and matched against the request path, letting you proxy only specific endpoints while ignoring others. Replay targets receive a copy of each forwarded request, which is useful for blue/green deployments, regression testing against a new backend, or recording traffic for later analysis.

Configuration can be passed entirely on the command line or loaded from a TOML file via **--config**, making it easy to commit reproducible proxy setups alongside the rest of a project.

# CONFIGURATION

A typical **rocky.toml** file looks like this:

```
port = 8080
forward = "http://127.0.0.1:9000"
replay = ["http://127.0.0.1:9001"]

[[routes]]
path = "/api/*"
forward = "http://api.internal:8080"

[[routes]]
path = "/static/*"
forward = "http://cdn.internal"
```

Command-line flags override values from the configuration file when both are supplied.

# CAVEATS

The upstream **rocky** project is **deprecated** and no longer actively maintained, so it should not be relied on for new production deployments. Because it runs on Node.js, performance under heavy load is lower than that of native proxies such as **nginx** or **HAProxy**. Glob route matching is greedy; order patterns from most specific to most general to avoid unexpected forwarding decisions.

# HISTORY

**rocky** was created by **Tomás Aparicio** (h2non) and released as an open-source Node.js HTTP proxy framework. The companion **rocky-cli** package shipped shortly afterwards to expose the same functionality without writing code. Both projects have been archived as deprecated, with users typically migrating to dedicated proxies such as **nginx**, **HAProxy**, or **Envoy**.

# INSTALL

```aur: yay -S rocky```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[nginx](/man/nginx)(8), [haproxy](/man/haproxy)(1), [caddy](/man/caddy)(1), [mitmproxy](/man/mitmproxy)(1), [socat](/man/socat)(1)
