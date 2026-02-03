# TLDR

**Show type information**

```monop [System.String]```

**Show type from assembly**

```monop -r:[assembly.dll] [TypeName]```

**List all types in assembly**

```monop -r:[assembly.dll] --list```

**Show type members**

```monop -d [System.Console]```

# SYNOPSIS

**monop** [_options_] _typename_

# PARAMETERS

**-r:** _assembly_
> Reference assembly file.

**-d**
> Show detailed member information.

**--list**
> List all types in assembly.

**-a**
> Show private members.

**-s**
> Search for partial type name.

# DESCRIPTION

**monop** displays type information from .NET assemblies. Shows class signatures, methods, properties, and inheritance. Part of the Mono framework for inspecting .NET types without decompilation.

# SEE ALSO

[monodis](/man/monodis)(1), [dotnet](/man/dotnet)(1)

