# TAGLINE

Global Assembly Cache management utility

# TLDR

**Install assembly to GAC**

```gacutil -i [assembly.dll]```

**Uninstall assembly from GAC**

```gacutil -u [AssemblyName]```

**List assemblies in GAC**

```gacutil -l```

**List specific assembly**

```gacutil -l [AssemblyName]```

**Install from package**

```gacutil -i [assembly.dll] -package [name]```

# SYNOPSIS

**gacutil** [_options_] [_assembly_]

# PARAMETERS

**-i** _assembly_
> Install assembly to GAC.

**-u** _name_
> Uninstall assembly from GAC.

**-l** [_name_]
> List assemblies (optionally filtered).

**-il** _listfile_
> Install assemblies from list file.

**-ul** _listfile_
> Uninstall assemblies from list file.

**-us** _assembly_
> Uninstall assembly using its full name from the assembly file.

**-package** _name_
> Package name for installation; creates a symlink in prefix/lib/mono/NAME/.

**-check_refs**
> Check that installed assembly doesn't reference non-strong-named assemblies.

**-root** _dir_
> Root directory prefix for GAC operations.

**-gacdir** _dir_
> Specify GAC directory (deprecated, use -root instead).

# DESCRIPTION

**gacutil** manages the Global Assembly Cache (GAC) for .NET assemblies. The GAC stores shared assemblies that can be used by multiple .NET applications.

On Linux, gacutil is provided by Mono. It installs, uninstalls, and lists assemblies in the GAC. Strong-named assemblies can be shared across applications through the GAC.

# CAVEATS

Requires strong-named assemblies for GAC installation. Mono's GAC differs from Windows .NET GAC. Root privileges may be required. .NET Core doesn't use GAC; assemblies are self-contained.

# HISTORY

The GAC was introduced with **.NET Framework 1.0** by Microsoft for assembly sharing. Mono implemented compatible tools including gacutil for cross-platform .NET development. With .NET Core/.NET 5+, the GAC model was replaced by NuGet packages.

# SEE ALSO

[mono](/man/mono)(1), [mcs](/man/mcs)(1), [dotnet](/man/dotnet)(1)
