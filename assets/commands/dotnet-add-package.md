# TAGLINE

NuGet package reference manager

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

# SYNOPSIS

**dotnet** **add** [_project_] **package** _package_name_ [_options_]

# PARAMETERS

**--version** _version_
> Specific version to install.

**--prerelease**
> Include prerelease packages.

**--source** _source_
> NuGet package source.

**-n**, **--no-restore**
> Don't restore after adding.

**--package-directory** _dir_
> Directory to restore packages to.

# DESCRIPTION

**dotnet add package** adds a NuGet package reference to a project file and automatically downloads the package. It modifies the .csproj or .fsproj file to include the package reference, making the dependency trackable in version control.

The command integrates with NuGet package sources to resolve packages and their transitive dependencies. Version constraints can be specified to pin specific versions or allow updates within semantic versioning ranges.

# SEE ALSO

[dotnet-remove](/man/dotnet-remove)(1), [dotnet-restore](/man/dotnet-restore)(1)

