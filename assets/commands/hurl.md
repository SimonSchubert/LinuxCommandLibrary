# TAGLINE

Run and test HTTP requests with plain text

# TLDR

**Run requests from a Hurl file**

```hurl [path/to/file.hurl]```

**Run in test mode** with progress reporting

```hurl --test [path/to/file.hurl]```

**Run with verbose output**

```hurl --verbose [path/to/file.hurl]```

**Run with a variable**

```hurl --variable [name]=[value] [path/to/file.hurl]```

**Run multiple files in parallel**

```hurl --parallel [path/to/file1.hurl] [path/to/file2.hurl]```

**Output results as JSON**

```hurl --json [path/to/file.hurl]```

**Run with retry on failure**

```hurl --retry [3] [path/to/file.hurl]```

# SYNOPSIS

**hurl** [_options_] [_FILE ..._]

# PARAMETERS

**-u, --user** _user:password_
> Add basic authentication credentials

**-H, --header** _header_
> Add a custom HTTP header

**-L, --location**
> Follow HTTP redirects

**--test**
> Activate test mode with progress reporting

**--json**
> Output results in JSON format

**--parallel**
> Run files concurrently

**--retry** _num_
> Number of retry attempts on failure

**--delay** _ms_
> Pause before each request

**--variable** _name=value_
> Define a template variable

**--variables-file** _file_
> Load variables from a file

**--secret** _name=value_
> Define a redacted variable (hidden from logs)

**-o, --output** _file_
> Write response body to file

**-k, --insecure**
> Allow insecure SSL connections

**--verbose**
> Enable detailed logging

**--very-verbose**
> Enable extra-detailed logging including request/response bodies

**--continue-on-error**
> Proceed despite assertion failures

**--from-entry** _num_
> Start execution at a specific entry

**--to-entry** _num_
> Stop execution at a specific entry

# DESCRIPTION

**hurl** is a command-line tool that runs HTTP requests defined in simple plain text **.hurl** files. It can chain multiple requests, capture values from responses, and evaluate assertions on headers, status codes, and body content using XPath, JSONPath, and regex queries.

Hurl supports REST, SOAP, GraphQL, and any XML/JSON-based API. It handles authentication, cookies, form data, multipart uploads, and binary bodies. Built in **Rust** and powered by **libcurl**, it is a single binary with no runtime dependencies.

Hurl is designed for both fetching data and testing HTTP sessions, with built-in support for assertions on response status, headers, body content, duration, and SSL certificates. Multiple report formats (text, JUnit, TAP, HTML) make it easy to integrate into CI/CD pipelines.

# CAVEATS

Hurl files use a custom format that is not compatible with curl command syntax despite the shared libcurl backend. The plain text format requires learning Hurl's specific syntax for assertions and captures. Error messages for malformed .hurl files can be cryptic.

# HISTORY

**hurl** was created by **Orange-OpenSource** (the French telecommunications company) and first released on GitHub in **August 2020**. Written in Rust with libcurl as its HTTP engine, it has grown to over 18,000 GitHub stars and is actively maintained.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [httpie](/man/httpie)(1)
