# TAGLINE

Import and convert 3D model file formats

# TLDR

**Convert** a 3D model between formats

```assimp export [input.fbx] [output.obj]```

**Show** model information

```assimp info [model.fbx]```

List **supported formats**

```assimp listext```

Extract **embedded textures**

```assimp extract [model.fbx]```

**Convert** with a specific output format

```assimp export [input.fbx] [output.glb] -f [glb2]```

**Dump** model structure for debugging

```assimp dump [model.fbx]```

# SYNOPSIS

**assimp** _command_ [_options_] _file_

# DESCRIPTION

**assimp** is the command-line interface for the Open Asset Import Library, supporting import and export of numerous 3D file formats. It can convert between formats, extract data, and optimize models.

The tool supports formats including OBJ, FBX, COLLADA, glTF, STL, and dozens more.

# PARAMETERS

**export** _in_ _out_
> Convert file format

**info** _file_
> Display model information

**extract** _file_
> Extract embedded textures

**listext**
> List supported file extensions

**knowext**
> Check if extension is supported

**exportinfo**
> List export formats

**dump** _file_
> Dump model data to text for debugging

**version**
> Show version

**-v**, **--verbose**
> Verbose output

# CAVEATS

Conversion quality varies by format. Some features may be lost in translation. Complex materials may not convert perfectly. Large models consume significant memory.

# HISTORY

The **Open Asset Import Library** was created around **2008** to provide a unified interface for loading 3D models across game engines and graphics applications.

# SEE ALSO

[blender](/man/blender)(1), [meshlab](/man/meshlab)(1), [meshlabserver](/man/meshlabserver)(1)
