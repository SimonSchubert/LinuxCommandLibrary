# TAGLINE

curl frontend with httpie-style syntax

# TLDR

Send a **GET** request

```curlie [httpbin.org/get]```

Send a **POST** request with JSON data

```curlie post [httpbin.org/post] [name=john] [age:=25]```

Send GET request with **query parameters**

```curlie get [httpbin.org/get] [first_param==5] [second_param==true]```

Send request with **custom header**

```curlie [httpbin.org/get] [X-Custom-Header:value]```

**Upload a file**

```curlie post [httpbin.org/post] < [file.json]```

**Pass curl options** directly

```curlie -k https://[self-signed.example.com/api]```

# SYNOPSIS

**curlie** [_method_] _url_ [_items_...]

# DESCRIPTION

**curlie** is a frontend to curl that combines the ease of use of httpie with curl's power. It translates httpie-style syntax to curl commands and displays responses with syntax highlighting.

It uses the same syntax conventions as httpie: = for string data, := for raw JSON, == for query parameters, and : for headers.

# PARAMETERS

_method_
> HTTP method (GET, POST, PUT, DELETE, etc.)

_url_
> Target URL

**key=value**
> String data field

**key:=value**
> Raw JSON data field

**key==value**
> Query parameter

**header:value**
> HTTP header

**-v**
> Verbose output (show request headers).

**-I**, **--head**
> Send HEAD request.

All curl options are supported and passed through directly.

# CAVEATS

Requires curl to be installed. All curl options are available but passed through as-is. Curlie formats JSON output automatically.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [wget](/man/wget)(1)
