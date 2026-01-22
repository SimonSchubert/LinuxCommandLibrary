# TLDR

**Track** changes between enumerations

```amass track -d [example.com]```

Track since **specific date**

```amass track -d [example.com] -since "2024-01-01"```

Compare with **previous enumeration**

```amass track -d [example.com] -last [2]```

Output **differences** to file

```amass track -d [example.com] -o [changes.txt]```

# SYNOPSIS

**amass track** [_-d domain_] [_-since date_] [_-last n_] [_options_]

# DESCRIPTION

**amass track** compares results from different enumeration runs to identify changes in an organization's external attack surface. It detects new subdomains, removed assets, and infrastructure changes.

This is useful for continuous monitoring of an organization's digital footprint, alerting security teams to potential shadow IT or unauthorized changes.

# PARAMETERS

**-d** _domain_
> Domain to track

**-since** _date_
> Compare against enumerations since date

**-last** _n_
> Compare against the last n enumerations

**-history**
> Show all historical changes

**-o** _file_
> Output file

**-dir** _path_
> Database directory

# CAVEATS

Requires multiple enumeration runs stored in database. Detection quality depends on consistency of enumeration settings. Large organizations may have frequent legitimate changes.

# HISTORY

**amass track** was introduced to support continuous monitoring use cases, allowing security teams to detect attack surface changes over time.

# SEE ALSO

[amass](/man/amass)(1), [amass-enum](/man/amass-enum)(1), [amass-db](/man/amass-db)(1)
