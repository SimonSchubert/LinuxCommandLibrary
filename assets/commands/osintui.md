# TAGLINE

Open source intelligence TUI for Shodan and VirusTotal

# TLDR

**Launch the OSINT interface**

```osintui```

**Install** from crates.io

```cargo install osintui```

# SYNOPSIS

**osintui**

# DESCRIPTION

**osintui** is a terminal user interface for querying open source intelligence services **Shodan** and **VirusTotal**. It displays search results in a navigable TUI, allowing you to browse and analyze OSINT data without leaving the terminal.

API tokens are configured in **~/.osintui/config/config.toml**, which is created automatically on first run.

# CONFIGURATION

**~/.osintui/config/config.toml**
> TOML configuration file containing API tokens for each service.

```
[keys]
virustotal = "api_key"
shodan = "api_key"
```

# KEYS

**/**
> Focus the search input.

**h**
> Go to the home screen.

**s** / **v**
> Switch to the Shodan or VirusTotal view.

**q**
> Go back.

**Arrow keys**
> Move between panes and list items (**j**/**k** also move down/up).

# CAVEATS

Requires valid API keys for each service you want to use. Free API tiers have rate limits. The tool has seen no release since **0.1.1** (October 2022) and the original GitHub repository is no longer available; it remains installable from crates.io.

# HISTORY

**osintui** was created by **wssheldon** and is written in **Rust**. Its architecture is modeled after spotify-tui, and it was inspired by **wtfis**.

# SEE ALSO

[nmap](/man/nmap)(1), [theHarvester](/man/theHarvester)(1), [wtfis](/man/wtfis)(1)
