# TLDR

**Run JavaScript file**

```node [script.js]```

**Start REPL**

```node```

**Evaluate expression**

```node -e "[console.log('hello')]"```

**Run with arguments**

```node [script.js] [arg1] [arg2]```

**Inspect for debugging**

```node --inspect [script.js]```

**Check syntax only**

```node --check [script.js]```

**Print version**

```node --version```

**Run TypeScript with loader**

```node --loader ts-node/esm [script.ts]```

# SYNOPSIS

**node** [_options_] [_script_] [_arguments_]

# PARAMETERS

_SCRIPT_
> JavaScript file to execute.

_ARGUMENTS_
> Arguments passed to script.

**-e** _CODE_
> Evaluate code string.

**--inspect**
> Enable debugger.

**--check**
> Syntax check only.

**--version**
> Show version.

**--help**
> Display help information.

# DESCRIPTION

**node** is the Node.js JavaScript runtime. It executes JavaScript outside browsers.

The tool provides V8 engine access. Supports npm ecosystem and async I/O.

node runs JavaScript server-side.

# CAVEATS

V8 engine based. Single-threaded event loop. Requires node installation.

# HISTORY

Node.js was created by **Ryan Dahl** in 2009 to bring JavaScript to server-side development.

# SEE ALSO

[npm](/man/npm)(1), [npx](/man/npx)(1), [deno](/man/deno)(1)

