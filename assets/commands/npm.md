# TAGLINE

node Package Manager

# TLDR

**Install dependencies**

```npm install```

**Install package**

```npm install [package]```

**Install globally**

```npm install -g [package]```

**Install dev dependency**

```npm install -D [package]```

**Run script**

```npm run [script-name]```

**Start application**

```npm start```

**Run tests**

```npm test```

**Update packages**

```npm update```

**Initialize project**

```npm init```

**Clean install from lockfile**

```npm ci```

**List installed packages**

```npm ls```

**Check for outdated packages**

```npm outdated```

**Run security audit**

```npm audit```

**Uninstall a package**

```npm uninstall [package]```

**Publish a package**

```npm publish```

# SYNOPSIS

**npm** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> npm command.

**install**
> Install packages.

**uninstall**
> Remove packages.

**run** _SCRIPT_
> Run package script.

**update**
> Update packages.

**init**
> Create package.json.

**ci**
> Clean install from package-lock.json (for CI/CD).

**audit**
> Run security vulnerability audit.

**ls**
> List installed packages.

**outdated**
> Check for outdated packages.

**publish**
> Publish package to registry.

**-g**
> Global installation.

**-D**, **--save-dev**
> Save as development dependency.

**--help**
> Display help information.

# DESCRIPTION

**npm** is the Node Package Manager and the default package manager for Node.js. It manages JavaScript packages and dependencies using package.json and package-lock.json files.

npm provides access to the world's largest software registry with over two million packages.

# CAVEATS

Requires Node.js. package-lock.json for determinism. Network dependent.

# HISTORY

npm was created by **Isaac Schlueter** in 2010 and is the default package manager for Node.js.

# SEE ALSO

[node](/man/node)(1), [npx](/man/npx)(1), [yarn](/man/yarn)(1), [pnpm](/man/pnpm)(1)

