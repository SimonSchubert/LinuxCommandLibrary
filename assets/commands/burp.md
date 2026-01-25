# TLDR

**Start Burp Suite**

```burpsuite```

**Start with specific memory allocation**

```java -jar -Xmx4g [burpsuite_pro.jar]```

**Start and load a project file**

```burpsuite --project-file=[project.burp]```

**Start in headless mode**

```java -jar [burpsuite_pro.jar] --project-file=[project.burp] --unpause-spider-and-scanner```

# SYNOPSIS

**burpsuite** [_options_]

# PARAMETERS

**--project-file** _file_
> Load an existing project file.

**--config-file** _file_
> Load configuration from file.

**--user-config-file** _file_
> Load user configuration from file.

**--unpause-spider-and-scanner**
> Start with spider and scanner unpaused.

**--disable-extensions**
> Start without loading extensions.

**--collaborator-server**
> Run as Collaborator server only.

**--collaborator-config** _file_
> Collaborator server configuration.

# PROXY CONFIGURATION

Default proxy listener: **127.0.0.1:8080**

Configure browser to use:
- HTTP/HTTPS Proxy: 127.0.0.1
- Port: 8080

Install Burp CA certificate from: **http://burp/cert**

# DESCRIPTION

**Burp Suite** is an integrated platform for web application security testing. It functions as an intercepting proxy, allowing security testers to inspect and modify traffic between a browser and target web applications.

Core features include: **Proxy** for intercepting HTTP/S traffic, **Scanner** (Pro only) for automated vulnerability detection, **Intruder** for customized attacks like fuzzing, **Repeater** for manual request manipulation, and **Sequencer** for analyzing session token randomness.

The tool supports extensions via BApp Store and custom Java/Python development. It can save complete project state for later resumption and generate professional reports of findings.

# CAVEATS

Burp Suite Community Edition lacks automated scanning capabilities. Using Burp against systems without authorization is illegal. HTTPS interception requires installing Burp's CA certificate. Memory usage can be significant for large projects; allocate sufficient heap space.

# HISTORY

Burp Suite was created by **Dafydd Stuttard** (author of "The Web Application Hacker's Handbook") and first released around **2003**. Originally a collection of separate tools, it evolved into an integrated suite. PortSwigger Ltd was founded in **2004** to develop and market Burp Suite professionally. It has become the industry-standard tool for web application penetration testing.

# SEE ALSO

[zaproxy](/man/zaproxy)(1), [mitmproxy](/man/mitmproxy)(1), [nikto](/man/nikto)(1), [sqlmap](/man/sqlmap)(1)
