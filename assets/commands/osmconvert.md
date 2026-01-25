# TLDR

**Convert PBF to OSM XML**

```osmconvert [input.pbf] -o=[output.osm]```

**Convert OSM to PBF**

```osmconvert [input.osm] -o=[output.pbf]```

**Extract bounding box**

```osmconvert [input.pbf] -b=[lon1,lat1,lon2,lat2] -o=[output.pbf]```

**Filter by polygon**

```osmconvert [input.pbf] -B=[polygon.poly] -o=[output.pbf]```

**Merge files**

```osmconvert [file1.pbf] [file2.pbf] -o=[merged.pbf]```

**Show statistics**

```osmconvert [input.pbf] --out-statistics```

# SYNOPSIS

**osmconvert** [_options_] _input_... [-o=_output_]

# PARAMETERS

**-o** _file_
> Output file.

**-b** _bbox_
> Bounding box filter.

**-B** _file_
> Polygon file filter.

**--drop-author**
> Remove author info.

**--drop-version**
> Remove version info.

**--complete-ways**
> Keep complete ways.

**--out-statistics**
> Show statistics.

# DESCRIPTION

**osmconvert** converts and filters OpenStreetMap data files. It handles conversion between OSM XML, PBF, and O5M formats, and can extract regions by bounding box or polygon.

Much faster than osmosis for simple conversions.

# BOUNDING BOX FORMAT

```
-b=min_lon,min_lat,max_lon,max_lat
-b=-74.1,40.5,-73.7,40.9  # NYC area
```

# CAVEATS

Memory-intensive for large files. Polygon files in .poly format. PBF format most efficient.

# HISTORY

osmconvert was developed by **Markus Weber** as a fast alternative to osmosis for common OSM data manipulation tasks.

# SEE ALSO

[osmosis](/man/osmosis)(1), [osm2pgsql](/man/osm2pgsql)(1), [osmfilter](/man/osmfilter)(1)
