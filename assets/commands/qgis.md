# TAGLINE

Open-source Geographic Information System

# TLDR

**Launch QGIS**

```qgis```

**Open a specific project file**

```qgis --project [path/to/project.qgs]```

**Open QGIS with specific layers**

```qgis [path/to/file.shp] [path/to/raster.tif]```

**Export a map snapshot** to an image file

```qgis --snapshot [output.png] --width [1024] --height [768] --project [project.qgs]```

**Launch without splash screen** and without plugins

```qgis --nologo --noplugins```

**Export project layers to DXF**

```qgis --dxf-export [output.dxf] --project [project.qgs]```

**Use a specific user profile**

```qgis --profile [profilename]```

**Run a Python script on startup**

```qgis --code [path/to/script.py]```

# SYNOPSIS

**qgis** [_options_] [_file_ ...]

# PARAMETERS

**-p**, **--project** _projectfile_
> Load the given QGIS project file.

**-s**, **--snapshot** _filename_
> Emit a snapshot of loaded datasets to the given image file.

**-w**, **--width** _width_
> Width of snapshot to emit.

**-h**, **--height** _height_
> Height of snapshot to emit.

**-e**, **--extent** _xmin,ymin,xmax,ymax_
> Set initial map extent.

**-n**, **--nologo**
> Hide the splash screen on startup.

**-V**, **--noversioncheck**
> Don't check for new version at startup.

**-P**, **--noplugins**
> Don't restore plugins on startup.

**--nopython**
> Disable Python support entirely.

**-B**, **--skipbadlayers**
> Don't prompt for missing layers.

**-C**, **--nocustomization**
> Don't apply GUI customization.

**-z**, **--customizationfile** _path_
> Use given ini file as GUI customization.

**-f**, **--code** _path_
> Run given Python file on load.

**--profile** _name_
> Load a named profile from the profiles folder.

**-S**, **--profiles-path** _path_
> Path to store user profile folders.

**-l**, **--lang** _language_
> Use specified language for the interface.

**-d**, **--defaultui**
> Reset user UI settings to default.

**--hide-browser**
> Hide the browser widget.

**--dxf-export** _filename.dxf_
> Emit DXF output of loaded datasets.

**--dxf-extent** _xmin,ymin,xmax,ymax_
> Set extent for DXF export.

**--dxf-symbology-mode** _mode_
> Symbology mode for DXF export: none, symbollayer, or feature.

**-v**, **--version**
> Display version information and exit.

**--help**
> Display help text.

# DESCRIPTION

**QGIS** is a cross-platform, free and open-source Geographic Information System licensed under the GNU GPLv2+. It supports viewing, editing, and analysis of geospatial data. Written primarily in C++ using the Qt framework, it features extensive Python plugin support.

QGIS handles vector formats (Shapefiles, GeoJSON, GML, KML, GeoPackage, PostGIS, and all OGR-supported formats), raster formats (GeoTIFF, ERDAS IMG, and all GDAL-supported formats), and database sources. It integrates with GRASS GIS for advanced analytical functions and uses GDAL/OGR for data format translation. Features include map composition, spatial analysis, digitizing, geoprocessing, and a rich plugin ecosystem.

For headless or batch processing, use the companion tool **qgis_process** instead.

# CONFIGURATION

User settings stored in **~/.config/QGIS/qgis.conf**. QGIS supports multiple user profiles, each with separate settings, plugins, and project templates. Use **--profile** to switch between profiles or **--profiles-path** to specify a custom profiles directory.

# CAVEATS

QGIS is primarily a GUI application; command-line usage is limited to launching with options, taking snapshots, and DXF export. Python plugins may affect startup time; use **--noplugins** or **--nopython** for faster launches. Large projects with many layers can consume significant memory. The **--configpath** option from QGIS 2.x was replaced by **--profiles-path** in QGIS 3.x.

# HISTORY

Development began in **February 2002** by **Gary Sherman** as **Quantum GIS**, initially a simple PostGIS data viewer for Linux. The first public release came in **July 2002**. It became an **OSGeo** incubator project in **2007**, and version 1.0 was released in **January 2009**. In **September 2013**, version 2.0 was released and the project was officially renamed from Quantum GIS to **QGIS**. Gary Sherman received the **Sol Katz Award** for open-source GIS contributions in **2014**.

# SEE ALSO

[gdalinfo](/man/gdalinfo)(1), [ogr2ogr](/man/ogr2ogr)(1), [ogrinfo](/man/ogrinfo)(1), [gdalwarp](/man/gdalwarp)(1), [gdal_translate](/man/gdal_translate)(1)
