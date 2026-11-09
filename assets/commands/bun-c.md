# TAGLINE

Scaffold new projects from templates (alias of bun create)

# TLDR

**Create a project from a template**

```bun c [template] [destination]```

**Create from a GitHub repository**

```bun c [github-user/repo] [destination]```

**Create without installing dependencies**

```bun c [template] [destination] --no-install```

**Create without initializing Git**

```bun c [template] [destination] --no-git```

**Overwrite existing files**

```bun c [template] [destination] --force```

# SYNOPSIS

**bun c** _template_ [_destination_] [_options_]

# PARAMETERS

**--force**
> Overwrite existing files.

**--no-install**
> Skip installing node_modules and tasks.

**--ignore-scripts**
> Skip tasks and lifecycle scripts.

**--no-git**
> Do not initialize a Git repository.

**--open**
> Start and open in the browser after finishing.

# DESCRIPTION

**bun c** is a short alias of **bun create**. It scaffolds a new project from a React component, an npm package named **create-**_template_, a GitHub repository, or a local template.

# CAVEATS

**bun c** is a subcommand. The flag **bun -c** is unrelated: it is short for **--config** and sets the path to the Bun configuration file.

# SEE ALSO

[bun](/man/bun)(1), [bun-create](/man/bun-create)(1), [bun-x](/man/bun-x)(1)

# RESOURCES

```[Source code](https://github.com/oven-sh/bun)```

```[Homepage](https://bun.com/)```

```[Documentation](https://bun.com/docs/runtime/templating/create)```

<!-- verified: 2026-11-09 -->
