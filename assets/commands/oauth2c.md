# TLDR

**Get access token**

```oauth2c [client_id] [client_secret] --token-url [url]```

**Authorization code flow**

```oauth2c --auth-url [url] --token-url [url] --redirect-uri [uri]```

**Client credentials flow**

```oauth2c [client_id] [client_secret] --token-url [url] --grant-type client_credentials```

**With scopes**

```oauth2c [client_id] [client_secret] --token-url [url] --scope "[scope1 scope2]"```

# SYNOPSIS

**oauth2c** [_options_]

# PARAMETERS

**--auth-url** _URL_
> Authorization endpoint.

**--token-url** _URL_
> Token endpoint.

**--redirect-uri** _URI_
> Redirect URI.

**--grant-type** _TYPE_
> OAuth2 grant type.

**--scope** _SCOPES_
> Requested scopes.

**--help**
> Display help information.

# DESCRIPTION

**oauth2c** is an OAuth2 CLI client. Obtains access tokens interactively.

The tool supports various OAuth2 flows. Useful for API testing.

oauth2c handles OAuth2 authentication.

# CAVEATS

Requires OAuth2 client credentials. Security-sensitive operations.

# HISTORY

oauth2c was created to provide **command-line OAuth2** authentication for developers.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1)

