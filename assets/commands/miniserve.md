# TAGLINE

simple file server

# TLDR

**Serve current directory**

```miniserve .```

**Serve specific directory**

```miniserve [/path/to/dir]```

**Serve single file**

```miniserve [file.zip]```

**Custom port**

```miniserve -p [8080] .```

**Enable upload**

```miniserve -u .```

**With authentication**

```miniserve -a [user:pass] .```

# SYNOPSIS

**miniserve** [_options_] _path_

# PARAMETERS

_PATH_
> File or directory to serve.

**-p** _PORT_
> Port number.

**-u**
> Enable uploads.

**-a** _CREDS_
> Basic auth (user:pass).

**-i** _ADDR_
> Interface to bind.

**--help**
> Display help information.

# DESCRIPTION

**miniserve** is a simple file server. It serves files over HTTP with minimal setup.

The tool supports uploads, authentication, and QR codes. Written in Rust for performance.

# CAVEATS

Development use recommended. Not for production. Rust-based.

# HISTORY

miniserve was created as a fast, minimal **Rust-based** HTTP file server for quick sharing.

# SEE ALSO

[python](/man/python)(1), [http-server](/man/http-server)(1), [serve](/man/serve)(1)

