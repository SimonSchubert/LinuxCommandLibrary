# TAGLINE

Add or update a NuGet package reference in a project

# TLDR

**Add a NuGet package**

```dotnet add package [package_name]```

**Add specific version**

```dotnet add package [package_name] --version [1.0.0]```

**Add package to specific project**

```dotnet add [project.csproj] package [package_name]```

**Add prerelease version**

```dotnet add package [package_name] --prerelease```

**Add from specific source**

```dotnet add package [package_name] --source [https://api.nuget.org/v3/index.json]```

**Add package targeting a specific framework**

```dotnet add package [package_name] --framework [net8.0]```

# SYNOPSIS

**dotnet** **add** [_project_] **package** _package_name_ [_options_]

# PARAMETERS

**-v**, **--version** _version_
> Specific version to install.

**--prerelease**
> Allow prerelease packages to be installed.

**-f**, **--framework** _framework_
> Add a package reference only when targeting a specific framework.

**-s**, **--source** _source_
> NuGet package source URI to use during restore.

**-n**, **--no-restore**
> Add reference without performing a restore preview and compatibility check.

**--package-directory** _dir_
> Directory to restore packages to.

**--interactive**
> Allow the command to stop and wait for user input or action.

# DESCRIPTION

**dotnet add package** adds a NuGet package reference to a project file and runs a compatibility check. It modifies the .csproj or .fsproj file to include a PackageReference element, making the dependency trackable in version control.

If the package is already referenced, it updates the reference to the latest compatible version. The command runs an implicit **dotnet restore** after adding the reference unless **--no-restore** is specified. Projects using Central Package Management (CPM) will have the PackageVersion element updated in the Directory.Packages.props file.

# SEE ALSO

[dotnet-restore](/man/dotnet-restore)(1), [dotnet-build](/man/dotnet-build)(1), [dotnet](/man/dotnet)(1)

