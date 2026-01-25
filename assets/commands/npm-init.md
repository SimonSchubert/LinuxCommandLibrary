# TLDR

**Initialize new project**

```npm init```

**Initialize with defaults**

```npm init -y```

**Create with initializer**

```npm init [initializer]```

**Create React app**

```npm init react-app [my-app]```

**Create Vite project**

```npm init vite@latest [my-app]```

**Set default author**

```npm config set init-author-name "[name]"```

# SYNOPSIS

**npm init** [_options_] [_initializer_]

# PARAMETERS

**-y**, **--yes**
> Accept all defaults.

**--scope** _scope_
> Create scoped package.

**-w**, **--workspace**
> Create workspace.

**initializer**
> Package to run (create-*).

# DESCRIPTION

**npm init** creates a new package.json file. Without an initializer, it prompts for package details. With an initializer, it runs that package's setup process.

Initializers like "react-app" are shorthand for "create-react-app".

# EXAMPLES

```bash
# Interactive
npm init
# Answer prompts...

# With defaults
npm init -y

# Using initializer (runs create-react-app)
npm init react-app my-app

# Scoped package
npm init --scope=@myorg
```

# PACKAGE.JSON TEMPLATE

```json
{
  "name": "my-package",
  "version": "1.0.0",
  "description": "",
  "main": "index.js",
  "scripts": { "test": "echo \"Error: no test\" && exit 1" },
  "keywords": [],
  "author": "",
  "license": "ISC"
}
```

# CAVEATS

-y uses defaults which may need editing. Initializers download packages. Workspace mode for monorepos.

# SEE ALSO

[npm](/man/npm)(1), [npm-install](/man/npm-install)(1), [npm-config](/man/npm-config)(1)
