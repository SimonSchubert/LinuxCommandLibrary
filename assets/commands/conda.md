# TAGLINE

package and environment manager for Python and data science

# TLDR

**Create** environment

```conda create -n [myenv] [python=3.11]```

**Activate** environment

```conda activate [myenv]```

**Install** package

```conda install [numpy]```

**List** environments

```conda env list```

**Export** environment

```conda env export > [environment.yml]```

**Deactivate** environment

```conda deactivate```

# SYNOPSIS

**conda** _command_ [_options_]

# DESCRIPTION

**conda** is a cross-platform package and environment management system originally developed for Python but extended to support R, Ruby, Lua, Scala, Java, JavaScript, C/C++, and other languages. Unlike pip which only manages Python packages, conda handles complete environments including system-level dependencies and compiled libraries, making it particularly valuable for scientific computing where native dependencies are common.

The environment isolation feature allows multiple projects with conflicting dependency requirements to coexist on the same system. Each conda environment is a directory containing a specific collection of packages, and switching between environments changes which packages are available. This is essential for data science workflows where different projects may require different versions of NumPy, TensorFlow, or other foundational libraries.

Conda distributes binary packages rather than building from source, which dramatically speeds up installation and eliminates compilation errors that plague pip-based workflows. The package ecosystem is organized into channels, with conda-forge being the largest community-maintained channel. conda is included in both Anaconda (a large distribution with 1500+ packages) and Miniconda (minimal installer with just conda and Python). The tool has become the de facto standard in data science, machine learning, and scientific computing communities.

# PARAMETERS

**create** **-n** _name_
> Create new environment

**install** _package_
> Install package

**update** _package_
> Update package

**remove** _package_
> Remove package

**list**
> List installed packages

**search** _package_
> Search for package

**env list**
> List environments

**activate** _name_
> Activate environment

**deactivate**
> Deactivate environment

# CONFIGURATION

**~/.condarc**
> User-level conda configuration file.

**/opt/conda/.condarc**
> System-level conda configuration.

**environment.yml**
> Environment specification file for reproducible environments.

# ENVIRONMENT MANAGEMENT

```bash
# Create environment with Python
conda create -n myenv python=3.11

# Create with packages
conda create -n dataenv python=3.11 numpy pandas matplotlib

# Create from file
conda env create -f environment.yml

# Clone environment
conda create --clone myenv -n myenv_copy

# Remove environment
conda env remove -n myenv

# List all environments
conda env list
```

# PACKAGE MANAGEMENT

```bash
# Install package
conda install numpy

# Install specific version
conda install numpy=1.24.0

# Install from channel
conda install -c conda-forge package

# Update package
conda update numpy

# Update all packages
conda update --all

# Remove package
conda remove numpy
```

# ENVIRONMENT.YML

```yaml
name: myenv
channels:
  - conda-forge
  - defaults
dependencies:
  - python=3.11
  - numpy
  - pandas
  - pip:
    - some-pip-package
```

# FEATURES

- Cross-platform
- Multiple language support
- Binary package distribution
- Dependency resolution
- Environment isolation
- Channel system
- Integration with pip

# CAVEATS

Large disk space usage. Environment activation requires shell integration. Channel priority can cause confusion. Some packages only on conda-forge. Slower than pip for pure Python packages. Mixing conda and pip can cause issues.

# HISTORY

**Conda** was created by Travis Oliphant and Peter Wang at Continuum Analytics (now Anaconda, Inc.) around **2012** for the Anaconda distribution.

# SEE ALSO

[pip](/man/pip)(1), [virtualenv](/man/virtualenv)(1), [mamba](/man/mamba)(1)
