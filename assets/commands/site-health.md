# TAGLINE

Check website and domain health from the command line

# TLDR

Run a **full health check** on a domain

```site-health example.com```

Show **verbose** diagnostics instead of the dashboard

```site-health --verbose example.com```

Check only **MX, SPF, and DMARC**

```site-health --mail example.com```

Emit a machine-readable **JSON** report

```site-health --format json example.com```

Require a specific **final URL** after redirects

```site-health --expected-url https://example.org/ example.com```

Skip the optional **/llms.txt** probe

```site-health --skip-llms-txt example.com```

Print the **version** and exit

```site-health --version```

# SYNOPSIS

**site-health** [**--mail**] [**--verbose**] [**--expected-url** _url_] [**--skip-llms-txt**] [**--format** _dashboard_|_json_] [**--version**] _domain_

# PARAMETERS

**--mail**
> Run only mail-related DNS checks: MX (including Null MX), SPF, and DMARC.

**--verbose**
> Print detailed troubleshooting diagnostics. Ignored when **--format json** is used.

**--expected-url** _url_
> Absolute `http://` or `https://` URL that the site must land on after redirects. Default is `https://<domain>/`.

**--skip-llms-txt**
> Skip the optional `GET /llms.txt` availability check.

**--format** _dashboard_|_json_
> Output format. Default `dashboard`. `json` writes one document on stdout. `text` is accepted as an alias for `dashboard`.

**--version**
> Print `site-health <version>` and exit 0.

**_domain_**
> Single hostname to check. A scheme, path, port, or trailing dot is stripped. Multiple arguments are a usage error.

# DESCRIPTION

**site-health** is a Go CLI that scores a domain's public web and mail posture. It uses only the Go standard library: no WHOIS client binary, no OpenSSL, and no other runtime dependencies.

A default (site) run probes DNS (A, AAAA, CNAME), TCP 80/443, HTTP/HTTPS, redirects and the canonical URL, the TLS certificate, response time, HTML content (common server, PHP, and WordPress error pages, parked-domain markers), domain registration expiry and registrar, MX/SPF/DMARC, and optionally `/llms.txt`. Before checks, it may auto-detect a forwarded destination: if `http://`, `http://www.`, `https://www.`, and `https://` all converge on one off-site final URL, that URL becomes the expected target. Several distinct destinations are treated as ambiguous and left for **--expected-url**.

Mail mode skips the web probes and prints a smaller MX/SPF/DMARC dashboard. JSON mode emits a single object with `tool`, `version`, `domain`, `mode` (`site` or `mail`), `expected_url`, `forwarding`, `checks`, `issues`, and `summary`. Exit codes are **0** (no failures), **1** (one or more failed checks), and **2** (usage error: missing domain, extra arguments, bad flag, or invalid **--expected-url**). Warnings do not by themselves produce exit 1.

# CAVEATS

Needs outbound network access to DNS, HTTP(S), and registration lookups; some TLDs and privacy-protected registrations will show incomplete registrar or expiry data. Only one domain is accepted per invocation. **--verbose** is suppressed in JSON mode. Auto-forwarding runs only when **--expected-url** was left at the default `https://<domain>/`. The `/llms.txt` check is informational and can be skipped. This is not a full vulnerability scanner, load tester, or replacement for **sslscan** / **testssl**.

# HISTORY

Written in **Go** by **atillalab**. The repository was published in **August 2026**. Version **0.8** is the completed Go rewrite. Licensed under **MIT**. The binary name is **site-health**.

# SEE ALSO

[whois](/man/whois)(1), [dig](/man/dig)(1), [host](/man/host)(1), [curl](/man/curl)(1), [openssl](/man/openssl)(1), [sslscan](/man/sslscan)(1), [httping](/man/httping)(1)

# RESOURCES

```[Source code](https://github.com/atillalab/site-health)```

<!-- verified: 2026-08-18 -->
