# TLDR

**Impersonate Chrome**

```curl_chrome124 [https://example.com]```

**Impersonate Firefox**

```curl_ff120 [https://example.com]```

**Impersonate Safari**

```curl_safari17_0 [https://example.com]```

**Output to file**

```curl_chrome124 -o [output.html] [https://example.com]```

**With custom headers**

```curl_chrome124 -H "[Header: value]" [https://example.com]```

**Follow redirects**

```curl_chrome124 -L [https://example.com]```

# SYNOPSIS

**curl_chrome\*** [_curl_options_] _url_

**curl_ff\*** [_curl_options_] _url_

**curl_safari\*** [_curl_options_] _url_

# DESCRIPTION

**curl-impersonate** is a modified curl that impersonates browser TLS and HTTP fingerprints. Makes requests identical to Chrome, Firefox, Edge, or Safari. Bypasses bot detection based on TLS fingerprinting.

# WRAPPER SCRIPTS

**curl_chrome110**, **curl_chrome124**
> Chrome impersonation

**curl_ff109**, **curl_ff120**
> Firefox impersonation

**curl_safari15_5**, **curl_safari17_0**
> Safari impersonation

**curl_edge101**
> Edge impersonation

# VERSIONS

**Chrome version**: Impersonates Chrome, Edge, Safari

**Firefox version**: Impersonates Firefox

# LIBCURL API

```c
curl_easy_impersonate(curl, "chrome116", 1);
```

Set target browser and whether to use default headers.

# DOCKER USAGE

```
docker run --rm lwthiker/curl-impersonate:0.6-chrome \
  curl_chrome124 https://example.com
```

# CAVEATS

Some curl flags alter TLS signature and may cause detection. Wrapper scripts set necessary headers. Custom options may break impersonation.

# SEE ALSO

[curl](/man/curl)(1), [httpie](/man/httpie)(1), [wget](/man/wget)(1)
