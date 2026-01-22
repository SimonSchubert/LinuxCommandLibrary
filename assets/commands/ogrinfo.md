# TLDR

**Show file info**

```ogrinfo [file.shp]```

**Show layer summary**

```ogrinfo -so [file.shp] [layer_name]```

**List all layers**

```ogrinfo -al [file.shp]```

**Show specific feature**

```ogrinfo [file.shp] -fid [feature_id]```

**Query with SQL**

```ogrinfo [file.shp] -sql "[SELECT * FROM layer]"```

# SYNOPSIS

**ogrinfo** [_options_] _datasource_ [_layer_]

# PARAMETERS

_DATASOURCE_
> Vector data source.

_LAYER_
> Layer name.

**-so**
> Summary only.

**-al**
> All layers.

**-fid** _ID_
> Feature ID.

**-sql** _QUERY_
> SQL query.

**--help**
> Display help information.

# DESCRIPTION

**ogrinfo** displays vector data information. Shows layers, fields, and features.

The tool inspects geospatial files. Part of GDAL suite.

ogrinfo inspects vector data.

# CAVEATS

Part of GDAL. Format support varies. Large files may be slow.

# HISTORY

ogrinfo is part of **GDAL/OGR** library for geospatial data inspection.

# SEE ALSO

[ogr2ogr](/man/ogr2ogr)(1), [gdalinfo](/man/gdalinfo)(1)

