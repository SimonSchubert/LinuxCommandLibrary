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
> Directory for TLS certificates

**--key** _file_
> TLS private key file

**--cert** _file_
> TLS certificate file

**--lang** _code_
> Default language for text/gemini responses

**--log-ip**
> Log client IP addresses

**--central-conf**
> Use central .meta files for configuration

# CAVEATS

Gemini requires TLS; unencrypted connections are not supported. The default Gemini port 1965 may require root privileges on some systems. Client support is limited compared to HTTP browsers.

# HISTORY

**agate** was created as part of the growing Gemini ecosystem after the Gemini protocol was designed by Solderpunk in **2019**. It provides a simple, Rust-based server implementation following the protocol's minimalist philosophy.

# SEE ALSO

[gemini](/man/gemini)(1), [gmni](/man/gmni)(1), [nginx](/man/nginx)(8)
