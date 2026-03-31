# TAGLINE

fast vulnerability scanner

# TLDR

**Scan target with all templates**

```nuclei -u [https://example.com]```

**Scan with specific template**

```nuclei -u [https://example.com] -t [template.yaml]```

**Scan multiple targets**

```nuclei -l [targets.txt]```

**Scan by severity**

```nuclei -u [https://example.com] -s critical,high```

**Scan by tags**

```nuclei -u [https://example.com] -tags [cve,oast]```

**Update templates**

```nuclei -ut```

**Save output as JSONL**

```nuclei -u [https://example.com] -jsonl -o [results.jsonl]```

# SYNOPSIS

**nuclei** [_options_]

# PARAMETERS

**-u** _URL_
> Target URL to scan.

**-l** _FILE_
> File containing target list.

**-t** _TEMPLATE_
> Template or directory to use.

**-s**, **-severity** _LEVEL_
> Filter by severity (info, low, medium, high, critical).

**-tags** _TAGS_
> Filter templates by tags (comma-separated).

**-o** _FILE_
> Output results to file.

**-jsonl**
> Output results in JSONL format.

**-ut**, **-update-templates**
> Update nuclei templates to latest version.

**-rl**, **-rate-limit** _NUM_
> Maximum requests per second (default: 150).

**-c**, **-concurrency** _NUM_
> Maximum number of templates to execute in parallel (default: 25).

**-silent**
> Show only results in output.

**-stats**
> Display scan statistics.

**--help**
> Display help information.

# DESCRIPTION

**nuclei** is a fast, template-based vulnerability scanner developed by ProjectDiscovery. It uses YAML-based templates to define scanning logic for various protocols including HTTP, DNS, TCP, and more.

The tool performs targeted scanning based on a large community-driven template library with thousands of checks for CVEs, misconfigurations, exposures, and default credentials. Templates can be customized or written from scratch.

# CAVEATS

Only use on authorized targets. Templates require regular updates to include new checks. May generate significant network traffic; use rate limiting in production environments. Some templates may trigger IDS/IPS alerts.

# HISTORY

Nuclei was created by **ProjectDiscovery** as a template-based vulnerability scanner.

# SEE ALSO

[nmap](/man/nmap)(1), [nikto](/man/nikto)(1), [httpx](/man/httpx)(1)

