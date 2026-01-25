# TLDR

**Rebuild all native modules**

```npm rebuild```

**Rebuild specific package**

```npm rebuild [package]```

**Rebuild for different Node version**

```npm rebuild --target=[18.0.0]```

**Rebuild globally installed packages**

```npm rebuild -g```

# SYNOPSIS

**npm rebuild** [_options_] [_packages_...]

# PARAMETERS

**-g**, **--global**
> Rebuild global packages.

**--ignore-scripts**
> Don't run scripts.

**--foreground-scripts**
> Run scripts in foreground.

# DESCRIPTION

**npm rebuild** rebuilds native addon modules for the current Node.js version. This is necessary after upgrading Node.js or when native modules fail to load.

The command runs node-gyp rebuild for each package with native code.

# COMMON USE CASES

```bash
# After Node.js upgrade
npm rebuild

# Fix broken native module
npm rebuild bcrypt

# Rebuild with verbose output
npm rebuild --verbose
```

# NATIVE MODULES

```
bcrypt, node-sass, sqlite3
sharp, canvas, grpc
leveldown, node-rdkafka
```

# CAVEATS

Requires build tools (Python, C++ compiler). May take significant time. Some modules need specific Node versions.

# HISTORY

npm rebuild has been part of npm since early versions, essential for maintaining native addon compatibility across Node.js versions.

# SEE ALSO

[npm](/man/npm)(1), [npm-install](/man/npm-install)(1), [node-gyp](/man/node-gyp)(1)
