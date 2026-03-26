# TAGLINE

user-friendly HTTP client for the command line

# TLDR

**Simple GET request**

```http [https://api.example.com/users]```

**POST with JSON**

```http POST [https://api.example.com/users] name=John age:=30```

**POST form data**

```http -f POST [url] name=John email=john@example.com```

**Add custom header**

```http [url] Authorization:"Bearer [token]"```

**Download file**

```http --download [https://example.com/file.zip]```

**Authenticated request**

```http -a [user:password] [url]```

**Follow redirects**

```http --follow [url]```

**Show verbose request and response**

```http --verbose [url]```

**Show only response headers**

```http --headers [url]```

# SYNOPSIS

**http** [_options_] [_method_] _url_ [_items_...]

# PARAMETERS

_method_
> HTTP method (GET, POST, PUT, DELETE, etc.).

**--json**, **-j**
> JSON data (default).

**--form**, **-f**
> Form data.

**--headers**, **-h**
> Print only headers.

**--body**, **-b**
> Print only body.

**--download**, **-d**
> Download file.

**--follow**, **-F**
> Follow redirects.

**--auth**, **-a** _user:pass_
> Basic authentication.

**--auth-type**, **-A** _type_
> Auth type: basic, digest, bearer.

**--verbose**, **-v**
> Print entire HTTP exchange (request and response).

**--print**, **-p** _what_
> Selectively print: H (request headers), B (request body), h (response headers), b (response body), m (metadata).

**--verify** _verify_
> SSL certificate verification. Set to "no" to skip.

**--timeout** _seconds_
> Connection timeout in seconds (default: 30).

**--proxy** _protocol:url_
> Set proxy (e.g., http:http://proxy:8080).

**--check-status**
> Exit with error on HTTP 3xx/4xx/5xx status codes.

**--output**, **-o** _file_
> Save response body to file.

**--session** _name_
> Named session for persisting cookies/auth/headers.

**--pretty** _mode_
> Output formatting: all, colors, format, none.

**--offline**
> Build request offline without sending.

# ITEM TYPES

```
key=value       String data (request body)
key:=value      Raw JSON value (request body)
key==value      URL query parameter
Header:value    HTTP header
@file           File upload (multipart)
key@file        File upload with field name
```

# DESCRIPTION

**HTTPie** is a user-friendly HTTP client for the command line. It provides intuitive syntax, colored output, and sensible defaults for API testing and debugging.

# CAVEATS

Requires Python. Syntax differs from curl. Large responses may be slow to colorize. The command is `http` (or `https`), not `httpie`.

# HISTORY

HTTPie was created by **Jakub Roztočil** in **2012** as a more user-friendly alternative to curl for interacting with HTTP APIs.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [xh](/man/xh)(1)
