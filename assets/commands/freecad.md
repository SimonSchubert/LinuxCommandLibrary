# TAGLINE

open-source parametric 3D CAD modeler

# TLDR

**Start FreeCAD**

```freecad```

**Open file**

```freecad [model.FCStd]```

**Run Python script**

```freecad -c [script.py]```

**Start without GUI**

```freecadcmd```

**Export to STEP**

```freecadcmd [model.FCStd] -o [output.step]```

# SYNOPSIS

**freecad** [_options_] [_file_...]

# PARAMETERS

_file_
> File to open (.FCStd, .step, .iges, etc.).

**-c** _script_
> Run Python script in console mode.

**--console**
> Start in console mode (no GUI).

**-t**, **--run-test** _module_
> Run tests.

**--write-log**
> Write log file.

**-M** _path_
> Add module path.

**-v**, **--version**
> Show version.

# CONFIGURATION

**~/.config/FreeCAD/user.cfg**
> User preferences including workbench settings, appearance, units, and default paths.

**~/.local/share/FreeCAD/Mod/**
> User-installed workbenches and macros directory.

# DESCRIPTION

**FreeCAD** is an open-source parametric 3D CAD modeler. It supports multiple workbenches for different tasks: Part Design for mechanical parts, Sketcher for 2D drawings, Arch for architecture, and more.

FreeCAD uses Python for scripting and macros, allowing automation and custom tools. It can import and export standard formats including STEP, IGES, STL, OBJ, and DXF.

# WORKBENCHES

- **Part Design**: Parametric solid modeling
- **Sketcher**: 2D constraint-based sketching
- **Draft**: 2D drawing tools
- **Arch**: Architectural modeling
- **FEM**: Finite element analysis
- **Path**: CNC toolpath generation

# CAVEATS

Large assemblies may be slow. Learning curve for parametric modeling. Some import/export formats have limitations. Stability varies by version.

# HISTORY

FreeCAD was started by **Jürgen Riegel** in **2002** and has been developed by a community of contributors. It became a significant open-source alternative to commercial CAD software, particularly for mechanical engineering and 3D printing.

# SEE ALSO

[openscad](/man/openscad)(1), [blender](/man/blender)(1), [meshlab](/man/meshlab)(1)
