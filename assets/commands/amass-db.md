# TAGLINE

Query and manage stored enumeration results

# TLDR

**List** all enumerations in database

```amass db -list```

**Show** results from specific enumeration

```amass db -d [example.com] -enum [1]```

**Export** to JSON

```amass db -d [example.com] -json [output.json]```

Show **names** for a domain

```amass db -d [example.com] -names```

Show discovered **IP addresses**

```amass db -d [example.com] -ip```

# SYNOPSIS

**amass db** [_-d domain_] [_-enum index_] [_options_]

# DESCRIPTION

**amass db** manages the graph database used by amass to store enumeration results. It allows querying past enumerations, exporting data, and managing stored results.

The database persists discovered assets, enabling tracking of changes over time and correlation across multiple enumeration runs.

# PARAMETERS

**-list**
> List all enumerations in database

**-d** _domain_
> Filter by target domain

**-enum** _index_
> Select specific enumeration by index

**-names**
> Show discovered DNS names

**-ip**
> Show discovered IP addresses

**-asn**
> Show discovered ASN information

**-json** _file_
> Export results to JSON file

**-dir** _path_
> Database directory

**-show**
> Show details for enumeration

# CONFIGURATION

**~/.config/amass/config.ini**
> Amass configuration file defining data sources, API keys, and scope settings.

# CAVEATS

Database can grow large over time; consider periodic cleanup. Export format may change between amass versions. Database location defaults to ~/.config/amass/.

# HISTORY

The database functionality was added to amass to support persistent storage of enumeration results and enable change tracking features introduced in later versions.

# SEE ALSO

[amass](/man/amass)(1), [amass-enum](/man/amass-enum)(1), [amass-track](/man/amass-track)(1)
