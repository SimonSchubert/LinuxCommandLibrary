# TAGLINE

Authorize twurl with Twitter/X API credentials

# TLDR

**Authorize** with consumer key and secret (interactive PIN flow)

```twurl authorize --consumer-key [key] --consumer-secret [secret]```

**Authorize** using short option names

```twurl authorize -c [key] -s [secret]```

**Generate a bearer token** (application-only authentication)

```twurl authorize --bearer --consumer-key [key] --consumer-secret [secret]```

**Authorize against a non-default host**

```twurl authorize -c [key] -s [secret] -H [api.twitter.com]```

**Authorize for a specific username**

```twurl authorize -c [key] -s [secret] -u [username]```

# SYNOPSIS

**twurl authorize** [**-c**|**--consumer-key** _key_] [**-s**|**--consumer-secret** _secret_] [_options_]

# PARAMETERS

**-c**, **--consumer-key** _key_
> OAuth consumer (API) key. Required. If the value is omitted, twurl prompts interactively.

**-s**, **--consumer-secret** _secret_
> OAuth consumer (API) secret. Required. If the value is omitted, twurl prompts interactively.

**-u**, **--username** _username_
> Username of the account being authorized.

**--bearer**
> Use application-only authentication and store a bearer token instead of a user access token.

**-H**, **--host** _host_
> API host used during authorization (default: **api.twitter.com**). Protocol prefix is stripped if present.

**-a**, **--access-token** _token_
> Supply an existing access token instead of running the full PIN handshake.

**-S**, **--token-secret** _secret_
> Supply an existing token secret to pair with **--access-token**.

**-P**, **--proxy** _proxy_
> HTTP proxy to use for the authorization requests.

**-t**, **--trace**
> Trace request and response traffic during the handshake.

# DESCRIPTION

**twurl authorize** is the first step when using **twurl**, Twitter's OAuth-enabled curl replacement for the X (Twitter) API. It registers a consumer key and secret with a user account (or generates an application-only bearer token), then saves the resulting credentials so later **twurl** requests are signed automatically.

For user-context OAuth, the tool prints an authorization URL. Open it in a browser, sign in to X, and enter the returned PIN back into the terminal. On success, credentials are written to **~/.twurlrc** and that profile becomes the default if none existed yet.

With **--bearer**, **twurl authorize** obtains and stores a bearer token for application-only calls. Subsequent requests can pass **--bearer** (and optionally **-c**) to use that token without a user context.

Multiple accounts and consumer keys can be authorized over time. Use **twurl accounts** to list them and **twurl set default** to switch the active profile.

# CAVEATS

Requires a developer account and app credentials from the X Developer Portal. The authorize flow needs interactive PIN entry (or pre-supplied tokens). X API product tiers and endpoint access change over time; successful authorization does not guarantee every endpoint is available to your app. Ruby and the **twurl** gem must be installed.

# HISTORY

**twurl** was created by Twitter (now X) as a development helper for its HTTP API. The **authorize** subcommand has always been the entry point for storing OAuth credentials in **~/.twurlrc**.

# SEE ALSO

[twurl](/man/twurl)(1), [twurl-accounts](/man/twurl-accounts)(1), [curl](/man/curl)(1), [httpie](/man/httpie)(1)

# RESOURCES

```[Source code](https://github.com/twitter/twurl)```

```[Documentation](https://github.com/twitter/twurl#getting-started)```

<!-- verified: 2026-07-17 -->
