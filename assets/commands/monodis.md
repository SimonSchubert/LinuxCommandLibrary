# TAGLINE

disassembles

# TLDR

**Disassemble .NET assembly**

```monodis [assembly.dll]```

**Show assembly metadata**

```monodis --assembly [assembly.dll]```

**Show type definitions**

```monodis --typedef [assembly.dll]```

**Output to file**

```monodis [assembly.dll] > [output.il]```

# SYNOPSIS

**monodis** [_options_] _assembly_

# PARAMETERS

**--assembly**
> Show assembly table.

**--typedef**
> Show type definitions.

**--typeref**
> Show type references.

**--methoddef**
> Show method definitions.

**--method** _name_
> Disassemble specific method.

**--output** _file_
> Output to file.

**--mscorlib**
> Reference mscorlib for disassembly.

# DESCRIPTION

**monodis** disassembles .NET assemblies (DLL/EXE) to CIL (Common Intermediate Language) text. Part of the Mono framework. Used for debugging, reverse engineering, and understanding .NET bytecode.

# INSTALL

```apt: sudo apt install mono-utils```

```pacman: sudo pacman -S mono```

```apk: sudo apk add mono```

```brew: brew install mono```

```nix: nix profile install nixpkgs#mono```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[monop](/man/monop)(1)

