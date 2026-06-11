# TAGLINE

Modern self-hosting Object Pascal compiler

# TLDR

**Compile a single** Pascal source file

```blaise --source [Hello.pas] --output [Hello]```

**Compile a project** described by a project XML file

```blaise --project [project.xml] --output [myapp]```

**Compile in** a specific build profile (debug, release, ...)

```blaise --project [project.xml] --config [debug] --output [myapp]```

**Emit QBE intermediate representation** for inspection

```blaise --source [Hello.pas] --emit-ir```

**Show** version / help

```blaise --version```

# SYNOPSIS

**blaise** **--source** _file_ [**--output** _file_] [**--emit-ir**]

**blaise** **--project** _file_ [**--config** _profile_] [**--output** _file_]

# PARAMETERS

**--source** _FILE_
> Compile a single Pascal source _FILE_.

**--output** _FILE_
> Path of the output executable. Defaults to the source's basename when omitted.

**--project** _FILE_
> Read build settings (units, search paths, libraries, defines) from _FILE_ — typically **project.xml**.

**--config** _PROFILE_
> Select a build profile defined inside the project file. Common values are **debug** and **release**.

**--emit-ir**
> Stop after emitting QBE intermediate representation; useful for inspecting code generation.

**--version**
> Print the compiler version and exit.

**--help**
> Show usage information and exit.

# DESCRIPTION

**Blaise** is a modern, self-hosting **Object Pascal** compiler written from scratch with no dependency on Free Pascal or Delphi sources. It targets native code through the **QBE** backend (with an LLVM backend in development) and is named after **Blaise Pascal**, the mathematician for whom the original Pascal language is also named.

The language Blaise compiles is a "Pascal for the 2020s": a single language mode (no separate Delphi/Free Pascal/Turbo dialects), a single string type using **UTF-8** internally, **Automatic Reference Counting** instead of manual memory management, reified generics, and zero-GUID interfaces. The toolchain ships its own debug format (**OPDF**) for first-class debugger support.

Two invocation styles are supported. **--source** compiles a single file in the spirit of **fpc hello.pas** and is most useful for tutorials and one-off programs. **--project** reads a structured XML project file describing units, search paths, library dependencies and build profiles, which is the recommended workflow for non-trivial applications.

Blaise bootstraps itself: the published binary is produced by the previous version of the compiler compiling its own sources, and the project tracks **byte-for-byte exact rebuild** as a correctness invariant.

# CAVEATS

Blaise is a young, actively-developed compiler — language and compiler flags can change between releases. The current backend is **QBE**, which targets a small set of architectures (x86_64, arm64, riscv64); the LLVM backend that broadens architecture coverage is still under construction. Source compatibility with **Delphi** and **Free Pascal** code is intentionally not a goal: many programs from those ecosystems will not compile unmodified.

# HISTORY

**Blaise** was created by **Graeme Geldenhuys** as a clean-slate Object Pascal compiler with the explicit goal of "no legacy baggage" — full ARC, unified UTF-8, and a single language mode. The project is hosted at **github.com/graemeg/blaise** and is distributed under an open-source license. It joins a long lineage of Pascal implementations dating back to **Niklaus Wirth's** original Pascal compiler at ETH Zurich in **1970**.

# SEE ALSO

