# TAGLINE

Semiempirical quantum chemistry calculation program

# TLDR

**Run a calculation from an input file**

```mopac [path/to/input_file.mop]```

**Run a calculation with a .dat input file**

```mopac [path/to/input_file.dat]```

**Resume a calculation from an .arc archive file**

```mopac [path/to/input_file.arc]```

# SYNOPSIS

**mopac** _input_file_

# DESCRIPTION

**MOPAC** (Molecular Orbital PACkage) is a semiempirical quantum chemistry program for computational chemistry calculations. It implements various methods based on the NDDO (Neglect of Diatomic Differential Overlap) approximation developed by Dewar and Thiel.

The program reads molecular geometry and calculation parameters from input files (.mop, .dat, or .arc) and performs electronic structure calculations, geometry optimizations, transition state searches, and property predictions. Output files (.out for main results, .arc for archival data) are written to the same directory as the input file, not the working directory.

No keywords are required; the default behavior is a geometry relaxation using the PM7 method. Common methods include PM7, PM6, AM1, and MNDO for calculating molecular properties, reaction energies, and optimized geometries.

# INPUT FILE FORMAT

Input files contain keywords on the first line, a title/comment on the second line, a blank third line, and atomic coordinates with element symbols and Cartesian or internal coordinates. Example:

```
PM7
HF molecule optimization

H 0.0 0.0 0.0
F 0.95 0.0 0.0
```

Common keywords include: **PM7**, **PM6**, **AM1**, **MNDO** (method selection), **CHARGE=n** (molecular charge), **EF** (transition state search), **1SCF** (single-point energy).

# CAVEATS

Semiempirical methods are faster but less accurate than ab initio methods. Results depend heavily on the chosen method (PM7, AM1, etc.) and may not be reliable for all molecular systems. Large molecules require significant computation time.

# HISTORY

**MOPAC** was originally developed by **James J.P. Stewart** starting in the 1980s. The program has been continuously updated with new methods, with PM7 being one of the most recent parameterizations. **OpenMOPAC** provides the open-source version of the software.

# SEE ALSO

[pymol](/man/pymol)(1)
