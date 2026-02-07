# TAGLINE

converts and transforms raster data

# TLDR

**Convert raster format**

```gdal_translate [input.tif] [output.png]```

**Convert with specific format**

```gdal_translate -of GTiff [input.png] [output.tif]```

**Subset by bounds**

```gdal_translate -projwin [ulx] [uly] [lrx] [lry] [input.tif] [output.tif]```

**Rescale to 8-bit**

```gdal_translate -ot Byte -scale [input.tif] [output.tif]```

**Set compression**

```gdal_translate -co COMPRESS=LZW [input.tif] [output.tif]```

**Extract bands**

```gdal_translate -b 1 -b 2 -b 3 [input.tif] [rgb.tif]```

# SYNOPSIS

**gdal_translate** [_options_] _src_ _dst_

# PARAMETERS

**-of** _format_
> Output format (GTiff, PNG, JPEG, etc.).

**-ot** _type_
> Output data type (Byte, Int16, Float32, etc.).

**-b** _band_
> Select band(s).

**-projwin** _ulx_ _uly_ _lrx_ _lry_
> Subset by coordinates.

**-srcwin** _xoff_ _yoff_ _xsize_ _ysize_
> Subset by pixels.

**-scale** [_src_min_ _src_max_ [_dst_min_ _dst_max_]]
> Scale values.

**-co** _NAME=VALUE_
> Creation option.

**-outsize** _xsize_ _ysize_
> Output size (pixels or %).

**-a_srs** _srs_
> Assign spatial reference.

**-a_nodata** _value_
> Assign nodata value.

# DESCRIPTION

**gdal_translate** converts raster data between formats, extracts subsets, and applies transformations. It's part of GDAL (Geospatial Data Abstraction Library), the standard for raster geospatial operations.

Common uses include format conversion, creating image pyramids, applying compression, and extracting regions from large datasets.

# CAVEATS

Large files may require significant memory. Some formats don't support all features. Lossy compression loses data. Check gdalinfo for source properties first.

# HISTORY

GDAL was started by **Frank Warmerdam** in **1998** and is now an OSGeo project. gdal_translate is one of the core GDAL utilities, supporting over 150 raster formats.

# SEE ALSO

[gdalwarp](/man/gdalwarp)(1), [gdalinfo](/man/gdalinfo)(1), [ogr2ogr](/man/ogr2ogr)(1), [gdal_merge.py](/man/gdal_merge.py)(1)
