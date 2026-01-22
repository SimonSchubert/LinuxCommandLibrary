# TLDR

**Convert shapefile to GeoJSON**

```ogr2ogr -f "GeoJSON" [output.json] [input.shp]```

**Convert GeoJSON to shapefile**

```ogr2ogr -f "ESRI Shapefile" [output.shp] [input.json]```

**Reproject data**

```ogr2ogr -t_srs EPSG:4326 [output.shp] [input.shp]```

**Import to PostGIS**

```ogr2ogr -f "PostgreSQL" PG:"dbname=[db]" [input.shp]```

**Select specific fields**

```ogr2ogr -select [field1,field2] [output] [input]```

# SYNOPSIS

**ogr2ogr** [_options_] _dst_ _src_

# PARAMETERS

_DST_
> Destination dataset.

_SRC_
> Source dataset.

**-f** _FORMAT_
> Output format.

**-t_srs** _SRS_
> Target coordinate system.

**-s_srs** _SRS_
> Source coordinate system.

**-select** _FIELDS_
> Select fields.

**-where** _EXPR_
> Filter expression.

**--help**
> Display help information.

# DESCRIPTION

**ogr2ogr** converts vector geospatial data. Supports many formats.

The tool transforms between GIS formats. Part of GDAL suite.

ogr2ogr converts vector data.

# CAVEATS

Part of GDAL. Format support varies. Coordinate system important.

# HISTORY

ogr2ogr is part of **GDAL/OGR** library for geospatial data processing.

# SEE ALSO

[ogrinfo](/man/ogrinfo)(1), [gdal_translate](/man/gdal_translate)(1), [gdalwarp](/man/gdalwarp)(1)

