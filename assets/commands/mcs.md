# TLDR

**Compile C# file**

```mcs [program.cs]```

**Output executable**

```mcs -out:[program.exe] [program.cs]```

**Build library**

```mcs -target:library [library.cs]```

**Reference assembly**

```mcs -r:[System.dll] [program.cs]```

**Debug build**

```mcs -debug [program.cs]```

**Compile multiple files**

```mcs [file1.cs] [file2.cs] -out:[program.exe]```

# SYNOPSIS

**mcs** [_options_] _files_

# PARAMETERS

_FILES_
> C# source files.

**-out** _FILE_
> Output file name.

**-target** _TYPE_
> Output type (exe, library, module).

**-r** _ASSEMBLY_
> Reference assembly.

**-debug**
> Include debug info.

**--help**
> Display help information.

# DESCRIPTION

**mcs** is the Mono C# compiler. It compiles C# source code to .NET assemblies.

The tool is part of the Mono project. It supports C# language specifications.

mcs compiles C# code.

# CAVEATS

Part of Mono framework. .NET compatibility varies. Being replaced by Roslyn.

# HISTORY

mcs is the **Mono** project's C# compiler, providing cross-platform .NET compilation.

# SEE ALSO

[mono](/man/mono)(1), [csc](/man/csc)(1), [dotnet](/man/dotnet)(1)

