# TAGLINE

creates virtual raster mosaics

# TLDR

**Create virtual mosaic**

```gdalbuildvrt [output.vrt] [input1.tif] [input2.tif]```

**Create from file list**

```gdalbuildvrt -input_file_list [files.txt] [output.vrt]```

**Create with resolution**

```gdalbuildvrt -resolution [average] [output.vrt] [*.tif]```

**Create with overwrite**

```gdalbuildvrt -overwrite [output.vrt] [*.tif]```

**Create with band selection**

```gdalbuildvrt -b [1] -b [2] -b [3] [output.vrt] [input.tif]```

# SYNOPSIS

**gdalbuildvrt** [_options_] _output.vrt_ _inputs_...

# PARAMETERS

**-input_file_list** _file_
> Read inputs from file.

**-resolution** _method_
> Resolution calculation (highest, lowest, average, user).

**-overwrite**
> Overwrite existing output.

**-b** _band_
> Select specific band.

**-separate**
> Put each input in separate band.

**-allow_projection_difference**
> Allow different projections.

**-te** _xmin ymin xmax ymax_
> Target extent.

# DESCRIPTION

**gdalbuildvrt** creates a virtual raster dataset (VRT) that references multiple input files without copying data. VRT files are XML documents describing how to combine source rasters into a unified dataset, enabling on-the-fly mosaicking, stacking, and subsetting.

The tool can mosaic adjacent tiles into seamless coverages or stack bands from separate files into multi-band datasets. Resolution handling controls how inputs with different pixel sizes are combined. VRTs support mixing projections with appropriate flags.

Virtual datasets save disk space and processing time compared to creating physical mosaics. They're ideal for working with large tile collections, time series data, and multi-spectral imagery where logical combinations change frequently.

# SEE ALSO

[gdaladdo](/man/gdaladdo)(1), [gdal_translate](/man/gdal_translate)(1)

