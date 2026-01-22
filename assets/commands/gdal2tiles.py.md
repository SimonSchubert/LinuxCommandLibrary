# TLDR

**Generate tiles from** image

```gdal2tiles.py [input.tif] [output_dir]```

**Specify zoom levels**

```gdal2tiles.py -z [5-18] [input.tif] [output_dir]```

**Generate for Leaflet**

```gdal2tiles.py -w leaflet [input.tif] [output_dir]```

**Use multiple processes**

```gdal2tiles.py --processes=[4] [input.tif] [output_dir]```

**Specify tile format**

```gdal2tiles.py --tileformat=[png] [input.tif] [output_dir]```

# SYNOPSIS

**gdal2tiles.py** [_options_] _input_ _output_directory_

# PARAMETERS

_INPUT_
> Input raster file (GeoTIFF, etc.).

_OUTPUT_DIRECTORY_
> Directory for output tiles.

**-z** _LEVELS_
> Zoom levels (e.g., 5-18).

**-w** _WEBVIEWER_
> Web viewer: leaflet, openlayers, none.

**--processes** _N_
> Parallel processing.

**--tileformat** _FORMAT_
> Tile format: png, jpeg, webp.

**--help**
> Display help information.

# DESCRIPTION

**gdal2tiles.py** generates map tiles from georeferenced raster images. It creates tile pyramids compatible with web mapping libraries like Leaflet and OpenLayers.

The tool produces XYZ or TMS tile structures with optional HTML viewer pages. It handles large images by generating multiple zoom levels with appropriate resampling.

gdal2tiles.py enables serving large geospatial imagery as web map tiles.

# CAVEATS

Large images need significant disk space. Processing time scales with zoom levels. Source must be georeferenced.

# HISTORY

gdal2tiles.py is part of **GDAL** (Geospatial Data Abstraction Library), providing tile generation for web mapping from geospatial raster data.

# SEE ALSO

[gdalinfo](/man/gdalinfo)(1), [gdal_translate](/man/gdal_translate)(1)
