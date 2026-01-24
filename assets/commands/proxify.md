# TLDR

**Start proxy server**

```proxify```

**Specify port**

```proxify -p [8888]```

**Output to directory**

```proxify -o [logs/]```

**Upstream proxy**

```proxify -upstream [http://127.0.0.1:8080]```

**Dump requests**

```proxify -dump-req```

**Dump responses**

```proxify -dump-resp```

**Filter by content type**

```proxify -match-resp-body "[text/html]"```

# SYNOPSIS

**proxify** [_-p port_] [_-o dir_] [_-upstream proxy_] [_options_]

# PARAMETERS

**-p**, **--port** _PORT_
> Listen port.

**-o**, **--output** _DIR_
> Output directory.

**-upstream** _PROXY_
> Upstream proxy.

**-dump-req**
> Dump requests.

**-dump-resp**
> Dump responses.

**-match-resp-body** _PATTERN_
> Filter response body.

**-match-req-body** _PATTERN_
> Filter request body.

**-silent**
> Silent mode.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**proxify** is a simple HTTP/HTTPS proxy for traffic capture. It logs and dumps web traffic.

Request and response bodies are captured. Useful for analyzing application traffic.

Pattern matching filters interesting traffic. Focus on specific content types or keywords.

Upstream proxy chains through another proxy. Enables integration with other security tools.

Output organization saves traffic by domain. Easy to review captured data.

# CAVEATS

HTTPS requires certificate installation. Large traffic volumes consume disk. Some apps detect proxies.

# HISTORY

**Proxify** was created by **ProjectDiscovery** for security testing. It provides simple traffic interception for web application analysis.

# SEE ALSO

[mitmproxy](/man/mitmproxy)(1), [burpsuite](/man/burpsuite)(1), [charles](/man/charles)(1)
