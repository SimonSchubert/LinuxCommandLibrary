# TLDR

**Type check project**

```flow check```

**Start Flow server**

```flow server```

**Check single file**

```flow check-contents < [file.js]```

**Initialize Flow config**

```flow init```

**Get type at** position

```flow type-at-pos [file.js] [10] [5]```

# SYNOPSIS

**flow** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Operation: check, server, status, init, etc.

**check**
> Type check all files.

**server**
> Start background server.

**status**
> Show server status and errors.

**init**
> Create .flowconfig file.

**stop**
> Stop background server.

**type-at-pos** _FILE_ _LINE_ _COL_
> Get type at position.

**--help**
> Display help information.

# DESCRIPTION

**flow** is a static type checker for JavaScript from Facebook. It adds gradual typing through type annotations and inference, catching errors before runtime.

The tool runs as a background server for fast incremental checking. Type annotations use a superset of JavaScript syntax, stripped at build time.

Flow integrates with editors for real-time type checking and provides detailed error messages with suggested fixes.

# CAVEATS

Requires .flowconfig file. Not compatible with all JavaScript patterns. Build step needed to strip annotations.

# HISTORY

Flow was created at **Facebook** (now Meta) in 2014 to add type safety to their JavaScript codebase. It competed with TypeScript, offering a different approach to gradual typing.

# SEE ALSO

[tsc](/man/tsc)(1), [eslint](/man/eslint)(1), [node](/man/node)(1)
