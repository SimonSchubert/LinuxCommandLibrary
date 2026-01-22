# TLDR

Convert a **.mol** file to XYZ coordinates

```obabel [path/to/file.mol] -O [path/to/output_file.xyz]```

Convert a **SMILES string** to a 500x500 picture

```obabel -:"[SMILES]" -O [path/to/output_file.png] -xp 500```

Convert a file of SMILES string to separate **3D .mol** files

```obabel [path/to/file.smi] -O [path/to/output_file.mol] --gen3D -m```

Render **multiple inputs** into one picture

```obabel [path/to/file1 path/to/file2 ...] -O [path/to/output_file.png]```

# SYNOPSIS

**obabel** [_OPTIONS_] [**-i** _input-type_] _infile_ [**-o** _output-type_] **-O** _outfile_

**obabel** **-:**"_SMILES-string_" [_OPTIONS_] **-O** _outfile_

# PARAMETERS

**-i** _format_
> Specify input format explicitly (e.g., **-imol**, **-ismi**)

**-o** _format_
> Specify output format explicitly (e.g., **-osmi**, **-opng**)

**-O** _outfile_
> Specify output file path

**-:**"_SMILES_"
> Use SMILES string as input instead of a file

**-m**
> Produce multiple output files (one per molecule)

**-f** _#_
> Start import at molecule number specified

**-l** _#_
> End import at molecule number specified

**--gen3D**
> Generate 3D coordinates for molecules

**-e**
> Continue with next object after error

**-z**
> Compress output with gzip

**-H**
> Display help; use **-H**_format_ for format-specific help

**-V**
> Display version number

**-a**_option_
> Input format-specific option

**-x**_option_
> Output format-specific option

# DESCRIPTION

**obabel** is the Open Babel command-line tool for converting between molecular file formats used in chemistry and computational modeling. It supports over 100 chemical data formats including SDF, MOL, PDB, SMILES, CML, and image formats for visualization.

Beyond simple conversion, obabel can filter molecules by properties, generate 3D coordinates, perform energy minimization using forcefields (MMFF94, UFF, GAFF), and manipulate molecular data. It handles batch processing with wildcard patterns and can split multi-molecule files into individual outputs.

# CAVEATS

Format detection relies on file extensions; use **-i** and **-o** flags explicitly when extensions are ambiguous. Some conversions may lose data if the target format lacks equivalent fields. 3D coordinate generation (**--gen3D**) can be slow for large molecules.

# HISTORY

Open Babel originated from the **OELib/OBabel** project started in **1998**. The **obabel** command replaced the older **babel** command around version 2.3 (2011), offering improved option handling following Unix conventions. Open Babel 3.0 was released in **2019** with enhanced stereochemistry support.

# SEE ALSO

[rdkit](/man/rdkit)(1), [pymol](/man/pymol)(1)
