# TAGLINE

small, embeddable V8 JavaScript runtime for Linux

# TLDR

Start a **REPL** (interactive shell)

```just```

**Run** a JavaScript file

```just [path/to/file.js]```

**Evaluate** JavaScript code

```just eval "[code]"```

**Initialize** a new project

```just init [project_name]```

**Build** a JavaScript application into executable

```just build [path/to/file.js] --static```

# SYNOPSIS

**just** [_options_] [_file_]

# PARAMETERS

**eval** _CODE_
> Evaluate JavaScript code string

**init** _NAME_
> Initialize a new project directory

**build** _FILE_
> Build JavaScript into executable

**--static**
> Create statically linked executable

# DESCRIPTION

**just** is a small, embeddable V8 JavaScript runtime for Linux. It provides a minimal runtime environment for executing JavaScript applications with direct access to Linux system calls.

The runtime is designed to be lightweight and fast-starting, suitable for serverless functions, command-line tools, and embedded applications. It can compile JavaScript into standalone executables.

# CAVEATS

Linux-only runtime. API differs from Node.js; applications may need modification. Smaller ecosystem compared to Node.js or Deno.

# HISTORY

just-js was created as a minimal V8 runtime for Linux, focusing on low overhead and direct system call access rather than the broader API compatibility of Node.js.

# SEE ALSO

[node](/man/node)(1), [deno](/man/deno)(1), [bun](/man/bun)(1)
