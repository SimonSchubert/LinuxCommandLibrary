# TAGLINE

Command-line HTTP client from the HTTPX2 Python library

# TLDR

**GET** a URL and print a highlighted response body

```httpx2 [https://example.com]```

**POST JSON** (method becomes POST when a body is given)

```httpx2 [https://api.example.com/items] -j ['{"name":"ada"}']```

Send **form fields**

```httpx2 [https://example.com/login] -d [username] [ada] -d [password] [s3cret]```

Add a **header** (name and value are two arguments)

```httpx2 [https://api.example.com] -h [Authorization] [Bearer token]```

**Follow redirects** and show the request as well as the response

```httpx2 [https://example.com] --follow-redirects -v```

**Download** the body to a file

```httpx2 [https://example.com/file.bin] --download [file.bin]```

Use **HTTP/2** if the server supports it (needs the **http2** extra)

```httpx2 [https://example.com] --http2```

# SYNOPSIS

**httpx2** _URL_ [_options_]

# PARAMETERS

**-m** _METHOD_, **--method** _METHOD_
> HTTP method: GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD, QUERY. Default **GET**, or **POST** if a request body is included.

**-p** _NAME_ _VALUE_, **--params** _NAME_ _VALUE_
> Query parameter. Repeatable.

**-c** _TEXT_, **--content** _TEXT_
> Raw request body.

**-d** _NAME_ _VALUE_, **--data** _NAME_ _VALUE_
> Form field in the request body. Repeatable.

**-f** _NAME_ _FILE_, **--files** _NAME_ _FILE_
> Multipart file field. Repeatable.

**-j** _TEXT_, **--json** _TEXT_
> JSON request body (must be valid JSON).

**-h** _NAME_ _VALUE_, **--headers** _NAME_ _VALUE_
> Extra request header. Repeatable.

**--cookies** _NAME_ _VALUE_
> Cookie. Repeatable.

**--auth** _USER_ _PASS_
> HTTP basic auth. Use **-** as the password to prompt. **--verbose** prints the Authorization header (reversible encoding).

**--proxy** _URL_
> Proxy URL for the request.

**--timeout** _FLOAT_
> Network timeout in seconds (default **5.0**).

**--follow-redirects**
> Follow HTTP redirects.

**--no-verify**
> Disable TLS certificate verification.

**--http2**
> Prefer HTTP/2 when the server supports it. Requires **pip install 'httpx2[http2]'**.

**--download** _FILE_
> Write the response body to _FILE_ instead of printing it.

**-v**, **--verbose**
> Print the request (and TLS details) as well as the response.

**--help**
> Show help and exit.

# DESCRIPTION

**httpx2** is the optional command-line client shipped with **HTTPX2**, Pydantic's maintained continuation of the Python **httpx** library. It is not ProjectDiscovery's **httpx** probe toolkit (documented as **httpx** in this library).

Install the CLI extra, which pulls in **click**, **rich**, and **pygments**:

```pip install 'httpx2[cli]'```

That registers the console script **httpx2**. Without **[cli]**, the Python package still installs but the command is not available.

The tool sends one HTTP request and prints a syntax-highlighted body (JSON pretty-printed when the content type is JSON). Binary responses print a byte-count placeholder. Exit status is **0** on a successful HTTP status, **1** on a 4xx/5xx response or a transport error.

HTTPX2 verifies TLS against the **operating-system trust store** (via **truststore**), not the **certifi** bundle used by classic httpx. In minimal containers, install CA certificates in the OS store or set **SSL_CERT_FILE** / **SSL_CERT_DIR**.

The same package is a full sync/async Python HTTP client (`import httpx2`). The CLI is a thin wrapper around **httpx2.Client**.

# CAVEATS

The binary name **httpx2** does not collide with ProjectDiscovery **httpx**, but mixing the two in scripts is easy if you type the wrong command.

**--http2** needs the optional **h2** extra. SOCKS proxies and Brotli/Zstd decoding are also optional extras (**httpx2[socks]**, **httpx2[brotli]**, **httpx2[zstd]**), not CLI flags.

Requires **Python 3.10+**. Pair options (**--headers**, **--params**, **--data**, **--auth**, **--cookies**, **--files**) take two argv tokens, not **Name:Value** as in HTTPie.

# HISTORY

**HTTPX** was created by **Tom Christie** (encode/httpx). With upstream activity slowing, **Pydantic** forked stewardship as **HTTPX2** (BSD-3-Clause) so the library keeps receiving security and maintenance updates. The CLI command was renamed from **httpx** to **httpx2** to match the package.

# INSTALL

```brew: brew install httpx2```

<!-- packages: 2026-08-28 -->

# SEE ALSO

[curl](/man/curl)(1), [http](/man/http)(1), [httpie](/man/httpie)(1), [xh](/man/xh)(1), [wget](/man/wget)(1), [python](/man/python)(1)

# RESOURCES

```[Source code](https://github.com/pydantic/httpx2)```

```[Homepage](https://httpx2.pydantic.dev/)```

<!-- verified: 2026-08-28 -->
