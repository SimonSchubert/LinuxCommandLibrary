# TLDR

**Create environment**

```micromamba create -n [myenv] python=[3.11]```

**Activate environment**

```micromamba activate [myenv]```

**Install packages**

```micromamba install -n [myenv] [numpy] [pandas]```

**Install from conda-forge**

```micromamba install -c conda-forge [package]```

**List environments**

```micromamba env list```

**List packages in environment**

```micromamba list -n [myenv]```

**Remove environment**

```micromamba env remove -n [myenv]```

**Update all packages**

```micromamba update --all```

# SYNOPSIS

**micromamba** _command_ [_-n env_] [_-c channel_] [_options_] [_packages_]

# PARAMETERS

**create**
> Create new environment.

**activate** _ENV_
> Activate environment.

**deactivate**
> Deactivate current environment.

**install** _PACKAGES_
> Install packages.

**remove** _PACKAGES_
> Remove packages.

**update** _PACKAGES_
> Update packages.

**list**
> List installed packages.

**env list**
> List environments.

**env remove**
> Remove environment.

**search** _PACKAGE_
> Search for packages.

**clean**
> Clean package cache.

**-n** _NAME_, **--name** _NAME_
> Environment name.

**-c** _CHANNEL_, **--channel** _CHANNEL_
> Package channel.

**-f** _FILE_, **--file** _FILE_
> Environment file.

**-y**, **--yes**
> Don't ask for confirmation.

**--no-deps**
> Don't install dependencies.

**-q**, **--quiet**
> Quiet output.

# DESCRIPTION

**micromamba** is a tiny, statically linked reimplementation of the conda package manager. It provides the same functionality as mamba/conda but as a single, fast, standalone binary.

Unlike conda/mamba, micromamba requires no base environment or Python installation. It's a pure C++ implementation that can bootstrap an entire conda environment from scratch.

Package resolution uses the same libsolv library as mamba, providing fast dependency solving. Channels like conda-forge provide access to thousands of packages.

Environment management mirrors conda: create isolated environments, install packages, and switch between them. Environment files (YAML) enable reproducible environment creation.

The tool is particularly useful for CI/CD pipelines and containers where a minimal footprint is desired. No initialization or base install needed - just download and run.

Shell integration works with bash, zsh, fish, and PowerShell. The activate command modifies PATH and environment variables appropriately.

# CAVEATS

Some conda features not implemented. No graphical interface. Some older packages may have compatibility issues. Shell hooks must be initialized. Different default channel than conda (uses conda-forge).

# HISTORY

**micromamba** was developed by the **mamba team** at QuantStack, released around **2020**. It was designed for scenarios where conda's size and startup time were problematic. The project shares its solver with mamba, bringing conda-like capabilities to constrained environments.

# SEE ALSO

[conda](/man/conda)(1), [mamba](/man/mamba)(1), [pip](/man/pip)(1), [pixi](/man/pixi)(1)
