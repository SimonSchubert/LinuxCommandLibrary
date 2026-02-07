# TAGLINE

displays raster dataset information

# TLDR

**Show raster information**

```gdalinfo [file.tif]```

**Show statistics**

```gdalinfo -stats [file.tif]```

**Show in JSON** format

```gdalinfo -json [file.tif]```

**Check specific dataset**

```gdalinfo [file.vrt]```

**Show metadata**

```gdalinfo -mm [file.tif]```

# SYNOPSIS

**gdalinfo** [_options_] _datasetname_

# PARAMETERS

_DATASETNAME_
> Input raster file.

**-json**
> Output as JSON.

**-stats**
> Compute and display statistics.

**-mm**
> Compute min/max values.

**-hist**
> Compute histogram.

**-nogcp**
> Suppress GCP output.

**-nomd**
> Suppress metadata output.

**--help**
> Display help information.

# DESCRIPTION

**gdalinfo** displays information about raster datasets. It shows format, dimensions, coordinate system, bands, and metadata for geospatial raster files.

The tool reads header information and optionally computes statistics. It supports hundreds of raster formats through GDAL drivers.

gdalinfo is the first step in understanding and validating geospatial raster data.

# CAVEATS

Statistics computation reads entire file. Some formats have limited metadata. Large files may be slow.

# HISTORY

gdalinfo is part of **GDAL** (Geospatial Data Abstraction Library), providing raster inspection capabilities across hundreds of formats.

# SEE ALSO

[gdalwarp](/man/gdalwarp)(1), [gdal_translate](/man/gdal_translate)(1), [ogrinfo](/man/ogrinfo)(1)
