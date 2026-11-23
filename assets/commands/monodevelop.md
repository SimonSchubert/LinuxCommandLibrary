# TAGLINE

Cross-platform IDE for .NET, Mono, C#, and F#

# TLDR

**Start MonoDevelop**

```monodevelop```

**Open a solution file**

```monodevelop [solution.sln]```

**Open a project file**

```monodevelop [project.csproj]```

**Open in a new window** instead of an existing instance

```monodevelop --new-window [solution.sln]```

**Start without the start window**

```monodevelop --no-start-window```

**Keep log output on the terminal** for debugging

```monodevelop --no-redirect```

# SYNOPSIS

**monodevelop** [_options_] [_files_...]

# PARAMETERS

**--new-window**
> Do not open the given files in an already running instance; start a new one.

**--no-start-window**
> Do not display the start (welcome) window.

**--no-splash**
> Do not display the splash screen. Deprecated and ignored in recent versions.

**--ipc-tcp**
> Use a TCP channel for inter-process communication between instances.

**--perf-log**
> Enable performance counter logging, written to **monodevelop.perf-log** in the current directory.

**--no-redirect**
> Disable redirection of stdout/stderr to a log file.

**-h**, **-?**, **--help**
> Display usage information.

# DESCRIPTION

**monodevelop** is a cross-platform integrated development environment for .NET and Mono. It supports C#, F#, Visual Basic, and a range of other languages via add-ins. Features include code completion, an integrated debugger, version control integration (Git, Subversion), refactorings, NuGet support, and a project/solution model compatible with Microsoft Visual Studio.

On macOS the same codebase was shipped as **Visual Studio for Mac**. Linux distributions usually package it as **monodevelop**.

# CAVEATS

The upstream repository was **archived in 2021** and the project is no longer maintained; **Visual Studio for Mac** was retired by Microsoft on **31 August 2024**. Modern .NET development on Linux has largely shifted to **Visual Studio Code** with the C# Dev Kit or **JetBrains Rider**. Recent .NET SDKs are not fully supported.

# HISTORY

MonoDevelop began in **2003** as a port of **SharpDevelop** to Mono and GTK#, developed by the Mono team at Ximian/Novell and later Xamarin. After Microsoft acquired Xamarin in **2016**, its codebase became the core of **Visual Studio for Mac**. Microsoft retired Visual Studio for Mac on **31 August 2024**.

# SEE ALSO

[mono](/man/mono)(1), [dotnet](/man/dotnet)(1), [msbuild](/man/msbuild)(1), [code](/man/code)(1)

# RESOURCES

```[Source code](https://github.com/mono/monodevelop)```

```[Homepage](https://www.monodevelop.com/)```

<!-- verified: 2026-11-23 -->
