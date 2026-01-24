# TLDR

**Start privoxy**

```privoxy [/etc/privoxy/config]```

**Start in foreground**

```privoxy --no-daemon [config]```

**Check configuration**

```privoxy --config-test [config]```

**Show version**

```privoxy --version```

# SYNOPSIS

**privoxy** [_options_] _config-file_

# DESCRIPTION

**privoxy** is a non-caching web proxy with filtering capabilities. It blocks ads, removes tracking, modifies web content, and enhances privacy.

The tool works between the browser and the internet, inspecting and modifying HTTP traffic according to configurable rules.

# PARAMETERS

**--no-daemon**
> Run in foreground.

**--pidfile** _file_
> PID file location.

**--user** _user_
> Run as user.

**--chroot**
> Chroot to home directory.

**--pre-chroot-nslookup** _host_
> DNS lookup before chroot.

**--config-test**
> Test configuration.

**--version**
> Show version.

**--help**
> Show help.

# CONFIGURATION

**listen-address**: Proxy listen address
**forward**: Upstream proxy
**actionsfile**: Action definitions
**filterfile**: Content filters
**logfile**: Log file path

# CAVEATS

HTTPS filtering requires browser configuration. Complex rules need tuning. May break some sites. Performance overhead for filtering.

# HISTORY

**Privoxy** evolved from **Internet Junkbuster** in **2001**, created as a privacy-focused web proxy. It's developed by a team of volunteers and remains one of the most flexible content-filtering proxies.

# SEE ALSO

[squid](/man/squid)(8), [tinyproxy](/man/tinyproxy)(1), [tor](/man/tor)(1), [dnsmasq](/man/dnsmasq)(1)
