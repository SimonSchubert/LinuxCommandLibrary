# TAGLINE

Attack surface mapping and asset discovery

# TLDR

**Enumerate** subdomains passively

```amass enum -passive -d [example.com]```

**Active** enumeration with DNS resolution and brute forcing

```amass enum -active -brute -d [example.com]```

Enumerate with **output file**

```amass enum -d [example.com] -o [output.txt]```

Retrieve discovered **subdomain names** from the database

```amass subs -names -d [example.com]```

Find **associations** between discovered assets

```amass assoc -d [example.com]```

# SYNOPSIS

**amass** _command_ [_options_]

# DESCRIPTION

**amass** is an OWASP project for in-depth attack surface mapping and asset discovery. It performs DNS enumeration, subdomain brute-forcing, and leverages numerous data sources including search engines, certificate transparency logs, and APIs.

The tool builds a comprehensive map of an organization's external network footprint, identifying subdomains, related domains, and network blocks. Collected data is stored in a graph database; **enum** populates the database while **subs**, **assoc**, and **viz** present results from it.

Since version 5.0 the engine and collection are separated: **enum** drives the collection engine, and analysis subcommands query the stored graph afterwards.

# PARAMETERS

**enum**
> Interface with the engine to perform asset discovery and network mapping.

**subs**
> Analyze and present discovered subdomains from the graph database.

**assoc**
> Find associations between discovered assets.

**track**
> Identify newly discovered assets over time.

**viz**
> Generate graph visualizations of collected data.

**-d** _domain_
> Target domain names (comma-separated).

**-passive**
> Only use passive data sources (no DNS resolution).

**-active**
> Use active methods such as zone transfers and certificate grabbing.

**-brute**
> Execute subdomain brute forcing after searches.

**-ip**
> Show IP addresses of discovered names.

**-names**
> With **subs**, print only the discovered names.

**-o** _file_
> Output file path.

**-dir** _path_
> Directory containing the output and graph database.

**-config** _file_
> YAML configuration file.

**-timeout** _minutes_
> Number of minutes to run before quitting.

# CONFIGURATION

**~/.config/amass/config.yaml**
> Main configuration file for data sources, API keys, and enumeration settings (YAML since v4).

# CAVEATS

Active enumeration generates significant DNS traffic and may be detected. Many data sources require API keys for full access. Results vary based on configured sources. As of v5, results are written to the graph database; use **subs** to retrieve names rather than relying solely on **enum -o**.

# HISTORY

**amass** was created by Jeff Foley and became an official OWASP project. It gained widespread adoption in the security community for reconnaissance and bug bounty hunting.

# INSTALL

```aur: yay -S amass```

```brew: brew install amass```

```nix: nix profile install nixpkgs#amass```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[subfinder](/man/subfinder)(1), [dnsenum](/man/dnsenum)(1), [nmap](/man/nmap)(1)

# RESOURCES

```[Source code](https://github.com/owasp-amass/amass)```

```[Homepage](https://owasp.org/www-project-amass/)```

```[Documentation](https://owasp-amass.github.io/docs)```

<!-- verified: 2026-06-11 -->
