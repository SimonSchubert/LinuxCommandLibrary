# TAGLINE

alias or variant of HTTPie for HTTPS requests

# TLDR

**GET request over HTTPS**

```https [https://api.example.com/users]```

**POST with JSON**

```https POST [url] name=value```

**Skip certificate verification**

```https --verify no [url]```

**Custom headers**

```https [url] Authorization:"Bearer token"```

**Download file**

```https --download [url]```

# SYNOPSIS

**https** [_options_] [_method_] _url_ [_data_]

# PARAMETERS

_METHOD_
> HTTP method (GET, POST, etc.).

_URL_
> Request URL.

_DATA_
> Request data.

**--verify** _MODE_
> SSL verification (yes/no).

**-d**, **--download**
> Download file.

**-v**, **--verbose**
> Verbose output.

**--cert** _FILE_
> Client certificate.

**--help**
> Display help information.

# DESCRIPTION

**https** is an alias or variant of HTTPie for HTTPS requests. It provides the same user-friendly interface with SSL/TLS by default.

The tool emphasizes secure connections while maintaining HTTPie's intuitive syntax. It's useful for API testing over HTTPS.

# CAVEATS

Alias for http with HTTPS. Python package. Same as HTTPie.

# HISTORY

https is part of **HTTPie**, providing explicit HTTPS-first HTTP client functionality.

# SEE ALSO

[http](/man/http)(1), [curl](/man/curl)(1), [wget](/man/wget)(1)
