# TAGLINE

Curl statistics made simple and visual

# TLDR

**Show HTTP request statistics** for a URL

```httpstat [https://example.com]```

**Follow redirects**

```httpstat -L [https://example.com]```

**Send a POST request**

```httpstat -X POST -d "[data]" [https://example.com/api]```

**Use custom headers**

```httpstat -H "Authorization: Bearer [token]" [https://example.com/api]```

# SYNOPSIS

**httpstat** [_curl_options_] _URL_

# DESCRIPTION

**httpstat** visualizes **curl** statistics in a clear and beautiful way. It wraps around curl to capture and display the time spent in each phase of an HTTP request: **DNS lookup**, **TCP connection**, **TLS handshake**, **server processing**, and **content transfer**. This breakdown helps identify performance bottlenecks in web requests.

Because httpstat is a wrapper around cURL, you can pass any cURL-supported option after the URL (except **-w**, **-D**, **-o**, **-s**, **-S** which are used internally).

# CAVEATS

Relies on curl being installed on the system. Some curl options (-w, -D, -o, -s, -S) conflict with httpstat's internal usage and cannot be passed through. The Python version requires Python 3.

# HISTORY

**httpstat** was created by **Reorx** and is written in **Python** as a single-file script with no dependencies. It quickly became popular and inspired implementations in **Go**, **Rust**, and **Nim**. The Go version by **Dave Cheney** is a standalone binary that does not require curl.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1)
