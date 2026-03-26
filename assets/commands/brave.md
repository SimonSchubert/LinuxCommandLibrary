# TAGLINE

Privacy-focused web browser

# TLDR

**Open** Brave browser

```brave```

**Open** a URL

```brave [https://example.com]```

**Open** in incognito mode

```brave --incognito [https://example.com]```

**Open** in a new window

```brave --new-window [https://example.com]```

**Open** a URL as a standalone app

```brave --app=[https://example.com]```

**Use** a specific profile directory

```brave --user-data-dir=[~/.config/brave-profile2]```

# SYNOPSIS

**brave** [_options_] [_url_]

# DESCRIPTION

**brave** is a privacy-focused web browser built on Chromium. It blocks ads and trackers by default, includes a built-in cryptocurrency wallet, and rewards users with BAT tokens for viewing privacy-respecting ads.

The browser emphasizes speed, privacy, and security while maintaining compatibility with Chrome extensions.

# PARAMETERS

**--incognito**
> Open in incognito (private) mode

**--new-window**
> Open URL in a new window

**--new-tab** _url_
> Open URL in a new tab

**--app=**_url_
> Open URL in application mode without browser UI

**--user-data-dir=**_dir_
> Use a specific profile directory (default: ~/.config/brave-browser)

**--proxy-server=**_server_
> Use specified HTTP/SOCKS4/SOCKS5 proxy server for requests

**--disable-extensions**
> Disable all browser extensions

**--no-proxy-server**
> Don't use a proxy server, always make direct connections

**--headless**
> Run in headless mode without a visible window

# FEATURES

- Built-in ad/tracker blocking (Brave Shields)
- Automatic HTTPS upgrades
- Script blocking
- Fingerprint protection
- BAT cryptocurrency integration
- Brave Rewards
- Private browsing with Tor
- IPFS support
- Chrome extension compatibility

# PRIVACY FEATURES

- **Shields** - Block ads, trackers, scripts
- **Private tabs with Tor** - Anonymous browsing
- **No telemetry** - Privacy by default
- **Fingerprint randomization**

# BRAVE REWARDS

Opt-in system that rewards users with BAT (Basic Attention Token) for viewing privacy-respecting ads. Users can tip content creators.

# CAVEATS

Some websites may not work with aggressive blocking. BAT rewards availability varies by region. Sync requires Brave account. Some find built-in crypto features unnecessary. Based on Chromium (Google project).

# HISTORY

**Brave** was created by Brendan Eich (JavaScript creator, Mozilla co-founder) and launched in **2016** to provide privacy-focused browsing with an alternative ad model.

# SEE ALSO

[firefox](/man/firefox)(1), [chromium](/man/chromium)(1), [google-chrome](/man/google-chrome)(1), [tor-browser](/man/tor-browser)(1)
