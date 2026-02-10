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
> Assign coordinate system.

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

[ogr2ogr](/man/ogr2ogr)(1), [ogrinfo](/man/ogrinfo)(1)

