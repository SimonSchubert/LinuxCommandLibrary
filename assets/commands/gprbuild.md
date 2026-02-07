# TAGLINE

GNAT project-aware Ada builder

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

**gprbuild** is the GNAT project-aware builder for Ada. It compiles Ada projects defined in GPR (GNAT Project) files, handling dependencies and build configuration automatically.

The tool manages compilation of Ada sources with incremental builds, supporting configuration through external variables and multiple build modes.

# CAVEATS

Ada/GNAT specific. Requires GPR project file. Part of GNAT toolchain.

# HISTORY

gprbuild is part of the **GNAT** Ada toolchain, developed by AdaCore for Ada project building.

# SEE ALSO

[gnat](/man/gnat)(1), [gnatmake](/man/gnatmake)(1)
