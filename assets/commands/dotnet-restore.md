# TAGLINE

NuGet package dependency restorer

# TLDR

**Restore dependencies**

```dotnet restore```

**Restore specific project**

```dotnet restore [project.csproj]```

**Restore with specific source**

```dotnet restore --source [https://api.nuget.org/v3/index.json]```

**Restore without cache**

```dotnet restore --no-cache```

**Restore for specific runtime**

```dotnet restore --runtime [linux-x64]```

# SYNOPSIS

**dotnet** **restore** [_project_] [_options_]

# PARAMETERS

**-s**, **--source** _source_
> NuGet package source.

**--packages** _directory_
> Directory for restored packages.

**--no-cache**
> Don't cache packages and requests.

**--runtime** _rid_
> Target runtime to restore for.

**--configfile** _file_
> NuGet config file to use.

**--disable-parallel**
> Disable parallel restore.

# DESCRIPTION

**dotnet restore** downloads and installs all NuGet package dependencies specified in project files. It resolves package versions, handles transitive dependencies, and caches packages locally for faster subsequent restores.

The command reads package references from .csproj/.fsproj files and nuget.config, then downloads packages from configured NuGet sources. Restore is typically automatic before build/run commands but can be run explicitly for troubleshooting or CI/CD pipelines.

# SEE ALSO

[dotnet-build](/man/dotnet-build)(1), [dotnet-add-package](/man/dotnet-add-package)(1)

