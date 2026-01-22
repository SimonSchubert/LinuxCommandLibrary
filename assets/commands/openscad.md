# TLDR

**Open file in GUI**

```openscad [model.scad]```

**Render to STL**

```openscad -o [output.stl] [model.scad]```

**Render to PNG**

```openscad -o [output.png] [model.scad]```

**Set parameter**

```openscad -D "[var=value]" -o [output.stl] [model.scad]```

**Preview mode**

```openscad --preview -o [output.png] [model.scad]```

# SYNOPSIS

**openscad** [_options_] [_file_]

# PARAMETERS

_FILE_
> OpenSCAD source file.

**-o** _OUTPUT_
> Output file.

**-D** _ASSIGNMENT_
> Set variable value.

**--preview**
> Preview render mode.

**--render**
> Full render mode.

**--help**
> Display help information.

# DESCRIPTION

**openscad** is a 3D CAD modeler. Uses scripting language for solid modeling.

The tool creates parametric 3D models. Exports to STL for printing.

openscad models 3D objects.

# CAVEATS

Script-based modeling. Rendering can be slow. CSG operations.

# HISTORY

OpenSCAD was created for **script-based 3D modeling** and parametric design.

# SEE ALSO

[freecad](/man/freecad)(1), [blender](/man/blender)(1), [meshlab](/man/meshlab)(1)

