# TAGLINE

Vue-powered static documentation generator

# TLDR

**Start development server**

```vuepress dev [docs]```

**Build static site** for production

```vuepress build [docs]```

**Start dev server** on a specific port

```vuepress dev [docs] --port [3000]```

**Build with debugging output**

```vuepress build [docs] --debug```

**Build to a custom output directory**

```vuepress build [docs] --dest [dist]```

**Show environment information**

```vuepress info```

# SYNOPSIS

**vuepress** _command_ [_sourceDir_] [_options_]

# PARAMETERS

**dev** [_sourceDir_]
> Start a development server with hot-reloading. Default target is current directory.

**build** [_sourceDir_]
> Build the site as static HTML files for deployment.

**info**
> Display information about the system and dependencies.

**-c**, **--config** _file_
> Set path to config file.

**-p**, **--port** _port_
> Specify the port for the development server (default: 8080). Dev only.

**--host** _host_
> Specify the host for the development server (default: 0.0.0.0). Dev only.

**-d**, **--dest** _dir_
> Set the output directory for build (default: .vuepress/dist). Build only.

**-t**, **--temp** _dir_
> Set the directory for temporary files.

**--cache** _dir_
> Set the directory for cache files.

**--debug**
> Enable debug mode with verbose output.

**--clean-temp**
> Clean temporary files before dev or build.

**--clean-cache**
> Clean cache files before dev or build.

**--open**
> Open browser when ready. Dev only.

**--no-watch**
> Disable watching page and config files. Dev only.

**--help**
> Display help for a command.

# DESCRIPTION

**VuePress** is a Vue-powered static site generator designed for creating documentation websites. It compiles Markdown files into a single-page application (SPA) with pre-rendered static HTML for each page, combining SEO benefits with SPA navigation.

VuePress allows using Vue components directly in Markdown files, enabling interactive documentation. It comes with a default theme optimized for technical documentation, including features like sidebar navigation, search, and automatic header anchors.

The development server provides hot module reloading for both Markdown content and Vue components. For production, the build command generates optimized static files that can be deployed to any static hosting service.

Configuration is done through a .vuepress/config.js or .vuepress/config.ts file in the source directory, controlling theme, plugins, navigation, and site metadata. CLI options override config file settings with the same name.

# CAVEATS

Requires Node.js 18.19.0 or higher. VuePress v1 is in maintenance mode; v2 or VitePress (the successor) are recommended for new projects. The `eject` command from v1 does not exist in v2. Large documentation sites may have slow build times. Custom themes require Vue.js knowledge.

# HISTORY

**VuePress** was created by **Evan You**, the creator of Vue.js, in **April 2018**. It was originally developed to document Vue.js itself but became a standalone project due to its utility for technical documentation. VuePress v2, released in **2022**, was rebuilt with Vue 3 support. **VitePress**, using Vite instead of Webpack, is now the recommended alternative for new projects.

# SEE ALSO

[vitepress](/man/vitepress)(1), [vue](/man/vue)(1), [docusaurus](/man/docusaurus)(1), [mkdocs](/man/mkdocs)(1)
