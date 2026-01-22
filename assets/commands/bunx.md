# TLDR

**Run package executable**

```bunx [prisma] migrate```

**Run specific package version**

```bunx [email protected] [app.js]```

**Run when binary name differs from package**

```bunx -p @angular/cli ng new [my-app]```

**Force run with Bun runtime**

```bunx --bun vite dev```

**Run prettier on file**

```bunx prettier [file.js]```

**Run create-react-app**

```bunx create-react-app [my-app]```

# SYNOPSIS

**bunx** [_options_] _package_ [_arguments_]

# DESCRIPTION

**bunx** auto-installs and runs executables from npm packages. It's Bun's equivalent of npx, roughly 100x faster for locally installed packages due to Bun's fast startup times.

Packages not found in local node_modules are automatically installed into a global shared cache.

# PARAMETERS

**-p, --package** _name_
> Specify package when binary name differs

**--bun**
> Force running with Bun instead of Node.js

**-c, --config** _file_
> Specify bunfig.toml config file

**--silent**
> Suppress output

# BEHAVIOR

By default, bunx respects **#!/usr/bin/env node** shebangs in scripts. Use **--bun** to override and run with Bun runtime.

# WINDOWS

On Windows, bunx uses a special **.bunx** file format for cross-filesystem symlinks that works with both Bun and Node.js.

# CAVEATS

Packages are cached globally after first use. Use **--bun** flag when you specifically need Bun's runtime features. Some packages may expect Node.js-specific APIs.

# SEE ALSO

[bun](/man/bun)(1), [bun-run](/man/bun-run)(1), [npx](/man/npx)(1)
