# TAGLINE

C# compiler from .NET SDK

# TLDR

**Compile a C# file** to executable

```csc [Program.cs]```

**Compile multiple files**

```csc [File1.cs] [File2.cs] [File3.cs]```

**Specify output filename**

```csc -out:[MyApp.exe] [Program.cs]```

**Create a library** (DLL)

```csc -target:library -out:[MyLib.dll] [Library.cs]```

**Reference external assemblies**

```csc -reference:[System.Data.dll] [Program.cs]```

**Compile with optimizations**

```csc -optimize [Program.cs]```

**Enable all warnings**

```csc -warn:4 [Program.cs]```

# SYNOPSIS

**csc** [_options_] _source-files_

# PARAMETERS

**-out:**_FILE_
> Specify output file name.

**-target:**_TYPE_
> Output type: exe, winexe, library, module.

**-reference:**_FILE_
> Reference an assembly file (can be repeated).

**-lib:**_PATH_
> Additional directories for assembly references.

**-optimize**[**+**|**-**]
> Enable or disable optimizations.

**-debug**[**+**|**-**]
> Emit debugging information.

**-warn:**_LEVEL_
> Warning level (0-4).

**-nowarn:**_WARNINGS_
> Disable specific warnings.

**-define:**_SYMBOLS_
> Define conditional compilation symbols.

**-doc:**_FILE_
> Generate XML documentation file.

**-?**, **-help**
> Display help information.

# DESCRIPTION

**csc** is the C# compiler from the .NET SDK. It compiles C# source files into assemblies (executables or libraries) that run on the .NET runtime. The compiler supports all C# language features and produces MSIL (Microsoft Intermediate Language) code.

Modern C# development typically uses the **dotnet** CLI which invokes csc internally, but direct csc usage is valuable for understanding compilation, scripting builds, or working with legacy projects.

The compiler handles syntax checking, type verification, code generation, and optimization. It supports incremental compilation and can produce debug symbols for debugging with Visual Studio or other debuggers.

# CAVEATS

Modern .NET development prefers **dotnet build** over direct csc invocation. Assembly references must be explicitly specified unlike with project files. Cross-platform .NET Core/5+ uses Roslyn compiler accessed through dotnet CLI.

# HISTORY

csc has been the C# compiler since **C# 1.0 in 2002**. Originally part of .NET Framework, it was reimplemented in C# itself as the Roslyn compiler starting in **2014**. The modern csc is part of the .NET SDK and supports C# 12 and beyond.

# SEE ALSO

[dotnet](/man/dotnet)(1), [msbuild](/man/msbuild)(1), [mono](/man/mono)(1), [mcs](/man/mcs)(1)
