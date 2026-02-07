# TAGLINE

Web application security testing platform

# TLDR

**Start** Burp Suite

```burpsuite```

Start using **default configuration**

```burpsuite --use-defaults```

Open a specific **project file**

```burpsuite --project-file=[path/to/file]```

Load a specific **configuration file**

```burpsuite --config-file=[path/to/file]```

Start **without extensions**

```burpsuite --disable-extensions```

# SYNOPSIS

**burpsuite** [_options_]

# DESCRIPTION

**Burp Suite** is a graphical web application security testing platform developed by PortSwigger. It provides tools for intercepting HTTP traffic, scanning for vulnerabilities, and manually testing web applications.

The tool includes a proxy for traffic interception, scanner for automated vulnerability detection, repeater for manual request manipulation, and intruder for automated attacks.

# PARAMETERS

**--use-defaults**
> Start with default configuration settings

**--project-file** _file_
> Open a specific project file

**--config-file** _file_
> Load configuration from file

**--disable-extensions**
> Start without loading extensions

**--user-config-file** _file_
> Load user options from file

# CAVEATS

The free Community Edition has limited functionality; Professional Edition is paid. Requires Java Runtime Environment. Only use on applications you have authorization to test. Intercepting traffic may break TLS/SSL validation.

# HISTORY

**Burp Suite** was created by Dafydd Stuttard (PortSwigger) and first released in **2003**. It has become one of the most widely used tools for web application security testing.

# SEE ALSO

[mitmproxy](/man/mitmproxy)(1), [owasp-zap](/man/owasp-zap)(1), [nikto](/man/nikto)(1)
