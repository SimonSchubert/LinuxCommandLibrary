# TLDR

**Launch PyMOL GUI**

```pymol```

**Open structure file**

```pymol [structure.pdb]```

**Run script**

```pymol [script.pml]```

**Command line mode**

```pymol -c [script.pml]```

**Render image**

```pymol -c -d "load [file.pdb]; ray; png [output.png]"```

# SYNOPSIS

**pymol** [_options_] [_files_...]

# PARAMETERS

**-c**
> Command line only (no GUI).

**-d** _command_
> Execute command.

**-p**
> Read commands from stdin.

**-q**
> Quiet mode.

**-r** _script_
> Run Python script.

**-e**
> Exit after script.

# DESCRIPTION

**PyMOL** is a molecular visualization system for 3D structures of proteins, nucleic acids, and small molecules. It provides publication-quality graphics and extensive scripting capabilities.

# EXAMPLES

```bash
# Launch and load structure
pymol protein.pdb

# Batch rendering
pymol -c -d "load 1abc.pdb; hide all; show cartoon; ray; png output.png; quit"

# Run script
pymol script.pml

# Fetch from PDB
pymol -d "fetch 1crn; show cartoon"
```

# COMMANDS (PML)

```
load file.pdb           # Load structure
fetch 1abc              # Download from PDB
show cartoon            # Display style
color red, chain A      # Coloring
ray                     # Render
png output.png          # Save image
```

# CAVEATS

Open-source version has some limitations. Educational and commercial licenses available. Memory-intensive for large structures.

# HISTORY

PyMOL was created by **Warren DeLano** starting in 1998, now maintained by **Schrödinger, Inc.** with open-source development.

# SEE ALSO

[chimera](/man/chimera)(1), [vmd](/man/vmd)(1), [rasmol](/man/rasmol)(1)
