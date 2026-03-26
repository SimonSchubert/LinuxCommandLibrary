# TAGLINE

OAuth2 CLI client

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

**oauth2c** is an OAuth2 CLI client that obtains access tokens using various OAuth2 grant types. It supports authorization code, client credentials, device code, and other standard flows.

The tool is useful for testing OAuth2-protected APIs, debugging authentication flows, and scripting token acquisition. It opens a browser for authorization code flows and displays the obtained token on stdout.

# CAVEATS

Requires valid OAuth2 client credentials (client ID and secret). The authorization code flow opens a browser and starts a local server for the redirect URI. Tokens are printed to stdout and should be handled securely. Some grant types require the redirect URI to be pre-registered with the authorization server.

# HISTORY

**oauth2c** was created by **Cloudentity** to simplify OAuth2 token acquisition from the command line, supporting the full range of OAuth2 grant types.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1)

