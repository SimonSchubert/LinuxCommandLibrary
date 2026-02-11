# TAGLINE

Compile Swift source code to executables

# TLDR

**Compile a Swift source file**

```swiftc [file.swift]```

**Compile with a custom output name**

```swiftc -o [program] [file.swift]```

**Compile multiple source files**

```swiftc [main.swift] [utils.swift] -o [program]```

**Compile with debugging symbols**

```swiftc -g [file.swift] -o [program]```

**Compile with optimization**

```swiftc -O [file.swift] -o [program]```

**Show verbose compilation output**

```swiftc -v [file.swift]```

**Emit object file only**

```swiftc -c [file.swift] -o [file.o]```

# SYNOPSIS

**swiftc** [_options_] [_files_]

# PARAMETERS

**-o** _file_
> Specify output file name

**-c**
> Compile without linking (produce object file)

**-g**
> Generate debugging symbols

**-O**
> Compile with optimizations

**-Ounchecked**
> Compile with optimizations, removing runtime safety checks

**-Onone**
> Compile without optimizations (default for debug)

**-v**, **--verbose**
> Show verbose output including executed commands

**-emit-library**
> Generate a dynamic library

**-emit-module**
> Generate a Swift module

**-I** _path_
> Add import search path

**-L** _path_
> Add library search path

**-l** _library_
> Link with specified library

**-h**, **--help**
> Display help information

# DESCRIPTION

**swiftc** is the Swift compiler that translates Swift source code into executable binaries, libraries, object files, and modules. It is the command-line interface for building Swift programs outside of Xcode.

The compiler driver coordinates multiple compilation phases: parsing, type checking, optimization, and code generation. For single-file programs, swiftc produces an executable directly. Multiple source files are compiled and linked together.

swiftc is a symbolic link to the swift executable, which determines its behavior based on how it is invoked. The Swift Package Manager typically handles compilation for complex projects.

# CAVEATS

swiftc requires the Swift toolchain to be installed. On macOS, it is included with Xcode; on Linux, it must be installed separately. Module compatibility depends on Swift version; mixing versions may cause issues.

# HISTORY

Swift was announced by **Apple** at WWDC **2014** and open-sourced in **December 2015**. The compiler was initially written in C++, with ongoing efforts to rewrite components in Swift itself. Swift 6 added major concurrency and safety improvements.

# SEE ALSO

[swift](/man/swift)(1), [clang](/man/clang)(1), [xcodebuild](/man/xcodebuild)(1), [lldb](/man/lldb)(1)
