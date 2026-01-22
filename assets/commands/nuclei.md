# TLDR

**Scan target with all templates**

```nuclei -u [https://example.com]```

**Scan with specific template**

```nuclei -u [https://example.com] -t [template.yaml]```

**Scan multiple targets**

```nuclei -l [targets.txt]```

**Scan by severity**

```nuclei -u [https://example.com] -severity critical,high```

**Update templates**

```nuclei -update-templates```

# SYNOPSIS

**nuclei** [_options_]

# PARAMETERS

**-u** _URL_
> Target URL to scan.

**-l** _FILE_
> File containing target list.

**-t** _TEMPLATE_
> Template or directory to use.

**-severity** _LEVEL_
> Filter by severity.

**-o** _FILE_
> Output results to file.

**-update-templates**
> Update nuclei templates.

**--help**
> Display help information.

# DESCRIPTION

**nuclei** is a fast vulnerability scanner. Uses YAML-based templates.

The tool performs targeted scanning. Community-driven template library.

nuclei scans for vulnerabilities.

# CAVEATS

Only use on authorized targets. Templates require updates. May generate traffic.

# HISTORY

Nuclei was created by **ProjectDiscovery** as a template-based vulnerability scanner.

# SEE ALSO

[nmap](/man/nmap)(1), [nikto](/man/nikto)(1), [httpx](/man/httpx)(1)

