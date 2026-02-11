# TAGLINE

Open-source cheminformatics and molecular toolkit

# TLDR

**Import RDKit in Python**

```python -c "from rdkit import Chem"```

**Read molecule from SMILES**

```python -c "from rdkit import Chem; m = Chem.MolFromSmiles('CCO'); print(m)"```

**Calculate molecular weight**

```python -c "from rdkit.Chem import Descriptors; from rdkit import Chem; print(Descriptors.MolWt(Chem.MolFromSmiles('CCO')))"```

# SYNOPSIS

**rdkit** Python library for cheminformatics

# DESCRIPTION

**RDKit** is an open-source cheminformatics library. It provides functionality for reading, writing, and manipulating chemical structures, calculating molecular descriptors, and performing substructure searches.

# EXAMPLES

```python
from rdkit import Chem
from rdkit.Chem import AllChem, Descriptors, Draw

# Read molecule
mol = Chem.MolFromSmiles('c1ccccc1')  # Benzene

# Calculate properties
mw = Descriptors.MolWt(mol)
logp = Descriptors.MolLogP(mol)

# Generate 2D coordinates
AllChem.Compute2DCoords(mol)

# Generate 3D conformer
mol3d = Chem.AddHs(mol)
AllChem.EmbedMolecule(mol3d)

# Substructure search
pattern = Chem.MolFromSmarts('c1ccccc1')
mol.HasSubstructMatch(pattern)

# Save as image
Draw.MolToFile(mol, 'molecule.png')
```

# INPUT FORMATS

```
SMILES - Chem.MolFromSmiles()
SDF    - Chem.SDMolSupplier()
MOL    - Chem.MolFromMolFile()
```

# CAVEATS

Python library (conda or pip install). Requires numpy. C++ library also available.

# HISTORY

RDKit was started by **Greg Landrum** at Rational Discovery and released as open source in 2006.

# SEE ALSO

[openbabel](/man/openbabel)(1), [pymol](/man/pymol)(1), [avogadro](/man/avogadro)(1)
