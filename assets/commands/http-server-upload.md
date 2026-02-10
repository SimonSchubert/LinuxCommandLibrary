# TAGLINE

provides a simple HTTP server that accepts file uploads

# TLDR

**Start upload server**

```http-server-upload```

**Specify port**

```http-server-upload -p [9090]```

**Specify upload directory**

```http-server-upload -d [./uploads]```

**Set token**

```http-server-upload -t [secret-token]```

# SYNOPSIS

**http-server-upload** [_options_]

# PARAMETERS

**-p**, **--port** _PORT_
> Server port.

**-d**, **--directory** _DIR_
> Upload directory.

**-t**, **--token** _TOKEN_
> Authentication token.

**--max-size** _SIZE_
> Maximum file size.

**--help**
> Display help information.

# DESCRIPTION

**http-server-upload** provides a simple HTTP server that accepts file uploads. It creates a web interface for uploading files to a specified directory.

The tool is useful for quick file transfers without setting up full file sharing. Token authentication provides basic security.

# CAVEATS

Not for production. Basic security only. Python or Node.js based.

# HISTORY

http-server-upload provides quick file upload capability, extending basic HTTP server functionality.

# SEE ALSO

[http-server](/man/http-server)(1), [updog](/man/updog)(1), [woof](/man/woof)(1)
