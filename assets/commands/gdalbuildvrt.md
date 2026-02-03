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

**gdalbuildvrt** creates a virtual dataset (VRT) that references multiple input raster files. VRTs provide a lightweight way to mosaic or stack rasters without copying data.

# SEE ALSO

[gdaladdo](/man/gdaladdo)(1), [gdal_translate](/man/gdal_translate)(1)

