# TAGLINE

Restore NuGet package dependencies for a .NET project

# TLDR

**Restore** dependencies for the project in the current directory

```dotnet restore```

**Restore a specific project**

```dotnet restore [project.csproj]```

**Restore from a specific NuGet source**

```dotnet restore --source [https://api.nuget.org/v3/index.json]```

**Restore without using HTTP cache**

```dotnet restore --no-cache```

**Restore for a specific runtime** (RID)

```dotnet restore --runtime [linux-x64]```

**Restore in lock-file mode** (fails if any package version drifts)

```dotnet restore --locked-mode```

**Restore with verbose logging**

```dotnet restore --verbosity detailed```

# SYNOPSIS

**dotnet** **restore** [_project_|_solution_] [_options_]

# PARAMETERS

**-s**, **--source** _SOURCE_
> NuGet package source to use during restore (overrides nuget.config).

**--packages** _DIR_
> Directory in which to install the restored packages (default: ~/.nuget/packages).

**--no-cache**
> Don't cache HTTP requests; always re-fetch from the source.

**--no-dependencies**
> Restore only the root project, ignoring project-to-project references.

**--force**
> Force all dependencies to be re-resolved even if a cached lock exists.

**--locked-mode**
> Don't allow updates to **packages.lock.json** — fail if it would change.

**--use-lock-file**
> Generate or update **packages.lock.json**.

**--runtime** _RID_
> Target a specific runtime identifier (e.g. **linux-x64**, **win-x86**).

**--configfile** _FILE_
> NuGet config file to use instead of the default chain.

**--disable-parallel**
> Disable parallel downloads.

**-v**, **--verbosity** _LEVEL_
> Verbosity: q[uiet], m[inimal], n[ormal], d[etailed], diag[nostic].

**-?**, **-h**, **--help**
> Display help.

# DESCRIPTION

**dotnet restore** downloads and installs all NuGet package dependencies declared in a project, solution, or **dotnet-tools.json**. It reads **PackageReference** entries from .csproj/.fsproj/.vbproj files, queries the configured NuGet sources, and writes restored assets to **obj/project.assets.json**.

Other commands like **dotnet build** and **dotnet run** trigger an implicit restore by default, so explicit invocation is mainly useful in CI pipelines (where you want to cache the restore step), when troubleshooting package resolution, or when **--no-restore** is being used downstream.

# CAVEATS

Restore obeys the standard NuGet config chain: machine-wide, user, and per-directory **NuGet.config** files. **--source** replaces (not adds to) configured sources. Setting **--locked-mode** without an existing **packages.lock.json** fails immediately.

# INSTALL

```dnf: sudo dnf install dotnet-host```

```pacman: sudo pacman -S dotnet-host```

```apk: sudo apk add dotnet-host```

```brew: brew install dotnet```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dotnet-build](/man/dotnet-build)(1), [dotnet-add-package](/man/dotnet-add-package)(1), [dotnet](/man/dotnet)(1)
