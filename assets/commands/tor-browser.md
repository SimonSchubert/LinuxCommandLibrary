# TLDR

**Launch Tor Browser**

```tor-browser```

**Launch with a specific profile**

```tor-browser --profile [path/to/profile]```

**Launch and open a URL**

```tor-browser [url]```

**Launch in offline mode**

```tor-browser --offline```

**Launch with new instance** (separate from existing)

```tor-browser --new-instance```

**Show version information**

```tor-browser --version```

# SYNOPSIS

**tor-browser** [_options_] [_url_]

# PARAMETERS

**--profile** _path_
> Start with the specified profile directory.

**--new-instance**
> Open a new browser instance instead of using an existing one.

**--offline**
> Start in offline mode.

**--private-window**
> Open a private browsing window.

**--safe-mode**
> Start with all extensions disabled.

**--headless**
> Run without a visible UI (for automation).

**--version**
> Display version information.

**--help**
> Display help message.

# DESCRIPTION

**Tor Browser** is a privacy-focused web browser based on Mozilla Firefox that routes all traffic through the Tor anonymity network. It is pre-configured with privacy protections including NoScript, HTTPS-Only mode, and anti-fingerprinting measures.

The browser is typically installed via **torbrowser-launcher** on Debian/Ubuntu systems or from the official tarball. When installed via the launcher, the command **torbrowser-launcher** handles downloading, verifying, updating, and starting the browser. From a manual installation, the browser is started using **./start-tor-browser.desktop** from the extracted directory.

Tor Browser automatically connects to the Tor network on startup, encrypting traffic through multiple relays to anonymize the user's location and browsing activity. It includes a circuit display showing the relay path and allows requesting new circuits for different exit nodes.

# CAVEATS

Tor Browser should not be used with other browsers simultaneously for activities requiring anonymity, as this can compromise privacy. Downloading files or enabling plugins may expose your real IP address. Performance is slower than regular browsers due to traffic routing through multiple relays. The browser is designed for anonymity, not just privacy.

# HISTORY

**Tor Browser** was first released by **The Tor Project** in **2008**, initially as a bundle combining Firefox with Tor. It evolved from earlier tools like Torbutton and became the officially recommended way to browse anonymously using Tor. The project continues active development with regular security updates and Firefox ESR rebases.

# SEE ALSO

[tor](/man/tor)(1), [torbrowser-launcher](/man/torbrowser-launcher)(1), [torify](/man/torify)(1), [firefox](/man/firefox)(1)
