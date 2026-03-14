# TAGLINE

HTTP proxy and network traffic monitor

# TLDR

**Start Charles Proxy**

```charles```

**Start in headless mode** (no GUI)

```charles -headless```

**Start with a custom configuration file**

```charles -headless -config [config.xml]```

**Start with throttling enabled**

```charles -throttling```

# SYNOPSIS

**charles** [_options_]

# PARAMETERS

**-config** _file_
> Load configuration from specified file.

**-headless**
> Run without GUI. Use the web interface at http://control.charles/ for control.

**-throttling**
> Start with bandwidth throttling enabled.

# PROXY CONFIGURATION

Default HTTP proxy: **localhost:8888**

For HTTPS inspection:
1. Configure SSL Proxying in Charles settings
2. Install Charles Root Certificate on device
3. Trust certificate in system/browser

iOS/Android: Configure WiFi proxy to point to Charles IP:8888

# DESCRIPTION

**Charles** is a cross-platform HTTP proxy and monitor that enables developers to view HTTP/HTTPS traffic between their machine and the Internet. It is particularly useful for debugging web applications, APIs, and mobile app network communication.

Key features include SSL proxying for decrypting HTTPS traffic, bandwidth throttling to simulate slow connections, request/response modification, breakpoints for intercepting requests, and automated testing support.

Charles presents traffic in a tree view organized by host, with detailed inspection of headers, cookies, request/response bodies, and timing information. Sessions can be saved for later analysis or sharing.

# CONFIGURATION

**config.xml**
> Charles configuration file with proxy settings, SSL certificates, and recording options. Loaded with -config flag.

# CAVEATS

Charles is commercial software requiring a license after the trial period. HTTPS inspection requires installing Charles' root certificate, which has security implications. Some applications with certificate pinning may not work with Charles SSL proxying. Mobile device configuration requires network access to the Charles host.

# HISTORY

Charles Proxy was created by **Karl von Randow** and first released in **2002**. Originally developed for macOS, it expanded to Windows and Linux. The tool became widely adopted by mobile and web developers for debugging network traffic, particularly as mobile development grew and tools like browser developer tools were insufficient for native app debugging.

# SEE ALSO

[mitmproxy](/man/mitmproxy)(1), [burpsuite](/man/burpsuite)(1), [wireshark](/man/wireshark)(1), [fiddler](/man/fiddler)(1)
