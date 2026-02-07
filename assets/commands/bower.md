# TAGLINE

Manage front-end web dependencies.

# TLDR

**Install** package

```bower install [jquery]```

**Install** from bower.json

```bower install```

**Search** for packages

```bower search [bootstrap]```

**Update** packages

```bower update```

**List** installed packages

```bower list```

# SYNOPSIS

**bower** _command_ [_options_]

# DESCRIPTION

**bower** is a package manager for web development, managing front-end dependencies like JavaScript libraries, CSS frameworks, and web components. It downloads and installs packages from Git repositories.

The tool was popular for front-end dependency management but is now deprecated in favor of npm and yarn.

# PARAMETERS

**install** _package_
> Install package

**update** _package_
> Update package

**uninstall** _package_
> Remove package

**search** _query_
> Search for packages

**list**
> List installed packages

**info** _package_
> Show package information

**init**
> Create bower.json

**--save**
> Add to dependencies

**--save-dev**
> Add to devDependencies

# CONFIGURATION

bower.json:
```json
{
  "name": "my-project",
  "dependencies": {
    "jquery": "^3.6.0",
    "bootstrap": "^5.1.0"
  }
}
```

# WORKFLOW

```bash
# Initialize project
bower init

# Install package
bower install jquery --save

# Install all dependencies
bower install

# Update all
bower update
```

# CAVEATS

**DEPRECATED** - No longer actively maintained. Use npm or yarn instead for new projects. Flat dependency tree can cause version conflicts. Requires .bowerrc for configuration. Most packages now available on npm.

# HISTORY

**Bower** was created by Twitter in **2012** to manage front-end dependencies, but was officially deprecated in **2017** as npm adopted similar functionality.

# SEE ALSO

[npm](/man/npm)(1), [yarn](/man/yarn)(1), [pnpm](/man/pnpm)(1)
