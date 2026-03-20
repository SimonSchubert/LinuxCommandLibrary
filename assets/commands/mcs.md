# TAGLINE

mono C# compiler

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
> C# source files to compile.

**-out:**_FILE_
> Output file name.

**-target:**_TYPE_
> Output type: **exe** (console app, default), **library** (DLL), **module**, or **winexe** (GUI app).

**-r:**_ASSEMBLY_
> Reference an external assembly.

**-debug**
> Emit debugging information.

**-optimize**
> Enable compiler optimizations.

**-define:**_SYMBOL_
> Define a preprocessor symbol.

**-pkg:**_PACKAGE_
> Reference packages registered with pkg-config.

**-recurse:**_PATTERN_
> Compile all files matching the pattern recursively.

**-warn:**_LEVEL_
> Set warning level (0-4, default 4).

**-warnaserror**
> Treat warnings as errors.

**-nowarn:**_NUMBERS_
> Suppress specified warning numbers.

**-unsafe**
> Enable compilation of unsafe code.

**-checked**
> Enable overflow checking.

**-main:**_CLASS_
> Specify which class contains the Main entry point.

**-lib:**_PATHLIST_
> Comma-separated list of directories to search for assemblies.

**-sdk:**_VERSION_
> Specify Base Class Library version (2 or 4, default 4).

**-noconfig**
> Disable loading the default compiler configuration.

**-langversion:**_VERSION_
> Specify C# language version (e.g., default, latest, ISO-1, ISO-2, 3-7).

**--help**
> Display help information.

# DESCRIPTION

**mcs** is the Mono C# compiler. It compiles C# source code into Common Intermediate Language (CIL) assemblies that run on the Mono or .NET runtime. It supports C# language versions up to C# 7.

Options use a colon separator (e.g., `-out:file.exe`, `-target:library`) following Microsoft csc conventions, though the alternate syntax with a space is also accepted in many cases.

# CAVEATS

Part of the Mono framework. The Mono project has been largely superseded by .NET (Core/.NET 5+) and the Roslyn-based **csc** compiler. New projects should prefer **dotnet build** or **csc**. Language support stops at C# 7; newer C# features require Roslyn.

# HISTORY

**mcs** is the **Mono** project's C# compiler, originally written by **Miguel de Icaza** and the Mono team. It was one of the first open-source implementations of the C# compiler, enabling .NET development on Linux and macOS before Microsoft open-sourced .NET.

# SEE ALSO

[mono](/man/mono)(1), [csc](/man/csc)(1), [dotnet](/man/dotnet)(1)

