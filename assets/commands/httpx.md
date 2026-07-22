# TAGLINE

fast HTTP toolkit for probing web servers

# TLDR

**Probe live hosts**

```cat [hosts.txt] | httpx```

**Check with title**

```httpx -l [hosts.txt] -title```

**Show status codes**

```httpx -l [hosts.txt] -status-code```

**Check specific ports**

```httpx -l [hosts.txt] -ports [80,443,8080]```

**Follow redirects**

```httpx -l [hosts.txt] -follow-redirects```

**Output JSON**

```httpx -l [hosts.txt] -json -o [output.json]```

# SYNOPSIS

**httpx** [_options_]

# PARAMETERS

**-l**, **-list** _FILE_
> Input file containing the list of hosts to process.

**-u**, **-target** _HOST_
> Probe a specific target host directly instead of reading a list.

**-title**
> Display the page title.

**-sc**, **-status-code**
> Display the response status code.

**-td**, **-tech-detect**
> Display detected technologies (based on the Wappalyzer dataset).

**-ip**
> Display the resolved host IP.

**-p**, **-ports** _PORTS_
> Ports to probe, using nmap-style syntax (e.g. `http:1,2-10,https:443`).

**-x** _METHOD_
> HTTP method(s) to probe; use `all` to try every method.

**-H** _HEADER_
> Custom HTTP header to send with each request.

**-fr**, **-follow-redirects**
> Follow HTTP redirects.

**-mc**, **-match-code** _CODES_
> Only show responses matching the given status codes (e.g. `-mc 200,301`).

**-fc**, **-filter-code** _CODES_
> Exclude responses matching the given status codes.

**-t**, **-threads** _N_
> Number of concurrent threads (default 50).

**-rl**, **-rate-limit** _N_
> Maximum requests per second (default 150).

**-timeout** _SECONDS_
> Request timeout (default 10).

**-retries** _N_
> Number of retries on failure.

**-silent**
> Only print results, suppressing the banner and stats.

**-json**
> Store output in JSONL(ines) format.

**-o**, **-output** _FILE_
> File to write results to.

**-help**
> Display help information.

# DESCRIPTION

**httpx** is a fast, multi-purpose HTTP toolkit built on Go's `retryablehttp` library for running many probes against a list of hosts at once. It checks which hosts are alive and can report status codes, titles, response headers, TLS data, detected technologies, screenshots, and more.

By default it probes with the **HTTPS** scheme first and falls back to **HTTP** only if HTTPS is unreachable; **-no-fallback** shows both. The tool is built for reconnaissance and security testing workflows, processing large host lists concurrently and integrating with the rest of the ProjectDiscovery toolchain (**nuclei**, **subfinder**, etc.).

# CAVEATS

Intended for reconnaissance and security testing against systems you're authorized to test. Requires Go to build from source; prebuilt binaries are available. Flags are single-dash (e.g. `-json`, not `--json`).

# HISTORY

httpx was created by **ProjectDiscovery** as part of its open-source security reconnaissance toolkit, alongside tools like **nuclei** and **subfinder**.

# INSTALL

```apk: sudo apk add py3-httpx```

```brew: brew install httpx```

```nix: nix profile install nixpkgs#httpx```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[nuclei](/man/nuclei)(1), [nmap](/man/nmap)(1), [httprobe](/man/httprobe)(1)

# RESOURCES

```[Source code](https://github.com/projectdiscovery/httpx)```

```[Homepage](https://projectdiscovery.io)```

```[Documentation](https://docs.projectdiscovery.io/opensource/httpx)```

<!-- verified: 2026-07-19 -->
