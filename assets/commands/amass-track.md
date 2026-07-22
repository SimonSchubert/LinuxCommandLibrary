# TAGLINE

Track changes in external attack surface over time

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

Note that **track** is a legacy subcommand. In Amass v4 it was moved out of the core **amass** binary into the separate oam-tools package (as **oam_track**), and the workflow was reworked again in Amass v5. On current Amass installations the **amass track** subcommand may not be available; check the version with **amass -version**.

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

# CONFIGURATION

**~/.config/amass/config.ini**
> Amass configuration file defining data sources, API keys, and scope settings.

# CAVEATS

Requires multiple enumeration runs stored in the database. Detection quality depends on consistency of enumeration settings. Large organizations may have frequent legitimate changes. The **track** subcommand is deprecated: it was removed from the core **amass** binary in v4 (moved to oam-tools as **oam_track**) and reworked again in v5, so it may be unavailable on current installations.

# HISTORY

**amass track** was introduced to support continuous monitoring use cases, allowing security teams to detect attack surface changes over time. With the Amass v4 redesign the subcommand was split out into the oam-tools package as **oam_track**, and the tracking workflow was further reworked in Amass v5.

# INSTALL

```aur: yay -S amass```

```brew: brew install amass```

```nix: nix profile install nixpkgs#amass```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[amass](/man/amass)(1), [amass-enum](/man/amass-enum)(1), [amass-intel](/man/amass-intel)(1), [amass-db](/man/amass-db)(1)

# RESOURCES

```[Source code](https://github.com/owasp-amass/amass)```

```[Documentation](https://github.com/owasp-amass/amass/blob/master/doc/user_guide.md)```

<!-- verified: 2026-06-11 -->
