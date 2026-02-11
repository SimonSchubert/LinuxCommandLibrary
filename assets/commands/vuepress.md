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

**Eject default theme** for customization

```vuepress eject [docs]```

**Show environment information**

```vuepress info```

# SYNOPSIS

**vuepress** _command_ [_targetDir_] [_options_]

# PARAMETERS

**dev** [_targetDir_]
> Start a development server with hot-reloading. Default target is current directory.

**build** [_targetDir_]
> Build the site as static HTML files for deployment.

**eject** [_targetDir_]
> Copy the default theme to .vuepress/theme for customization.

**info**
> Display debugging information about the local environment.

**--port** _port_
> Specify the port for the development server. Default is 8080.

**--host** _host_
> Specify the host for the development server.

**--temp** _dir_
> Set the directory for temporary files.

**--cache** _dir_
> Set the directory for cache files.

**--dest** _dir_
> Set the output directory for build.

**--debug**
> Enable debug mode with verbose output.

**--clean-cache**
> Clean cache before building.

**--help**
> Display help for a command.

# DESCRIPTION

**VuePress** is a Vue-powered static site generator designed for creating documentation websites. It compiles Markdown files into a single-page application (SPA) with pre-rendered static HTML for each page, combining SEO benefits with SPA navigation.

VuePress allows using Vue components directly in Markdown files, enabling interactive documentation. It comes with a default theme optimized for technical documentation, including features like sidebar navigation, search, and automatic header anchors.

The development server provides hot module reloading for both Markdown content and Vue components. For production, the build command generates optimized static files that can be deployed to any static hosting service.

Configuration is done through a .vuepress/config.js file in the target directory, controlling theme, plugins, navigation, and site metadata.

# CAVEATS

Requires Node.js 14 or higher. VuePress v1 is in maintenance mode; v2 or VitePress (the successor) are recommended for new projects. Large documentation sites may have slow build times. Custom themes require Vue.js knowledge.

# HISTORY

**VuePress** was created by **Evan You**, the creator of Vue.js, in **April 2018**. It was originally developed to document Vue.js itself but became a standalone project due to its utility for technical documentation. VuePress v2, released in **2022**, was rebuilt with Vue 3 support. **VitePress**, using Vite instead of Webpack, is now the recommended alternative for new projects.

# SEE ALSO

[vitepress](/man/vitepress)(1), [vue](/man/vue)(1), [docusaurus](/man/docusaurus)(1), [mkdocs](/man/mkdocs)(1)
