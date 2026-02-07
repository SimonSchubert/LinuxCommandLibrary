# TAGLINE

secure runtime for JavaScript and TypeScript

# TLDR

**Run a TypeScript/JavaScript** file

```deno run [script.ts]```

**Run with network** permission

```deno run --allow-net [script.ts]```

**Run with all permissions**

```deno run -A [script.ts]```

**Start REPL**

```deno```

**Run remote script**

```deno run [https://example.com/script.ts]```

**Compile to executable**

```deno compile [script.ts]```

**Format source files**

```deno fmt```

**Run tests**

```deno test```

# SYNOPSIS

**deno** _subcommand_ [_options_] [_script_] [_args_]

# PARAMETERS

_SUBCOMMAND_
> Command: run, compile, test, fmt, lint, bundle, etc.

_SCRIPT_
> TypeScript/JavaScript file or URL to execute.

**--allow-net** [_HOSTS_]
> Allow network access.

**--allow-read** [_PATHS_]
> Allow filesystem read access.

**--allow-write** [_PATHS_]
> Allow filesystem write access.

**--allow-env** [_VARS_]
> Allow environment variable access.

**-A**, **--allow-all**
> Allow all permissions.

**--unstable**
> Enable unstable APIs.

**--watch**
> Watch for changes and restart.

**--help**
> Display help information.

# DESCRIPTION

**Deno** is a secure runtime for JavaScript and TypeScript. It executes code in a sandboxed environment where permissions for file, network, and environment access must be explicitly granted.

Deno features native TypeScript support without configuration, a built-in formatter and linter, test runner, and standard library. It uses ES modules exclusively and can import modules directly from URLs, eliminating the need for a package manager.

The runtime is built on V8 and Rust, emphasizing security and modern JavaScript features. It provides Web API compatibility, making code more portable between Deno and browser environments.

# CONFIGURATION

**deno.json** or **deno.jsonc**
> Project configuration file for import maps, tasks, compiler options, and formatting rules.

# CAVEATS

Not fully compatible with Node.js modules. Some npm packages require compatibility layers. Permission flags must be specified for each resource type. URL imports depend on remote availability.

# HISTORY

Deno was created by **Ryan Dahl**, the original creator of Node.js, and announced in **2018**. It was designed to address perceived shortcomings in Node.js, particularly around security, TypeScript support, and module systems. Version 1.0 was released in **2020**.

# SEE ALSO

[node](/man/node)(1), [bun](/man/bun)(1), [tsc](/man/tsc)(1)
