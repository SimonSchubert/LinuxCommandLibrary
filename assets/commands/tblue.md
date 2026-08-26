# TAGLINE

passive blue-team HTTP security scanner that runs locally

# TLDR

**Passive** scan (GET/HEAD only)

```tblue -u [https://yoursite.com]```

Add side-effect-free **probes**

```tblue -u [https://yoursite.com] --probe```

Add **intrusive** checks (only on systems you own)

```tblue -u [https://yoursite.com] --active```

Write an **HTML** report

```tblue -u [https://yoursite.com] -o [report.html]```

**JSON** or **SARIF** for CI

```tblue -u [https://yoursite.com] --json -o [report.json]```

Run **selected** modules

```tblue -u [https://yoursite.com] --only headers,csp,cookies```

Fail the build on **high** findings

```tblue -u [https://yoursite.com] --fail-on high```

# SYNOPSIS

**tblue** **-u** _URL_ [_options_]

# PARAMETERS

**-u** _URL_
> Target. Must be a site you own or have permission to test.

**--probe**
> Enable ~12 side-effect-free probes (GraphQL introspection, CORS reflection, TLS ciphers, DNS enum).

**--active**
> Enable intrusive checks (auth attempts, password-reset posts, injection payloads, port scans). Implies **--probe**.

**-o** _file_
> HTML report path.

**--json** / **--sarif** / **--siem** / **--splunk** / **--sigma** / **--sentinel**
> Machine output formats.

**--only** / **--skip**
> Comma-separated module or category lists.

**--cookie** / **--bearer** / **--header** / **--auth**
> Session credentials, sent only to the target host (2.0.1+).

**--fail-on** _severity_ / **--fail-below** _n_
> CI gates: finding severity and/or numeric score.

**--browser**
> Playwright-powered SPA/DOM checks.

**-d** _depth_
> Crawl depth.

# DESCRIPTION

**tblue** is a Python scanner (PyPI package **tblue**) with hundreds of read-only checks: headers, CSP, cookies, TLS, secrets in JS, DNS email records, and more. Default mode is **passive**: CI fails the build if a default scanner sends POST or an injection payload.

Findings stay on disk (`~/.tblue/scans/` plus the report you pass). Some modules query public intel (crt.sh, OSV, NVD), which discloses the domain or version to those services. Use **--skip** on enrichment modules for offline runs.

An MCP server (`python -m tblue.mcp_server`) exposes **scan**, **list_modules**, and **explain_module**.

# CAVEATS

Unauthorized scanning is illegal. **--active** can lock accounts, send mail, and trip WAFs. Authenticated scans before 2.0.1 could leak credentials to third parties or follow redirects off-host; use 2.0.1+ and rotate old secrets. Findings are heuristics, not exploit proof. **HTTP_PROXY**/**HTTPS_PROXY** see request metadata.

# HISTORY

MIT project by taylannuhogluofficial-png. Current release 2.0.1 on PyPI (`pip install tblue`).

# SEE ALSO

[nikto](/man/nikto)(1), [testssl](/man/testssl)(1), [nuclei](/man/nuclei)(1)

# RESOURCES

```[Source code](https://github.com/taylannuhogluofficial-png/Tblue)```

```[Homepage](https://pypi.org/project/tblue/)```

<!-- verified: 2026-08-26 -->
