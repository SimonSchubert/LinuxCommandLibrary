# TAGLINE

Browser exploitation framework for penetration testing

# TLDR

**Start BeEF server**

```beef-xss```

**Start with custom config**

```beef-xss -c [/path/to/config.yaml]```

**Reset database**

```beef-xss -x```

**Show help**

```beef-xss -h```

# SYNOPSIS

**beef-xss** [_options_]

# DESCRIPTION

**beef-xss** (Browser Exploitation Framework) is a penetration testing tool that focuses on web browser vulnerabilities. It hooks web browsers through XSS or other injection vectors and uses them as beachheads for launching client-side attacks.

The framework provides a web-based control panel for managing hooked browsers, executing JavaScript modules, and assessing client-side security. It examines exploitability from within the browser context rather than the network perimeter.

# PARAMETERS

**-c, --config** _file_
> Use custom configuration file

**-x, --resetdb**
> Reset the BeEF database

**-v, --verbose**
> Enable verbose output

**-h, --help**
> Display help message

# COMPONENTS

**Hook (hook.js)**
> JavaScript file that hooks browsers; inject via XSS or social engineering

**Web UI**
> Control panel at http://127.0.0.1:3000/ui/panel

**RESTful API**
> Programmatic access to BeEF functionality

**Command Modules**
> Browser exploitation modules (keylogging, phishing, network discovery)

# CONFIGURATION

**/etc/beef-xss/config.yaml**
> Main configuration file on Kali Linux installations. Controls network settings, credentials, and enabled extensions.

**/usr/share/beef-xss/config.yaml**
> Alternative location for the main configuration file in package installations.

# CAVEATS

Default credentials must be changed before use. Requires Ruby and various dependencies. Only use in authorized penetration testing engagements. The hook.js file must be injected into target browsers via XSS or other means. Network interfaces and ports are configurable in config.yaml.

# HISTORY

BeEF was created by **Wade Alcorn** and the BeEF development team. It has been an active open-source project since **2006**, becoming a standard tool in web application penetration testing for assessing browser-based attack vectors.

# SEE ALSO

[metasploit](/man/metasploit)(1), [burpsuite](/man/burpsuite)(1), [nikto](/man/nikto)(1)
