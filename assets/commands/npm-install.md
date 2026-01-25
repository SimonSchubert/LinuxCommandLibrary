# TLDR

**Install all dependencies**

```npm install```

**Install specific package**

```npm install [package]```

**Install as dev dependency**

```npm install -D [package]```

**Install specific version**

```npm install [package]@[version]```

**Install globally**

```npm install -g [package]```

**Install from git**

```npm install [git+https://github.com/user/repo.git]```

**Clean install (CI)**

```npm ci```

# SYNOPSIS

**npm install** [_options_] [_packages_...]

# PARAMETERS

**-D**, **--save-dev**
> Save as devDependency.

**-g**, **--global**
> Install globally.

**-E**, **--save-exact**
> Save exact version.

**--no-save**
> Don't update package.json.

**--legacy-peer-deps**
> Ignore peer dep conflicts.

**--force**
> Force fetch packages.

# DESCRIPTION

**npm install** (or npm i) installs packages and their dependencies. Without arguments, it installs everything in package.json. With package names, it adds them to the project.

The package-lock.json ensures reproducible installs.

# VERSION RANGES

```bash
npm install lodash         # Latest
npm install lodash@4.17.0  # Exact
npm install lodash@^4.0.0  # Compatible
npm install lodash@~4.17.0 # Patch updates
```

# CAVEATS

npm ci is faster for CI/CD. Peer deps may cause issues in npm 7+. Lock file should be committed.

# HISTORY

npm install has been the core command of npm since **Isaac Schlueter** created npm in **2010** for Node.js package management.

# SEE ALSO

[npm](/man/npm)(1), [npm-ci](/man/npm-ci)(1), [npm-uninstall](/man/npm-uninstall)(1), [yarn](/man/yarn)(1)
