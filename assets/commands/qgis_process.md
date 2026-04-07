# TAGLINE

Run QGIS Processing algorithms from the command line

# TLDR

**List all available** processing algorithms

```qgis_process list```

**Show help** for a specific algorithm

```qgis_process help [algorithm_id]```

**Run a buffer** operation on a vector layer

```qgis_process run native:buffer -- INPUT=[input.shp] DISTANCE=[10] OUTPUT=[buffered.shp]```

**Run an algorithm** with JSON output

```qgis_process run [algorithm_id] --json -- [PARAM]=[VALUE]```

**List available plugins** and their status

```qgis_process plugins```

**Enable a plugin** provider (e.g. GRASS)

```qgis_process plugins enable [grassprovider]```

# SYNOPSIS

**qgis_process** [_--json_] [_--verbose_] [_--no-python_] [_--skip-loading-plugins_] \<_command_\> [_algorithm_id_] [**--** _PARAM=VALUE ..._]

# PARAMETERS

**list**
> List all available processing algorithms, grouped by provider.

**help** _algorithm_id_
> Display help and parameter descriptions for a specific algorithm.

**run** _algorithm_id_ [**--** _PARAM=VALUE ..._]
> Execute an algorithm with the given parameters. Parameters follow **--** using **KEY=VALUE** syntax. A trailing **-** reads parameters from stdin as JSON.

**plugins**
> List available and active processing provider plugins.

**plugins enable** _name_
> Activate a specific plugin provider.

**plugins disable** _name_
> Deactivate a specific plugin provider.

**--json**
> Format output as JSON.

**--verbose**
> Enable verbose logging output.

**--no-python**
> Disable Python support for faster startup.

**--skip-loading-plugins**
> Skip loading plugins for faster startup.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Show version details.

# DESCRIPTION

**qgis_process** is a standalone command-line tool for running QGIS Processing algorithms without launching the QGIS GUI. It provides access to the full Processing framework including native QGIS algorithms, GDAL, GRASS GIS, SAGA, and any third-party plugin algorithms, all from the terminal.

This enables batch processing of geospatial data via shell scripts, automation with cron jobs, integration with external tools and pipelines, and headless server usage for geoprocessing workflows. Algorithm parameters are passed after a **--** separator using **PARAM=VALUE** syntax, and repeated parameters create ordered lists. Special parameters include **--ELLIPSOID**, **--PROJECT_PATH**, **--distance_units**, and **--area_units** for controlling coordinate reference and measurement settings.

The tool ships with QGIS 3.14 and later as part of the standard installation.

# CONFIGURATION

On headless servers without a display, set the environment variable before running:

```export QT_QPA_PLATFORM=offscreen```

Plugin providers like GRASS or SAGA may need to be explicitly enabled on fresh installations where the QGIS GUI has never been launched:

```qgis_process plugins enable grassprovider```

Only plugins with **hasProcessingProvider=yes** in their metadata.txt are recognized.

# CAVEATS

On headless systems, **QT_QPA_PLATFORM=offscreen** must be set or the tool will fail to start. Processing provider plugins (GRASS, SAGA) are not loaded automatically on systems where the QGIS GUI has never been launched and must be enabled manually. Loading Python and plugins adds startup overhead; use **--no-python** and **--skip-loading-plugins** when those features are not needed. This tool exposes only the Processing framework and does not replace the full QGIS desktop application.

# HISTORY

**qgis_process** was proposed in **February 2019** by **Nyall Dawson** as QGIS Enhancement Proposal #140, originally named **qgis_transform** before being renamed after community discussion. Development was **sponsored by the Swedish QGIS User Group**. The pull request was merged in **April 2020** and the tool first shipped with **QGIS 3.14 "Pi"** in **June 2020**. It has been continuously enhanced in subsequent releases with features like plugin management and JSON I/O.

# SEE ALSO

[qgis](/man/qgis)(1), [gdalinfo](/man/gdalinfo)(1), [ogr2ogr](/man/ogr2ogr)(1), [ogrinfo](/man/ogrinfo)(1), [gdalwarp](/man/gdalwarp)(1), [gdal_translate](/man/gdal_translate)(1)
