# TAGLINE

generates documentation websites

# TLDR

**Create new project**

```mkdocs new [project-name]```

**Serve locally**

```mkdocs serve```

**Build site**

```mkdocs build```

**Deploy to GitHub Pages**

```mkdocs gh-deploy```

**Serve on custom port**

```mkdocs serve -a [localhost:8080]```

**Strict mode**

```mkdocs build --strict```

# SYNOPSIS

**mkdocs** _command_ [_options_]

# PARAMETERS

_COMMAND_
> MkDocs operation.

**new** _NAME_
> Create new project.

**serve**
> Start dev server.

**build**
> Build static site.

**gh-deploy**
> Deploy to GitHub Pages.

**-a** _ADDR_
> Server address.

**--help**
> Display help information.

# DESCRIPTION

**mkdocs** generates documentation websites. It builds static sites from Markdown files.

The tool is designed for project documentation. Supports themes and plugins.

# CAVEATS

Python-based. Requires mkdocs.yml config. Material theme popular.

# HISTORY

MkDocs was created to provide simple, fast **documentation** generation from Markdown files.

# INSTALL

```dnf: sudo dnf install mkdocs```

```pacman: sudo pacman -S mkdocs```

```apk: sudo apk add mkdocs```

```brew: brew install mkdocs```

```nix: nix profile install nixpkgs#mkdocs```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[sphinx-build](/man/sphinx-build)(1), [jekyll](/man/jekyll)(1), [hugo](/man/hugo)(1)

