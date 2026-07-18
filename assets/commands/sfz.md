# TAGLINE

Simple static file server for local development

# TLDR

**Serve** the current directory on the default port

```sfz```

**Serve** a path on a port

```sfz -p [8080] [path]```

**Enable CORS** / address bind (see help)

```sfz --help```

# SYNOPSIS

**sfz** [*options*] [*path*]

# DESCRIPTION

**sfz** (**S**tatic **F**ile **Z**erver) is a small Rust CLI that serves a directory over HTTP—useful for quick local previews. Note: the original author has indicated limited maintenance; consider alternatives on crates.io for long-term projects.

# PARAMETERS

*path*

> Directory to serve (default: current directory).

**-p**, **--port** *port*

> Listen port.

Additional flags control address, CORS, and cache headers—**sfz --help**.

# CAVEATS

Not hardened for public Internet exposure. Project maintenance status is limited. Prefer **caddy**/**nginx** for production.

# SEE ALSO

[python](/man/python)(1), [caddy](/man/caddy)(1), [miniserve](/man/miniserve)(1)

# RESOURCES

```[Source code](https://github.com/weihanglo/sfz)```

<!-- verified: 2026-07-19 -->
