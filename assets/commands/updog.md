# TAGLINE

Simple HTTP file server with upload support

# TLDR

**Start server**

```updog```

**Custom port**

```updog -p [8080]```

**Enable uploads**

```updog --upload```

**With password**

```updog --password [secret]```

**Custom directory**

```updog -d [path/to/directory]```

# SYNOPSIS

**updog** [_-p port_] [_-d dir_] [_--upload_] [_options_]

# PARAMETERS

**-p** _PORT_
> Port number.

**-d** _DIR_
> Directory to serve.

**--upload**
> Allow uploads.

**--password** _PASS_
> Set password.

**--ssl**
> Enable HTTPS.

# DESCRIPTION

**updog** is a Python-based HTTP file server designed as a modern replacement for Python's built-in SimpleHTTPServer. It serves files from a directory with a clean web interface that supports browsing, downloading, and optionally uploading files.

The server provides features beyond basic file serving, including password protection for access control, SSL/HTTPS support, and a responsive web interface. File uploads can be enabled with the **--upload** flag, making it useful for quickly transferring files between machines on a local network.

updog is intended for development and ad-hoc file sharing, not production use. It starts quickly with sensible defaults and can be customized with command-line options for port, directory, authentication, and encryption.

# CAVEATS

Python required. Development use only. Not for production.

# HISTORY

**updog** was created as a modern Python replacement for SimpleHTTPServer with file upload support.

# SEE ALSO

[python](/man/python)(1), [serve](/man/serve)(1), [http-server](/man/http-server)(1)
