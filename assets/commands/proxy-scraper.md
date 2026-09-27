# TAGLINE

Find public proxies that pass a live check

# TLDR

**Open the setup wizard**

```proxy-scraper```

**Stop after 50 proxies** that can tunnel HTTPS

```proxy-scraper --want 50 --https-only -y```

**Keep only** Germany, Austria, and Switzerland

```proxy-scraper --country DE,AT,CH -l 20000 -y```

**Recheck the public hourly list** from this network

```proxy-scraper --recheck live -y```

**Serve those hits** as one local rotating proxy

```proxy-scraper --recheck --serve```

**Print matching hits** on standard output

```proxy-scraper --recheck live --want 20 -y -o -```

**Write a proxychains config** next to the results

```proxy-scraper --want 30 -y --export proxychains```

**Rank sources** by hit rate

```proxy-scraper --list-sources```

# SYNOPSIS

**proxy-scraper** [_options_]

# DESCRIPTION

**proxy-scraper** collects publicly listed HTTP, SOCKS4, and SOCKS5 proxies and keeps the ones that pass a live check. A hit has to fetch two independent pages and return a foreign exit address, then a static HTML page has to arrive unchanged. HTTPS is tested through a tunnel with verified TLS. Each hit records latency, anonymity (**elite**, **anonymous**, or **transparent**), country, and whether the exit looks like a datacenter or appears on the SpamCop blocklist.

With no arguments in a terminal, a wizard asks what to look for and prints the matching command. **-y** skips the wizard. **--want** _N_ stops once enough matches are found. **--recheck** checks the previous hits again. **--recheck live** starts from the project's hourly public list.

**--serve** turns the hits into one proxy on **127.0.0.1:8899** (HTTP and SOCKS5 on the same port). Each new connection goes through a different upstream. The proxy username can request **country-XX**, **type-http**, **type-socks4**, **type-socks5**, or **session-NAME**.

Each run writes a folder under **results/**. **results/latest.txt** names the newest folder. On macOS and Linux, **results/latest** is also a symlink. The folder holds **all.txt** (`type://ip:port`, fastest first), one list per protocol, **proxies.json**, and **proxies.csv**.

The PyPI package is **proxy-scraper-cli**. The shell command is **proxy-scraper**, and the same program is also installed as **proxy-scraper-cli**. **proxy-scraper --mcp**, or the separate **proxy-scraper-mcp** command, speaks MCP on standard I/O and needs the **mcp** extra (`pipx install "proxy-scraper-cli[mcp]"`, Python 3.10 or newer). The tool itself needs Python 3.9 or newer. Release **1.8.0**. MIT license.

# PARAMETERS

**-y**, **--yes**

> Skip the wizard and start with the defaults, plus any other flags on the command line.

**-i**, **--interactive**

> Open the wizard even when other arguments are present. Those arguments are the starting values.

**-V**, **--version**

> Print the version and exit.

**--types** _http_ _socks4_ _socks5_

> Protocols to check. The default is all three.

**-l**, **--limit** _N_

> Check only the _N_ most promising candidates, ordered by history and source hit rate. **0** means no cap.

**--want** _N_

> Stop once _N_ proxies match the filters.

**--country** _CC_

> Comma-separated country codes, for example **DE,AT,CH**.

**--https-only**

> Keep only proxies that can tunnel HTTPS.

**--anonymity** _anonymous_|_elite_

> Minimum anonymity. **elite** is stricter than **anonymous**.

**--max-latency** _MS_

> Drop proxies slower than this many milliseconds. The check gives up at that latency instead of waiting out the full timeout.

**--no-datacenter**

> Drop exits that look like cloud or hosting addresses.

**--no-blocklisted**

> Drop exits listed by SpamCop.

**--target** _URL_

> Keep only proxies that reach this site. Repeat the flag for another site.

**--recheck** [_FILE_|**live**]

> Skip collection. With no argument, check the last run plus history. **live** downloads the public hourly list and checks it from this network. A path checks that file.

**--fast**

> Skip the HTTPS test. The confirmation request and the anonymity check still run.

**-c**, **--concurrency** _N_

> Simultaneous checks. Default **2000**.

**-t**, **--timeout** _SECONDS_

> Time limit per proxy. Default **8**.

**--connect-timeout** _SECONDS_

> Time limit for the TCP connect. Default **4**.

**--no-geo**

> Skip the country lookup.

**--no-dnsbl**

> Skip the SpamCop lookup.

**--serve** [_PORT_]

> After the run, listen as a rotating proxy. Default port **8899**, bound to **127.0.0.1**.

**--serve-host** _ADDRESS_

> Bind address. **0.0.0.0** accepts connections from other machines.

**--serve-password** _SECRET_

> Require this password on HTTP and SOCKS5 logins and on the status page. **PROXY_SCRAPER_SERVE_PASSWORD** sets the same value without putting it in the process list.

**--rotate** _weighted_|_random_|_round-robin_|_fastest_

> How the server picks the next upstream. The default is **weighted** (faster, proven proxies more often).

**--sticky** _SEC_

> Keep the same upstream for one target site for this many seconds.

**--serve-refill** _HOURS_

> While serving, check fresh proxies on this interval and add the hits to the pool.

**-o**, **--output** _FILE_

> Also write every hit as `type://ip:port`. **-** prints them on standard output and moves the interface to standard error.

**--export** _FORMATS_

> Extra files in the results folder: **proxychains**, **clash**, **curl**, or **all**. Separate names with commas.

**--list-sources** [_N_]

> Print the source ranking by hit rate and exit. Default **50**.

**--discover**

> Search GitHub for new proxy lists on this run.

**--no-discover**

> Turn off the automatic GitHub search.

**--discover-repos** _N_

> Maximum repositories to inspect during discovery. Default **400**, or **40** without a GitHub token.

**--no-cache**

> Download every source list again. Unchanged lists are normally skipped via ETag.

**--all-sources**

> Also load sources marked dead, outdated, or unreachable.

**--completion** _bash_|_zsh_|_fish_

> Print a completion script for that shell.

**--mcp**

> Run as an MCP server on standard I/O. Requires the **mcp** extra and Python 3.10 or newer.

# CONFIGURATION

An installed copy stores learned state (source hit rates and proxy history) in the user data directory: **~/Library/Application Support/proxy-scraper** on macOS, **$XDG_DATA_HOME/proxy-scraper** or **~/.local/share/proxy-scraper** on Linux, and **%LOCALAPPDATA%\proxy-scraper** on Windows. **PROXY_SCRAPER_HOME** replaces that directory. Result files go to **./results** in the current directory.

A checkout that still contains **pyproject.toml** and **proxy_scraper.py** keeps state in **data/** and results in **results/**, both inside the project.

**GITHUB_TOKEN**, or a logged-in **gh**, raises the limit for **--discover**. Without a token the search stops at 40 repositories.

While **--serve** is running, **http://127.0.0.1:8899/__proxy-scraper/status** returns JSON and **/__proxy-scraper/metrics** returns Prometheus text. A password, when set, is required as Basic auth on those paths.

# CAVEATS

A public proxy is operated by someone else, who can read traffic that is not encrypted. Keep passwords, cookies, and personal data off it.

**--serve-host** set to anything other than a loopback address, with no password, is an open proxy for anyone who can reach the port.

Many networks block outbound proxy connections. When the hit rate falls below 0.2% the tool warns and does not treat that run as evidence that its sources went bad.

Hits go stale within minutes. Run **--recheck** before relying on a saved list. The hourly public list still needs a check from this network.

On PyPI the name **proxy-scraper** belongs to an older package. This command is installed as **proxy-scraper-cli**.

# HISTORY

Written by **Maximilian Feix**. First public release **1.0.0** on 24 September 2026. The installable command arrived in **1.3.0** the same day. **1.8.0** (27 September 2026) is the current release.

# SEE ALSO

[curl](/man/curl)(1), [proxychains](/man/proxychains)(1), [mitmproxy](/man/mitmproxy)(1)

# RESOURCES

```[Source code](https://github.com/maximilianfeix/proxy-scraper)```

<!-- verified: 2026-09-27 -->
