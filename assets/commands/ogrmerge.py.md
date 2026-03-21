# TAGLINE

merges vector datasets

# TLDR

**Merge shapefiles**

```ogrmerge.py -o [output.shp] [input1.shp] [input2.shp]```

**Merge to GeoPackage**

```ogrmerge.py -f GPKG -o [output.gpkg] [*.shp]```

**Merge with single layer**

```ogrmerge.py -single -o [output.shp] [*.shp]```

**Overwrite output**

```ogrmerge.py -overwrite_ds -o [output.shp] [input*.shp]```

**Assign coordinate reference system**

```ogrmerge.py -a_srs [EPSG:4326] -o [output.shp] [*.shp]```

**Merge with source layer name as field**

```ogrmerge.py -single -src_layer_field_name [source] -o [output.gpkg] [*.shp]```

# SYNOPSIS

**ogrmerge.py** [_options_] -o _output_ _inputs_...

# PARAMETERS

**-o** _FILE_
> Output file.

**-f** _FORMAT_
> Output format.

**-single**
> Merge into single layer.

**-overwrite_ds**
> Overwrite existing output.

**-a_srs** _SRS_
> Assign coordinate reference system.

**-src_layer_field_name** _NAME_
> Add a field with the source layer name (useful with -single).

**-src_layer_field_content** _CONTENT_
> Specify content for the source layer field.

**-nln** _NAME_
> Name for the merged output layer (used with -single).

**--help**
> Display help information.

# DESCRIPTION

**ogrmerge.py** merges vector datasets. Combines multiple files into one.

The script consolidates geospatial data. Part of GDAL Python utilities.

# CAVEATS

Part of GDAL. Python script. Requires compatible schemas for single layer merge.

# HISTORY

ogrmerge.py was added to **GDAL** for convenient vector data merging.

# SEE ALSO

[ogr2ogr](/man/ogr2ogr)(1), [ogrinfo](/man/ogrinfo)(1), [gdalinfo](/man/gdalinfo)(1)

