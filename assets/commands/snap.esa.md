# TAGLINE

ESA satellite data processing platform

# TLDR

Display all **available updates**

```snap --nosplash --nogui --modules --list --refresh```

Display **help**

```snap --help```

Launch with **no splash** screen

```snap --nosplash```

Launch in **headless mode**

```snap --nogui```

# SYNOPSIS

**snap** [_OPTIONS_]

# PARAMETERS

**--nosplash**
> Start without splash screen

**--nogui**
> Run in headless/command-line mode

**--modules**
> Access module management

**--list**
> List available items

**--refresh**
> Check for updates

**--help**
> Display help information

# DESCRIPTION

**SNAP** (Sentinel Application Platform) is the ESA (European Space Agency) toolbox for processing and analyzing satellite data. It provides visualization, analysis, and processing capabilities for Earth observation data from Sentinel satellites and other missions.

The platform supports various data formats and includes tools for radiometric correction, geometric correction, filtering, and data fusion. It can be operated through a graphical interface or command-line for batch processing.

# CAVEATS

Requires Java Runtime Environment. Large satellite datasets demand significant memory and storage. Some processing operations are computationally intensive. Not to be confused with the Ubuntu/Canonical **snap** package manager.

# HISTORY

**SNAP** was developed by the **European Space Agency** as part of the Copernicus program, which operates the Sentinel satellite fleet. The platform evolved from earlier ESA toolboxes (BEAM, NEST) and was released to support the Sentinel-1, -2, and -3 missions launched starting in **2014**. It is freely available as open-source software.

# SEE ALSO

[gdalinfo](/man/gdalinfo)(1), [gdal_translate](/man/gdal_translate)(1)
