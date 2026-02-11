# TAGLINE

Fast and friendly HTTP client

# TLDR

**Make GET request**

```xh [https://api.example.com/users]```

**Make POST with JSON data**

```xh POST [https://api.example.com/users] name=John email=john@example.com```

**Make POST with raw JSON**

```xh POST [https://api.example.com/users] < [data.json]```

**Set custom headers**

```xh [https://api.example.com] Authorization:"Bearer [token]"```

**Download file**

```xh --download [https://example.com/file.zip]```

**Show only response body**

```xh -b [https://api.example.com/users]```

**Show only headers**

```xh -h [https://api.example.com/users]```

**Follow redirects**

```xh --follow [https://example.com/redirect]```

# SYNOPSIS

**xh** [_method_] _URL_ [_items_] [_--json_] [_--download_] [_options_]

# PARAMETERS

**(method)**
> HTTP method: GET, POST, PUT, PATCH, DELETE, HEAD.

**-b**, **--body**
> Show only response body.

**-h**, **--headers**
> Show only response headers.

**-d**, **--download**
> Download file.

**-c**, **--continue**
> Resume download.

**-o** _FILE_, **--output** _FILE_
> Save response to file.

**-f**, **--form**
> Send form data.

**-j**, **--json**
> Send JSON data (default for POST).

**-F**, **--follow**
> Follow redirects.

**--offline**
> Build request without sending.

**-p** _WHAT_, **--print** _WHAT_
> What to print: H(request headers), B(request body), h(response headers), b(response body).

**-v**, **--verbose**
> Show request and response.

**--timeout** _SECS_
> Request timeout.

**-A** _TYPE_, **--auth-type** _TYPE_
> Auth type: basic, bearer, digest.

**-a** _USER:PASS_, **--auth** _USER:PASS_
> Authentication credentials.

**--proxy** _PROTO:URL_
> Proxy URL.

**-I**, **--ignore-stdin**
> Ignore stdin data.

# DESCRIPTION

**xh** is a friendly HTTP client, designed as a faster Rust reimplementation of HTTPie. It formats output with syntax highlighting and provides intuitive syntax for requests.

Request items use special syntax: key=value for JSON/form data, key:=value for raw JSON values, key:value for headers. This enables building requests without complex quoting.

Output is formatted and colored by default: JSON is pretty-printed, headers are highlighted. The -b flag outputs raw body for piping to other tools.

Authentication supports basic, bearer token, and digest. Session support persists cookies and auth across requests.

Download mode saves response bodies to files, with resume support for interrupted transfers. Progress is shown during download.

The offline mode builds and displays requests without sending, useful for debugging or generating curl commands.

# CAVEATS

Some HTTPie features not yet implemented. Output formatting adds overhead for large responses. Session handling differs from HTTPie. Some terminal color schemes may need adjustment.

# HISTORY

**xh** was created by **ducaale** around **2020** as a Rust reimplementation of HTTPie. The name "xh" is HTTPie's h reversed. Written for performance and portability, it provides near-identical syntax while being significantly faster and shipping as a single binary.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [wget](/man/wget)(1)
