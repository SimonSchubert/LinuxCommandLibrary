# TLDR

**Build project**

```gprbuild -P [project.gpr]```

**Build with configuration**

```gprbuild -P [project.gpr] -XBUILD_MODE=release```

**Clean and build**

```gprbuild -P [project.gpr] --clean```

**Parallel build**

```gprbuild -P [project.gpr] -j[4]```

# SYNOPSIS

**gprbuild** [_options_] [_project_]

# PARAMETERS

_PROJECT_
> Project file (.gpr).

**-P** _FILE_
> Project file.

**-X** _NAME=VALUE_
> External variable.

**-j** _N_
> Parallel jobs.

**--clean**
> Clean before build.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**gprbuild** is the GNAT project-aware builder. It compiles Ada projects defined in GPR (GNAT Project) files, handling dependencies and build configuration.

The tool manages compilation of Ada sources with incremental builds. It supports configuration through external variables and multiple build modes.

gprbuild builds Ada projects with GNAT.

# CAVEATS

Ada/GNAT specific. Requires GPR project file. Part of GNAT toolchain.

# HISTORY

gprbuild is part of the **GNAT** Ada toolchain, developed by AdaCore for Ada project building.

# SEE ALSO

[gnat](/man/gnat)(1), [gnatmake](/man/gnatmake)(1)
