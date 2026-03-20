# TAGLINE

Mono Class Outline Viewer

# TLDR

**Show the outline of a type**

```monop [System.String]```

**Show a type from a specific assembly**

```monop -r:[path/to/assembly.dll] [TypeName]```

**List all types in an assembly**

```monop -r:[path/to/assembly.dll] --list```

**Show only members declared in the type** (exclude inherited)

```monop --only-declared [System.Console]```

**Search for a type by partial name**

```monop -s [PartialName]```

**Show private members**

```monop -a [System.String]```

# SYNOPSIS

**monop** [_options_] _typename_

# PARAMETERS

**-r:**_assembly_
> Reference a specific assembly file.

**--only-declared**
> Only show members declared in the specified type (exclude inherited members).

**--filter-obsolete**
> Do not show obsolete types and members.

**--refs**
> Print a list of referenced assemblies for the given assembly.

**--list**
> List all types in the assembly.

**-a**
> Show private members.

**-s**
> Search for a type by partial name across all known assemblies.

# DESCRIPTION

**monop** is a command-line class outline viewer for the Mono framework. It displays the outline of a .NET type, showing class signatures, methods, properties, fields, events, and constructors. It can inspect types from the standard library or from specific assemblies, making it useful for quick API reference without needing a decompiler or IDE.

# SEE ALSO

[monodis](/man/monodis)(1), [mono](/man/mono)(1), [dotnet](/man/dotnet)(1)

