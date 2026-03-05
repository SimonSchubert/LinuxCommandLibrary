# TAGLINE

Open source intelligence TUI for Shodan, Censys, and VirusTotal

# TLDR

**Launch the OSINT interface**

```osintui```

# SYNOPSIS

**osintui** [_options_]

# DESCRIPTION

**osintui** is a terminal user interface for querying open source intelligence services including **Shodan**, **Censys**, and **VirusTotal**. It displays search results in a navigable TUI, allowing you to browse and analyze OSINT data without leaving the terminal.

API tokens are configured in **~/.osintui/config/config.toml**, which is created automatically on first run.

# CONFIGURATION

**~/.osintui/config/config.toml**
> TOML configuration file containing API tokens for each service.

# CAVEATS

Requires valid API keys for each service you want to use. Free API tiers have rate limits.

# HISTORY

**osintui** was created by **wssheldon** and is written in **Rust**. Its architecture is modeled after spotify-tui.

# SEE ALSO

[shodan](/man/shodan)(1), [nmap](/man/nmap)(1)
