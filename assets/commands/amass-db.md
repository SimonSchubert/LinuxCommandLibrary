# TAGLINE

query and manage stored amass enumeration results

# TLDR

**List** enumerations for a domain

```amass db -list -d [example.com]```

**Show** results from a specific enumeration index

```amass db -show -d [example.com] -enum [1]```

**Print discovered names** only

```amass db -names -d [example.com]```

**Show discovered IP addresses** for a domain

```amass db -show -ip -d [example.com]```

**Export** all results for a domain to JSON

```amass db -d [example.com] -json [output.json]```

**Print ASN summary** for a domain

```amass db -summary -d [example.com]```

# SYNOPSIS

**amass db** [_options_]

# DESCRIPTION

**amass db** queries the local graph database that stores results from previous **amass enum** runs. It lists past enumerations, prints their findings, exports them to JSON, and can scope queries by domain, enumeration index, and data source.

The database persists discovered assets so changes between scans can be tracked and results correlated across runs.

# PARAMETERS

**-d** _domain_
> Domain name(s) to filter by, comma-separated. May be repeated.

**-df** _file_
> File containing root domain names, one per line.

**-list**
> Print a numbered list of enumerations, filtered by the provided domains.

**-show**
> Print results for the enumeration index and domains provided.

**-enum** _index_
> Identify an enumeration via the index from **-list**.

**-names**
> Print only the discovered DNS names.

**-ip**
> Show IP addresses for discovered names.

**-ipv4**
> Show only IPv4 addresses.

**-ipv6**
> Show only IPv6 addresses.

**-src**
> Print the data source for each discovered name.

**-summary**
> Print the ASN table summary only.

**-demo**
> Censor output to make it suitable for demonstrations.

**-nocolor**
> Disable colorized output.

**-silent**
> Disable all output during execution (useful with **-json**/**-o**).

**-config** _file_
> Path to the INI configuration file.

**-dir** _path_
> Path to the directory containing the graph database (default: `~/.config/amass`).

**-json** _file_
> Path to a JSON output file.

**-o** _file_
> Path to a text file capturing stdout/stderr.

**-h**, **-help**
> Show the program usage message.

# CONFIGURATION

**~/.config/amass/config.ini**
> Amass configuration file defining data sources, API keys, and scope settings.

**~/.config/amass/**
> Default location of the graph database (overridable with **-dir**).

# CAVEATS

The database can grow large over time; periodic pruning or rotating the **-dir** path is sensible. The **db** subcommand was deprecated in Amass v4 in favor of the standalone **oam_subs** / **oam-tools** utilities; this page documents the v3-era CLI still found in many distributions.

# HISTORY

**amass** is an **OWASP** project originally created by **Jeff Foley** (caffix) for in-depth attack surface mapping. The graph database and **db** subcommand were added in the v3 series to support persistent storage of enumeration results and change tracking. In **v4** the database tooling was split out into **oam-tools** (`oam_subs`, etc.).

# SEE ALSO

[amass](/man/amass)(1), [amass-enum](/man/amass-enum)(1), [amass-track](/man/amass-track)(1)
