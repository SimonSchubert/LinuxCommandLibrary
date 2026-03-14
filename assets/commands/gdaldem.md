# TAGLINE

analyzes and visualizes terrain elevation

# TLDR

**Generate a hillshade** from a DEM

```gdaldem hillshade [dem.tif] [hillshade.tif]```

**Create a slope map** in degrees

```gdaldem slope [dem.tif] [slope.tif]```

**Generate an aspect map**

```gdaldem aspect [dem.tif] [aspect.tif]```

**Create color relief** using a color table file

```gdaldem color-relief [dem.tif] [colors.txt] [relief.tif]```

**Generate hillshade with custom** light direction and altitude

```gdaldem hillshade -az [315] -alt [45] [dem.tif] [hillshade.tif]```

**Compute Terrain Ruggedness Index**

```gdaldem TRI [dem.tif] [tri.tif]```

# SYNOPSIS

**gdaldem** _mode_ [_options_] _input_ _output_

# PARAMETERS

_MODE_
> Operation: hillshade, slope, aspect, color-relief, TRI, TPI, roughness.

_INPUT_
> Input DEM raster.

_OUTPUT_
> Output raster file.

**-az** _DEGREES_
> Light azimuth for hillshade.

**-alt** _DEGREES_
> Light altitude for hillshade.

**-s** _SCALE_
> Ratio of vertical to horizontal units (e.g., 111120 for feet with degree coordinates).

**-z** _FACTOR_
> Vertical exaggeration factor.

**-of** _FORMAT_
> Output raster format (default: GTiff).

**-compute_edges**
> Compute values at raster edges and nodata boundaries.

**--help**
> Display help information.

# DESCRIPTION

**gdaldem** analyzes and visualizes digital elevation models. It generates terrain derivatives including hillshade, slope, aspect, and various roughness indices.

The tool produces visualization-ready output from raw elevation data. Hillshading creates realistic terrain lighting. Slope and aspect support terrain analysis.

gdaldem is essential for cartographic terrain representation and geomorphological analysis.

# CAVEATS

Requires properly scaled DEM. Edge effects at boundaries. Large files need more memory.

# HISTORY

gdaldem is part of **GDAL** (Geospatial Data Abstraction Library), providing DEM analysis tools for terrain visualization and analysis.

# SEE ALSO

[gdal_contour](/man/gdal_contour)(1), [gdalinfo](/man/gdalinfo)(1), [ogr2ogr](/man/ogr2ogr)(1)
