# TLDR

**Add project reference**

```dotnet add reference [../Other/Other.csproj]```

**Add multiple references**

```dotnet add reference [../Lib1/Lib1.csproj] [../Lib2/Lib2.csproj]```

**Add reference to specific project**

```dotnet add [src/App/App.csproj] reference [../Lib/Lib.csproj]```

# SYNOPSIS

**dotnet** **add** [_project_] **reference** _project_path_... [_options_]

# PARAMETERS

**-f**, **--framework** _framework_
> Add reference only for specific framework.

# DESCRIPTION

**dotnet add reference** adds project-to-project (P2P) references to a project file. Referenced projects are built before the referencing project.

# SEE ALSO

[dotnet-remove-reference](/man/dotnet-remove-reference)(1), [dotnet-list-reference](/man/dotnet-list-reference)(1)

