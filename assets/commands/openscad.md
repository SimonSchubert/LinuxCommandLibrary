# TAGLINE

Script-based 3D CAD modeler for parametric design

# TLDR

**Open file in GUI**

```openscad [model.scad]```

**Render to STL**

```openscad -o [output.stl] [model.scad]```

**Render to PNG**

```openscad -o [output.png] [model.scad]```

**Set parameter**

```openscad -D "[var=value]" -o [output.stl] [model.scad]```

**Preview mode image export**

```openscad --preview -o [output.png] [model.scad]```

**Export with camera angle and image size**

```openscad -o [output.png] --camera [0,0,0,25,0,35,500] --imgsize [1920,1080] [model.scad]```

**Auto-center and fit object in exported image**

```openscad -o [output.png] --autocenter --viewall [model.scad]```

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
> Full render mode (CGAL).

**--camera** _params_
> Camera parameters: translate_x,y,z,rot_x,y,z,dist or eye_x,y,z,center_x,y,z.

**--imgsize** _x,y_
> PNG image dimensions.

**--projection** _type_
> Projection type: ortho or perspective.

**--autocenter**
> Adjust camera to look at object's center.

**--viewall**
> Adjust camera to fit the entire object.

**--colorscheme** _scheme_
> Color scheme for rendering.

**-v**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**openscad** is a script-based 3D CAD modeler for creating parametric models using Constructive Solid Geometry (CSG). Unlike interactive CAD tools, models are defined programmatically in a scripting language. It can export to STL, OFF, AMF, 3MF, DXF, SVG, and PNG formats.

# CAVEATS

Full CGAL rendering can be very slow for complex models. The -o output format is determined by the file extension. Preview mode is faster but less accurate than full render.

# HISTORY

**OpenSCAD** was created by Marius Kintel and Clifford Wolf, first released in **2010** as an open-source tool for script-based 3D CAD modeling using Constructive Solid Geometry.

# SEE ALSO

[freecad](/man/freecad)(1), [blender](/man/blender)(1), [meshlab](/man/meshlab)(1)

