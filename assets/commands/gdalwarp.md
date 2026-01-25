# TLDR

**Reproject a raster** to a different coordinate system

```gdalwarp -t_srs [EPSG:4326] [input.tif] [output.tif]```

**Reproject with source and target** coordinate systems

```gdalwarp -s_srs [EPSG:32611] -t_srs [EPSG:4326] [input.tif] [output.tif]```

**Change resolution** while reprojecting

```gdalwarp -tr [0.001] [0.001] -t_srs [EPSG:4326] [input.tif] [output.tif]```

**Use bilinear resampling** method

```gdalwarp -r bilinear -t_srs [EPSG:4326] [input.tif] [output.tif]```

**Mosaic multiple rasters** into one output

```gdalwarp [input1.tif] [input2.tif] [input3.tif] [output.tif]```

**Clip raster using a shapefile** cutline

```gdalwarp -cutline [boundary.shp] -crop_to_cutline [input.tif] [output.tif]```

**Specify output format** and data type

```gdalwarp -of GTiff -ot Float32 -t_srs [EPSG:4326] [input.tif] [output.tif]```

# SYNOPSIS

**gdalwarp** [_OPTIONS_] _SRCFILE_... _DSTFILE_

# PARAMETERS

**-s_srs** _SRS_
> Source spatial reference system (EPSG code, PROJ.4, or WKT).

**-t_srs** _SRS_
> Target spatial reference system for output.

**-r** _METHOD_
> Resampling method: near, bilinear, cubic, cubicspline, lanczos, average, mode, max, min, med, q1, q3, sum.

**-tr** _XRES_ _YRES_
> Target resolution in georeferenced units.

**-ts** _WIDTH_ _HEIGHT_
> Target size in pixels.

**-te** _XMIN_ _YMIN_ _XMAX_ _YMAX_
> Target extent in georeferenced coordinates.

**-of** _FORMAT_
> Output format (GTiff, PNG, JPEG, etc.).

**-ot** _TYPE_
> Output band data type (Byte, UInt16, Float32, etc.).

**-cutline** _FILE_
> Vector file for clipping (shapefile, GeoJSON, etc.).

**-crop_to_cutline**
> Crop output extent to cutline boundary.

**-overwrite**
> Overwrite existing output file.

**-multi**
> Use multithreaded warping.

**-co** _NAME_=_VALUE_
> Creation option for output format.

# DESCRIPTION

**gdalwarp** is an image mosaicing, reprojection, and warping utility from the GDAL library. It transforms raster datasets between coordinate reference systems, resamples to different resolutions, mosaics multiple inputs into a single output, and clips rasters using vector boundaries.

The utility supports all GDAL raster formats and can apply ground control points (GCPs) stored with images. Various resampling algorithms are available, from fast nearest-neighbor to high-quality Lanczos windowed sinc interpolation.

gdalwarp is essential for GIS workflows requiring coordinate system transformations, data integration from multiple sources, or preparing raster data for specific analysis requirements.

# CAVEATS

Large rasters may require significant memory; use **-wm** to limit memory usage. Reprojection can introduce artifacts at high compression or with inappropriate resampling methods. Source coordinate system must be defined or specified with -s_srs. NoData values should be handled explicitly with -srcnodata and -dstnodata.

# HISTORY

gdalwarp is part of **GDAL** (Geospatial Data Abstraction Library), originally developed by Frank Warmerdam starting in **1998**. GDAL became an OSGeo project and has grown into the fundamental library for geospatial raster operations, used by virtually all GIS software including QGIS, ArcGIS, and countless specialized tools.

# SEE ALSO

[gdal_translate](/man/gdal_translate)(1), [gdalinfo](/man/gdalinfo)(1), [ogr2ogr](/man/ogr2ogr)(1), [gdalbuildvrt](/man/gdalbuildvrt)(1)
