# TLDR

**Install dependencies**

```pnpm install```

**Add a package**

```pnpm add [package]```

**Add dev dependency**

```pnpm add -D [package]```

**Run script**

```pnpm run [script]```

**Update packages**

```pnpm update```

**Remove package**

```pnpm remove [package]```

# SYNOPSIS

**pnpm** [_command_] [_options_]

# PARAMETERS

**install**
> Install all dependencies.

**add** _PACKAGE_
> Add a package.

**-D**, **--save-dev**
> Save as dev dependency.

**remove** _PACKAGE_
> Remove a package.

**update**
> Update packages.

**run** _SCRIPT_
> Run a script.

**exec** _CMD_
> Execute a command.

**-r**, **--recursive**
> Run in all workspaces.

# DESCRIPTION

**pnpm** is a fast, disk-efficient Node.js package manager. Uses content-addressable storage.

The tool manages JavaScript dependencies. Hard links shared packages.

pnpm manages packages.

# CAVEATS

Node.js required. Uses hard links for efficiency.

# HISTORY

pnpm was created as a **fast alternative** to npm with better disk usage.

# SEE ALSO

[npm](/man/npm)(1), [yarn](/man/yarn)(1), [node](/man/node)(1)

