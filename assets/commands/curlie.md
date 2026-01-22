# TLDR

Send a **GET** request

```curlie [httpbin.org/get]```

Send a **POST** request

```curlie post [httpbin.org/post] [name=john] [age:=25]```

Send GET request with **query parameters**

```curlie get [httpbin.org/get] [first_param==5] [second_param==true]```

Send request with **custom header**

```curlie get [httpbin.org/get] [header-name:header-value]```

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
> Verbose output

# CAVEATS

Requires curl to be installed. Some advanced curl options may not have httpie-style equivalents and must be passed directly.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [wget](/man/wget)(1)
