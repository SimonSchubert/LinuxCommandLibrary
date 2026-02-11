# TAGLINE

OAuth-enabled curl for Twitter API

# TLDR

**Authorize account**

```twurl authorize --consumer-key [key] --consumer-secret [secret]```

**GET request**

```twurl [/2/users/me]```

**POST request**

```twurl -X POST [/2/tweets] -d '{"text":"Hello"}'```

**List accounts**

```twurl accounts```

**Set default account**

```twurl set default [username]```

# SYNOPSIS

**twurl** [_-X method_] [_-d data_] [_options_] _endpoint_

# PARAMETERS

**-X** _METHOD_
> HTTP method.

**-d** _DATA_
> Request body.

**-H** _HEADER_
> Custom header.

**authorize**
> Set up OAuth.

**accounts**
> List accounts.

# DESCRIPTION

**twurl** is an OAuth-enabled curl replacement specifically designed for the Twitter (X) API. It handles the OAuth authentication handshake automatically, allowing developers to make authenticated API requests without manually managing tokens in each request.

After initial authorization with consumer key and secret, twurl stores credentials and signs all subsequent requests. Multiple accounts can be authorized and switched between, making it easy to test API calls across different users. All Twitter API endpoints are accessible via standard HTTP methods.

Requests support custom headers and JSON request bodies for POST operations. The tool is particularly useful for API exploration and debugging during Twitter application development.

# CAVEATS

Twitter API changes. Developer account needed. Ruby required.

# HISTORY

**twurl** was created by **Twitter** as an OAuth-enabled curl alternative for the Twitter API.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [twitter](/man/twitter)(1)
