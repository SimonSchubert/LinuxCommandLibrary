# TLDR

**GET request**

```lwp-request [https://example.com/]```

**POST request with data**

```lwp-request -m POST -c 'application/json' -C '[{"key":"value"}]' [https://api.example.com/]```

**HEAD request** (headers only)

```lwp-request -m HEAD [https://example.com/]```

**Show response headers and content**

```lwp-request -USed [https://example.com/]```

**Follow redirects**

```lwp-request -f [https://example.com/redirect]```

**Use specific method**

```lwp-request -m [DELETE] [https://api.example.com/resource]```

**Set custom header**

```lwp-request -H 'Authorization: Bearer [token]' [https://api.example.com/]```

**Save to file**

```lwp-request [https://example.com/file] > [output]```

# SYNOPSIS

**lwp-request** [_-m method_] [_-f_] [_-H header_] [_-c content-type_] [_-C content_] [_options_] _url_

# PARAMETERS

**-m** _METHOD_
> HTTP method (GET, POST, HEAD, PUT, DELETE).

**-f**
> Follow redirects.

**-H** _HEADER_
> Add custom header.

**-c** _TYPE_
> Content-Type for request body.

**-C** _CONTENT_
> Content/body data.

**-b** _URI_
> Base URI for relative URLs.

**-o** _FORMAT_
> Output format.

**-d**
> Print request content/body.

**-e**
> Print response headers.

**-s**
> Print response status.

**-S**
> Print request URL.

**-U**
> Print request headers.

**-t** _SECONDS_
> Timeout.

**-a**
> Use text mode for content.

# DESCRIPTION

**lwp-request** is a command-line HTTP client from the LWP (Library for WWW in Perl) suite. It sends HTTP requests and displays responses.

The tool is also available as GET, POST, and HEAD commands, which are symlinks with preset methods. These shortcuts simplify common operations.

Output options control what gets printed: request details (-U, -S, -d) and response details (-e, -s). Combined flags show the full transaction for debugging.

Authentication, cookies, and proxy settings come from environment variables or configuration files. It integrates with the Perl LWP ecosystem.

For simple testing and scripting, lwp-request provides HTTP access without additional dependencies beyond Perl's LWP modules.

# CAVEATS

Requires libwww-perl package. Less feature-rich than curl or httpie. Error handling is basic. Large file downloads may be slow.

# HISTORY

**lwp-request** is part of **libwww-perl**, created by **Gisle Aas** starting in the **1990s**. LWP became the standard HTTP library for Perl, and lwp-request provided command-line access to its functionality.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [http](/man/http)(1), [perl](/man/perl)(1)
