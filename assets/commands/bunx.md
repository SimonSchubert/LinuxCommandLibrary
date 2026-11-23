# TAGLINE

Auto-install and run package executables

# TLDR

**Run package executable**

```bunx [prisma] migrate```

**Run specific package version**

```bunx [uglify-js@3.14.0] [app.js]```

**Run when binary name differs from package**

```bunx -p @angular/cli ng new [my-app]```

**Force run with Bun runtime**

```bunx --bun vite dev```

**Run prettier on file**

```bunx prettier [file.js]```

Run **only if already installed**, never download

```bunx --no-install [package]```

**Run a command** with a package's binaries on the PATH

```bunx -p [typescript] sh -c "[tsc --version]"```

# SYNOPSIS

**bunx** [_options_] _package_[@_version_] [_arguments_]

**bun x** [_options_] _package_[@_version_] [_arguments_]

# DESCRIPTION

**bunx** auto-installs and runs executables from npm packages. It is an alias for **bun x** and Bun's equivalent of npx or yarn dlx, roughly 100x faster than npx for locally installed packages due to Bun's fast startup times.

A locally installed package is used first; otherwise the package is installed into Bun's global shared cache. When a version is given (e.g. _pkg@2_) the local copy is ignored. Cached packages are checked for newer versions once a day, or on every run with _pkg@latest_.

# PARAMETERS

**-p**, **--package** _name_
> Specify the package to install when the binary name differs from the package name.

**--bun**
> Force running with Bun even if the executable carries a Node shebang.

**--no-install**
> Skip installation if the package is not already installed.

**--cwd** _dir_
> Set the working directory.

**--env-file** _file_
> Load environment variables from the specified file(s).

**--minimum-release-age** _seconds_
> Only install packages published at least N seconds ago.

**--trust**
> Run the lifecycle scripts of the package and all of its dependencies during installation.

**--silent**
> Suppress installation-related output.

**--verbose**
> Print extra detail during installation.

# BEHAVIOR

By default, bunx respects **#!/usr/bin/env node** shebangs in scripts. Use **--bun** to override and run with Bun runtime. Flags for bunx itself must appear before the package name; anything after it is passed to the executable.

# WINDOWS

On Windows, bunx uses a special **.bunx** file format for cross-filesystem symlinks that works with both Bun and Node.js.

# CAVEATS

Packages are cached globally after first use. Use **--bun** flag when you specifically need Bun's runtime features. Some packages may expect Node.js-specific APIs.

# SEE ALSO

[bun](/man/bun)(1), [bun-run](/man/bun-run)(1), [bun-x](/man/bun-x)(1), [npx](/man/npx)(1)

# RESOURCES

```[Source code](https://github.com/oven-sh/bun)```

```[Documentation](https://bun.com/docs/pm/bunx)```

<!-- verified: 2026-11-23 -->
