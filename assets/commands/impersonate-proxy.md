# TAGLINE

Local MITM proxy with configurable TLS and HTTP fingerprints

# TLDR

**Build** the binary from a clone

```make build```

**Start** the proxy (rebuilds, frees port 8080, reads `config.yaml`)

```make run```

**Run** an already-built binary with the default config

```impersonate-proxy```

**Run** with an explicit config file

```impersonate-proxy -config [config.yaml]```

**Send curl** through the proxy with the generated CA

```curl --proxy http://127.0.0.1:8080 --cacert [ca.crt] [https://example.com]```

**Read** the live management API

```curl http://127.0.0.1:8081/api/config```

**Switch** the TLS preset at runtime (new connections only)

```curl -X POST http://127.0.0.1:8081/api/config -H 'Content-Type: application/json' -d '{"tls_preset":"firefox"}'```

# SYNOPSIS

**impersonate-proxy** [**-config** _file_]

# PARAMETERS

**-config** _file_
> Path to the YAML configuration file. Default: `config.yaml`.

The project Makefile also exposes:

**make build**
> Compile the Go sources to `./impersonate-proxy`. Requires Go 1.22+.

**make run**
> Build, kill any process on port 8080, then start `./impersonate-proxy -config config.yaml`.

**make trust-ca**
> On macOS, add the generated `ca.crt` to the system keychain (requires sudo).

**make clean**
> Remove the binary, `ca.crt`, and `ca.key`.

# DESCRIPTION

**impersonate-proxy** is a local man-in-the-middle HTTP proxy written in Go. It decrypts client TLS with a generated CA, then opens a new upstream connection whose TLS ClientHello, HTTP/2 SETTINGS, header order, and User-Agent are taken from a YAML profile. The intent is authorized testing of WAF and bot-detection systems: route curl, a browser, or Playwright through the proxy and observe how a given fingerprint is classified.

On first start the process writes `ca.crt` and `ca.key` (paths are configurable) and listens on `127.0.0.1:8080` by default. Clients must trust that CA or pass it explicitly (`curl --cacert`, `NODE_EXTRA_CA_CERTS`, Firefox certificate import). A second listener (`mgmt_listen`, default `127.0.0.1:8081`) serves `GET`/`POST /api/config` so the bundled Chrome extension — or curl — can change the TLS preset, a custom JA3/JA4 `custom_hello`, spoofed client IP headers, and User-Agent without restarting.

Built-in TLS presets include `chrome`, `firefox`, `safari`, `edge`, `ios`, `random`, `golang`, and `custom`. HTTP/1.1 rewriting covers header order, add/remove, User-Agent, and optional `X-Forwarded-For` / `True-Client-IP`. When HTTP/2 is enabled on the proxy-to-server leg, SETTINGS order, `WINDOW_UPDATE`, and pseudo-header order are also configurable.

Supported platforms are **macOS** and **Linux** (amd64 and arm64). There is no package-manager binary; clone the repository and run `make build`.

# CONFIGURATION

**config.yaml**
> Single YAML file read at startup. All keys have defaults; only overrides need to be set.

**listen**
> Proxy bind address. Default `127.0.0.1:8080`.

**mgmt_listen**
> Management API bind address. Default `127.0.0.1:8081`. Set to empty to disable.

**ca_cert** / **ca_key**
> Paths for the MITM CA (default `ca.crt` / `ca.key`). Generated on first run if missing.

**tls.preset**
> `chrome` | `firefox` | `safari` | `edge` | `ios` | `random` | `golang` | `custom`.

**tls.custom_hello**
> Used only when `preset` is `custom`. Fields: `cipher_suites`, `curves`, `versions`, `extensions`. Order of cipher suites and extensions is part of the JA3/JA4 fingerprint. GREASE placeholders (`0x0a0a` and other `0xXAXA` values) are randomized per connection.

**http.user_agent**
> Override the forwarded User-Agent. Empty string passes the client's value through.

**http.client_ip**
> When set, overwrites `X-Forwarded-For` and `True-Client-IP`.

**http.header_order** / **add_headers** / **remove_headers**
> Control HTTP/1.1 header order and membership. Unlisted headers are appended.

**http2.enabled** / **settings** / **window_update** / **pseudo_header_order**
> HTTP/2 fingerprint on the upstream leg. SETTINGS `id` values follow RFC 7540 §11.3.

Runtime `POST /api/config` accepts `tls_preset`, `custom_hello`, `client_ip`, and `user_agent`. Changes apply to new connections only.

# CAVEATS

This is a decrypting MITM proxy. Clients must trust the generated CA, and intercepting traffic without authorization may violate law and terms of service. The client-to-proxy leg is HTTP/1.1 CONNECT only; custom HTTP/2 fingerprints apply solely on the proxy-to-server side. Chunked request bodies are not supported. QUIC and HTTP/3 are out of scope. The proxy rewrites the HTTP `User-Agent` header, not JavaScript `navigator.userAgent`. Some applications use certificate pinning and will refuse the MITM certificate. The management API has no authentication — keep it on localhost.

# HISTORY

Written in **Go** by **ytkoka** as a standalone local proxy around the uTLS TLS-fingerprint library. The binary name produced by `go build -o impersonate-proxy .` is **impersonate-proxy**. Licensed under MIT.

# SEE ALSO

[mitmproxy](/man/mitmproxy)(1), [curl](/man/curl)(1), [curl-impersonate](/man/curl-impersonate)(1), [tinyproxy](/man/tinyproxy)(1)

# RESOURCES

```[Source code](https://github.com/ytkoka/impersonate-proxy)```

<!-- verified: 2026-08-18 -->
