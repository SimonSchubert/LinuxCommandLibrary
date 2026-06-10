# TAGLINE

Local proxy for inspecting, replaying, and modifying traffic

# TLDR

**Run oproxy** as a local HTTP, HTTPS, and SOCKS5 proxy

```oproxy```

**Route a request** through the proxy

```curl -x http://127.0.0.1:8080 [http://example.com]```

**Run oproxy in Docker**, exposing the proxy and UI ports

```docker run --rm -p 127.0.0.1:8080:8080 -p 127.0.0.1:1080:1080 ghcr.io/sauravrao637/oproxy:latest```

# SYNOPSIS

**oproxy** [_options_]

# DESCRIPTION

**oproxy** is a local HTTP, HTTPS, and SOCKS5 proxy for inspecting, replaying, and modifying network traffic from browsers, command-line tools, and applications. After installing its local certificate authority it can perform man-in-the-middle interception of HTTPS, decoding requests and responses including headers, bodies, status, and timing, with awareness of JWT, GraphQL, gRPC, and WebSocket payloads.

Beyond observation, oproxy can rewrite traffic on the fly: rule sets support map-remote and map-local redirection, throttling, breakpoints, mock responses, and DNS overrides, which makes it useful for debugging, testing error handling, and developing against APIs that are not yet available. A web UI, served locally, presents the captured traffic and rule configuration.

# CAVEATS

Intercepting HTTPS requires trusting oproxy's locally generated certificate authority; install it only on machines you control and remove it when finished. The proxy is meant for local development and testing, not as a production gateway.

# SEE ALSO

[mitmproxy](/man/mitmproxy)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/sauravrao637/oproxy)```

<!-- verified: 2026-06-10 -->
