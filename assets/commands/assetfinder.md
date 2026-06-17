# TAGLINE

Discover subdomains and related domains

# TLDR

**Find** subdomains and related assets

```assetfinder [example.com]```

Find only **subdomains**

```assetfinder --subs-only [example.com]```

# SYNOPSIS

**assetfinder** [_--subs-only_] _domain_

# DESCRIPTION

**assetfinder** discovers domains and subdomains related to a target organization. It queries various sources including certificate transparency logs, DNS databases, and web archives to find associated assets.

The tool is useful for reconnaissance in security assessments and for discovering an organization's external attack surface.

# PARAMETERS

**--subs-only**
> Only show subdomains

**domain**
> Target domain to investigate

# CONFIGURATION

Some data sources need API credentials, supplied through environment variables:

**FB_APP_ID**, **FB_APP_SECRET**
> Facebook application credentials for the Facebook certificate transparency source.

**VT_API_KEY**
> VirusTotal API key.

**SPYSE_API_TOKEN**
> Spyse (findsubdomains) API token.

# CAVEATS

Passive reconnaissance only; generates no traffic to target. Results depend on public data sources. May include old or inactive domains.

# HISTORY

**assetfinder** was created by Tom Hudson (tomnomnom) as a fast, simple subdomain discovery tool for security reconnaissance.

# SEE ALSO

[amass](/man/amass)(1), [subfinder](/man/subfinder)(1), [findomain](/man/findomain)(1)

# RESOURCES

```[Source code](https://github.com/tomnomnom/assetfinder)```

<!-- verified: 2026-06-17 -->
