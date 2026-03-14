# TAGLINE

generates contour lines from elevation data

# TLDR

**Generate contours**

```gdal_contour -a [elev] -i [10] [dem.tif] [contours.shp]```

**Specify interval**

```gdal_contour -i [100] [dem.tif] [contours.shp]```

**Fixed contour levels**

```gdal_contour -fl [100] [500] [1000] [dem.tif] [contours.shp]```

**Output to GeoJSON**

```gdal_contour -f "GeoJSON" -i [10] [dem.tif] [contours.geojson]```

**Generate 3D contour polygons**

```gdal_contour -p -3d -a [elev] -i [50] [dem.tif] [contours.shp]```

# SYNOPSIS

**gdal_contour** [_options_] _input_ _output_

# PARAMETERS

_INPUT_
> Input elevation raster (DEM).

_OUTPUT_
> Output vector file.

**-a** _NAME_
> Attribute name for elevation.

**-i** _INTERVAL_
> Contour interval.

**-fl** _LEVELS_
> Fixed contour levels.

**-f** _FORMAT_
> Output format.

**-b** _BAND_
> Source band number (default: 1).

**-3d**
> Force production of 3D vectors instead of 2D.

**-p**
> Generate contour polygons rather than contour lines.

**-off** _OFFSET_
> Offset from zero relative to which to interpret intervals.

**-snodata** _VALUE_
> Input nodata value to ignore.

**-nln** _NAME_
> Output layer name.

**-q**
> Quiet mode, suppress progress output.

# DESCRIPTION

**gdal_contour** generates contour lines from elevation rasters (DEMs). It creates vector features representing lines of equal elevation.

The tool supports regular interval or specified level contours. Output includes elevation attributes for labeling. Multiple output formats are available.

gdal_contour is used for cartography, terrain analysis, and visualization of elevation data.

# CAVEATS

Quality depends on DEM resolution. Dense contours may be slow. Output size varies with complexity.

# HISTORY

gdal_contour is part of **GDAL** (Geospatial Data Abstraction Library), providing contour generation from digital elevation models for mapping and analysis.

# SEE ALSO

[gdaldem](/man/gdaldem)(1), [gdalinfo](/man/gdalinfo)(1), [ogr2ogr](/man/ogr2ogr)(1)
