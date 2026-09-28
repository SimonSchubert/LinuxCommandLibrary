# TAGLINE

small, embeddable V8 JavaScript runtime for Linux

# TLDR

Start a **REPL** (interactive shell)

```just```

**Run** a JavaScript file

```just [path/to/file.js]```

Run a script **piped from stdin**

```cat [path/to/file.js] | just --```

**Evaluate** JavaScript code

```just eval "[just.print(just.memoryUsage().rss)]"```

**Initialize** a new project

```just init [project_name]```

**Build** a JavaScript application into a static executable

```just build [path/to/file.js] --clean --static```

**Clean** a built project

```just clean```

# SYNOPSIS

**just** [_file_ | **--** | _command_] [_options_]

# PARAMETERS

**eval** _CODE_
> Evaluate a JavaScript code string.

**init** _NAME_
> Initialize a new project directory.

**build** [_FILE_]
> Build JavaScript into a native executable.

**clean**
> Remove build artifacts of a project.

**--**
> Read the script from standard input.

**--static**
> Create a statically linked executable (build).

**--clean**
> Clean before building (build).

# DESCRIPTION

**just** is a small, embeddable V8 JavaScript runtime for Linux. It is a thin layer over system calls, V8 and the C/C++ standard library, giving scripts direct access to Linux primitives such as epoll.

The runtime is designed to be lightweight and fast-starting, suitable for system software, network servers and command-line tools. Modules use CommonJS, calls are blocking by default, and the event loop is implemented in JavaScript. Applications can be compiled into standalone executables.

# CAVEATS

Linux x86_64 only. The API differs completely from Node.js; npm packages generally do not work. No ES module support. The project is **not actively maintained** since November 2023; its author has moved to a successor runtime called **lo**.

# HISTORY

just-js was created by **Andrew Johnston** (billywhizz) around **2020** as a minimal V8 runtime for Linux. It gained attention for reaching the top of the TechEmpower web framework benchmarks. The last release, 0.1.13, was published in October 2022.

# SEE ALSO

[node](/man/node)(1), [deno](/man/deno)(1), [bun](/man/bun)(1)

# RESOURCES

```[Source code](https://github.com/just-js/just)```

```[Homepage](https://just.billywhizz.io/)```

<!-- verified: 2026-09-29 -->
