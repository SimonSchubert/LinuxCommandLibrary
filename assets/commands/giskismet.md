# TAGLINE

wireless recon visualization tool for Kismet data

# TLDR

**Import Kismet NETXML data**

```giskismet -x [kismet-output.netxml]```

**Query for specific access points by ESSID**

```giskismet -q "select * from wireless where ESSID='[MyNetwork]'"```

**Export results to KML file**

```giskismet -x [data.netxml] -o [output.kml]```

**Filter by encryption type**

```giskismet -x [data.netxml] --encryption [WPA]```

**Filter by BSSID**

```giskismet -x [data.netxml] --bssid [AA:BB:CC:DD:EE:FF]```

# SYNOPSIS

**giskismet** [_options_]

# PARAMETERS

**-h**, **--help**
> Display help.

**-v**, **--version**
> Display version.

**-x** _FILE_, **--xml** _FILE_
> Parse Kismet NETXML file.

**--csv** _FILE_
> Parse Kismet CSV file.

**--bssid** _FILTER_
> Filter by BSSID (file or comma-separated list).

**--essid** _FILTER_
> Filter by ESSID (file or comma-separated list).

**--encryption** _FILTER_
> Filter by encryption type (file or comma-separated list).

**--channel** _FILTER_
> Filter by channel (file or comma-separated list).

**-a**, **--ap**
> Insert only access points.

**-q** _SQL_, **--query** _SQL_
> Execute SQL query against the database.

**-o** _FILE_, **--output** _FILE_
> Specify output filename for KML export.

**-n** _NAME_, **--name** _NAME_
> Set KML layer name.

**-s**, **--silent**
> Suppress output when adding access points.

**-d** _LEVEL_, **--debug** _LEVEL_
> Debug information level.

# DESCRIPTION

**giskismet** is a Perl-based tool that processes wireless recon data gathered by **Kismet** and stores it in a SQLite database. Users can run SQL queries against the data and generate **Google Earth KML** files for mapping access point locations.

The tool supports filtering by BSSID, ESSID, encryption type, and channel, making it useful for wireless security assessments and site surveys.

# CAVEATS

Requires Kismet NETXML output files as input. GPS data must be present in the Kismet capture for meaningful KML output. The tool is deprecated in favor of newer Kismet built-in visualization features.

# SEE ALSO

[kismet](/man/kismet)(1), [aircrack-ng](/man/aircrack-ng)(1)

