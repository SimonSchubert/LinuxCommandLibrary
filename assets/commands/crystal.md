# TAGLINE

statically-typed compiled language with Ruby-inspired syntax

# TLDR

**Run a Crystal program**

```crystal run [path/to/file.cr]```

**Compile to an executable**

```crystal build [path/to/file.cr]```

**Compile with optimizations** (release mode)

```crystal build --release [path/to/file.cr]```

**Start a new project**

```crystal init app [project_name]```

**Run the project's spec tests**

```crystal spec```

**Check code for errors** without compiling

```crystal tool format --check [path/to/file.cr]```

**Format source code**

```crystal tool format [path/to/file.cr]```

**Generate documentation**

```crystal docs```

# SYNOPSIS

**crystal** [_command_] [_options_] [_file_] [_--_] [_arguments_]

# PARAMETERS

**run** _file_
> Compile and run the program.

**build** _file_
> Compile to an executable.

**spec**
> Run the project's spec test suite.

**init** _type name_
> Create a new Crystal project (app or lib).

**docs**
> Generate API documentation.

**tool format** _files_
> Format Crystal source code.

**tool hierarchy** _type_
> Show type hierarchy.

**tool implement** _type_
> Show implementation of a method.

**play**
> Start the Crystal playground web server.

**--release**
> Compile in release mode with optimizations.

**-o**, **--output** _file_
> Specify output executable name.

**--progress**
> Show compilation progress.

**--no-color**
> Disable colored output.

**-D**, **--define** _flag_
> Define a compile-time flag.

**--static**
> Link statically.

**--cross-compile**
> Generate object file for cross-compilation.

# DESCRIPTION

**crystal** is the command-line interface for the Crystal programming language. Crystal is a statically-typed, compiled language with Ruby-inspired syntax that aims for C-level performance with programmer-friendly ergonomics.

The primary commands are **run** for quick execution during development and **build** for creating distributable binaries. Crystal compiles through LLVM, producing native machine code. The **--release** flag enables optimizations for production builds.

Crystal uses a specification-based testing framework. The **spec** command runs tests from the **spec/** directory. The test syntax resembles RSpec from Ruby, making it familiar to Ruby developers.

The **init** command scaffolds new projects with standard directory structure, shard.yml (dependency manifest), and initial files. Dependencies (shards) are managed separately with the **shards** command, similar to Bundler in Ruby.

Crystal includes built-in code formatting and documentation generation. The playground provides an interactive web-based environment for experimenting with code.

# CAVEATS

Compilation can be slow and memory-intensive for large projects. Cross-compilation requires specific setup. Some Ruby syntax patterns don't translate directly. The standard library is smaller than more established languages. Static linking may require additional system libraries.

# HISTORY

**Crystal** was created by Ary Borenszweig and Juan Wajnerman, with development starting in **2011** and the first public release in **2014**. The language was designed to combine Ruby's expressiveness with static typing and native performance. Version 1.0 was released in **March 2021**, marking the language's production readiness.

# SEE ALSO

[shards](/man/shards)(1), [ruby](/man/ruby)(1), [rustc](/man/rustc)(1), [llvm](/man/llvm)(1)
