# TLDR

**Simple GET request**

```http [https://api.example.com/users]```

**POST with JSON**

```http POST [https://api.example.com/users] name=John age:=30```

**POST form data**

```http -f POST [url] name=John email=john@example.com```

**Add custom header**

```http [url] Authorization:"Bearer token"```

**Download file**

```http --download [https://example.com/file.zip]```

**Follow redirects**

```http --follow [url]```

**Show only headers**

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

**--auth-type** _type_
> Auth type: basic, digest.

**--session** _name_
> Named session for cookies/auth.

**--offline**
> Build request offline.

# ITEM TYPES

```
key=value      String data
key:=value     Raw JSON
key==value     Query parameter
Header:value   HTTP header
@file          File upload
```

# DESCRIPTION

**HTTPie** is a user-friendly HTTP client for the command line. It provides intuitive syntax, colored output, and sensible defaults for API testing and debugging.

# CAVEATS

Requires Python. Syntax differs from curl. Large responses may be slow to colorize.

# HISTORY

HTTPie was created by **Jakub Roztočil** in **2012** as a more user-friendly alternative to curl for interacting with HTTP APIs.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [xh](/man/xh)(1)
