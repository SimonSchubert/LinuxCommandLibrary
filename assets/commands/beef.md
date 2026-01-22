# TLDR

**Start BeEF** server with default configuration

```beef-xss```

**Start BeEF** with a custom configuration file

```beef-xss -c [path/to/config.yaml]```

**Start BeEF** on a specific interface and port

```beef-xss -x [interface] -p [port]```

**Reset BeEF** user credentials

```beef-xss -h```

**Stop BeEF** service

```beef-xss-stop```

# SYNOPSIS

**beef-xss** [**-c** _config_] [**-x** _interface_] [**-p** _port_] [**-v**]

# PARAMETERS

**-c _config_**
> Path to a custom YAML configuration file

**-x _interface_**
> Network interface to bind the server

**-p _port_**
> Port number to listen on (default: 3000)

**-v**
> Enable verbose output

**-h**
> Display help and reset user credentials

# DESCRIPTION

**BeEF** (Browser Exploitation Framework) is a penetration testing tool focused on exploiting vulnerabilities in web browsers. Unlike traditional network-based tools, BeEF targets the client-side attack surface by injecting JavaScript hooks into web pages.

When a target browser loads a page containing the BeEF hook script, it establishes a persistent connection to the BeEF control panel. Security professionals can then execute various command modules against the hooked browser, testing for vulnerabilities like XSS, session hijacking, and social engineering attacks.

The tool provides a web-based UI accessible at **http://127.0.0.1:3000/ui/panel** by default. The hook script is served at **http://\<IP\>:3000/hook.js** and must be embedded in target pages via a script tag.

# CAVEATS

BeEF is intended **exclusively for authorized penetration testing**. Using it without explicit written permission from the target system owner is illegal and may result in severe legal consequences. Always ensure proper authorization before conducting any browser exploitation tests.

# HISTORY

BeEF was originally created by **Wade Alcorn** in **2006** as a research project to demonstrate browser security weaknesses. It became an open-source project and gained popularity in the security community. The tool is now maintained by a community of contributors and is included in security-focused Linux distributions like **Kali Linux**.

# SEE ALSO

[bettercap](/man/bettercap)(1), [mitmproxy](/man/mitmproxy)(1), [nikto](/man/nikto)(1), [burpsuite](/man/burpsuite)(1)
