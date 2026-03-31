# TAGLINE

user-friendly HTTP client

# TLDR

**GET request**

```http [https://api.example.com/users]```

**POST with JSON**

```http POST [url] name=value```

**POST with form data**

```http --form POST [url] field=value```

**Custom headers**

```http [url] Authorization:"Bearer [token]"```

**Download file**

```http --download [url]```

**Authenticated request**

```http --auth [user]:[password] [url]```

**Verbose output**

```http --verbose [url]```

**Use a named session**

```http --session=[name] [url]```

# SYNOPSIS

**http** [_options_] [_method_] _url_ [_data_]

# PARAMETERS

_METHOD_
> HTTP method (GET, POST, PUT, DELETE).

_URL_
> Request URL.

_DATA_
> Request data (key=value pairs).

**-d**, **--download**
> Download file.

**-f**, **--form**
> Form encoded data.

**-j**, **--json**
> JSON data.

**-v**, **--verbose**
> Verbose output.

**-o**, **--output** _FILE_
> Output file.

**-a**, **--auth** _USER:PASS_
> Basic or digest authentication credentials.

**-A**, **--auth-type** _TYPE_
> Authentication type: basic, digest, bearer.

**--session** _NAME_
> Create or reuse a named session for cookies and headers.

**-p**, **--print** _FLAGS_
> Control output: H (request headers), B (request body), h (response headers), b (response body).

**--pretty** _STYLE_
> Output formatting: all, colors, format, none.

**--verify** _CERT_
> SSL certificate verification. Use **no** to skip.

**--proxy** _PROTOCOL:URL_
> Use a proxy for requests.

**--follow**
> Follow HTTP redirects.

**--help**
> Display help information.

# DESCRIPTION

**HTTPie** (http) is a user-friendly HTTP client. It provides intuitive syntax, colorized output, and JSON support for API interaction.

The tool simplifies making HTTP requests from the command line. It automatically formats responses and supports sessions and authentication.

# CAVEATS

Python package. Different from curl syntax. JSON by default.

# HISTORY

HTTPie was created by **Jakub Roztocil** as a more user-friendly alternative to curl for API testing.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [https](/man/https)(1), [xh](/man/xh)(1), [curlie](/man/curlie)(1)
