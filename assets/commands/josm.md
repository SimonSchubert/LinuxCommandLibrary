# TLDR

**Launch JOSM editor**

```josm```

**Open OSM file**

```josm [file.osm]```

**Download area by bounding box**

```josm --download=[minlat],[minlon],[maxlat],[maxlon]```

**Start in offline mode**

```josm --offline=all```

**Set window geometry**

```josm --geometry=[800]x[600]+[100]+[100]```

# SYNOPSIS

**josm** [_options_] [_file_...]

# PARAMETERS

**--download=**_bounds_
> Download bounding box (minlat,minlon,maxlat,maxlon).

**--downloadgps=**_bounds_
> Download GPS traces for area.

**--offline=**_mode_
> Start in offline mode (osm_api, josm_website, all).

**--geometry=**_WxH+X+Y_
> Set window size and position.

**--language=**_lang_
> Set interface language.

**--selection=**_query_
> Select objects matching search.

**--version**
> Display version information.

# DESCRIPTION

**josm** is the Java OpenStreetMap Editor, a feature-rich desktop application for editing OpenStreetMap data. It supports loading and saving OSM data files, GPS tracks, imagery layers, and provides advanced editing tools for mapping.

# SEE ALSO

[osmium](/man/osmium)(1), [osm2pgsql](/man/osm2pgsql)(1)

