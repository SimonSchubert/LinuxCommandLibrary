# TLDR

**Create project from template**

```bun create [template] [project-name]```

**Create Hono project**

```bun create hono@latest [my-app]```

**Create Elysia project**

```bun create elysia [my-app]```

**Create from GitHub template**

```bun create [github-user/repo] [project-name]```

**Create from local template**

```bun create [./path/to/template] [project-name]```

# SYNOPSIS

**bun create** _template_ [_destination_]

# DESCRIPTION

**bun create** scaffolds new projects from templates. It supports templates from npm, GitHub repositories, and local directories. After cloning, it automatically installs dependencies and initializes the project.

For basic project initialization without templates, use **bun init** instead.

# PARAMETERS

_template_
> Template source: npm package, GitHub repo (user/repo), or local path

_destination_
> Project directory name (defaults to template name)

# TEMPLATES

**From npm**
> bun create hono@latest my-app

**From GitHub**
> bun create user/repo my-project

**From local directory**
> bun create ./my-template new-project

# RELATED COMMANDS

**bun init**
> Initialize blank project in current directory

**bun init --react**
> Scaffold React project

**bun init --react=tailwind**
> Scaffold React with Tailwind CSS

**bun init --react=shadcn**
> Scaffold React with shadcn/ui

# CAVEATS

Template availability depends on the source. GitHub templates require network access. Some templates may have additional setup steps documented in their README.

# SEE ALSO

[bun](/man/bun)(1), [bun-init](/man/bun-init)(1), [npm-init](/man/npm-init)(1)
