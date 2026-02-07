# TAGLINE

builds raster overview pyramids

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

**gdaladdo** builds or rebuilds overview images (also called pyramids) for raster datasets. Overviews are downsampled versions of the original image at multiple resolutions, enabling efficient display and processing at different zoom levels.

Without specified levels, the tool generates default pyramids. Custom levels define the subsampling factors (e.g., 2, 4, 8 means half, quarter, eighth resolution). Different resampling methods affect quality and performance: nearest is fastest, average produces smoother results, and cubic provides highest quality.

Overviews can be stored internally in the file or as separate .ovr sidecar files. Compression settings reduce overview file size. gdaladdo is essential for working with large imagery in GIS applications and web mapping services.

# SEE ALSO

[gdal_translate](/man/gdal_translate)(1), [gdalinfo](/man/gdalinfo)(1)

