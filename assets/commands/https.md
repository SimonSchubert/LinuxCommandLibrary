# TAGLINE

alias or variant of HTTPie for HTTPS requests

# TLDR

**GET request over HTTPS**

```https [https://api.example.com/users]```

**POST with JSON**

```https POST [url] name=value```

**Skip certificate verification**

```https --verify no [url]```

**Custom headers**

```https [url] Authorization:"Bearer token"```

**Download file**

```https --download [url]```

# SYNOPSIS

**https** [_options_] [_method_] _url_ [_data_]

# PARAMETERS

_METHOD_
> HTTP method (GET, POST, PUT, DELETE, etc.). Inferred from the presence of data if omitted.

_URL_
> Request URL. The **https://** scheme is assumed when none is given.

_DATA_
> Request items: `key=value` for JSON/form fields, `key:value` for headers, `key==value` for query params, `key@file` for file uploads.

**-j**, **--json**
> Encode data items as a JSON object (default).

**-f**, **--form**
> Encode data items as `multipart/form-data` or `application/x-www-form-urlencoded`.

**-o**, **--output** _FILE_
> Write output to a file instead of stdout.

**-d**, **--download**
> Download the response body as a file, like a resumable wget.

**-v**, **--verbose**
> Print the whole request as well as the response.

**-p**, **--print** _FLAGS_
> Control what's printed: `H`/`B` for request headers/body, `h`/`b` for response headers/body.

**-a**, **--auth** _USER[:PASS]_
> Basic or digest authentication credentials.

**--session** _NAME_
> Create or reuse a named session, persisting cookies and headers between requests.

**--verify** _yes|no|CA_BUNDLE_
> SSL certificate verification; set to **no** to skip, or point at a custom CA bundle.

**--cert** _FILE_
> Client-side SSL certificate.

**--cert-key** _FILE_
> Private key file for the client certificate, if not bundled with **--cert**.

**--proxy** _PROTOCOL:URL_
> Proxy to use for the given protocol.

**--follow**
> Follow HTTP redirects (30x responses).

**--offline**
> Build and print the request without sending it over the network.

**--help**
> Display help information.

# DESCRIPTION

**https** is a companion executable installed alongside **HTTPie**. It is functionally identical to the **http** command, except the default URL scheme is **https://** instead of **http://**, so a bare hostname like `https example.org` requests `https://example.org`. All other behavior, options, and output formatting are shared with **http**.

Like HTTPie generally, it provides colorized, formatted output, intuitive key=value/key:value syntax for building requests, JSON support by default, and features like sessions, downloads, and authentication.

# CAVEATS

Not a shell alias but a separate entry point shipped by the **httpie** Python package; installing HTTPie installs both **http** and **https**. Equivalent to running `http --default-scheme=https`.

# HISTORY

**https** has been bundled with **HTTPie** since its early releases, created by **Jakub Roztocil** as a more user-friendly alternative to curl for command-line HTTP/API testing.

# INSTALL

```dnf: sudo dnf install httpie```

```pacman: sudo pacman -S httpie```

```apk: sudo apk add httpie```

```zypper: sudo zypper install httpie```

```brew: brew install httpie```

```nix: nix profile install nixpkgs#httpie```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[http](/man/http)(1), [curl](/man/curl)(1), [wget](/man/wget)(1)

# RESOURCES

```[Source code](https://github.com/httpie/cli)```

```[Homepage](https://httpie.io)```

```[Documentation](https://httpie.io/docs/cli)```

<!-- verified: 2026-07-19 -->
