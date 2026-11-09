# TAGLINE

Vite-powered static site generator

# TLDR

**Start development server**

```vitepress dev [docs]```

**Build for production**

```vitepress build [docs]```

**Preview production build**

```vitepress preview [docs]```

**Initialize new project**

```vitepress init```

**Start in current directory**

```vitepress```

# SYNOPSIS

**vitepress** [_command_] [_root_] [_options_]

# COMMANDS

**dev** _root_: Start development server with hot reload.

**build** _root_: Build static site for production.

**preview** _root_: Preview production build locally (alias: **serve**).

**init**: Start the setup wizard for a new VitePress project.

# PARAMETERS

_root_
> Project root directory (default: current directory).

**--host** _host_
> Development server host (dev only, default: localhost).

**--port** _port_
> Server port (dev default: 5173, preview default: 4173).

**--open** [_path_]
> Open browser on startup (dev only).

**--base** _path_
> Public base path (default: /).

**--assetsBase** _url_
> URL prefix the generated assets are served from, e.g. a CDN (build and preview).

**--cors**
> Enable CORS (dev only).

**--strictPort**
> Exit if port is in use (dev only).

**--force**
> Force optimizer to ignore cache (dev only).

**--minify** _value_
> Minification setting passed to Vite (build only).

**--mpa**
> Experimental MPA mode without client-side hydration (build only).

**--outDir** _dir_
> Output directory relative to the working directory (build only, default: _root_/.vitepress/dist).

**--target** _target_
> Transpile target (build only, default: modules).

**--assetsInlineLimit** _bytes_
> Static asset base64 inline threshold (build only, default: 4096).

# DESCRIPTION

**VitePress** is a static site generator powered by Vite and Vue.js. It is designed for documentation websites, providing fast development experience with hot module replacement and optimized production builds.

Content is written in Markdown with Vue component support. The tool generates SEO-friendly static HTML pages that hydrate into a single-page application on load.

Configuration is done through a .vitepress/config.js file. Themes can be customized or replaced entirely. Built-in features include navigation, sidebar, search, and dark mode.

VitePress is the spiritual successor to VuePress, rebuilt on top of Vite for improved performance.

Install via npm: `npm add -D vitepress`

# CAVEATS

Stable 1.x requires Node.js 18+, while the 2.x prereleases require Node.js 22+. Vue 3 only (not compatible with Vue 2). Custom themes require Vue knowledge. Large sites may have longer build times.

# HISTORY

**VitePress** was created by Evan You (creator of Vue.js and Vite) as a modern replacement for VuePress. It leverages Vite's fast development server and build optimizations. The project is maintained by the Vue.js team.

# SEE ALSO

[vite](/man/vite)(1), [vuepress](/man/vuepress)(1), [hugo](/man/hugo)(1), [jekyll](/man/jekyll)(1)

# RESOURCES

```[Source code](https://github.com/vuejs/vitepress)```

```[Homepage](https://vitepress.dev/)```

```[Documentation](https://vitepress.dev/reference/cli)```

<!-- verified: 2026-11-09 -->
