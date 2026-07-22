# TAGLINE

Serve content over the Gemini protocol

# TLDR

**Start** a Gemini server

```agate --content [/var/gemini] --hostname [example.com]```

Use **custom certificates**

```agate --content [/var/gemini] --hostname [example.com] --certs [/etc/agate/certs]```

Run on **custom port**

```agate --content [/var/gemini] --hostname [example.com] --addr [0.0.0.0:1965]```

Enable **logging**

```agate --content [/var/gemini] --hostname [example.com] --log-ip```

# SYNOPSIS

**agate** --content _dir_ --hostname _host_ [_options_]

# DESCRIPTION

**agate** is a simple, secure server for the Gemini protocol, a lightweight alternative to HTTP focused on privacy and simplicity. It serves static content over TLS with minimal configuration.

The server automatically generates TLS certificates if not provided, handles multiple virtual hosts, and serves Gemini text files (.gmi) and other content types based on file extensions.

# PARAMETERS

**--content** _dir_
> Root directory for content

**--hostname** _host_
> Hostname for the server (can be repeated for virtual hosting)

**--addr** _address_
> Address to bind (default: 0.0.0.0:1965)

**--certs** _dir_
> Directory holding the TLS certificate/key pairs (default: .certificates). Certificates are generated automatically per hostname if missing.

**--lang** _code_
> Default language code for text/gemini responses.

**--log-ip**
> Log client IP addresses.

**-C**, **--central-conf**
> Read a single .meta configuration file from the content root instead of per-directory files.

**--serve-secret**
> Serve files and directories whose names start with a dot (served as hidden by default).

**-3**, **--only-tls13**
> Disable TLSv1.2, accepting only TLSv1.3 connections.

**--skip-port-check**
> Do not require the port in the request URL to match the listening port (useful behind a proxy).

**-s**, **--silent**
> Disable logging output.

# CAVEATS

Gemini requires TLS; unencrypted connections are not supported. The default Gemini port 1965 may require root privileges on some systems. Client support is limited compared to HTTP browsers.

# HISTORY

**agate** was created as part of the growing Gemini ecosystem after the Gemini protocol was designed by Solderpunk in **2019**. It provides a simple, Rust-based server implementation following the protocol's minimalist philosophy.

# INSTALL

```aur: yay -S agate```

```nix: nix profile install nixpkgs#agate```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[nginx](/man/nginx)(8)

# RESOURCES

```[Source code](https://github.com/mbrubeck/agate)```

<!-- verified: 2026-06-11 -->
