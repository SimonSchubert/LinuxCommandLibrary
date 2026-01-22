# TLDR

**GET request**

```http [https://api.example.com/users]```

**POST with JSON**

```http POST [url] name=value```

**POST with form data**

```http --form POST [url] field=value```

**Custom headers**

```http [url] Authorization:"Bearer token"```

**Download file**

```http --download [url]```

**Verbose output**

```http --verbose [url]```

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

**--help**
> Display help information.

# DESCRIPTION

**HTTPie** (http) is a user-friendly HTTP client. It provides intuitive syntax, colorized output, and JSON support for API interaction.

The tool simplifies making HTTP requests from the command line. It automatically formats responses and supports sessions and authentication.

HTTPie is a friendly HTTP client.

# CAVEATS

Python package. Different from curl syntax. JSON by default.

# HISTORY

HTTPie was created by **Jakub Roztocil** as a more user-friendly alternative to curl for API testing.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [https](/man/https)(1)
