# TAGLINE

Reverse proxy with HTTP/3 and hybrid post-quantum TLS

# TLDR

**Validate** the configuration and exit

```pqcrypta-proxy --config [path/to/config.toml] --validate```

**Start** the proxy

```pqcrypta-proxy --config [path/to/config.toml]```

Write a systemd **socket unit** for the listeners and exit

```pqcrypta-proxy --socket-unit [path/to/pqcrypta-proxy.socket]```

Ask the running admin API to **reload**

```pqcrypta-proxy --admin POST /reload```

# SYNOPSIS

**pqcrypta-proxy** [_options_]

# PARAMETERS

**-c**, **--config** _file_
> Configuration file. The default is **/etc/pqcrypta/config.toml**.

**--validate**
> Check the configuration and do not listen.

**--env** _name_
> Also load a per-environment file next to the base config, named with the config stem, the environment, and the toml suffix, merged over the base file.

**--udp-port** _port_
> Override the UDP port of the QUIC listener.

**--admin-port** _port_
> Override the admin API port.

**--log-level** _level_
> One of trace, debug, info, warn, or error. The default comes from the config, then info.

**--json-logs**
> Write logs as JSON. **--json-logs=false** forces text.

**--no-pqc**
> Disable hybrid post-quantum key exchange.

**--watch-config**
> Reload when the configuration file changes. This is on unless set to false.

**--socket-unit** _file_
> Write a systemd socket unit for this configuration's listeners and exit.

**--test-certificates** _directory_
> Write self-signed test certificates into a directory and exit. Files already there are not replaced. Nothing trusts them by default.

**--merge-fingerprints** _file_
> Merge fingerprint corpora into one file and exit. **--from** adds an input and may be repeated.

**--admin** _method_ _path_
> Send one request to this node's admin API, print the body, and exit. **--admin-body** is the JSON body.

**--moq-token** _prefix_
> Print a Media over QUIC publish token and exit. **--moq-token-days** sets how long it stays valid (default 30).

# DESCRIPTION

**pqcrypta-proxy** is a reverse proxy for HTTP/1.1, HTTP/2, HTTP/3 over QUIC, and WebTransport. TLS can use a hybrid post-quantum key exchange. Routes, certificates, rate limits, and the admin API are set in the configuration file. The process stays in the foreground and reloads that file when it changes, unless **--watch-config** is turned off.

Several flags do one job and exit: validate, write a socket unit, write test certificates, merge fingerprint corpora, call the admin API, or mint a Media over QUIC token. With none of those, the proxy listens.

# CAVEATS

The default config path is **/etc/pqcrypta/config.toml**. A file you write elsewhere is used only with **--config**. Test certificates are not a production trust anchor. The admin client uses the credentials named in the config's admin section.

# SEE ALSO

[openssl](/man/openssl)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/PQCrypta/pqcrypta-proxy)```

<!-- verified: 2026-11-26 -->
