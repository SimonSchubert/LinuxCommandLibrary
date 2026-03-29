# TAGLINE

Convert vector geospatial data between formats

# TLDR

**Convert a shapefile to GeoJSON**

```ogr2ogr -f "GeoJSON" [output.json] [input.shp]```

**Convert GeoJSON to GeoPackage**

```ogr2ogr -f "GPKG" [output.gpkg] [input.json]```

**Reproject data to WGS84**

```ogr2ogr -t_srs EPSG:4326 [output.shp] [input.shp]```

**Import a shapefile into PostGIS**

```ogr2ogr -f "PostgreSQL" PG:"dbname=[db]" [input.shp]```

**Filter features with a WHERE clause**

```ogr2ogr -where "[population > 10000]" [output.shp] [input.shp]```

**Clip features to a bounding box**

```ogr2ogr -spat [xmin] [ymin] [xmax] [ymax] [output.shp] [input.shp]```

**Append data to an existing PostGIS layer**

```ogr2ogr -append -f "PostgreSQL" PG:"dbname=[db]" [input.shp]```

**Select specific fields and rename the output layer**

```ogr2ogr -select [name,population] -nln [cities] [output.gpkg] [input.shp]```

# SYNOPSIS

**ogr2ogr** [_options_] _dst_datasource_ _src_datasource_ [_layer_]

# PARAMETERS

_DST_DATASOURCE_
> Destination dataset (file path, database connection string, etc.).

_SRC_DATASOURCE_
> Source dataset.

**-f** _FORMAT_
> Output format name (e.g., "GeoJSON", "ESRI Shapefile", "PostgreSQL", "GPKG").

**-t_srs** _SRS_
> Target spatial reference system (e.g., EPSG:4326).

**-s_srs** _SRS_
> Source spatial reference system (override if not defined in source).

**-a_srs** _SRS_
> Assign a spatial reference system to the output without reprojecting.

**-select** _FIELDS_
> Comma-separated list of fields to copy from the source.

**-where** _EXPR_
> SQL WHERE clause to filter features from the source.

**-sql** _STATEMENT_
> SQL statement to execute against the source for feature selection.

**-spat** _XMIN_ _YMIN_ _XMAX_ _YMAX_
> Spatial filter: only select features intersecting this bounding box.

**-clipsrc** _XMIN_ _YMIN_ _XMAX_ _YMAX_
> Clip geometries to the specified bounding box or WKT geometry.

**-overwrite**
> Delete and recreate the output layer if it already exists.

**-append**
> Append to an existing layer instead of creating a new one.

**-update**
> Open existing output datasource in update mode.

**-nln** _NAME_
> Assign a new name to the output layer.

**-nlt** _TYPE_
> Define the geometry type for the output layer (e.g., POINT, POLYGON, MULTILINESTRING).

**-lco** _NAME=VALUE_
> Layer creation option (format specific).

**-dsco** _NAME=VALUE_
> Dataset creation option (format specific).

**-skipfailures**
> Continue processing after a failure, skipping the failed feature.

**-progress**
> Display a progress bar on the terminal.

**-gt** _N_
> Group N features per transaction (default 20000). Increase for better performance with database drivers.

# DESCRIPTION

**ogr2ogr** converts vector geospatial data between file formats, databases, and web services. It is part of the **GDAL/OGR** library and supports over 80 vector formats including Shapefile, GeoJSON, GeoPackage, PostGIS, KML, and GML.

Beyond simple format conversion, ogr2ogr can reproject coordinates between spatial reference systems, filter features by attribute or spatial extent, clip geometries, select specific fields, and transform geometry types.

# CAVEATS

Part of the GDAL suite and must be installed separately. Format support depends on how GDAL was compiled. Coordinate system reprojection requires correct SRS definitions. The **-skipfailures** option forces transaction grouping to 1, which can severely slow database inserts.

# SEE ALSO

[ogrinfo](/man/ogrinfo)(1), [gdal_translate](/man/gdal_translate)(1), [gdalwarp](/man/gdalwarp)(1), [gdalinfo](/man/gdalinfo)(1)

