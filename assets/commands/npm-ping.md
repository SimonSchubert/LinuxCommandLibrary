# TAGLINE

checks connectivity to npm registry

# TLDR

**Ping default npm registry**

```npm ping```

**Ping custom registry**

```npm ping --registry [https://registry.example.com]```

# SYNOPSIS

**npm** **ping** [_options_]

# PARAMETERS

**--registry** _url_
> Registry URL to ping (default: https://registry.npmjs.org).

# DESCRIPTION

**npm ping** pings the configured or specified npm registry and verifies authentication if credentials are configured. It outputs the registry URL and response time on success, or an error on failure. Useful for diagnosing registry connectivity issues, verifying custom registry configurations, and troubleshooting npm authentication.

# CAVEATS

Requires network connectivity. If authentication is configured, the ping also verifies token validity.

# SEE ALSO

[npm](/man/npm)(1), [npm-config](/man/npm-config)(1)

