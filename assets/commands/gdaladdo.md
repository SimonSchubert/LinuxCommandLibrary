# TLDR

**Build overviews**

```gdaladdo [image.tif]```

**Build specific levels**

```gdaladdo [image.tif] [2] [4] [8] [16]```

**Build using average resampling**

```gdaladdo -r average [image.tif]```

**Build external overviews**

```gdaladdo -ro [image.tif]```

**Build with compression**

```gdaladdo --config COMPRESS_OVERVIEW JPEG [image.tif]```

# SYNOPSIS

**gdaladdo** [_options_] _filename_ [_levels_...]

# PARAMETERS

**-r** _method_
> Resampling method (nearest, average, gauss, cubic).

**-ro**
> Create external overview file.

**--config** _key_ _value_
> Set configuration option.

**-b** _band_
> Build for specific band only.

**-clean**
> Remove existing overviews.

# DESCRIPTION

**gdaladdo** builds or rebuilds overview images (pyramids) for raster datasets. Overviews allow efficient viewing of large images at reduced resolutions.

# SEE ALSO

[gdal_translate](/man/gdal_translate)(1), [gdalinfo](/man/gdalinfo)(1)

