# TAGLINE

Import and convert 3D model file formats

# TLDR

**Convert** a 3D model between formats

```assimp export [input.fbx] [output.obj]```

**Show** model information and statistics

```assimp info [model.fbx]```

List all supported **import** file extensions

```assimp listext```

List all supported **export** formats

```assimp listexport```

Check if a file **extension** is supported

```assimp knowext [fbx]```

Extract **embedded textures** from a model

```assimp extract [model.fbx]```

**Dump** model structure to text for debugging

```assimp dump [model.fbx] [output.assxml]```

Show **help** for a specific subcommand

```assimp [export] --help```

# SYNOPSIS

**assimp** _command_ [_parameters_]

# DESCRIPTION

**assimp** is the command-line interface for the Open Asset Import Library. It supports import and export of numerous 3D file formats, including OBJ, FBX, COLLADA (.dae), glTF/glTF2 (.gltf, .glb), STL, 3DS, PLY, X3D, and many more.

The tool can convert between formats, display model information, extract embedded textures, and dump model structures for debugging. Use `assimp <verb> --help` for detailed help on each subcommand.

# PARAMETERS

**export** _input_ _output_
> Convert a 3D model between file formats.

**info** _file_
> Display statistics and structure of a 3D model.

**listext**
> List all known import file extensions.

**listexport**
> List all supported export formats.

**knowext** _extension_
> Check whether a file extension is recognized by Assimp.

**extract** _file_
> Extract an embedded texture from a model.

**dump** _file_ [_output_]
> Convert a model to binary or XML dumps (ASSBIN/ASSXML).

**cmpdump** _file1_ _file2_
> Compare two file dumps produced with assimp dump.

**version**
> Display Assimp version information.

**help**
> Show help message.

# CAVEATS

Conversion quality varies by format. Some features may be lost in translation. Complex materials may not convert perfectly. Large models consume significant memory.

# HISTORY

The **Open Asset Import Library** was created around **2008** to provide a unified interface for loading 3D models across game engines and graphics applications.

# SEE ALSO

[blender](/man/blender)(1), [meshlab](/man/meshlab)(1), [meshlabserver](/man/meshlabserver)(1)
