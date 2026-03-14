# TAGLINE

static site generator optimized for documentation

# TLDR

**Create a new Docusaurus site** using the classic template

```npx create-docusaurus@latest [my-website] classic```

**Start the development server** (with hot reload)

```npx docusaurus start```

**Start on a specific port**

```npx docusaurus start --port [8080]```

**Build the site for production**

```npx docusaurus build```

**Serve the production build locally**

```npx docusaurus serve```

**Deploy to GitHub Pages**

```npx docusaurus deploy```

**Clear generated files and caches**

```npx docusaurus clear```

**Tag a new documentation version**

```npx docusaurus docs:version [1.0]```

# SYNOPSIS

**npx docusaurus** _command_ [_options_]

# PARAMETERS

**start** [**--port** _n_]
> Start development server (default port 3000).

**build** [**--out-dir** _path_]
> Build static site for production.

**serve** [**--port** _n_]
> Serve built site locally.

**deploy**
> Deploy to GitHub Pages.

**clear**
> Clear generated files and caches.

**swizzle** _theme_ _component_
> Eject or wrap a theme component for customization (interactive).

**docs:version** _version_
> Tag the current docs as a new version snapshot.

**write-translations**
> Extract translatable strings to JSON translation files.

**write-heading-ids**
> Add explicit heading IDs to Markdown documents.

**--locale** _locale_
> Specify locale for the command.

**--config** _path_
> Use a custom configuration file.

**--out-dir** _path_
> Custom output directory for build (default: build/).

# DESCRIPTION

**Docusaurus** is a static site generator optimized for documentation websites. It uses React for the UI, Markdown/MDX for content, and provides features like versioning, i18n, and search out of the box.

Sites are configured via **docusaurus.config.js**, defining metadata, themes, plugins, and navigation. Content lives in **docs/** for documentation and **blog/** for blog posts.

The development server provides hot reloading. Production builds generate static HTML, CSS, and JavaScript that can be hosted anywhere. Built-in deployment support targets GitHub Pages.

# PROJECT STRUCTURE

```
my-website/
├── docs/           # Documentation markdown
├── blog/           # Blog posts
├── src/
│   ├── components/ # React components
│   └── pages/      # Custom pages
├── static/         # Static assets
├── docusaurus.config.js
└── sidebars.js     # Sidebar configuration
```

# CONFIGURATION

**docusaurus.config.js**
> Main configuration defining site metadata, themes, plugins, navbar, footer, and build options.

**sidebars.js**
> Sidebar structure configuration defining documentation hierarchy and navigation.

# CAVEATS

Requires Node.js 18+. Large sites may have slow build times. Custom React components need familiarity with React. Swizzling (customizing) theme components may break on version upgrades. Full-text search requires additional setup (Algolia DocSearch or a local search plugin).

# HISTORY

Docusaurus was created at **Facebook** (Meta) and open-sourced in **2017**. It was designed to power documentation for Facebook's open-source projects. Version 2, a complete rewrite using React, was released in **2022**. The project is maintained by Meta and a community of contributors.

# SEE ALSO

[gatsby](/man/gatsby)(1), [vitepress](/man/vitepress)(1), [mkdocs](/man/mkdocs)(1), [hugo](/man/hugo)(1)
